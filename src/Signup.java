/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author manoj
 */
import java.sql.*;
import javax.swing.*;
public class Signup extends javax.swing.JFrame {
    Statement prepareQuery;
    /**
     * Creates new form Login
     */
    public Signup() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerLogo = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passInput = new javax.swing.JPasswordField();
        email_username_label1 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        email_username_label2 = new javax.swing.JLabel();
        middlename = new javax.swing.JTextField();
        email_username_label3 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        passwordLabel1 = new javax.swing.JLabel();
        confirmpassInput = new javax.swing.JPasswordField();
        signupBTN = new javax.swing.JButton();
        loginLabel = new javax.swing.JLabel();
        loginBTN = new javax.swing.JButton();
        loginGroupLabel = new javax.swing.JLabel();
        roleGroup = new javax.swing.JComboBox<>();
        courseLabel = new javax.swing.JLabel();
        courseInput = new javax.swing.JComboBox<>();
        username = new javax.swing.JLabel();
        usernameInput = new javax.swing.JTextField();
        phoneInput = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        addressInput = new javax.swing.JTextField();
        sexLabel = new javax.swing.JLabel();
        sexGroup = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        headerLogo.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        headerLogo.setText("Signup");
        headerLogo.setToolTipText("");

        emailInput.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        email.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        email.setText("Email");

        passwordLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        passwordLabel.setText("Password");

