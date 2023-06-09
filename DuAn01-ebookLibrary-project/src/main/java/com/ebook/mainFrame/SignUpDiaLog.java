/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.ebook.mainFrame;

import com.ebooks.dao.ThongTinNguoiDungDAO;

import com.ebooks.dao.TaiKhoanDAO;
import com.ebooks.helper.DialogHelper;
import com.ebooks.helper.UtilityHelper;

import com.ebooks.model.TaiKhoan;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Time;
import java.util.List;
import java.util.Properties;
import java.util.regex.Pattern;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thinh
 */
public class SignUpDiaLog extends javax.swing.JDialog {

 
    public SignUpDiaLog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        initMoving(this, pnlMainDialog);
      

    }

    private int x;
    private int y;

    public void initMoving(JDialog DiaLog, JPanel panel) {
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX();
                y = me.getY();
            }

        });
        panel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                DiaLog.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }
        });
    }

  

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlMainDialog = new com.ebooks.Compoment.PanelBorder();
        imageBoder2 = new com.ebooks.Compoment.ImageBoder();
        jLabel2 = new javax.swing.JLabel();
        btnTaoTaiKhoan = new com.ebooks.Compoment.MyButton();
        lblTenDangNhap = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblXacNhan = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnTaoTaiKhoan1 = new com.ebooks.Compoment.MyButton();
        txtTenDangNhap = new com.ebooks.Compoment.txtFieldBoder();
        txtXacNhan = new javax.swing.JPasswordField();
        txtMatKhau1 = new javax.swing.JPasswordField();
        lblMatKhau1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        pnlMainDialog.setBackground(new java.awt.Color(255, 255, 255));
        pnlMainDialog.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imageBoder2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ebooks/Image/2d23848e893747691e26.jpg"))); // NOI18N
        imageBoder2.setRadius(25);
        pnlMainDialog.add(imageBoder2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 380, 380));

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 30)); // NOI18N
        jLabel2.setText("Đăng ký vào Nerds");
        pnlMainDialog.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        btnTaoTaiKhoan.setBackground(new java.awt.Color(87, 190, 110));
        btnTaoTaiKhoan.setBorder(null);
        btnTaoTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        btnTaoTaiKhoan.setText("Tạo Tài Khoản");
        btnTaoTaiKhoan.setBoderColor(new java.awt.Color(87, 190, 110));
        btnTaoTaiKhoan.setColorOver(new java.awt.Color(54, 172, 63));
        btnTaoTaiKhoan.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        btnTaoTaiKhoan.setRadius(10);
        btnTaoTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoTaiKhoanActionPerformed(evt);
            }
        });
        pnlMainDialog.add(btnTaoTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 140, 40));

        lblTenDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTenDangNhap.setText("Tên Đăng Nhập");
        pnlMainDialog.add(lblTenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        pnlMainDialog.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 50, 50));

        lblXacNhan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblXacNhan.setText("Xác Nhận");
        pnlMainDialog.add(lblXacNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ebooks/Image/nerds-removebg-preview.png"))); // NOI18N
        pnlMainDialog.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnTaoTaiKhoan1.setBackground(new java.awt.Color(87, 190, 110));
        btnTaoTaiKhoan1.setBorder(null);
        btnTaoTaiKhoan1.setForeground(new java.awt.Color(255, 255, 255));
        btnTaoTaiKhoan1.setText("Trở về");
        btnTaoTaiKhoan1.setBoderColor(new java.awt.Color(87, 190, 110));
        btnTaoTaiKhoan1.setColorOver(new java.awt.Color(54, 172, 63));
        btnTaoTaiKhoan1.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        btnTaoTaiKhoan1.setRadius(10);
        btnTaoTaiKhoan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoTaiKhoan1ActionPerformed(evt);
            }
        });
        pnlMainDialog.add(btnTaoTaiKhoan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, 60, 40));

        txtTenDangNhap.setBackground(new java.awt.Color(220, 250, 220));
        txtTenDangNhap.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtTenDangNhap.setRadius(10);
        pnlMainDialog.add(txtTenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 460, 40));

        txtXacNhan.setBackground(new java.awt.Color(220, 250, 220));
        txtXacNhan.setText("jPasswordField1");
        pnlMainDialog.add(txtXacNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 220, 40));

        txtMatKhau1.setBackground(new java.awt.Color(220, 250, 220));
        txtMatKhau1.setText("jPasswordField1");
        pnlMainDialog.add(txtMatKhau1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 210, 40));

        lblMatKhau1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMatKhau1.setText("Mật Khẩu");
        pnlMainDialog.add(lblMatKhau1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainDialog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainDialog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaoTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoTaiKhoanActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_btnTaoTaiKhoanActionPerformed

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded

    }//GEN-LAST:event_jLabel1AncestorAdded

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnTaoTaiKhoan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoTaiKhoan1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new LogInDiaLog(null, true).setVisible(true);
    }//GEN-LAST:event_btnTaoTaiKhoan1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUpDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SignUpDiaLog dialog = new SignUpDiaLog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.ebooks.Compoment.MyButton btnTaoTaiKhoan;
    private com.ebooks.Compoment.MyButton btnTaoTaiKhoan1;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.ebooks.Compoment.ImageBoder imageBoder2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblMatKhau1;
    private javax.swing.JLabel lblTenDangNhap;
    private javax.swing.JLabel lblXacNhan;
    private com.ebooks.Compoment.PanelBorder pnlMainDialog;
    private javax.swing.JPasswordField txtMatKhau1;
    private com.ebooks.Compoment.txtFieldBoder txtTenDangNhap;
    private javax.swing.JPasswordField txtXacNhan;
    // End of variables declaration//GEN-END:variables
}
