/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan1.ui;

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("QUẢN LÝ HỌC SINH");

        tabs.setMinimumSize(new java.awt.Dimension(658, 649));

        jLabel2.setText("Mã học sinh");

        jLabel3.setText("Tên học sinh");

        jLabel4.setText("Giới tính");

        jLabel5.setText("Ngày sinh");

        jLabel6.setText("Địa chỉ email");

        jLabel7.setText("Ghi chú");

        txGhiChu.setColumns(20);
        txGhiChu.setRows(5);
        jScrollPane1.setViewportView(txGhiChu);

        btAdd.setText("Thêm");

        btUpdate.setText("Sửa");

        btDelete.setText("Xóa");

        btNew.setText("Mới");

        btLast.setText(">|");

        btNext.setText(">>");

        btPrev.setText("<<");

        btFirst.setText("|<");

        javax.swing.GroupLayout pThongTinLayout = new javax.swing.GroupLayout(pThongTin);
        pThongTin.setLayout(pThongTinLayout);
        pThongTinLayout.setHorizontalGroup(
            pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pThongTinLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addContainerGap(562, Short.MAX_VALUE))
            .addComponent(txMa)
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
                .addGroup(pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(0, 0, Short.MAX_VALUE))
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
        );
        pThongTinLayout.setVerticalGroup(
            pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pThongTinLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(143, Short.MAX_VALUE))
        );

        tabs.addTab("THÔNG TIN", pThongTin);

        pTimKiem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TÌM KIẾM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btTim.setText("Tìm");

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
                "Mã HS", "Họ tên", "Giới tính", "Ngày sinh", "Email", "Mã GV"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbDanhSach);

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
    private javax.swing.JTextField txTen;
    private javax.swing.JTextField txTim;
    // End of variables declaration//GEN-END:variables
}
