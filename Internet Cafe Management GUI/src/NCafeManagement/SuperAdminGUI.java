/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NCafeManagement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.regex.Pattern;

/**
 *
 * @author Arya Prathama
 */
public class SuperAdminGUI extends javax.swing.JFrame {
    String Username;
    String Password;
    String loggedInUsername;
    private Connection Con;


    /**
     * Creates new form SuperAdminGUI
     * 
     * 
     */
    
    public SuperAdminGUI(){
        initComponents();
        setTitle("Super Admin GUI");
        this.setLocationRelativeTo(null);
    }
            
    public SuperAdminGUI(String username, String password, Connection connection) {
        initComponents();
        setTitle("Super Admin GUI");
        this.setLocationRelativeTo(null);
        Username = username;
        Password = password;
        loggedInUsername = username;
        this.Con = connection;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ViewAdminbutton = new javax.swing.JButton();
        ChangeSPWbutton = new javax.swing.JButton();
        ChangePwButton = new javax.swing.JButton();
        RemoveButton1 = new javax.swing.JButton();
        BackSadmin = new javax.swing.JButton();
        SearchanAdmin = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JtableSadmin = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        ViewAdminbutton.setText("View Admin");
        ViewAdminbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewAdminbuttonMouseClicked(evt);
            }
        });

        ChangeSPWbutton.setText("Change Other Admin Password");
        ChangeSPWbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangeSPWbuttonMouseClicked(evt);
            }
        });

        ChangePwButton.setText("Change Admin Password");
        ChangePwButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangePwButtonMouseClicked(evt);
            }
        });

        RemoveButton1.setText("Remove an Admin");
        RemoveButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RemoveButton1MouseClicked(evt);
            }
        });

        BackSadmin.setText("Back");
        BackSadmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackSadminMouseClicked(evt);
            }
        });

        SearchanAdmin.setText("Search an Admin");
        SearchanAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchanAdminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(ViewAdminbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(ChangePwButton)
                .addGap(42, 42, 42)
                .addComponent(ChangeSPWbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(SearchanAdmin)
                .addGap(26, 26, 26)
                .addComponent(RemoveButton1)
                .addGap(61, 61, 61)
                .addComponent(BackSadmin)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChangeSPWbutton)
                    .addComponent(ViewAdminbutton)
                    .addComponent(ChangePwButton)
                    .addComponent(RemoveButton1)
                    .addComponent(BackSadmin)
                    .addComponent(SearchanAdmin))
                .addGap(28, 28, 28))
        );

        JtableSadmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "Password", "Status"
            }
        ));
        jScrollPane2.setViewportView(JtableSadmin);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewAdminbuttonMouseClicked(java.awt.event.MouseEvent evt) {

        try {
            Statement statement = Con.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM tb_username");

            DefaultTableModel model = (DefaultTableModel) JtableSadmin.getModel();
            model.setRowCount(0);
            while (resultSet.next()) {
                String username = resultSet.getString("Username");
                String password = resultSet.getString("Password");
                String adminType = resultSet.getString("Status");
                
                model.addRow(new Object[]{username, password,  adminType});
            }

            // Tutup koneksi dan statement
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to connect to database.");
        }
    }

    private void ChangePwButtonMouseClicked(java.awt.event.MouseEvent evt) {
//GEN-FIRST:event_ChangePwButtonMouseClicked
        try {
            Statement statement = Con.createStatement();
            String usernameInput = JOptionPane.showInputDialog(this, "Enter your username ");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM tb_username WHERE Username='" + usernameInput + "'");
            if (resultSet.next()) {
                String passwordDatabase = resultSet.getString("Password");
                String passwordInput = JOptionPane.showInputDialog(this, "Enter your old password ");
                if (passwordInput.equals(passwordDatabase)) {
                    String confirmation = JOptionPane.showInputDialog(this, "Confirm your old password ");
                    if (confirmation.equals(passwordInput)) {
                        String newPassword = JOptionPane.showInputDialog(this, "Enter your new password ");
                        statement.executeUpdate("UPDATE tb_username SET Password='" + newPassword + "' WHERE Username='" + usernameInput + "'");
                        JOptionPane.showMessageDialog(this, "Password changed successfully!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Password doesn't match!");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Wrong password!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Username not found!");
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to connect to database.");
        }
    }


//GEN-LAST:event_ChangePwButtonMouseClicked

    private void ChangeSPWbuttonMouseClicked(java.awt.event.MouseEvent evt) {
  
   try {
    String adminType = getAdminType(loggedInUsername);
    
   
    if (adminType.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Invalid username.");
        return;
    }
    
   
    if (!adminType.equals("admin super")) {
        JOptionPane.showMessageDialog(this, "Only super admin can change passwords for other admins.");
        return; 
    }

    Statement statement = Con.createStatement();
    String username = JOptionPane.showInputDialog(this, "Enter the admin's username ");
    String oldPass = JOptionPane.showInputDialog(this, "Enter old Password");
    String newPass= JOptionPane.showInputDialog(this, "Enter new Password");

    
    ResultSet resultSet = statement.executeQuery("SELECT * FROM tb_username WHERE Username='" + username + "'");
    if (resultSet.next()) {
        if (oldPass.equals(resultSet.getString("Password"))) {
            int rowsAffected = statement.executeUpdate("UPDATE tb_username SET Password='" + newPass + "' WHERE Username='" + username + "'");
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Password changed successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to change password. Please check your username and old password.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect old password.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Username not found.");
    }

    resultSet.close();
    statement.close();
} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Failed to connect to database.");
}
}


    private String getAdminType(String username) {
        String adminType = "";

        try {
            Statement statement = Con.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT Status FROM tb_username WHERE Username = '" + username + "'");

            if (resultSet.next()) {
                adminType = resultSet.getString("Status");
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return adminType;

    }


    private void RemoveButton1MouseClicked(java.awt.event.MouseEvent evt) {
        String username = JOptionPane.showInputDialog(this, "Enter the admin's username: ");

        try {
            Statement statement = Con.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM tb_username WHERE Username='" + username + "'");
            if (!resultSet.next()) {
                JOptionPane.showMessageDialog(this, "That username does not exist.");
            } else {
                String adminType = resultSet.getString("Status");

                if (adminType.equals("admin regular")) {

                    statement.executeUpdate("DELETE FROM tb_username WHERE Username='" + username + "'");
                    JOptionPane.showMessageDialog(this, "Admin found, deleting admin " + username);
                } else if (adminType.equals("admin super")) {

                    JOptionPane.showMessageDialog(this, "Can't delete a privileged admin");
                }
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to connect to database.");
        }
    }


    private void BackSadminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackSadminMouseClicked
        AfterLoginGui afterLoginGui = new AfterLoginGui(loggedInUsername, Password, Con);
        afterLoginGui.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_BackSadminMouseClicked

    private void SearchanAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchanAdminMouseClicked
        String xUsername = JOptionPane.showInputDialog(this, "Enter Admin Infromation ");

        try {
            Statement statement = Con.createStatement();

            String search = "^"+xUsername+".*";

            ResultSet resultSet = statement.executeQuery("SELECT * FROM tb_username WHERE Username REGEXP '"+search+"'");

            DefaultTableModel model = (DefaultTableModel) JtableSadmin.getModel();
            model.setRowCount(0);
            while (resultSet.next()) {
                String username = resultSet.getString("Username");
                String password = resultSet.getString("Password");
                String adminType = resultSet.getString("Status");

                model.addRow(new Object[]{username, password,  adminType});
            }
            
            // Tutup koneksi dan statement
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to connect to database.");
        }

    }//GEN-LAST:event_SearchanAdminMouseClicked


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
            java.util.logging.Logger.getLogger(SuperAdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuperAdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuperAdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuperAdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuperAdminGUI().setVisible(true);
            }
        });


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackSadmin;
    private javax.swing.JButton ChangePwButton;
    private javax.swing.JButton ChangeSPWbutton;
    private javax.swing.JTable JtableSadmin;
    private javax.swing.JButton RemoveButton1;
    private javax.swing.JButton SearchanAdmin;
    private javax.swing.JButton ViewAdminbutton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
