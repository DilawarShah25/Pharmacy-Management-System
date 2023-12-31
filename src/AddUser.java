
import dao.ConnectionProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Date;

public class AddUser extends javax.swing.JFrame {

    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String mobileNumberPattern = "^[0-9]*$";
    public int checkUserName = 0;

    public AddUser() {
        initComponents();
        iconLabel.setVisible(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtMobileNumber = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        iconLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        comboUserRole = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        dateDOB = new com.toedter.calendar.JDateChooser();
        txtPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Add User");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 17, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 71, 890, -1));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Phone no");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 271, 244, -1));
        jPanel1.add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 230, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));
        jPanel1.add(iconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 57, -1, -1));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 79, 244, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Email");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 57, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("User Role");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 79, 244, -1));

        comboUserRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Pharmacist" }));
        comboUserRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboUserRoleActionPerformed(evt);
            }
        });
        jPanel1.add(comboUserRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 230, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Username");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 125, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserNameKeyReleased(evt);
            }
        });
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 147, 244, -1));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 230, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Password");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 187, -1, -1));
        jPanel1.add(dateDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 230, -1));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 209, 244, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("DOB (Date Of Birth)");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Address");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 249, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 660, 380));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-back-40.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyReleased
        // TODO add your handling code here:
        String userName = txtUserName.getText();
        if (!userName.equals("")) {
            iconLabel.setVisible(true);
            iconLabel.setIcon(new ImageIcon("C:\\Users\\ds555\\Documents\\NetBeansProjects\\Pharmacy Managment System\\src\\icons\\yes.png"));
            iconLabel.setText("");
            checkUserName = 0;

            try {
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select *from appuser where username='" + userName + "'");
                while (rs.next()) {
                    checkUserName = 1;
                    iconLabel.setIcon(new ImageIcon("C:\\Users\\ds555\\Documents\\NetBeansProjects\\Pharmacy Managment System\\src\\icons\\no.png"));

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            iconLabel.setVisible(false);
        }
    }//GEN-LAST:event_txtUserNameKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String userRole = (String) comboUserRole.getSelectedItem();
        String name = txtName.getText();
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = dateDOB.getDate();
        String dob = "";
        if (date != null) {
            dob = dFormat.format(dateDOB.getDate());
        }
        String mobileNumber = txtMobileNumber.getText();
        String email = txtEmail.getText();
        String username = txtUserName.getText();
        String password = txtPassword.getText();
        String address = txtAddress.getText();

        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Name field is required.");
        } else if (dob.equals("")) {
            JOptionPane.showMessageDialog(null, "Date of birth field is required.");
        } else if (!mobileNumber.matches(mobileNumberPattern) || mobileNumber.length() != 11) {
            JOptionPane.showMessageDialog(null, "Mobile number field is required.");
        } else if (!email.matches(emailPattern)) {
            JOptionPane.showMessageDialog(null, "Email field is required.");
        } else if (username.equals("")) {
            JOptionPane.showMessageDialog(null, "Userame field is required.");
        } else if (checkUserName == 1) {
            JOptionPane.showMessageDialog(null, "Username already field is exist.");
        } else if (password.equals("")) {
            JOptionPane.showMessageDialog(null, "Password field is required.");
        } else if (address.equals("")) {
            JOptionPane.showMessageDialog(null, "Address field is required.");
        } else {
            try {
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("INSERT INTO appuser (appuser_pk, userRole, name, dob, mobileNumber, email, username, password, address) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
                ps.setString(1, getNextUserID(con)); // Get the next user ID
                ps.setString(2, userRole);
                ps.setString(3, name);
                ps.setString(4, dob);
                ps.setString(5, mobileNumber);
                ps.setString(6, email);
                ps.setString(7, username);
                ps.setString(8, password);
                ps.setString(9, address);

                int result = ps.executeUpdate(); // Execute the query

                if (result > 0) {
                    JOptionPane.showMessageDialog(null, "User added Successfully.");
                    setVisible(false);
                    new AddUser().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to add user.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed
    private String getNextUserID(Connection con) throws SQLException {
        String query = "SELECT MAX(appuser_pk) FROM appuser"; // Get the maximum user ID
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        int nextID = 1;
        if (rs.next()) {
            nextID = rs.getInt(1) + 1; // Increment the maximum user ID by 1 for the next user
        }

        return String.valueOf(nextID);
    }
    private void comboUserRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUserRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboUserRoleActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new AdminDashboard().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboUserRole;
    private com.toedter.calendar.JDateChooser dateDOB;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
