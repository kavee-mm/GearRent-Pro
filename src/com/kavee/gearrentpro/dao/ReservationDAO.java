package com.kavee.gearrentpro.dao;

import com.kavee.gearrentpro.entity.Reservation;
import java.sql.*;
import java.time.LocalDate;

public class ReservationDAO {

    public boolean add(Reservation reservation) {
        String sql = "INSERT INTO reservation (code, customerCode, equipmentCode, fromDate, toDate) VALUES (?,?,?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, reservation.getCode());
            ps.setString(2, reservation.getCustomerCode());
            ps.setString(3, reservation.getEquipmentCode());
            ps.setString(4, reservation.getFromDate());
            ps.setString(5, reservation.getToDate());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean saveReservation(Reservation reservation) {
        return add(reservation);
    }

    public boolean cancelReservation(int reservationId) {
        String sql = "UPDATE reservation SET status = 'Cancelled' WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, reservationId);
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean markAsConverted(int reservationId) {
        String sql = "UPDATE reservation SET status = 'Converted' WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, reservationId);
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            return false;
        }
    }

    
    public boolean hasOverlap(int equipmentId, LocalDate start, LocalDate end) {
        String sql =
                "SELECT COUNT(*) FROM reservation " +
                "WHERE equipmentId = ? AND status <> 'Cancelled' " +
                "AND (fromDate <= ? AND toDate >= ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, equipmentId);
            ps.setDate(2, Date.valueOf(end));
            ps.setDate(3, Date.valueOf(start));

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) return rs.getInt(1) > 0;
            }

        } catch (Exception e) {
        }
        return false;
    }
}
