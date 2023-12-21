package common;

import dao.PharmacyUtils;
import java.io.File;
import javax.swing.JOptionPane;

public class OpenPdf {
    public static void openById(String id) {
        try {
            String filePath = PharmacyUtils.billPath + id + ".pdf";
            File file = new File(filePath);

            if (file.exists()) {
                Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + filePath);
            } else {
                JOptionPane.showMessageDialog(null, "File does not exist: " + filePath);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error opening file: " + e.getMessage());
        }
    }
}
