package com.kavee.gearrentpro.dao;

import com.kavee.gearrentpro.entity.Branch;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class BranchDAO {

    public boolean add(Branch branch) {
        String sql = "INSERT INTO branch (code, name, address, contact) VALUES (?,?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, branch.getCode());
            ps.setString(2, branch.getName());
            ps.setString(3, branch.getAddress());
            ps.setString(4, branch.getContact());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    
    public boolean saveBranch(Branch branch) {
        return add(branch);
    }
}
