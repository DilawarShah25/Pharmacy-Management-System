package dao;

import javax.swing.*;
import java.sql.Connection;
import java.sql.Statement;

public class Tables {
    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();

//            st.executeUpdate("INSERT INTO appuser (userRole, name, dob, mobileNumber, email, username, password, address) " +
//                    "VALUES ('Admin', 'Admin', '25-12-2003', '0000111222', 'admin@gmail.com', 'admin', 'password', 'Pakistan')");
//            st.executeUpdate("create table medicine(medicine_pk int AUTO_INCREMENT primary key,uniqueId varchar(200),name varchar(200),companyName varchar(200),quantity bigint,price bigint)");
              st.executeUpdate("CREATE TABLE bill (bill_pk INT AUTO_INCREMENT PRIMARY KEY, billId VARCHAR(50), billDate VARCHAR(50), totalPaid BIGINT, generatedBy VARCHAR(50))");



            
            JOptionPane.showMessageDialog(null, "Table created Successfully");
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
              System.out.println(e);
        }
    }
} 
