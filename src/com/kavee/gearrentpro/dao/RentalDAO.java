package com.kavee.gearrentpro.dao;

import com.kavee.gearrentpro.entity.Rental;
import java.sql.*;
import java.time.LocalDate;

public class RentalDAO {

    public boolean add(Rental rental) {
        String sql = "INSERT INTO rental (code, customerCode, date, total) VALUES (?,?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, rental.getCode());
            ps.setString(2, rental.getCustomerCode());
            ps.setString(3, rental.getDate());   // keep String if your entity uses String
            ps.setDouble(4, rental.getTotal());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean saveRental(Rental rental) {
        return add(rental);
    }

    public boolean processReturn(int rentalId, java.time.LocalDate actualReturnDate) {
        
        String sql = "UPDATE rental SET returnDate = ?, status = 'Returned' WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setDate(1, Date.valueOf(actualReturnDate));
            ps.setInt(2, rentalId);
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean createRental(Rental rental) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean returnRental(int rentalId, LocalDate actualReturnDate) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
