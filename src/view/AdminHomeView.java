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
public class AdminHomeView extends javax.swing.JFrame {

    /**
     * Creates new form AdminHomeView
     */
    private int x;
    private int y;
    private UserController controller;

    public AdminHomeView(UserController controller) {
        this.controller = controller;
        initComponents();
        setComponents();
        frameSetting();
    }

    private void setComponents() {
        setLocationRelativeTo(null);
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
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        employeeLabel = new javax.swing.JLabel();
        departmentLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundPane.setBackground(new java.awt.Color(255, 255, 255));
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

        backgroundPane.add(frameBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(778, 22, 82, 30));

        jLabel1.setFont(new java.awt.Font("Baloo Bhai", 0, 82)); // NOI18N
        jLabel1.setText("ADMIN");
        backgroundPane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 52, -1, -1));

        jLabel2.setFont(new java.awt.Font("Baloo Bhai", 0, 45)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(52, 65, 143));
        jLabel2.setText("DASHBOARD");
        backgroundPane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 143, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Saly-12 1.png"))); // NOI18N
        backgroundPane.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 70, 575, 575));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ellipse_1.png"))); // NOI18N
        backgroundPane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 475, 475));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ellipse_2.png"))); // NOI18N
        backgroundPane.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 398, 398));

        employeeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/employee_btn.png"))); // NOI18N
        employeeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        employeeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeLabelMouseClicked(evt);
            }
        });
        backgroundPane.add(employeeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 282, 272, 58));

        departmentLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/department_btn.png"))); // NOI18N
        departmentLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        departmentLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                departmentLabelMouseClicked(evt);
            }
        });
        backgroundPane.add(departmentLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 378, 272, 58));

        jLabel6.setFont(new java.awt.Font("Montserrat Medium", 0, 20)); // NOI18N
        jLabel6.setText("Sign out");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        backgroundPane.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 450, -1, -1));

        getContentPane().add(backgroundPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        setBounds(0, 0, 900, 600);
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

    private void employeeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeLabelMouseClicked
        new SecondHomeView(1, controller).setVisible(true);
        dispose();
    }//GEN-LAST:event_employeeLabelMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        dispose();
        new LoginView(controller).setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void departmentLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmentLabelMouseClicked
        dispose();
        new SecondHomeView(2, controller).setVisible(true);
    }//GEN-LAST:event_departmentLabelMouseClicked

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
            java.util.logging.Logger.getLogger(AdminHomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdminHomeView(null).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPane;
    private javax.swing.JLabel departmentLabel;
    private javax.swing.JLabel employeeLabel;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JPanel frameBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel minLabel;
    // End of variables declaration//GEN-END:variables
}
