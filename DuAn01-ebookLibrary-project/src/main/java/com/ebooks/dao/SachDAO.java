/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ebooks.dao;

import com.ebooks.helper.JdbcHelper;
import com.ebooks.model.Sach;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class SachDAO {
    private Sach readFromResultSet(ResultSet rs) throws SQLException{
	Sach model=new Sach();
        model.setMaSach(rs.getString("maSach"));
        model.setTenSach(rs.getString("tenSach"));
        model.setMaNXB(rs.getString("maNXB"));
        model.setMoTa(rs.getString("moTa"));
        model.setDuongDan(rs.getString("duongDan"));
        model.setNamXuatBan(rs.getDate("namXuatBan"));
        model.setBiaTruoc(rs.getString("biaTruoc"));
        model.setTenDangNhap(rs.getString("tenDangNhap"));
        return model;
    }
    
    private List<Sach> select(String sql, Object...args){
        List<Sach> list=new ArrayList<>();
        try {
            ResultSet rs=null;
            try{
                rs=JdbcHelper.executeQuery(sql, args);
                while(rs.next()){
                    list.add(readFromResultSet(rs));
                }
            }finally{
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
        return list;
    }
    
    /**
     * Thêm mới thực thể vào CSDL
     * @param entity là thực thể chứa thông tin bản ghi mới
     */
    public void insert(Sach entity) {
        String sql="INSERT INTO Sach (maSach, tenSach, maNXB, moTa, duongDan, namXuatBan, biaTruoc, tenDangNhap) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        JdbcHelper.executeUpdate(sql,
                entity.getMaSach(),
                entity.getTenSach(),
                entity.getMaNXB(),
                entity.getMoTa(),
                entity.getDuongDan(),
                entity.getNamXuatBan(),
                entity.getBiaTruoc(),
                entity.getTenDangNhap());
    }
    /**
     * Cập nhật thực thể vào CSDL
     * @param entity là thực thể chứa thông tin bản ghi cần cập nhật
     */
    public void update(Sach entity) {
        String sql="UPDATE Sach SET tenSach=?, maNXB=?, moTa=?, duongDan=?, namXuatBan=?, biaTruoc=?, tenDangNhap=? WHERE MaSach=?";
        JdbcHelper.executeUpdate(sql,
                entity.getTenSach(),
                entity.getMaNXB(),
                entity.getMoTa(),
                entity.getDuongDan(),
                entity.getNamXuatBan(),
                entity.getBiaTruoc(),
                entity.getTenDangNhap(),
                entity.getMaSach());
    }
    
    /**
     * Xóa bản ghi khỏi CSDL
     * @param id là mã của bản ghi cần xóa
     */
    public void delete(String id) {
        String sql="DELETE FROM Sach WHERE MaSach=?";
        JdbcHelper.executeUpdate(sql, id);
    }
    
    /**
     * Truy vấn tất cả các các thực thể
     * @return list danh sách các thực thể
     */
    public List<Sach> selectAll() {
        String sql="SELECT * FROM Sach";
        return select(sql);
    }
    
    public List<Sach> selectSachNotAudio() {
        String sql="SELECT * FROM SACH WHERE maSach NOT IN (SELECT Sach.maSach FROM Sach JOIN AudioSach ON Sach.maSach = AudioSach.maSach)";
        return select(sql);
    }
    
    public List<Sach> selectName(String name) {
        String sql="SELECT * FROM Sach WHERE tenSach LIKE ?";
        return select(sql,"%"+name+"%");
    }
    
    /**
     * Truy vấn thực thể theo mã id
     * @param id là mã của bản ghi được truy vấn
     * @return thực thể chứa thông tin của bản ghi
     */
    
    
    public Sach findById(String id) {
        String sql="SELECT * FROM Sach WHERE MaSach=?";
        List<Sach> list=select(sql,id);
        return list.size()>0?list.get(0):null;
    }
    
    public List <Sach> selectByTheLoai(String matt){
        String sql = "SELECT * FROM Sach JOIN LoaiSS ON Sach.maSach = LoaiSS.maSach JOIN TheLoai ON TheLoai.maTheLoai = LoaiSS.maTheLoai WHERE TheLoai.maTheLoai LIKE ?";
        return this.select(sql,matt+"%");
    }
    
}
