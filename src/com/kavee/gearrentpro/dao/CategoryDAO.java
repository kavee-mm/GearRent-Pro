package com.kavee.gearrentpro.dao;

import com.kavee.gearrentpro.entity.Category;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO {

    public boolean add(Category category) {
        String sql = "INSERT INTO category (code, name) VALUES (?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, category.getCode());
            ps.setString(2, category.getName());
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    
    public boolean saveCategory(Category category) {
        return add(category);
    }

  
    public List<Category> getAllActiveCategories() {
        
        String sql = "SELECT code, name FROM category";
        List<Category> list = new ArrayList<>();

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Category c = new Category();
                c.setCode(rs.getString("code"));
                c.setName(rs.getString("name"));
                list.add(c);
            }
            return list;

        } catch (Exception e) {
            e.printStackTrace();
            return list;
        }
    }

    
    public boolean deactivateCategory(int categoryId) {
       
        String sql = "UPDATE category SET active = 0 WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, categoryId);
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
