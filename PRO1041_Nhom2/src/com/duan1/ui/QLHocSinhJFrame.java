/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan1.ui;

import com.duan1.DAO.HocSinhDAO;
import com.duan1.helper.DateHelper;
import com.duan1.helper.DialogHelper;
import com.duan1.helper.ShareHelper;
import com.duan1.model.HocSinh;
import java.awt.HeadlessException;
import java.sql.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class QLHocSinhJFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form QLHocSinh
     */
    public QLHocSinhJFrame() {
        initComponents();
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
        pThongTin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txMa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbGioiTinh = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txNgaySinh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txGhiChu = new javax.swing.JTextArea();
        btAdd = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btNew = new javax.swing.JButton();
        btLast = new javax.swing.JButton();
        btNext = new javax.swing.JButton();
        btPrev = new javax.swing.JButton();
        btFirst = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txPass = new javax.swing.JTextField();
        pDanhSach = new javax.swing.JPanel();
        pTimKiem = new javax.swing.JPanel();
        txTim = new javax.swing.JTextField();
        btTim = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDanhSach = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setMinimumSize(new java.awt.Dimension(704, 763));
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
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("QUẢN LÝ HỌC SINH");

        tabs.setMinimumSize(new java.awt.Dimension(658, 649));

        jLabel2.setText("Mã học sinh");

        jLabel3.setText("Tên học sinh");

        jLabel4.setText("Giới tính");

        cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nam", "Nữ" }));

        jLabel5.setText("Ngày sinh");

        jLabel6.setText("Địa chỉ email");

        jLabel7.setText("Ghi chú");

        txGhiChu.setColumns(20);
        txGhiChu.setRows(5);
        jScrollPane1.setViewportView(txGhiChu);

        btAdd.setText("Thêm");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btUpdate.setText("Sửa");
        btUpdate.setEnabled(false);
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        btDelete.setText("Xóa");
        btDelete.setEnabled(false);
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
        btLast.setEnabled(false);
        btLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLastActionPerformed(evt);
            }
        });

        btNext.setText(">>");
        btNext.setEnabled(false);
        btNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNextActionPerformed(evt);
            }
        });

        btPrev.setText("<<");
        btPrev.setEnabled(false);
        btPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrevActionPerformed(evt);
            }
        });

        btFirst.setText("|<");
        btFirst.setEnabled(false);
        btFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFirstActionPerformed(evt);
            }
        });

        jLabel8.setText("Mật khẩu");

        javax.swing.GroupLayout pThongTinLayout = new javax.swing.GroupLayout(pThongTin);
        pThongTin.setLayout(pThongTinLayout);
        pThongTinLayout.setHorizontalGroup(
            pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txMa)
            .addComponent(txPass)
            .addGroup(pThongTinLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addContainerGap(593, Short.MAX_VALUE))
            .addComponent(txTen)
            .addGroup(pThongTinLayout.createSequentialGroup()
                .addGroup(pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txNgaySinh)))
            .addComponent(txEmail)
            .addComponent(jScrollPane1)
            .addGroup(pThongTinLayout.createSequentialGroup()
                .addComponent(btAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btFirst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPrev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btNext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btLast))
            .addGroup(pThongTinLayout.createSequentialGroup()
                .addGroup(pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pThongTinLayout.setVerticalGroup(
            pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pThongTinLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdd)
                    .addComponent(btUpdate)
                    .addComponent(btDelete)
                    .addComponent(btNew)
                    .addComponent(btLast)
                    .addComponent(btNext)
                    .addComponent(btPrev)
                    .addComponent(btFirst))
                .addContainerGap(198, Short.MAX_VALUE))
        );

        tabs.addTab("THÔNG TIN", pThongTin);

        pTimKiem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TÌM KIẾM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btTim.setText("Tìm");
        btTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pTimKiemLayout = new javax.swing.GroupLayout(pTimKiem);
        pTimKiem.setLayout(pTimKiemLayout);
        pTimKiemLayout.setHorizontalGroup(
            pTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txTim)
                .addGap(18, 18, 18)
                .addComponent(btTim, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        pTimKiemLayout.setVerticalGroup(
            pTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTimKiemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTim))
                .addContainerGap())
        );

        tbDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HS", "Họ tên", "Giới tính", "Ngày sinh", "Email", "Người tạo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        jScrollPane2.setViewportView(tbDanhSach);
        if (tbDanhSach.getColumnModel().getColumnCount() > 0) {
            tbDanhSach.getColumnModel().getColumn(0).setResizable(false);
            tbDanhSach.getColumnModel().getColumn(1).setResizable(false);
            tbDanhSach.getColumnModel().getColumn(2).setResizable(false);
            tbDanhSach.getColumnModel().getColumn(3).setResizable(false);
            tbDanhSach.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout pDanhSachLayout = new javax.swing.GroupLayout(pDanhSach);
        pDanhSach.setLayout(pDanhSachLayout);
        pDanhSachLayout.setHorizontalGroup(
            pDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
            .addComponent(pTimKiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pDanhSachLayout.setVerticalGroup(
            pDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDanhSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE))
        );

        tabs.addTab("DANH SÁCH", pDanhSach);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        
    }//GEN-LAST:event_btNewActionPerformed

    private void btTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimActionPerformed
        // TODO add your handling code here:
        this.load();
        clear();
    }//GEN-LAST:event_btTimActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btFirst;
    private javax.swing.JButton btLast;
    private javax.swing.JButton btNew;
    private javax.swing.JButton btNext;
    private javax.swing.JButton btPrev;
    private javax.swing.JButton btTim;
    private javax.swing.JButton btUpdate;
    private javax.swing.JComboBox cbGioiTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pDanhSach;
    private javax.swing.JPanel pThongTin;
    private javax.swing.JPanel pTimKiem;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tbDanhSach;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextArea txGhiChu;
    private javax.swing.JTextField txMa;
    private javax.swing.JTextField txNgaySinh;
    private javax.swing.JTextField txPass;
    private javax.swing.JTextField txTen;
    private javax.swing.JTextField txTim;
    // End of variables declaration//GEN-END:variables

    int index = 0;
    HocSinhDAO dao = new HocSinhDAO();
    
    void load(){
        DefaultTableModel model = (DefaultTableModel) tbDanhSach.getModel();
        model.setRowCount(0);
        try {
            String keyword = txTim.getText();
            List<HocSinh> list = dao.selectByKeyword(keyword);
            for (HocSinh hs : list) {
                Object[] row = {
                    hs.getId(),
                    hs.getTen(),
                    hs.getGioiTinh() ? "Nam" : "Nữ",
                    hs.getNgaySinh(),
                    hs.getEmail(),
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
            e.printStackTrace();
        }
    }
    
    void insert() {
       HocSinh model = getModel();
       if(txMa.getText().length()<5){
           DialogHelper.alert(this, "Mã học sinh phải nhập ít nhất 5 ký tự");
           return;
       }
       else if(!txMa.getText().matches("[a-zA-Z0-9]{5,}")){
           DialogHelper.alert(this, "Mã học sinh chỉ được dùng ký tự chữ hoặc số");
           return;
       }
       else if(txPass.getText().length()<5){
           DialogHelper.alert(this, "Mật khẩu phải trên 5 ký tự");
           return;
       }
       else if(txTen.getText().equals("")){
           DialogHelper.alert(this, "Phải nhập họ tên học sinh");
           return;
       }
       else if (!txEmail.getText().matches("\\w+@+\\w+(\\.+\\w){1,2}")) {
            DialogHelper.alert(this, "Nhập sai định dạng email");
            return;
        }
        else{
          try   {
                dao.insert(model);
                this.load();
                this.clear();
                DialogHelper.alert(this, "Thêm mới thành công!");
            } catch (Exception e) {
                DialogHelper.alert(this, "Thêm mới thất bại!");
            }
            
        }
    }

    void update() {
        HocSinh model = getModel();
         if(txPass.getText().length()<5){
           DialogHelper.alert(this, "Mật khẩu phải trên 5 ký tự");
           return;
       }
       else if(txTen.getText().equals("")){
           DialogHelper.alert(this, "Phải nhập họ tên học sinh");
           return;
       }
       else if (!txEmail.getText().matches("\\w+@+\\w+(\\.+\\w){1,2}")) {
            DialogHelper.alert(this, "Nhập sai định dạng email");
            return;
        }
        else{
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
        if (DialogHelper.confirm(this, "Bạn thực sự muốn xóa người học này?")) {
            String maHS = txMa.getText();
            try {
                dao.delete(maHS);
                this.load();
                this.clear();
                DialogHelper.alert(this, "Xóa thành công!");
            } catch (HeadlessException e) {
                DialogHelper.alert(this, "Xóa thất bại!");         
        }
        }
    }
    
    void clear() {
        txMa.setText("");
        txTen.setText("");
        cbGioiTinh.setSelectedIndex(0);
        txNgaySinh.setText("");
        txEmail.setText("");
        txGhiChu.setText("");
        txPass.setText("");
        this.setStatus(true);
    }

    void edit() {
        try {
            String maHS = (String) tbDanhSach.getValueAt(this.index, 0);
          HocSinh model = dao.findByID(maHS);
            if (model != null) {
                this.setModel(model);
                this.setStatus(false);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    
    void setModel(HocSinh model) {
        txMa.setText(model.getId());
        txTen.setText(model.getTen());
        cbGioiTinh.setSelectedIndex(model.getGioiTinh() ? 0 : 1);
        txNgaySinh.setText(model.getNgaySinh());
        txEmail.setText(model.getEmail());
        txGhiChu.setText(model.getGhiChu());
        txPass.setText(model.getMatKhau());
    }

    HocSinh getModel() {
        HocSinh model = new HocSinh();
        model.setId(txMa.getText());
        model.setTen(txTen.getText());
        model.setGioiTinh(cbGioiTinh.getSelectedIndex() == 0);
        model.setNgaySinh(txNgaySinh.getText());
        model.setEmail(txEmail.getText());
        model.setGhiChu(txGhiChu.getText());
        model.setMatKhau(txPass.getText());
        return model;
    }

    void setStatus(boolean insertable) {
        txMa.setEditable(insertable);
        btAdd.setEnabled(insertable);
        btUpdate.setEnabled(!insertable);
        btDelete.setEnabled(!insertable);
        boolean first = this.index > 0;
        boolean last = this.index < tbDanhSach.getRowCount() - 1;
        btFirst.setEnabled(!insertable && first);
        btPrev.setEnabled(!insertable && first);
        btLast.setEnabled(!insertable && last);
        btNext.setEnabled(!insertable && last);
    }
}
