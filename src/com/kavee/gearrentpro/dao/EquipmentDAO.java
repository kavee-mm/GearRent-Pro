package com.kavee.gearrentpro.dao;

import com.kavee.gearrentpro.entity.Equipment;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EquipmentDAO {

    public boolean add(Equipment equipment) {
        String sql = "INSERT INTO equipment (code, name, categoryCode, qty, pricePerDay) VALUES (?,?,?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, equipment.getCode());
            ps.setString(2, equipment.getName());
            ps.setString(3, equipment.getCategoryCode());
            ps.setInt(4, equipment.getQty());
            ps.setDouble(5, equipment.getPricePerDay());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            return false;
        }
    }

   
    public boolean saveEquipment(Equipment equipment) { return add(equipment); }

    public Equipment findById(int equipmentId) {
        String sql = "SELECT code, name, categoryCode, qty, pricePerDay FROM equipment WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, equipmentId);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Equipment e = new Equipment();
                    e.setCode(rs.getString("code"));
                    e.setName(rs.getString("name"));
                    e.setCategoryCode(rs.getString("categoryCode"));
                    e.setQty(rs.getInt("qty"));
                    e.setPricePerDay(rs.getDouble("pricePerDay"));
                    return e;
                }
            }
        } catch (Exception ex) {
        }
        return null;
    }

    public List<Equipment> getEquipmentByBranch(int branchId) {
        String sql = "SELECT code, name, categoryCode, qty, pricePerDay FROM equipment WHERE branchId = ?";
        List<Equipment> list = new ArrayList<>();

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, branchId);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Equipment e = new Equipment();
                    e.setCode(rs.getString("code"));
                    e.setName(rs.getString("name"));
                    e.setCategoryCode(rs.getString("categoryCode"));
                    e.setQty(rs.getInt("qty"));
                    e.setPricePerDay(rs.getDouble("pricePerDay"));
                    list.add(e);
                }
            }
            return list;

        } catch (Exception ex) {
            ex.printStackTrace();
            return list;
        }
    }

    public boolean updateStatus(int equipmentId, String status) {
        String sql = "UPDATE equipment SET status = ? WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, status);
            ps.setInt(2, equipmentId);
            return ps.executeUpdate() > 0;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
