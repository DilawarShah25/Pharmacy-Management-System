
package dao;
import dao.EmailSender;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.mail.MessagingException;

public class EmailFrame extends JFrame {

    private JTextField txtTo;
    private JTextField txtSubject;
    private JTextArea txtDescription;
    private JButton btnSend;
    private JButton btnAttachment;
    private File attachedFile; // Added for file attachment

    public EmailFrame() {
        initComponents();
    }

    private void initComponents() {
        txtTo = new JTextField(20);
        txtSubject = new JTextField(20);
        txtDescription = new JTextArea(10, 20);
        btnSend = new JButton("Send");
        btnAttachment = new JButton("Attachment");

        setLayout(new BorderLayout());

        JPanel fieldPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        fieldPanel.add(new JLabel("To:"), gbc);
        fieldPanel.add(txtTo, gbc);
        fieldPanel.add(new JLabel("Subject:"), gbc);
        fieldPanel.add(txtSubject, gbc);
        fieldPanel.add(new JLabel("Description:"), gbc);
        fieldPanel.add(new JScrollPane(txtDescription), gbc);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnSend);
        buttonPanel.add(btnAttachment);

        add(fieldPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Inside the btnSend ActionListener
        btnSend.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String to = txtTo.getText();
                String subject = txtSubject.getText();
                String body = txtDescription.getText();

                if (to.isEmpty() || subject.isEmpty() || body.isEmpty()) {
                    JOptionPane.showMessageDialog(EmailFrame.this, "Please fill in all fields",
                            "Incomplete Information", JOptionPane.WARNING_MESSAGE);
                } else {
                    if (hasAttachment()) {
                        System.out.println("Attached File: " + attachedFile.getAbsolutePath());
                    }
                    try {
                        EmailSender.sendEmailWithAttachment(to, subject, body, attachedFile);
                        JOptionPane.showMessageDialog(EmailFrame.this, "Email sent successfully",
                                "Success", JOptionPane.INFORMATION_MESSAGE);
                    } catch (MessagingException e) {
                        JOptionPane.showMessageDialog(EmailFrame.this, "Failed to send email",
                                "Error", JOptionPane.ERROR_MESSAGE);
                        e.printStackTrace();
                    }
                }
            }
        });

        // Action listener for the Attachment button
        btnAttachment.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int option = fileChooser.showOpenDialog(EmailFrame.this);
                if (option == JFileChooser.APPROVE_OPTION) {
                    attachedFile = fileChooser.getSelectedFile();
                }
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Email Frame");
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private boolean hasAttachment() {
        return attachedFile != null && attachedFile.exists();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                ex.printStackTrace();
            }
            new EmailFrame();
        });
    }
}
