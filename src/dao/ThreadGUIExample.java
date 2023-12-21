package dao;
import javax.swing.*;

public class ThreadGUIExample extends JFrame {
    private JLabel label;

    public ThreadGUIExample() {
        super("Thread GUI Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new java.awt.FlowLayout());

        label = new JLabel("Processing...");
        add(label);

        // Create a thread for background processing
        Thread processingThread = new Thread(new Runnable() {
            public void run() {
                // Simulate some processing
                try {
                    Thread.sleep(3000); // Sleep for 3 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Update the GUI from the background thread
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        label.setText("Processing completed!");
                    }
                });
            }
        });

        // Start the thread
        processingThread.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ThreadGUIExample().setVisible(true);
            }
        });
    }
}

