package com.kavee.gearrentpro.controller;

import com.kavee.gearrentpro.entity.Reservation;
import com.kavee.gearrentpro.entity.Equipment;
import com.kavee.gearrentpro.entity.Customer;
import com.kavee.gearrentpro.entity.Branch;
import com.kavee.gearrentpro.service.ReservationService;

import java.time.LocalDate;

public class ReservationController {

    private final ReservationService reservationService;

    public ReservationController() {
        reservationService = new ReservationService();
    }

    
    public void createReservation(Equipment equipment,
                                  Customer customer,
                                  Branch branch,
                                  LocalDate startDate,
                                  LocalDate endDate) {

        Reservation reservation = new Reservation();
        reservation.setEquipment(equipment);
        reservation.setCustomer(customer);
        reservation.setBranch(branch);
        reservation.setStartDate(startDate);
        reservation.setEndDate(endDate);
        reservation.setStatus("Active");

        boolean isCreated = reservationService.createReservation(reservation);

        if (isCreated) {
            System.out.println("Reservation created successfully.");
        } else {
            System.out.println("Failed to create reservation.");
        }
    }

   
    public void cancelReservation(int reservationId) {

        boolean isCancelled = reservationService.cancelReservation(reservationId);

        if (isCancelled) {
            System.out.println("Reservation cancelled successfully.");
        } else {
            System.out.println("Failed to cancel reservation.");
        }
    }

   
    public void convertToRental(int reservationId) {

        boolean isConverted = reservationService.convertReservationToRental(reservationId);

        if (isConverted) {
            System.out.println("Reservation converted to rental successfully.");
        } else {
            System.out.println("Failed to convert reservation to rental.");
        }
    }
}

