package dao;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FAQButtonExample extends JFrame {
    private JButton faqButton;

    public FAQButtonExample() {
        setTitle("FAQ Button Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create the FAQ button
        faqButton = new JButton("FAQ");
        faqButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create a popup menu
                JPopupMenu popupMenu = new JPopupMenu();

                // Add clickable options for FAQs
                JMenuItem option1 = new JMenuItem("FAQ Option 1");
                option1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "FAQ Option 1 clicked!");
                    }
                });
                popupMenu.add(option1);

                JMenuItem option2 = new JMenuItem("FAQ Option 2");
                option2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "FAQ Option 2 clicked!");
                    }
                });
                popupMenu.add(option2);

                // Show the popup menu below the button
                popupMenu.show(faqButton, 0, faqButton.getHeight());
            }
        });

        // Add the FAQ button to the frame
        add(faqButton);

        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FAQButtonExample();
    }
}
