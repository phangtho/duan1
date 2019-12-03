/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan1.DAO;

import com.duan1.helper.JDBCHelper;
import com.duan1.model.GiaoVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author QUAN
 */
public class GiaoVienDAO {
    public void insert(GiaoVien model){
        String sql="insert into giaoVien(id,matKhau,ten,email) values (?,?,?,?)";
        JDBCHelper.executeUpdate(sql,
        model.getId(),
        model.getPass(),
        model.getTen(),
        model.getEmail());
    }
    public void update(GiaoVien model){
        String sql="UPDATE giaoVien SET matKhau=?, ten=?, email=? WHERE id=?";
        JDBCHelper.executeUpdate(sql,
        model.getPass(),
        model.getTen(),
        model.getEmail(),
        model.getId());
    }
    public void delete(String id){
        String sql="DELETE FROM GiaoVien WHERE id=?";
        JDBCHelper.executeUpdate(sql, id);
    }
    public List<GiaoVien> select(){
        String sql="SELECT * FROM giaoVien";
        return select(sql);
    }
    private List<GiaoVien> select(String sql, Object...args){
        List<GiaoVien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
        try {
            rs = JDBCHelper.executeQuery(sql, args);
        while(rs.next()){
            GiaoVien model = readFromResultSet(rs);
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
    private GiaoVien readFromResultSet(ResultSet rs) throws SQLException{
        GiaoVien model=new GiaoVien();
        model.setId(rs.getString("id"));
        model.setPass(rs.getString("matKhau"));
        model.setTen(rs.getString("ten"));
        model.setEmail(rs.getString("email"));
    return model;
    }
}
