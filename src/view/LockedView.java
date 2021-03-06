/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Point;
import javax.swing.ImageIcon;
import services.UserController;

/**
 *
 * @author ACER
 */
public class LockedView extends javax.swing.JFrame {

    /**
     * Creates new form LockedView
     */
    private int x;
    private int y;
    private UserController controller;

    public LockedView(UserController controller) {
        this.controller = controller;
        initComponents();
        setComponents();
        frameSetting();
    }

    private void setComponents() {
        setLocationRelativeTo(null);
        backButton.setFocusable(false);
    }

    private void frameSetting() {
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/assets/iconLogo.png"));
        this.setIconImage(imageIcon.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPane = new javax.swing.JPanel();
        frameBar = new javax.swing.JPanel();
        minLabel = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        backgroundPane.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPane.setPreferredSize(new java.awt.Dimension(700, 500));
        backgroundPane.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                backgroundPaneMouseDragged(evt);
            }
        });
        backgroundPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backgroundPaneMousePressed(evt);
            }
        });
        backgroundPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        frameBar.setBackground(new java.awt.Color(255, 255, 255));
        frameBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_minus_48px_1 1.png"))); // NOI18N
        minLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minLabelMouseClicked(evt);
            }
        });
        frameBar.add(minLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        exitLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/exitButton.png"))); // NOI18N
        exitLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        frameBar.add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 30, 30));

        backgroundPane.add(frameBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 17, 82, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/locked_illustration.png"))); // NOI18N
        jLabel1.setToolTipText("");
        backgroundPane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 134, 408, 272));

        jLabel2.setFont(new java.awt.Font("Montserrat SemiBold", 2, 35)); // NOI18N
        jLabel2.setText("OOPS");
        backgroundPane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 192, -1, -1));

        jLabel3.setFont(new java.awt.Font("Montserrat SemiBold", 2, 35)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(1, 209, 143));
        jLabel3.setText("!");
        backgroundPane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 192, -1, -1));

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 15)); // NOI18N
        jLabel5.setText("You seemed to be lock out.");
        backgroundPane.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, 50));

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 15)); // NOI18N
        jLabel6.setText("In  your  account has been");
        backgroundPane.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, 50));

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 15)); // NOI18N
        jLabel4.setText("logged in three times.");
        backgroundPane.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, 50));

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/arrow-left.png"))); // NOI18N
        backButton.setText("Back to login");
        backButton.setBorder(null);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        backgroundPane.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 347, 106, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo_small.png"))); // NOI18N
        backgroundPane.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 19, 89, 34));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setBounds(0, 0, 700, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void minLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minLabelMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minLabelMouseClicked

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void backgroundPaneMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundPaneMouseDragged
        Point coord = evt.getLocationOnScreen();
        setLocation(coord.x - x, coord.y - y);
    }//GEN-LAST:event_backgroundPaneMouseDragged

    private void backgroundPaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundPaneMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_backgroundPaneMousePressed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        new LoginView(controller).setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LockedView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LockedView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LockedView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LockedView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LockedView(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel backgroundPane;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JPanel frameBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel minLabel;
    // End of variables declaration//GEN-END:variables
}
