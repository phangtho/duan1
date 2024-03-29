/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan1.ui;

import com.duan1.DAO.GiaoVienDAO;
import com.duan1.helper.DialogHelper;
import com.duan1.model.GiaoVien;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class GiaoVienJFrame extends javax.swing.JInternalFrame {
    GiaoVienDAO dao = new GiaoVienDAO();
    int index;
    /**
     * Creates new form GiaoVien
     */
    public GiaoVienJFrame() {
        initComponents();
    }
    public void load() {
        DefaultTableModel model = (DefaultTableModel)tbDanhSach.getModel();
        model.setRowCount(0);
        try {
            List<GiaoVien> list = dao.select();
            for (GiaoVien gv : list ) {
                Object[] row = {
                    gv.getId(),
                    gv.getTen(),
                    gv.getPass(),
                    gv.getEmail()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }
    void insert() {
        GiaoVien model = getModel();
        if(txMa.getText().length()<5){
           DialogHelper.alert(this, "Mã giáo viên phải nhập ít nhất 5 ký tự");
           return;
       }
       else if(!txMa.getText().matches("[a-zA-Z0-9]{5,}")){
           DialogHelper.alert(this, "Mã giáo viên chỉ được dùng ký tự chữ hoặc số");
           return;
       }
       else if(txPass.getText().length()<5){
           DialogHelper.alert(this, "Mật khẩu phải trên 5 ký tự");
           return;
       }
       else if(txTen.getText().equals("")){
           DialogHelper.alert(this, "Phải nhập họ tên giáo viên");
           return;
       }
       else if(!txTen.getText().matches("[a-zA-Z ]{1,}")){
           DialogHelper.alert(this, "Tên giáo viên chỉ được dùng ký tự chữ và khoảng trắng");
           return;
       }
       else if (!txEmail.getText().matches("\\w+@\\w+(\\.\\w+){1,2}")) {
            DialogHelper.alert(this, "Nhập sai định dạng email");
            return;
       }
        else{
        String confirm = new String(txXacNhan.getPassword());
        if (confirm.equals(model.getPass().trim())) {
            try {
                dao.insert(model);
                this.load();
                this.clear();
                DialogHelper.alert(this, "Thêm mới thành công!");
            } catch (Exception e) {
                DialogHelper.alert(this, "Thêm mới thất bại!");
            }
        } else {
            DialogHelper.alert(this, "Xác nhận mật khẩu không khớp! Thêm mới thất bại!");
        }
        }
    }
    void update() {
        GiaoVien model = getModel();

        String confirm = new String(txXacNhan.getPassword());
        if (!confirm.equals(model.getPass())) {
            DialogHelper.alert(this, "Xác nhận mật khẩu không đúng!");
            return;
        }
        else if(txPass.getText().length()<5){
           DialogHelper.alert(this, "Mật khẩu phải trên 5 ký tự");
           return;
       }
       else if(txTen.getText().equals("")){
           DialogHelper.alert(this, "Phải nhập họ tên giáo viên");
           return;
       }
       else if(!txTen.getText().matches("[a-zA-Z ]{1,}")){
           DialogHelper.alert(this, "Tên giáo viên chỉ được dùng ký tự chữ và khoảng trắng");
           return;
       }
       else if (!txEmail.getText().matches("\\w+@\\w+(\\.\\w+){1,2}")) {
            DialogHelper.alert(this, "Nhập sai định dạng email");
            return;
       }
        else {
            try {
                dao.update(model);
                this.load();
                DialogHelper.alert(this, "Cập nhật thành công!");
            } catch (Exception e) {
                DialogHelper.alert(this, "Cập nhật thất bại!");
            }
        }
    }

    void delete() {
      
            if (DialogHelper.confirm(this, "Bạn thực sự muốn xóa giáo viên này?")) {
                String magv = txMa.getText();
                try {
                    dao.delete(magv);
                    this.load();
                    this.clear();
                    DialogHelper.alert(this, "Xóa thành công!");
                } catch (Exception e) {
                    DialogHelper.alert(this, "Xóa thành công!");
                }
            }
    }
    void clear() {
        txMa.setText("");
        txTen.setText("");
        txPass.setText("");
        txXacNhan.setText("");
        txEmail.setText("");
    }
    void setModel(GiaoVien model) {
        txMa.setText(model.getId().trim());
        txTen.setText(model.getTen());
        txPass.setText(model.getPass().trim());
        txXacNhan.setText(model.getPass().trim());
        txEmail.setText(model.getEmail());
    }

    GiaoVien getModel() {
        GiaoVien model = new GiaoVien() ;
            model.setId(txMa.getText().trim());
            model.setTen(txTen.getText());
            model.setPass(new String(txPass.getPassword()));
            model.setEmail(txEmail.getText());
        
        return model;
    }
     void edit() {
        try {
            String gvid = (String) tbDanhSach.getValueAt(this.index, 0);
            GiaoVien model = dao.findByID(gvid);
            if (model != null) {
                this.setModel(model);
                this.setStatus(false);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }
     void setStatus(boolean insertable) {
        


        boolean first = this.index > 0;
        boolean last = this.index < tbDanhSach.getRowCount() - 1;
        btFirst.setEnabled(!insertable && first);
        btPrev.setEnabled(!insertable && first);
        btNext.setEnabled(!insertable && last);
        btLast.setEnabled(!insertable && last);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pCapNhat = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txMa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txPass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        txTen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txXacNhan = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txEmail = new javax.swing.JTextField();
        btAdd = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btNew = new javax.swing.JButton();
        btLast = new javax.swing.JButton();
        btNext = new javax.swing.JButton();
        btPrev = new javax.swing.JButton();
        btFirst = new javax.swing.JButton();
        pDanhSach = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDanhSach = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("QUẢN LÝ GIÁO VIÊN");

        jLabel2.setText("Mã giáo viên");

        jLabel3.setText("Mật khẩu");

        jLabel4.setText("Họ và tên");

        jLabel5.setText("Xác nhận mật khẩu");

        jLabel6.setText("Địa chỉ email");

        btAdd.setText("Thêm");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btUpdate.setText("Sửa");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        btDelete.setText("Xóa");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btNew.setText("Mới");
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });

        btLast.setText(">|");
        btLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLastActionPerformed(evt);
            }
        });

        btNext.setText(">>");
        btNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNextActionPerformed(evt);
            }
        });

        btPrev.setText("<<");
        btPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrevActionPerformed(evt);
            }
        });

        btFirst.setText("|<");
        btFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFirstActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pCapNhatLayout = new javax.swing.GroupLayout(pCapNhat);
        pCapNhat.setLayout(pCapNhatLayout);
        pCapNhatLayout.setHorizontalGroup(
            pCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txMa)
            .addComponent(txPass)
            .addComponent(txTen)
            .addComponent(txXacNhan)
            .addComponent(txEmail)
            .addGroup(pCapNhatLayout.createSequentialGroup()
                .addGroup(pCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pCapNhatLayout.createSequentialGroup()
                .addComponent(btAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(btFirst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPrev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btNext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btLast))
        );
        pCapNhatLayout.setVerticalGroup(
            pCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCapNhatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txMa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txTen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdd)
                    .addComponent(btUpdate)
                    .addComponent(btDelete)
                    .addComponent(btNew)
                    .addComponent(btLast)
                    .addComponent(btNext)
                    .addComponent(btPrev)
                    .addComponent(btFirst))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tabs.addTab("CẬP NHẬT", pCapNhat);

        tbDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ GV", "HỌ VÀ TÊN", "Mật Khẩu", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbDanhSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDanhSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDanhSach);
        if (tbDanhSach.getColumnModel().getColumnCount() > 0) {
            tbDanhSach.getColumnModel().getColumn(1).setResizable(false);
            tbDanhSach.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout pDanhSachLayout = new javax.swing.GroupLayout(pDanhSach);
        pDanhSach.setLayout(pDanhSachLayout);
        pDanhSachLayout.setHorizontalGroup(
            pDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );
        pDanhSachLayout.setVerticalGroup(
            pDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDanhSachLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("DANH SÁCH", pDanhSach);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabs)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDanhSachMouseClicked
        // TODO add your handling code here:
         if (evt.getClickCount() == 2) {
            this.index = tbDanhSach.rowAtPoint(evt.getPoint());
            if (this.index >= 0) {
                this.edit();
                tabs.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_tbDanhSachMouseClicked

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_btAddActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btUpdateActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        // TODO add your handling code here:
        clear();
        this.setStatus(true);
    }//GEN-LAST:event_btNewActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        this.load();
        this.setStatus(true);
    }//GEN-LAST:event_formInternalFrameOpened

    private void btFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFirstActionPerformed
        // TODO add your handling code here:
         this.index = 0;
        this.edit();
    }//GEN-LAST:event_btFirstActionPerformed

    private void btPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrevActionPerformed
        // TODO add your handling code here:
         this.index--;
        this.edit();
    }//GEN-LAST:event_btPrevActionPerformed

    private void btNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNextActionPerformed
        // TODO add your handling code here:
         this.index++;
        this.edit();
    }//GEN-LAST:event_btNextActionPerformed

    private void btLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLastActionPerformed
        // TODO add your handling code here:
        this.index = tbDanhSach.getRowCount() - 1;
        this.edit();
    }//GEN-LAST:event_btLastActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btFirst;
    private javax.swing.JButton btLast;
    private javax.swing.JButton btNew;
    private javax.swing.JButton btNext;
    private javax.swing.JButton btPrev;
    private javax.swing.JButton btUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pCapNhat;
    private javax.swing.JPanel pDanhSach;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tbDanhSach;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextField txMa;
    private javax.swing.JPasswordField txPass;
    private javax.swing.JTextField txTen;
    private javax.swing.JPasswordField txXacNhan;
    // End of variables declaration//GEN-END:variables
}
