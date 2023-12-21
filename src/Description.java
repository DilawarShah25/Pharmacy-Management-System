
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Description extends JFrame implements ActionListener {

    private TextArea descriptionArea;
    private JButton serializeButton, deserializeButton;

    public Description() {
        super("Customer Description Manager");
        setLayout(new FlowLayout());

        descriptionArea = new TextArea(10, 50);
        add(descriptionArea);

        serializeButton = new JButton("Serialize Description");
        serializeButton.addActionListener(this);
        add(serializeButton);

        deserializeButton = new JButton("Deserialize Description");
        deserializeButton.addActionListener(this);
        add(deserializeButton);

        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == serializeButton) {
            serializeDescription();
        } else if (e.getSource() == deserializeButton) {
            deserializeDescription();
        }
    }

    private void serializeDescription() {
        String description = descriptionArea.getText();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("customer_descriptions.txt"))) {
            oos.writeObject(description);
            JOptionPane.showMessageDialog(null, "Description serialized successfully!");
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }

    private void deserializeDescription() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("customer_descriptions.txt")); BufferedWriter writer = new BufferedWriter(new FileWriter("new_file.txt"))) {

            String description = (String) ois.readObject();
            writer.write(description);
            JOptionPane.showMessageDialog(null, "Description deserialized and saved to new_file.txt");

        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new Description();
    }
}
