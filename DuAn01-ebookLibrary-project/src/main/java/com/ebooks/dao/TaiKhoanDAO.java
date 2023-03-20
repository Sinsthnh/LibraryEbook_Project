/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ebooks.dao;

import com.ebooks.helper.JdbcHelper;
import com.ebooks.model.TaiKhoan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class TaiKhoanDAO  {

    private TaiKhoan readFromResultSet(ResultSet rs) throws SQLException {
        TaiKhoan model = new TaiKhoan();
        model.setTenDangNhap(rs.getString("tenDangNhap"));
        model.setMatKhau(rs.getString("matKhau"));
        model.setTrangThai(rs.getBoolean("trangThai"));
        model.setVaiTro(rs.getBoolean("vaiTro"));
        return model;
    }

    private List<TaiKhoan> select(String sql, Object... args) {
        List<TaiKhoan> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    list.add(readFromResultSet(rs));
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            throw new RuntimeException();
        }
        return list;
    }

    /**
     * Thêm mới thực thể vào CSDL
     *
     * @param entity là thực thể chứa thông tin bản ghi mới
     */
    public void insert(TaiKhoan entity) {
        String sql = "INSERT INTO TaiKhoan (TenDangNhap, MatKhau, trangthai, vaiTro) VALUES (?, ?, ?, ?)";
        JdbcHelper.executeUpdate(sql,
                entity.getTenDangNhap(),
                entity.getMatKhau(),
                entity.isTrangThai(),
                entity.isVaiTro());
    }

    /**
     * Cập nhật thực thể vào CSDL
     *
     * @param entity là thực thể chứa thông tin bản ghi cần cập nhật
     */
    public void update(TaiKhoan entity) {
        String sql = "UPDATE TaiKhoan SET MatKhau=?, trangThai=? , vaiTro=? WHERE TenDangNhap=?";
        JdbcHelper.executeUpdate(sql,
                entity.getMatKhau(),
                entity.isTrangThai(),
                entity.isVaiTro(),
                entity.getTenDangNhap());
    }

    public void updateMatKhau(TaiKhoan entity) {

        String sql = "UPDATE TaiKhoan SET MatKhau=? WHERE TenDangNhap=?";
        JdbcHelper.executeUpdate(sql,
                entity.getMatKhau(),
                entity.getTenDangNhap());
    }

    /**
     * Xóa bản ghi khỏi CSDL
     *
     * @param id là mã của bản ghi cần xóa
     */
    public void delete(String id) {
        String sql = "DELETE FROM TaiKhoan WHERE TenDangNhap=?";
        JdbcHelper.executeUpdate(sql, id);
    }

    /**
     * Truy vấn tất cả các các thực thể
     *
     * @return list danh sách các thực thể
     */
    
    public List<TaiKhoan> selectAll() {
        String sql = "SELECT * FROM TaiKhoan";
        return select(sql);
    }

    /**
     * Truy vấn thực thể theo mã id
     *
     * @param id là mã của bản ghi được truy vấn
     * @return thực thể chứa thông tin của bản ghi
     */
    public TaiKhoan findById(String id) {
        String sql = "SELECT * FROM TaiKhoan WHERE tenDangNhap=?";
        List<TaiKhoan> list = select(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    public TaiKhoan findByIdND(String id) {
        String sql = "SELECT * FROM TaiKhoan WHERE maNguoiDung=?";
        List<TaiKhoan> list = select(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }
}
