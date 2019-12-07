/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan1.ui;

import com.duan1.DAO.CauHoiDAO;
import com.duan1.DAO.KetQuaDAO;
import com.duan1.helper.DateHelper;
import com.duan1.helper.DialogHelper;
import com.duan1.helper.ShareHelper;
import com.duan1.model.CauHoi;
import com.duan1.model.KetQua;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.Timer;

/**
 *
 * @author ASUS
 */
public class ExamJFrame extends javax.swing.JInternalFrame {
    CauHoiDAO dao = new CauHoiDAO();
    List<CauHoi> list;
    int diem = 0;
    String tl="";
    int index;
    /**
     * Creates new form Exam
     * @param text
     * @throws java.beans.PropertyVetoException
     */
    public ExamJFrame(String text) {
        initComponents();
        if(text.equals("TH")){
            list = dao.findTH();
            lblMon.setText("Bài thi: TỔNG HỢP");
        }
        else{
            list = dao.findByMon(text);
            if(text.equals("M01")){
                lblMon.setText("Môn thi: TOÁN");
            }
            else if(text.equals("M02")){
                lblMon.setText("Môn thi: Lý");
            }
            else{
                lblMon.setText("Môn thi: Hoá");
            }
        }
        cauHoi();
        timer.start();
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }
    
    void cauHoi(){
        List<String> listch = new ArrayList();
        for(int i=0;i<list.size();i++){
            listch.clear();
            listch.add(list.get(i).getDapAn());
            listch.add(list.get(i).getDapAnS1());
            listch.add(list.get(i).getDapAnS2());
            listch.add(list.get(i).getDapAnS3());
            Collections.shuffle(listch);
            tabs.addTab("Câu"+(i+1),makePanel(list.get(i).getDeBai(),listch.get(0).toString(),listch.get(1).toString(),listch.get(2).toString(),listch.get(3).toString()));

        }
    }
    private JPanel makePanel(String text,String t1,String t2,String t3,String t4) {
        JPanel p = new JPanel(new GridBagLayout());
        JPanel p1 = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        JTextArea ta = new JTextArea(text, 10, 40);
        ta.setLineWrap(true);
        ta.setEditable(false);
        JRadioButton da = new JRadioButton(t1);
        JRadioButton da1 = new JRadioButton(t2);
        JRadioButton da2 = new JRadioButton(t3);
        JRadioButton da3 = new JRadioButton(t4);
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(da);
        bg1.add(da1);
        bg1.add(da2);
        bg1.add(da3);
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10, 10, 10, 10);
        p.add(ta,c);
        p1.add(da,c);
        c.gridx = 0;
        c.gridy = 1;
        p.add(p1,c);
        p1.add(da1,c);
        c.gridx = 0;
        c.gridy = 2;
        p1.add(da2,c);
        c.gridx = 0;
        c.gridy = 3;
        p1.add(da3,c);
        da.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tl = e.getActionCommand();
                chamDiem(text);
            }
        });
        da1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tl = e.getActionCommand();
                chamDiem(text);
            }
        });
        da2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tl = e.getActionCommand();
                chamDiem(text);
            }
        });
        da3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tl = e.getActionCommand();
                chamDiem(text);
            }
        });
        return p;
    }
    
    public void chamDiem(String a){
        CauHoi ch = dao.findByDe(a);
        String da = ch.getDapAn().trim();
        if(da.equals(tl)){
            diem++;
            tl="";
        }
        else{
            tl="";
        }
    }
    public void nopBai(){
        SimpleDateFormat DATE_FORMATER = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss",Locale.ENGLISH);
        String d = DATE_FORMATER.format(DateHelper.now());
        JOptionPane.showMessageDialog(this,"Điểm của bạn là: "+diem+"/"+list.size());
        timer.stop();
        String idhs = ShareHelper.USER.getId();
        String ngayLam = d;
        String baiLam = lblMon.getText();
        KetQua kq = new KetQua(idhs, diem, ngayLam, baiLam);
        KetQuaDAO kqdao = new KetQuaDAO();
        kqdao.insert(kq);
        diem=0;
        this.dispose();
    }
    
    double timeLeft = 60000;
    ActionListener countDown=new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
            timeLeft -= 100;
            SimpleDateFormat df=new SimpleDateFormat("mm:ss");
            lblTime.setText(df.format(timeLeft));
            if(timeLeft<=0)
            {
                DialogHelper.alert(rootPane, "Bạn đã hết thời gian làm bài!");
                timer.stop();
                nopBai();
            }
        }
    };
    Timer timer=new Timer(100, countDown);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnOK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblMon = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        tabs = new javax.swing.JTabbedPane();

        setClosable(true);
        setIconifiable(true);
        setMaximumSize(new java.awt.Dimension(700, 500));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(720, 550));

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(153, 153, 153)));

        btnOK.setText("NỘP BÀI");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnPrev.setText("Previous");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOK)
                            .addComponent(btnPrev)
                            .addComponent(btnNext))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("THỜI GIAN:");

        lblTime.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        lblTime.setForeground(new java.awt.Color(204, 0, 0));
        lblTime.setText("Label3");

        lblMon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMon.setText("Môn thi:");

        jPanel5.setLayout(new java.awt.BorderLayout());

        tabs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabsMouseClicked(evt);
            }
        });
        jPanel5.add(tabs, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(lblMon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(lblMon))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        try{
        index = tabs.getSelectedIndex();
        if(index<list.size()-1){
        tabs.setSelectedIndex(index+1);
        }
        if(index==list.size()-1){
        tabs.setSelectedIndex(0);
        index=0;
        }
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:
        int opt = JOptionPane.showConfirmDialog(this, "Bạn muốn nộp  bài ?");
        if(opt==0){
        nopBai();}
    }//GEN-LAST:event_btnOKActionPerformed

    private void tabsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabsMouseClicked

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        try{
        index = tabs.getSelectedIndex();
        if(index>0){
        tabs.setSelectedIndex(index-1);
        }
        if(index==0){
        tabs.setSelectedIndex(list.size()-1);
        index=list.size()-1;
        }
        }catch(Exception e){
        }
    }//GEN-LAST:event_btnPrevActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnPrev;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblMon;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTabbedPane tabs;
    // End of variables declaration//GEN-END:variables
}
