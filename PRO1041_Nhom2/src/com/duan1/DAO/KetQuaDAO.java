/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan1.DAO;

import com.duan1.helper.JDBCHelper;
import com.duan1.helper.ShareHelper;
import com.duan1.model.KetQua;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    public List<KetQua> select(){
        String sql="SELECT * FROM ketQua where idHS=?";
        return select(sql,ShareHelper.USER.getId());
    }
     private List<KetQua> select(String sql, Object...args){
        List<KetQua> list = new ArrayList<>();
        try {
            ResultSet rs = null;
        try {
            rs = JDBCHelper.executeQuery(sql, args);
        while(rs.next()){
            KetQua model = readFromResultSet(rs);
            list.add(model);
            }
        }
        finally{
            rs.getStatement().getConnection().close();
        }
        }
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    return list;
    }
     private KetQua readFromResultSet(ResultSet rs) throws SQLException{
        KetQua model=new KetQua();
        model.setId(rs.getInt("id"));
        model.setIdHSinh(rs.getString("idHS"));
        model.setDiem(rs.getDouble("diem"));
        model.setNgayLam(rs.getString("ngayLam"));
        model.setBaiLam(rs.getString("baiLam"));
    return model;
    }
}
