/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan1.ui;

import com.duan1.DAO.CauHoiDAO;
import com.duan1.helper.DateHelper;
import com.duan1.helper.DialogHelper;
import com.duan1.helper.JDBCHelper;
import com.duan1.model.CauHoi;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class CauHoiJFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form CauHoi
     */
    public CauHoiJFrame() {
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
        pCapNhat = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txMaCH = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbMon = new javax.swing.JComboBox();
        cbDe = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txCauHoi = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txDapAn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txDapAnSai1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txDapAnSai2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txDapAnSai3 = new javax.swing.JTextField();
        btAdd = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btNew = new javax.swing.JButton();
        btLast = new javax.swing.JButton();
        btNext = new javax.swing.JButton();
        btPrev = new javax.swing.JButton();
        btFirst = new javax.swing.JButton();
        pMon = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cbTimMon = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbMon = new javax.swing.JTable();

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
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("QUẢN LÝ CÂU HỎI");

        jLabel2.setText("Mã câu hỏi");

        txMaCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMaCHActionPerformed(evt);
            }
        });

        jLabel3.setText("Môn thi");

        jLabel4.setText("Đề tổng hợp");

        jLabel5.setText("Câu hỏi");

        txCauHoi.setColumns(20);
        txCauHoi.setRows(5);
        jScrollPane1.setViewportView(txCauHoi);

        jLabel6.setText("Đáp án");

        jLabel7.setText("Đáp án sai 1");

        jLabel8.setText("Đáp án sai 2");

        jLabel9.setText("Đáp án sai 3");

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

        javax.swing.GroupLayout pCapNhatLayout = new javax.swing.GroupLayout(pCapNhat);
        pCapNhat.setLayout(pCapNhatLayout);
        pCapNhatLayout.setHorizontalGroup(
            pCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txMaCH)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCapNhatLayout.createSequentialGroup()
                .addGroup(pCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(cbMon, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(pCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pCapNhatLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(304, 304, 304))
                    .addComponent(cbDe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jScrollPane1)
            .addGroup(pCapNhatLayout.createSequentialGroup()
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
            .addGroup(pCapNhatLayout.createSequentialGroup()
                .addGroup(pCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txDapAnSai2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(txDapAn, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(53, 53, 53)
                .addGroup(pCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCapNhatLayout.createSequentialGroup()
                        .addGroup(pCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addContainerGap())
                    .addComponent(txDapAnSai1)
                    .addComponent(txDapAnSai3)))
        );
        pCapNhatLayout.setVerticalGroup(
            pCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCapNhatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txMaCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txDapAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txDapAnSai1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txDapAnSai2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txDapAnSai3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addGroup(pCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdd)
                    .addComponent(btUpdate)
                    .addComponent(btDelete)
                    .addComponent(btNew)
                    .addComponent(btLast)
                    .addComponent(btNext)
                    .addComponent(btPrev)
                    .addComponent(btFirst))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        tabs.addTab("CẬP NHẬT", pCapNhat);

        jLabel11.setText("MÔN");

        cbTimMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTimMonActionPerformed(evt);
            }
        });

        tbMon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ CH", "MÃ ĐỀ", "CÂU HỎI", "ĐÁP ÁN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbMon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbMon);
        if (tbMon.getColumnModel().getColumnCount() > 0) {
            tbMon.getColumnModel().getColumn(0).setResizable(false);
            tbMon.getColumnModel().getColumn(0).setPreferredWidth(35);
            tbMon.getColumnModel().getColumn(1).setResizable(false);
            tbMon.getColumnModel().getColumn(2).setResizable(false);
            tbMon.getColumnModel().getColumn(2).setPreferredWidth(100);
            tbMon.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout pMonLayout = new javax.swing.GroupLayout(pMon);
        pMon.setLayout(pMonLayout);
        pMonLayout.setHorizontalGroup(
            pMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMonLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(pMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
                    .addGroup(pMonLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(cbTimMon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pMonLayout.setVerticalGroup(
            pMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbTimMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("MÔN ", pMon);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        this.load();
        fillToComboBoxDe();
        fillToComboBoxMon();
        fillToComboBoxTim();
        this.setStatus(true);
    }//GEN-LAST:event_formInternalFrameOpened

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
        // TODO add your handling code here
        clear();
    }//GEN-LAST:event_btNewActionPerformed

    private void btFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFirstActionPerformed
        // TODO add your handling code here:
        index =0;
       this.edit();
    }//GEN-LAST:event_btFirstActionPerformed

    private void btPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrevActionPerformed
        // TODO add your handling code here:
        index--;
        this.edit();
    }//GEN-LAST:event_btPrevActionPerformed

    private void btNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNextActionPerformed
        // TODO add your handling code here:
        index++;
        this.edit();
        
    }//GEN-LAST:event_btNextActionPerformed

    private void btLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLastActionPerformed
        // TODO add your handling code here:
        index = tbMon.getRowCount()-1;
        this.edit();
    }//GEN-LAST:event_btLastActionPerformed

    private void cbTimMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTimMonActionPerformed
        // TODO add your handling code here:
      fillToTableMon();
    }//GEN-LAST:event_cbTimMonActionPerformed

    private void tbMonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMonMouseClicked
        // TODO add your handling code here:
         if (evt.getClickCount() == 2) {
            this.index = tbMon.rowAtPoint(evt.getPoint());
            if (this.index >= 0) {
                this.edit();
                tabs.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_tbMonMouseClicked

    private void txMaCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMaCHActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txMaCHActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btFirst;
    private javax.swing.JButton btLast;
    private javax.swing.JButton btNew;
    private javax.swing.JButton btNext;
    private javax.swing.JButton btPrev;
    private javax.swing.JButton btUpdate;
    private javax.swing.JComboBox cbDe;
    private javax.swing.JComboBox cbMon;
    private javax.swing.JComboBox cbTimMon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pCapNhat;
    private javax.swing.JPanel pMon;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tbMon;
    private javax.swing.JTextArea txCauHoi;
    private javax.swing.JTextField txDapAn;
    private javax.swing.JTextField txDapAnSai1;
    private javax.swing.JTextField txDapAnSai2;
    private javax.swing.JTextField txDapAnSai3;
    private javax.swing.JTextField txMaCH;
    // End of variables declaration//GEN-END:variables
    
    int index = 0;
    CauHoiDAO dao = new CauHoiDAO();
    
    void load() {
        DefaultTableModel model = (DefaultTableModel) tbMon.getModel();
        model.setRowCount(0);
        try {
            List<CauHoi> list = dao.select();
            for (CauHoi ch : list) {
                Object[] row = {
                    ch.getId(),
                    ch.getDeTH(),
                    ch.getDeBai(),
                    ch.getDapAn(),              
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
        
    }
    
       void insert(){
      CauHoi model = getModel();
         if("".equals(txCauHoi.getText())){
           DialogHelper.alert(this, "Phải nhập câu hỏi");
           return;
       }
       else if(txDapAn.getText().equals("") || txDapAnSai1.getText().equals("") || txDapAnSai2.getText().equals("") || txDapAnSai3.getText().equals("")){
           DialogHelper.alert(this, "Phải nhập đầy đủ đáp án đúng và đáp án sai");
           return;
       }
       else{
      
           
          try   {
                dao.insert(model);
                this.load();
                this.clear();
                fillToTableMon();
                DialogHelper.alert(this, "Thêm mới thành công!");
            } catch (Exception e) {
                DialogHelper.alert(this, "Thêm mới thất bại!");
            }
       }
       }
    

    void update() {
        try{
        CauHoi model = getModel();
           if("".equals(txCauHoi.getText())){
           DialogHelper.alert(this, "Phải nhập câu hỏi");
           return;
       }
       else if(txDapAn.getText().equals("") || txDapAnSai1.getText().equals("") || txDapAnSai2.getText().equals("") || txDapAnSai3.getText().equals("")){
           DialogHelper.alert(this, "Phải nhập đầy đủ đáp án đúng và đáp án sai");
           return;
       }
       else{
            try {
                dao.update(model);
                this.load();
                fillToTableMon();
                DialogHelper.alert(this, "Cập nhật thành công!");
            } catch (Exception e) {
                DialogHelper.alert(this, "Cập nhật thất bại!");
            }
            }
        }
          catch(NumberFormatException e){
                 if(txMaCH.getText().length()<7){
           DialogHelper.alert(this, "Mã câu hỏi phải nhập ít nhất 7 ký tự");
           return;
                 }
                 else   if(!txMaCH.getText().matches("[0-9]{7,}")){
           DialogHelper.alert(this, "Mã câu hỏi chỉ được nhập số");
           return;
       }
          }
    }

    void delete() {
        if (DialogHelper.confirm(this, "Bạn thực sự muốn xóa câu hỏi này?")) {
            String maCH = txMaCH.getText();
            try {
                dao.delete(maCH);
                this.load();
                this.clear();
                fillToTableMon();
                DialogHelper.alert(this, "Xóa thành công!");
            } catch (HeadlessException e) {
                DialogHelper.alert(this, "Xóa thất bại!");         
        }
        }
    }
    
    void clear() {
        txCauHoi.setText("");
        txMaCH.setText("");
        cbMon.setSelectedIndex(0);
        cbDe.setSelectedIndex(0);
        txDapAn.setText("");
        txDapAnSai1.setText("");
        txDapAnSai2.setText("");
        txDapAnSai3.setText("");
        setStatus(true);
    }

    void edit() {
        try {
           Integer maCH = (Integer) tbMon.getValueAt(this.index, 0);
            CauHoi model = dao.findById(maCH);
            if (model != null) {
                this.setModel(model);
                this.setStatus(false);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");    e.printStackTrace();
           
        }
    }

    void setModel(CauHoi model) {
        cbDe.setToolTipText(String.valueOf(model.getDeTH()));
        cbMon.setToolTipText(String.valueOf(model.getMon()));
        cbTimMon.setToolTipText(String.valueOf(model.getMon()));
        cbDe.setSelectedItem(model.getDeTH());
        cbMon.setSelectedItem(model.getMon());
        cbTimMon.setSelectedItem(model.getMon());
        txCauHoi.setText(model.getDeBai());
        txDapAn.setText(model.getDapAn());
        txDapAnSai1.setText(model.getDapAnS1());
        txDapAnSai2.setText(model.getDapAnS2());
        txDapAnSai3.setText(model.getDapAnS3());
        txMaCH.setText(String.valueOf(model.getId()));
    }

    CauHoi getModel() {
      CauHoi model = new CauHoi();
        model.setDapAn(txDapAn.getText());
        model.setDapAnS1(txDapAnSai1.getText());
        model.setDapAnS2(txDapAnSai2.getText());
        model.setDapAnS3(txDapAnSai3.getText());
        model.setDeBai(txCauHoi.getText());
        model.setDeTH(String.valueOf(cbDe.getSelectedItem()));
        model.setMon(String.valueOf(cbMon.getSelectedItem()));
        model.setNgayTao(DateHelper.toString(DateHelper.now()));
        model.setMaGV(title);
        model.setId(Integer.parseInt(txMaCH.getText()));
        return model;
    }

    void setStatus(boolean insertable) {
        btAdd.setEnabled(insertable);
        btUpdate.setEnabled(!insertable);
        btDelete.setEnabled(!insertable);
        txMaCH.setEditable(insertable);
        boolean first = this.index > 0;
        boolean last = this.index < tbMon.getRowCount() - 1;
        btFirst.setEnabled(!insertable && first);
        btPrev.setEnabled(!insertable && first);
        btLast.setEnabled(!insertable && last);
        btNext.setEnabled(!insertable && last);
    }
    
    void fillToComboBoxDe(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbDe.getModel();
           model.removeAllElements();
    try {
            String sql = "Select * from boDeTH";
             ResultSet rs = JDBCHelper.executeQuery(sql);
            while (rs.next()) {;
                String de = rs.getString("maDe");
                model.addElement(de);
            }
          
        } catch (SQLException e) {
            DialogHelper.alert(this, "Lỗi truy vấn combo box đề tổng hợp!");
        }
        cbDe.setSelectedIndex(0);
    }
   
    
    
    void fillToComboBoxMon(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbMon.getModel();
       
           model.removeAllElements();
 
        try {
            String sql = "Select * from boDeMon";
             ResultSet rs = JDBCHelper.executeQuery(sql);
            while (rs.next()) {;
                String mon = rs.getString("maMon");
                model.addElement(mon);
            }
          
        } catch (SQLException e) {
            DialogHelper.alert(this, "Lỗi truy vấn combo box môn học!");
        }
        cbMon.setSelectedIndex(0);
       
    }
        void fillToComboBoxTim(){
             DefaultComboBoxModel model = (DefaultComboBoxModel) cbTimMon.getModel();
             model.removeAllElements();
 
        try {
            String sql = "Select * from boDeMon";
             ResultSet rs = JDBCHelper.executeQuery(sql);
            while (rs.next()) {;
                String mon = rs.getString("maMon");
                model.addElement(mon);
            }
          
        } catch (SQLException e) {
            DialogHelper.alert(this, "Loi truy vấn combo box tìm kiếm!");
        }
        cbTimMon.setSelectedIndex(0);
        }
    
    void fillToTableMon(){
         DefaultTableModel model = (DefaultTableModel) tbMon.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "Select * from cauHoi where monThi=?";
            ResultSet rs = JDBCHelper.executeQuery(sql, cbTimMon.getSelectedItem().toString() );
            while (rs.next()) {;
                Object[] row = {
                    rs.getInt("id"), rs.getString("deTH"),
                    rs.getString("de"),rs.getString("dapAn")
                };
                model.addRow(row);
            }
          
        } catch (SQLException e) {
            DialogHelper.alert(this, "Loi truy vấn môn thi!");
        }
    }
}
    

