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
import java.util.stream.Stream;

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
    public List<CauHoi> findByMon(String mon){
        String sql = "SELECT TOP 10 * FROM cauHoi WHERE monThi = ? ORDER BY NEWID()";
        List<CauHoi>list = select(sql, mon);
        return list;
    }
    public CauHoi findByDe(String de){
        String sql = "SELECT * FROM cauHoi WHERE de=?";
        List<CauHoi> list = select(sql, de);
        return list.size() > 0 ? list.get(0) : null;
    }
    public List<CauHoi> findTH(){
        String sql = "SELECT TOP 5 * FROM cauHoi WHERE monThi = 'M01' ORDER BY NEWID()";
        List<CauHoi>list1 = select(sql);
        String sql1 = "SELECT TOP 5 * FROM cauHoi WHERE monThi = 'M02' ORDER BY NEWID()";
        List<CauHoi>list2 = select(sql1);
        String sql2 = "SELECT TOP 5 * FROM cauHoi WHERE monThi = 'M03' ORDER BY NEWID()";
        List<CauHoi>list3 = select(sql2);
        List<CauHoi>list = new ArrayList<>();
        Stream.of(list1,list2,list3).forEach(list::addAll);
        return list;
    }
    public CauHoi findById(char id){
        String sql = "SELECT * FROM cauHoi WHERE id=?";
        List<CauHoi> list = select(sql, id);
        return list.size() > 0 ? list.get(0) : null;
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
