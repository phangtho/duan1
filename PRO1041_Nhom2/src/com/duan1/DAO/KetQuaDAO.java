/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan1.DAO;

import com.duan1.helper.JDBCHelper;
import com.duan1.model.KetQua;

/**
 *
 * @author QUAN
 */
public class KetQuaDAO {
        public void insert(KetQua model){
        String sql="insert into ketQua(idHS,diem,ngayLam,baiLam) values (?,?,?,?)";
        JDBCHelper.executeUpdate(sql,
        model.getIdHSinh(),
        model.getDiem(),
        model.getNgayLam(),
        model.getBaiLam());
    }
}
