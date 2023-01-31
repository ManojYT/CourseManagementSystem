
import java.awt.Toolkit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author manoj
 */
public class AdminPortal extends javax.swing.JFrame {

    /**
     * Creates new form StudentPortal
     */
    public AdminPortal(int id, String course) {
        super();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon/herald_icon.png")));
        headerText1.setText(course);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        navBar = new javax.swing.JPanel();
        profileName = new javax.swing.JLabel();
        headerText = new javax.swing.JLabel();
        navMenuPanel = new javax.swing.JPanel();
        logoutBTN = new javax.swing.JButton();
        homeBTN = new javax.swing.JButton();
        coursesBTN = new javax.swing.JButton();
        profileBTN = new javax.swing.JButton();
        mainBody = new javax.swing.JPanel();
        headerText1 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        navBar.setBackground(new java.awt.Color(0, 0, 0));

        profileName.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        profileName.setForeground(new java.awt.Color(255, 255, 255));
        profileName.setText("Hello, Manoj");

        headerText.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        headerText.setForeground(new java.awt.Color(255, 255, 255));
        headerText.setText("Admin Dashboard");

        navMenuPanel.setBackground(new java.awt.Color(51, 51, 51));

        logoutBTN.setBackground(new java.awt.Color(102, 102, 102));
        logoutBTN.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        logoutBTN.setText("Logout");

        homeBTN.setBackground(new java.awt.Color(102, 102, 102));
        homeBTN.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        homeBTN.setText("Home");

        coursesBTN.setBackground(new java.awt.Color(102, 102, 102));
        coursesBTN.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        coursesBTN.setText("Courses");

        profileBTN.setBackground(new java.awt.Color(102, 102, 102));
        profileBTN.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        profileBTN.setText("Profile");

        javax.swing.GroupLayout navMenuPanelLayout = new javax.swing.GroupLayout(navMenuPanel);
        navMenuPanel.setLayout(navMenuPanelLayout);
        navMenuPanelLayout.setHorizontalGroup(
            navMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navMenuPanelLayout.createSequentialGroup()
                .addGap(393, 393, 393)
                .addComponent(homeBTN)
                .addGap(18, 18, 18)
                .addComponent(coursesBTN)
                .addGap(18, 18, 18)
                .addComponent(profileBTN)
                .addGap(18, 18, 18)
                .addComponent(logoutBTN)
                .addContainerGap(398, Short.MAX_VALUE))
        );
        navMenuPanelLayout.setVerticalGroup(
            navMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navMenuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(navMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeBTN)
                    .addComponent(logoutBTN)
                    .addComponent(coursesBTN)
                    .addComponent(profileBTN))
                .addGap(576, 576, 576))
        );

        javax.swing.GroupLayout navBarLayout = new javax.swing.GroupLayout(navBar);
        navBar.setLayout(navBarLayout);
        navBarLayout.setHorizontalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(profileName, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(navMenuPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        navBarLayout.setVerticalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profileName)
                    .addComponent(headerText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(navMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mainBody.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        headerText1.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        headerText1.setForeground(new java.awt.Color(0, 0, 0));
        headerText1.setText("Home");

        javax.swing.GroupLayout mainBodyLayout = new javax.swing.GroupLayout(mainBody);
        mainBody.setLayout(mainBodyLayout);
        mainBodyLayout.setHorizontalGroup(
            mainBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerText1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainBodyLayout.setVerticalGroup(
            mainBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerText1)
                .addContainerGap(539, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
                new AdminPortal(0,"null").setVisible(true);
            }
        });
        
        
      
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton coursesBTN;
    private javax.swing.JLabel headerText;
    private static javax.swing.JLabel headerText1;
    private javax.swing.JButton homeBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutBTN;
    private javax.swing.JPanel mainBody;
    private javax.swing.JPanel navBar;
    private javax.swing.JPanel navMenuPanel;
    private javax.swing.JButton profileBTN;
    private javax.swing.JLabel profileName;
    // End of variables declaration//GEN-END:variables
}
