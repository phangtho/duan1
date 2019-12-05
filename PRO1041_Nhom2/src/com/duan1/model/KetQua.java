/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan1.model;

/**
 *
 * @author QUAN
 */
public class KetQua {
    int id;
    String idHSinh;
    double diem;
    String ngayLam;
    String baiLam;

    public KetQua(String idHSinh, double diem, String ngayLam, String baiLam) {
        this.idHSinh = idHSinh;
        this.diem = diem;
        this.ngayLam = ngayLam;
        this.baiLam = baiLam;
    }
    
    public KetQua(){
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdHSinh() {
        return idHSinh;
    }

    public void setIdHSinh(String idHSinh) {
        this.idHSinh = idHSinh;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getNgayLam() {
        return ngayLam;
    }

    public void setNgayLam(String ngayLam) {
        this.ngayLam = ngayLam;
    }

    public String getBaiLam() {
        return baiLam;
    }

    public void setBaiLam(String baiLam) {
        this.baiLam = baiLam;
    }
    
}
