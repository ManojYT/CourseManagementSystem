
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author manoj
 */
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTextField;
public class AssignModule extends javax.swing.JFrame {
    PreparedStatement createQuery;
    ResultSet sqlQuery;
    
    public AssignModule() {
        super();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon/herald_icon.png")));
        fetchCoursesData();
        disableOptionalModule();
    }
    
    public Connection checkConnection() {
        db startDB = new db();
        Connection confirmConn = startDB.checkConnection();
        return confirmConn;
    }
    
    public void disableOptionalModule() {
        module5label.setVisible(false);
        module6label.setVisible(false);
        module5input.setVisible(false);
        module6input.setVisible(false);
    }
    
    public void fetchCoursesData() {
        try {
            Connection dbConnection = checkConnection();
            createQuery = dbConnection.prepareStatement("select name, isActive from courses");
            sqlQuery = createQuery.executeQuery();
            while (sqlQuery.next()) {
                String getCoursesName = sqlQuery.getString("name");
                int getAvailability = sqlQuery.getInt("isActive");
                if (getAvailability == 1) {
                    courseBox.addItem(getCoursesName);
                }
            }
            
        } catch (Exception exp) {
            System.out.println(exp);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        moduleSubmitBTN = new javax.swing.JButton();
        courseLabel = new javax.swing.JLabel();
        courseBox = new javax.swing.JComboBox<>();
        semesterLabel = new javax.swing.JLabel();
        semesterBox = new javax.swing.JComboBox<>();
        levelLabel = new javax.swing.JLabel();
        levelBox = new javax.swing.JComboBox<>();
        moduleCancelBTN = new javax.swing.JButton();
        moduleLabel = new javax.swing.JLabel();
        selectModuleBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        moduleSubmitBTN.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        moduleSubmitBTN.setText("Submit");
        moduleSubmitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moduleSubmitBTNActionPerformed(evt);
            }
        });
        getContentPane().add(moduleSubmitBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 290, 90, -1));

        courseLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        courseLabel.setText("Select Instructors");
        getContentPane().add(courseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        courseBox.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        courseBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseBoxActionPerformed(evt);
            }
        });
        getContentPane().add(courseBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 327, 39));

        semesterLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        semesterLabel.setText("Select Semester");
        getContentPane().add(semesterLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        semesterBox.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        semesterBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semester 1", "Semester 2", "Semester 3", "Semester 4" }));
        semesterBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterBoxActionPerformed(evt);
            }
        });
        getContentPane().add(semesterBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 327, 39));

        levelLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        levelLabel.setText("Select Level");
        getContentPane().add(levelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        levelBox.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        levelBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Level 4", "Level 5", "Level 6" }));
        levelBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelBoxActionPerformed(evt);
            }
        });
        getContentPane().add(levelBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 327, 39));

        moduleCancelBTN.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        moduleCancelBTN.setText("Cancel");
        moduleCancelBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moduleCancelBTNActionPerformed(evt);
            }
        });
        getContentPane().add(moduleCancelBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 290, 90, -1));

        moduleLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        moduleLabel.setText("Select Module");
        getContentPane().add(moduleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        selectModuleBox.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        selectModuleBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectModuleBoxActionPerformed(evt);
            }
        });
        getContentPane().add(selectModuleBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 327, 39));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void moduleSubmitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moduleSubmitBTNActionPerformed
        try {
            Connection dbConnection = checkConnection();
            if (courseBox.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(this, "You have not selected any course.");
                return;
            }
            String getcourse = courseBox.getSelectedItem().toString();
            String getSemester = semesterBox.getSelectedItem().toString();
            String getLevel = levelBox.getSelectedItem().toString();
            String firstModule = module1input.getText();
            String secondModule = module2input.getText();
            String thirdModule = module3input.getText();
            String fourthModule = module4input.getText();
            String fifthModule = module5input.getText();
            String sixthModule = module6input.getText();
            createQuery = dbConnection.prepareStatement("select * from modules where semester = ? and level = ?");
            createQuery.setString(1, getSemester);
            createQuery.setString(2, getLevel);
            sqlQuery = createQuery.executeQuery();
            
            if (sqlQuery.next()) {
                JOptionPane.showMessageDialog(this, "The module already exists on " + getLevel + " and " + getSemester + ".");
                dbConnection.close();
                return;
            }
            
            if (getLevel != "Level 6") {
                if (firstModule.equals(secondModule) || firstModule.equals(thirdModule) || firstModule.equals(fourthModule)|| secondModule.equals(thirdModule) || secondModule.equals(fourthModule) || thirdModule.equals(fourthModule) || fourthModule.equals(fifthModule)) {
                    JOptionPane.showMessageDialog(this, "Modules cannot be repeated", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                createQuery = dbConnection.prepareStatement("insert into modules(course, semester, level, module1, module2, module3, module4, module5, module6) values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
                createQuery.setString(1, getcourse);
                createQuery.setString(2, getSemester);
                createQuery.setString(3, getLevel);
                createQuery.setString(4, firstModule);
                createQuery.setString(5, secondModule);
                createQuery.setString(6, thirdModule);
                createQuery.setString(7, fourthModule);
                createQuery.setString(8, "none");
                createQuery.setString(9, "none");
            } else {
                if (firstModule.equals(secondModule) || firstModule.equals(thirdModule) || firstModule.equals(fourthModule) || firstModule.equals(fifthModule) || firstModule.equals(sixthModule) || secondModule.equals(thirdModule) || secondModule.equals(fourthModule) || secondModule.equals(fifthModule) || secondModule.equals(sixthModule) || thirdModule.equals(fourthModule) || thirdModule.equals(fifthModule) || thirdModule.equals(sixthModule) || fourthModule.equals(fifthModule) || fourthModule.equals(sixthModule) || fifthModule.equals(sixthModule)) {
                    JOptionPane.showMessageDialog(this, "Modules cannot be repeated", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                createQuery = dbConnection.prepareStatement("insert into modules(course, semester, level, module1, module2, module3, module4, module5, module6) values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
                createQuery.setString(1, getcourse);
                createQuery.setString(2, getSemester);
                createQuery.setString(3, getLevel);
                createQuery.setString(4, firstModule);
                createQuery.setString(5, secondModule);
                createQuery.setString(6, thirdModule);
                createQuery.setString(7, fourthModule);
                createQuery.setString(8, fifthModule);
                createQuery.setString(9, sixthModule);
            }
            int checkResult = createQuery.executeUpdate();
            if (checkResult != 1) {
                JOptionPane.showMessageDialog(this, "Something went wrong while adding new modules", "ERROR", JOptionPane.ERROR_MESSAGE);
                dbConnection.close();
                return;
            }
            JOptionPane.showMessageDialog(this, "Successfully added new modules", "INFO", JOptionPane.INFORMATION_MESSAGE);
            dbConnection.close();
            return;
        } catch (Exception exp) {
            System.out.println(exp);
        }
    }//GEN-LAST:event_moduleSubmitBTNActionPerformed

    private void courseBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseBoxActionPerformed

    private void semesterBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semesterBoxActionPerformed

    private void levelBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelBoxActionPerformed
        String chooseLevel = levelBox.getSelectedItem().toString();
        if (chooseLevel != "Level 6") {
            module5label.setVisible(false);
            module6label.setVisible(false);
            module5input.setVisible(false);
            module6input.setVisible(false);
        } else {
            module5label.setVisible(true);
            module6label.setVisible(true);
            module5input.setVisible(true);
            module6input.setVisible(true);
        }
    }//GEN-LAST:event_levelBoxActionPerformed

    private void moduleCancelBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moduleCancelBTNActionPerformed
        dispose();
    }//GEN-LAST:event_moduleCancelBTNActionPerformed

    private void selectModuleBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectModuleBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectModuleBoxActionPerformed

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
            java.util.logging.Logger.getLogger(StudentPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddModule().setVisible(true);
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> courseBox;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JComboBox<String> levelBox;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JButton moduleCancelBTN;
    private javax.swing.JLabel moduleLabel;
    private javax.swing.JButton moduleSubmitBTN;
    private javax.swing.JComboBox<String> selectModuleBox;
    private javax.swing.JComboBox<String> semesterBox;
    private javax.swing.JLabel semesterLabel;
    // End of variables declaration//GEN-END:variables
}
