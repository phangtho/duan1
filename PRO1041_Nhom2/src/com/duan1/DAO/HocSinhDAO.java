/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan1.DAO;

import com.duan1.helper.JDBCHelper;
import java.util.List;
import com.duan1.model.HocSinh;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author QUAN
 */
public class HocSinhDAO {
    public void insert(HocSinh model){
        String sql="insert into hocSinh(id,matKhau,ten,email) values (?,?,?,?)";
        JDBCHelper.executeUpdate(sql,
        model.getId(),
        model.getMatKhau(),
        model.getTen(),
        model.getEmail());
    }
    public void update(HocSinh model){
        String sql="UPDATE hocSinh SET matKhau=?, ten=?, email=? WHERE id=?";
        JDBCHelper.executeUpdate(sql,
        model.getMatKhau(),
        model.getTen(),
        model.getEmail(),
        model.getId());
    }
    public void delete(String id){
        String sql="DELETE FROM hocSinh WHERE id=?";
        JDBCHelper.executeUpdate(sql, id);
    }
    public HocSinh findByID(String id){
        String sql = "SELECT * FROM hocSinh WHERE id=?";
        List<HocSinh> list = select(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }
    public List<HocSinh> select(){
        String sql="SELECT * FROM hocSinh";
        return select(sql);
    }
    private List<HocSinh> select(String sql, Object...args){
        List<HocSinh> list = new ArrayList<>();
        try {
            ResultSet rs = null;
        try {
            rs = JDBCHelper.executeQuery(sql, args);
        while(rs.next()){
            HocSinh model = readFromResultSet(rs);
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
    private HocSinh readFromResultSet(ResultSet rs) throws SQLException{
        HocSinh model=new HocSinh();
        model.setId(rs.getString("id"));
        model.setMatKhau(rs.getString("matKhau"));
        model.setTen(rs.getString("ten"));
        model.setEmail(rs.getString("email"));
    return model;
    }
}
