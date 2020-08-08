
package timeMinusMain;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Justin
 */
public class frmTimeMinus extends javax.swing.JFrame {
    
    /**
     * Creates new form frmTimeMinus
     */
    public frmTimeMinus() {
        initComponents();
        pnlLogin.setFocusable(true);
        parentPanel.removeAll();
        parentPanel.add(pnlLogin);
        parentPanel.repaint();
        parentPanel.revalidate();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        parentPanel = new javax.swing.JPanel();
        pnlLogin = new javax.swing.JPanel();
        login_AppName = new javax.swing.JLabel();
        login_Logo = new javax.swing.JLabel();
        login_detailsPanel = new javax.swing.JPanel();
        login_detailsHeader = new javax.swing.JLabel();
        login_Username = new javax.swing.JTextField();
        login_Password = new javax.swing.JTextField();
        login_RememberDetails = new javax.swing.JCheckBox();
        login_Button = new javax.swing.JButton();
        pnlLoginExtra = new javax.swing.JPanel();
        login_ForgottenLink = new javax.swing.JLabel();
        login_CookiesLink = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlHome = new javax.swing.JPanel();
        main_BackButton = new javax.swing.JButton();
        main_WelcomeBackMessage = new javax.swing.JLabel();
        main_NextClassLabel = new javax.swing.JPanel();
        main_NextClassHeader = new javax.swing.JLabel();
        main_NextClassNameCode = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(750, 200, 0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(360, 640));

        parentPanel.setBackground(new java.awt.Color(255, 255, 255));
        parentPanel.setLayout(new java.awt.CardLayout());

        pnlLogin.setBackground(new java.awt.Color(0, 0, 255));
        pnlLogin.setLayout(null);

        login_AppName.setBackground(new java.awt.Color(255, 255, 255));
        login_AppName.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        login_AppName.setForeground(new java.awt.Color(255, 255, 255));
        login_AppName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_AppName.setText("Time - Minus");
        pnlLogin.add(login_AppName);
        login_AppName.setBounds(6, 105, 354, 44);

        login_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pearsonLogoResized.png"))); // NOI18N
        pnlLogin.add(login_Logo);
        login_Logo.setBounds(6, 27, 200, 60);

        login_detailsPanel.setBackground(new java.awt.Color(255, 255, 255));

        login_detailsHeader.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        login_detailsHeader.setForeground(new java.awt.Color(0, 0, 0));
        login_detailsHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_detailsHeader.setText("Please enter your login details below:");

        login_Username.setBackground(new java.awt.Color(255, 255, 255));
        login_Username.setForeground(new java.awt.Color(153, 153, 153));
        login_Username.setText("Student ID / Pearson Email");
        login_Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                login_UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                login_UsernameFocusLost(evt);
            }
        });

        login_Password.setBackground(new java.awt.Color(255, 255, 255));
        login_Password.setForeground(new java.awt.Color(153, 153, 153));
        login_Password.setText("Password");
        login_Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                login_PasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                login_PasswordFocusLost(evt);
            }
        });

        login_RememberDetails.setText("Remember Me");

        login_Button.setBackground(new java.awt.Color(12, 89, 207));
        login_Button.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        login_Button.setForeground(new java.awt.Color(255, 255, 255));
        login_Button.setText("Log In");
        login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout login_detailsPanelLayout = new javax.swing.GroupLayout(login_detailsPanel);
        login_detailsPanel.setLayout(login_detailsPanelLayout);
        login_detailsPanelLayout.setHorizontalGroup(
            login_detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_detailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(login_detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(login_Password)
                    .addComponent(login_detailsHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(login_Username, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_detailsPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(login_RememberDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        login_detailsPanelLayout.setVerticalGroup(
            login_detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_detailsPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(login_detailsHeader)
                .addGap(18, 18, 18)
                .addComponent(login_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(login_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(login_RememberDetails)
                .addGap(27, 27, 27)
                .addComponent(login_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pnlLogin.add(login_detailsPanel);
        login_detailsPanel.setBounds(26, 155, 313, 310);

        pnlLoginExtra.setBackground(new java.awt.Color(255, 255, 255));

        login_ForgottenLink.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        login_ForgottenLink.setForeground(new java.awt.Color(20, 100, 246));
        login_ForgottenLink.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_ForgottenLink.setText("Forgotten username or Password");

        login_CookiesLink.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        login_CookiesLink.setForeground(new java.awt.Color(20, 100, 246));
        login_CookiesLink.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_CookiesLink.setText("Cookies must be enabled in your browser");

        javax.swing.GroupLayout pnlLoginExtraLayout = new javax.swing.GroupLayout(pnlLoginExtra);
        pnlLoginExtra.setLayout(pnlLoginExtraLayout);
        pnlLoginExtraLayout.setHorizontalGroup(
            pnlLoginExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginExtraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLoginExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login_ForgottenLink, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(login_CookiesLink, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlLoginExtraLayout.setVerticalGroup(
            pnlLoginExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginExtraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_ForgottenLink)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(login_CookiesLink)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pnlLogin.add(pnlLoginExtra);
        pnlLoginExtra.setBounds(0, 570, 360, 79);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loginBackgroundResized.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        pnlLogin.add(jLabel2);
        jLabel2.setBounds(0, 0, 360, 640);

        parentPanel.add(pnlLogin, "card2");

        pnlHome.setBackground(new java.awt.Color(255, 255, 255));
        pnlHome.setPreferredSize(new java.awt.Dimension(360, 640));

        main_BackButton.setBackground(new java.awt.Color(255, 255, 255));
        main_BackButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        main_BackButton.setForeground(new java.awt.Color(0, 0, 0));
        main_BackButton.setText("<");
        main_BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main_BackButtonActionPerformed(evt);
            }
        });

        main_WelcomeBackMessage.setBackground(new java.awt.Color(0, 0, 0));
        main_WelcomeBackMessage.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        main_WelcomeBackMessage.setForeground(new java.awt.Color(0, 0, 0));
        main_WelcomeBackMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main_WelcomeBackMessage.setText("Welcome Back USER_NAME USER_SURNAME");
        main_WelcomeBackMessage.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        main_NextClassLabel.setBackground(new java.awt.Color(2, 31, 84));
        main_NextClassLabel.setLayout(null);

        main_NextClassHeader.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        main_NextClassHeader.setForeground(new java.awt.Color(255, 255, 255));
        main_NextClassHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main_NextClassHeader.setText("Your next class:");
        main_NextClassLabel.add(main_NextClassHeader);
        main_NextClassHeader.setBounds(6, 6, 330, 19);

        main_NextClassNameCode.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        main_NextClassNameCode.setForeground(new java.awt.Color(255, 255, 255));
        main_NextClassNameCode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main_NextClassNameCode.setText("CLASS_NAME — CLASS_CODE");
        main_NextClassLabel.add(main_NextClassNameCode);
        main_NextClassNameCode.setBounds(10, 40, 320, 19);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Duration : START_TIME — END_TIME");
        main_NextClassLabel.add(jLabel1);
        jLabel1.setBounds(10, 70, 320, 19);

        jButton2.setBackground(new java.awt.Color(2, 31, 84));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText(">");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        main_NextClassLabel.add(jButton2);
        jButton2.setBounds(300, 90, 38, 32);

        jButton3.setBackground(new java.awt.Color(2, 31, 84));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Navigate to Class");

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(main_BackButton)
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(main_WelcomeBackMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(main_NextClassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addComponent(main_BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(main_WelcomeBackMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(main_NextClassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );

        parentPanel.add(pnlHome, "card3");

        getContentPane().add(parentPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents



    
//////////      LOGIN SCREEN        //////////
    private void login_UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_login_UsernameFocusGained
        if (login_Username.getText().equals("Student ID / Pearson Email")) {        //code for showing text hints the login screentextboxes
            login_Username.setText("");
            login_Username.setForeground(Color.black);
        } 
    }//GEN-LAST:event_login_UsernameFocusGained

    private void login_UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_login_UsernameFocusLost
        if (login_Username.getText().equals("")) {
            login_Username.setText("Student ID / Pearson Email");
            login_Username.setForeground(new Color(153,153,153));
        }    
    }//GEN-LAST:event_login_UsernameFocusLost

    private void login_PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_login_PasswordFocusGained
        if (login_Password.getText().equals("Password")) {
            login_Password.setText("");
            login_Password.setForeground(Color.black);
        }
    }//GEN-LAST:event_login_PasswordFocusGained

    private void login_PasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_login_PasswordFocusLost
        if (login_Password.getText().equals("")) {
            login_Password.setText("Password");
            login_Password.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_login_PasswordFocusLost

    private void login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_ButtonActionPerformed
        User user = new User();
        if (user.userLoginTest(login_Username.getText(), login_Password.getText())) {//test login button, will work with database
            parentPanel.removeAll();
            parentPanel.add(pnlHome);
            parentPanel.repaint();
            parentPanel.revalidate();
            if (!login_RememberDetails.isSelected()) {
                login_Password.setText("Password");
                login_Password.setForeground(new Color(153,153,153));
                login_Username.setText("Student ID / Pearson Email");
                login_Username.setForeground(new Color(153,153,153));
            }
        } else {
            login_Password.setText("Password");
            login_Password.setForeground(new Color(153,153,153));
            login_Username.setText("Student ID / Pearson Email");
            login_Username.setForeground(new Color(153,153,153));
            JOptionPane.showMessageDialog(parentPanel,"Incorrect Username or Password", "", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_login_ButtonActionPerformed
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



//////////          MAIN SCREEN         //////////
    private void main_BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main_BackButtonActionPerformed
        parentPanel.removeAll();
        parentPanel.add(pnlLogin);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_main_BackButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
            java.util.logging.Logger.getLogger(frmTimeMinus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTimeMinus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTimeMinus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTimeMinus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTimeMinus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel login_AppName;
    private javax.swing.JButton login_Button;
    private javax.swing.JLabel login_CookiesLink;
    private javax.swing.JLabel login_ForgottenLink;
    private javax.swing.JLabel login_Logo;
    private javax.swing.JTextField login_Password;
    private javax.swing.JCheckBox login_RememberDetails;
    private javax.swing.JTextField login_Username;
    private javax.swing.JLabel login_detailsHeader;
    private javax.swing.JPanel login_detailsPanel;
    private javax.swing.JButton main_BackButton;
    private javax.swing.JLabel main_NextClassHeader;
    private javax.swing.JPanel main_NextClassLabel;
    private javax.swing.JLabel main_NextClassNameCode;
    private javax.swing.JLabel main_WelcomeBackMessage;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlLoginExtra;
    // End of variables declaration//GEN-END:variables
}
