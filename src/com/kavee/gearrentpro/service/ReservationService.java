package com.kavee.gearrentpro.service;

import com.kavee.gearrentpro.dao.ReservationDAO;
import com.kavee.gearrentpro.entity.Reservation;

public class ReservationService {

    private final ReservationDAO reservationDAO;

    public ReservationService() {
        this.reservationDAO = new ReservationDAO();
    }

    public boolean addReservation(Reservation reservation) {
        if (reservation == null) return false;
        return reservationDAO.add(reservation);
    }

    public boolean createReservation(Reservation reservation) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public boolean cancelReservation(int reservationId) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public boolean convertReservationToRental(int reservationId) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
