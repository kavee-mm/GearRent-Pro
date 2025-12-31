package com.kavee.gearrentpro.dao;

import com.kavee.gearrentpro.entity.Customer;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {

    public boolean add(Customer customer) {
        String sql = "INSERT INTO customer (code, name, address, contact) VALUES (?,?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, customer.getCode());
            ps.setString(2, customer.getName());
            ps.setString(3, customer.getAddress());
            ps.setString(4, customer.getContact());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    public boolean saveCustomer(Customer customer) { return add(customer); }

    public Customer findById(int customerId) {
        String sql = "SELECT code, name, address, contact FROM customer WHERE id = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, customerId);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Customer c = new Customer();
                    c.setCode(rs.getString("code"));
                    c.setName(rs.getString("name"));
                    c.setAddress(rs.getString("address"));
                    c.setContact(rs.getString("contact"));
                    return c;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Customer> getAllCustomers() {
        String sql = "SELECT code, name, address, contact FROM customer";
        List<Customer> list = new ArrayList<>();

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Customer c = new Customer();
                c.setCode(rs.getString("code"));
                c.setName(rs.getString("name"));
                c.setAddress(rs.getString("address"));
                c.setContact(rs.getString("contact"));
                list.add(c);
            }
            return list;

        } catch (Exception e) {
            e.printStackTrace();
            return list;
        }
    }

    public boolean updateMembership(int customerId, String membershipLevel) {
        String sql = "UPDATE customer SET membershipLevel = ? WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, membershipLevel);
            ps.setInt(2, customerId);
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
