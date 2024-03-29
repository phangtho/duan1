/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan1.ui;

import com.duan1.DAO.GiaoVienDAO;
import com.duan1.DAO.HocSinhDAO;
import com.duan1.helper.DialogHelper;
import com.duan1.helper.ShareHelper;
import com.duan1.model.GiaoVien;
import com.duan1.model.HocSinh;

/**
 *
 * @author Viet Anh
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form DangNhapJFrame
     */
    public MainJFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    HocSinhDAO hsdao = new HocSinhDAO();
    GiaoVienDAO gvdao = new GiaoVienDAO();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btDangNhap = new javax.swing.JButton();
        btKetThuc = new javax.swing.JButton();
        btDangKy = new javax.swing.JButton();
        txPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(563, 282));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/Thrive-security-icon.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("ĐĂNG NHẬP");

        txUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txUser.setText("quanld");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Password");

        btDangNhap.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btDangNhap.setText("Đăng nhập");
        btDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDangNhapActionPerformed(evt);
            }
        });

        btKetThuc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btKetThuc.setText("Kết thúc");
        btKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKetThucActionPerformed(evt);
            }
        });

        btDangKy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btDangKy.setText("Đăng ký");
        btDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDangKyActionPerformed(evt);
            }
        });

        txPass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txPass.setText("abc");
        txPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txPass)
                            .addComponent(txUser)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btDangNhap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btKetThuc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addComponent(btDangKy)
                        .addGap(29, 29, 29))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txUser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDangNhap)
                    .addComponent(btKetThuc)
                    .addComponent(btDangKy))
                .addContainerGap(59, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDangNhapActionPerformed
        // TODO add your handling code here:
        login();
    }//GEN-LAST:event_btDangNhapActionPerformed

    private void btKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKetThucActionPerformed
        // TODO add your handling code here:
        exit();
    }//GEN-LAST:event_btKetThucActionPerformed

    private void btDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDangKyActionPerformed
        // TODO add your handling code here:
        openDangKy();
        this.dispose();
    }//GEN-LAST:event_btDangKyActionPerformed

    private void txPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txPassActionPerformed
    void exit() {
        if (DialogHelper.confirm(this, "Bạn có muốn thoát khỏi ứng dụng không?")) {
            System.exit(0);
        }
    }
     void openDangKy(){
        DangKyJFrame dk = new DangKyJFrame();
        dk.setVisible(true);
    }
     void login() {
        String id = txUser.getText(); 
        String matKhau = new String(txPass.getPassword()); 
        try {
            GiaoVien gv = gvdao.findByID(id);
            if(gv != null){
                String matKhau2 = gv.getPass().trim(); 
                if(matKhau.equals(matKhau2)){ 
                    ShareHelper.USERGV = gv; 
                    DialogHelper.alert(this, "Đăng nhập thành công!"); 
                    this.dispose();
                    openMain();
                } 
                else{
                    DialogHelper.alert(this, "Sai mật khẩu!");
                } 
            }
            HocSinh hocSinh = hsdao.findByID(id);
            if(hocSinh != null){ 
                String matKhau2 = hocSinh.getMatKhau().trim(); 
                if(matKhau.equals(matKhau2)){ 
                    ShareHelper.USER = hocSinh; 
                    DialogHelper.alert(this, "Đăng nhập thành công!"); 
                    this.dispose();
                    openMain();
                } 
                else{
                    DialogHelper.alert(this, "Sai mật khẩu!");
                } 
            } 
            else if(gv == null && hocSinh == null){ 
                DialogHelper.alert(this, "Sai tên đăng nhập!"); 
            } 
        }  
        catch (Exception e) { 
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!"+e); 
        } 
     }
     void openMain() {
         GiaoDienJFrame main = new GiaoDienJFrame();
         main.setVisible(true);
     }
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDangKy;
    private javax.swing.JButton btDangNhap;
    private javax.swing.JButton btKetThuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txPass;
    private javax.swing.JTextField txUser;
    // End of variables declaration//GEN-END:variables
}
