
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
public class ViewResult extends javax.swing.JFrame {
    PreparedStatement createQuery;
    ResultSet sqlQuery;
    String isCourse;
    String isTeacher;
    
    public ViewResult() {
        super();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon/herald_icon.png")));
        this.isCourse = isCourse;
        this.isTeacher = isTeacher;
        fetchstudentData();
    }
    
    public Connection checkConnection() {
        db startDB = new db();
        Connection confirmConn = startDB.checkConnection();
        return confirmConn;
    }
    
    public void fetchstudentData() {
        try {
            Connection dbConnection = checkConnection();
            createQuery = dbConnection.prepareStatement("select * from result");
            sqlQuery = createQuery.executeQuery();
            
            
            DefaultTableModel resultTableModel = (DefaultTableModel)viewResultTable.getModel();
            resultTableModel.setRowCount(0); // clearing table data.
            while (sqlQuery.next()) {
                String id = String.valueOf(sqlQuery.getInt("id"));
                String getStudent = sqlQuery.getString("student");
                String getEmail = sqlQuery.getString("email");
                String getInstructor = sqlQuery.getString("instructor");
                String getModule = sqlQuery.getString("module");
                String getSemester = sqlQuery.getString("semester");
                String getLevel = sqlQuery.getString("level");
                String getMark = sqlQuery.getString("marks");

                String tableData[] = {id, getStudent, getEmail, getInstructor, getModule, getSemester, getLevel, getMark};
                resultTableModel.addRow(tableData);
                viewResultTable.setEnabled(false);
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

        jScrollPane6 = new javax.swing.JScrollPane();
        viewResultTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Result");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewResultTable.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        viewResultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.N", "Student", "Email", "Instructor", "Module", "Semester", "Level", "Marks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(viewResultTable);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1070, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                new ViewResult().setVisible(true);
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable viewResultTable;
    // End of variables declaration//GEN-END:variables
}
