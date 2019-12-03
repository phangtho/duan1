/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan1.DAO;

import com.duan1.helper.JDBCHelper;
import com.duan1.model.CauHoi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author QUAN
 */
public class CauHoiDAO {
    public void insert(CauHoi model){
        String sql="insert into cauHoi(id,monThi,deTH,de,dapAn,daSai,daSai1,daSai2) values (?,?,?,?,?,?,?,?)";
        JDBCHelper.executeUpdate(sql,
        model.getId(),
        model.getMon(),
        model.getDeTH(),
        model.getDeBai(),
        model.getDapAn(),
        model.getDapAnS1(),
        model.getDapAnS2(),
        model.getDapAnS3());
    }
    public void update(CauHoi model){
        String sql="UPDATE cauHoi SET de=?, monThi=?, deTH=?, dapAn=?, daSai=?, daSai1=?, daSai2=? WHERE id=?";
        JDBCHelper.executeUpdate(sql,
        model.getDeBai(),
        model.getMon(),
        model.getDeTH(),
        model.getDapAn(),
        model.getDapAnS1(),
        model.getDapAnS2(),
        model.getDapAnS3(),
        model.getId());
    }
    public void delete(String id){
        String sql="DELETE FROM CauHoi WHERE id=?";
        JDBCHelper.executeUpdate(sql, id);
    }
    public List<CauHoi> select(){
        String sql="SELECT * FROM cauHoi";
        return select(sql);
    }
    private List<CauHoi> select(String sql, Object...args){
        List<CauHoi> list = new ArrayList<>();
        try {
            ResultSet rs = null;
        try {
            rs = JDBCHelper.executeQuery(sql, args);
        while(rs.next()){
            CauHoi model = readFromResultSet(rs);
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
    private CauHoi readFromResultSet(ResultSet rs) throws SQLException{
        CauHoi model=new CauHoi();
        model.setId(rs.getInt("id"));
        model.setDeBai(rs.getString("de"));
        model.setMon(rs.getString("monThi"));
        model.setDeTH(rs.getString("deTH"));
        model.setDapAn(rs.getString("dapAn"));
        model.setDapAnS1(rs.getString("daSai"));
        model.setDapAnS2(rs.getString("daSai1"));
        model.setDapAnS3(rs.getString("daSai2"));
    return model;
    }
}