        passInput.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        passInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passInputActionPerformed(evt);
            }
        });

        email_username_label1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        email_username_label1.setText("Fiirstname");

        firstname.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        email_username_label2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        email_username_label2.setText("Middlename");

        middlename.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        email_username_label3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        email_username_label3.setText("Lastname");

        lastname.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        passwordLabel1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        passwordLabel1.setText("Confirm Password");

        confirmpassInput.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        confirmpassInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmpassInputActionPerformed(evt);
            }
        });

        signupBTN.setBackground(new java.awt.Color(51, 51, 51));
        signupBTN.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        signupBTN.setForeground(new java.awt.Color(255, 255, 255));
        signupBTN.setText("Signup");
        signupBTN.setToolTipText("");
        signupBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBTNActionPerformed(evt);
            }
        });

        loginLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        loginLabel.setText("Already have an account?");

        loginBTN.setBackground(new java.awt.Color(255, 255, 255));
        loginBTN.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        loginBTN.setText("Login");
        loginBTN.setToolTipText("");
        loginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBTNActionPerformed(evt);
            }
        });

        loginGroupLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        loginGroupLabel.setText("Who are you?");

        roleGroup.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        roleGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Teacher" }));

        courseLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        courseLabel.setText("Select Course");

        courseInput.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        courseInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BIT", "IBM", "MBA" }));

        username.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        username.setText("Username");

        usernameInput.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        phoneInput.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        phoneLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        phoneLabel.setText("Phone number");

        addressLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        addressLabel.setText("Address");

        addressInput.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        sexLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        sexLabel.setText("Sex");

        sexGroup.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        sexGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Prefer not say" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(headerLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email_username_label1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(email_username_label2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(middlename))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(email_username_label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(confirmpassInput, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passInput, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emailInput, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email)
                            .addComponent(passwordLabel)
                            .addComponent(passwordLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneInput)
                            .addComponent(usernameInput, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phoneLabel)
                                    .addComponent(username))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sexGroup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addressInput, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sexLabel)
                                    .addComponent(addressLabel))
                                .addGap(208, 208, 208))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loginGroupLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(roleGroup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courseInput, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(courseLabel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(signupBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(loginLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loginBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(headerLogo)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(email_username_label1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(email_username_label2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(middlename, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(email_username_label3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username)
                    .addComponent(sexLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(phoneLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressInput, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(addressLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passInput, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmpassInput, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loginGroupLabel)
                            .addComponent(courseLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roleGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(courseInput, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(signupBTN)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginLabel)
                    .addComponent(loginBTN))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passInputActionPerformed

    private void confirmpassInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmpassInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmpassInputActionPerformed

    public Connection checkConnection() {
        db startDB = new db();
        Connection confirmConn = startDB.checkConnection();
        return confirmConn;
    }
    private void signupBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBTNActionPerformed
        try {
            Connection dbConnection = checkConnection();
            String getFirstname = firstname.getText();
            String getMiddlename = middlename.getText();
            String getLastname = lastname.getText();
            String getUsername = usernameInput.getText();
            String getEmail = emailInput.getText();
            String getGender = sexGroup.getSelectedItem().toString();
            String getPhone = phoneInput.getText();
            String getAddress = addressInput.getText();
            String role = roleGroup.getSelectedItem().toString();
            String getCourse = sexGroup.getSelectedItem().toString();
            String password = String.valueOf(passInput.getPassword());
            String confirmpassword = String.valueOf(confirmpassInput.getPassword());
            prepareQuery = dbConnection.createStatement();
            
            System.out.println(getGender);
            if (getFirstname.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter your first name!");
                return;
            } else if (getLastname.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter your last name!");
                return;
            } else if (getUsername.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter your username!");
                return;
            } else if (getPhone.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter your phone number!");
                return;
            } else if (getAddress.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter your address!");
                return;
            } else if (getEmail.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter your email!");
                return;
            } else if (password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter your password!");
                return;
            } else if (confirmpassword.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please confirm your password!");
                return;
            }
            
            if (password.equals(confirmpassword)) {
                if (!getMiddlename.isEmpty()) {
                    prepareQuery.executeUpdate("insert into students (firstname, middlename, lastname, sex, username, phone, address, email, course, password) values ('"+ getFirstname +"', '" + getMiddlename +"', '" + getLastname +"', '" + getGender +"', '" + getUsername + "', '" + getPhone +"', '" + getAddress +"', '" + getEmail +"', '" + getCourse +"','" + password + "')");
                } else {
                    prepareQuery.executeUpdate("insert into students (firstname, lastname, sex, username, phone, address, email, course, password) values ('"+ getFirstname +"', '" + getLastname +"', '" + getGender +"', '" + getUsername + "', '" + getPhone +"', '" + getAddress +"', '" + getEmail +"', '" + getCourse +"','" + password + "')");
                }
                JOptionPane.showMessageDialog(this, "You have successfully registered, you may login now!");
                dispose();
                Login showPage = new Login();
                showPage.setVisible(true);
                dbConnection.close();
                return;
            } else {
                JOptionPane.showMessageDialog(this, "Password Mismatch!");
                firstname.setText("");
                middlename.setText("");
                lastname.setText("");
                usernameInput.setText("");
                emailInput.setText("");
                passInput.setText("");
                confirmpassInput.setText("");
                dbConnection.close();
                return;
            }
        } catch (Exception exp) {
            System.out.println(exp);
        }
    }//GEN-LAST:event_signupBTNActionPerformed

    private void loginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBTNActionPerformed
        dispose();
        Login showLogin = new Login();
        showLogin.setVisible(true);
    }//GEN-LAST:event_loginBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressInput;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JPasswordField confirmpassInput;
    private javax.swing.JComboBox<String> courseInput;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel email_username_label1;
    private javax.swing.JLabel email_username_label2;
    private javax.swing.JLabel email_username_label3;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel headerLogo;
    private javax.swing.JTextField lastname;
    private javax.swing.JButton loginBTN;
    private javax.swing.JLabel loginGroupLabel;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTextField middlename;
    private javax.swing.JPasswordField passInput;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JTextField phoneInput;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JComboBox<String> roleGroup;
    private javax.swing.JComboBox<String> sexGroup;
    private javax.swing.JLabel sexLabel;
    private javax.swing.JButton signupBTN;
    private javax.swing.JLabel username;
    private javax.swing.JTextField usernameInput;
    // End of variables declaration//GEN-END:variables
}
