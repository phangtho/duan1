/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan1.model;

import com.duan1.helper.DateHelper;

/**
 *
 * @author QUAN
 */
public class CauHoi {
    int id;
    String mon;
    String deTH;
    String deBai;
    String dapAn;
    String dapAnS1;
    String dapAnS2;
    String dapAnS3;
    String maGV;
    String ngayTao =DateHelper.toString(DateHelper.now());

    public CauHoi(int id, String mon, String deTH, String deBai, String dapAn, String dapAnS1, String dapAnS2, String dapAnS3) {
        this.id = id;
        this.mon = mon;
        this.deTH = deTH;
        this.deBai = deBai;
        this.dapAn = dapAn;
        this.dapAnS1 = dapAnS1;
        this.dapAnS2 = dapAnS2;
        this.dapAnS3 = dapAnS3;       
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public CauHoi(){
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getDeTH() {
        return deTH;
    }

    public void setDeTH(String deTH) {
        this.deTH = deTH;
    }

    public String getDeBai() {
        return deBai;
    }

    public void setDeBai(String deBai) {
        this.deBai = deBai;
    }

    public String getDapAn() {
        return dapAn;
    }

    public void setDapAn(String dapAn) {
        this.dapAn = dapAn;
    }

    public String getDapAnS1() {
        return dapAnS1;
    }

    public void setDapAnS1(String dapAnS1) {
        this.dapAnS1 = dapAnS1;
    }

    public String getDapAnS2() {
        return dapAnS2;
    }

    public void setDapAnS2(String dapAnS2) {
        this.dapAnS2 = dapAnS2;
    }

    public String getDapAnS3() {
        return dapAnS3;
    }

    public void setDapAnS3(String dapAnS3) {
        this.dapAnS3 = dapAnS3;
    }

    public CauHoi(String deBai, String dapAn, String dapAnS1, String dapAnS2, String dapAnS3) {
        
        this.deBai = deBai;
        this.dapAn = dapAn;
        this.dapAnS1 = dapAnS1;
        this.dapAnS2 = dapAnS2;
        this.dapAnS3 = dapAnS3;
    }
    
}
