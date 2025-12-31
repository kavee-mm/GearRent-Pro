package com.kavee.gearrentpro.controller;

import com.kavee.gearrentpro.entity.Branch;
import com.kavee.gearrentpro.entity.Customer;
import com.kavee.gearrentpro.entity.Equipment;
import com.kavee.gearrentpro.entity.Rental;
import com.kavee.gearrentpro.service.RentalService;

import java.time.LocalDate;

public class RentalController {

    private RentalService rentalService;

    public RentalController() {
        rentalService = new RentalService();
    }


    public void createRental(Equipment equipment,
                             Customer customer,
                             Branch branch,
                             LocalDate startDate,
                             LocalDate endDate) {

        Rental rental = new Rental();
        rental.setEquipment(equipment);
        rental.setCustomer(customer);
        rental.setBranch(branch);
        rental.setStartDate(startDate);
        rental.setEndDate(endDate);

        boolean isCreated = rentalService.createRental(rental);

        if (isCreated) {
            System.out.println("Rental created successfully.");
        } else {
            System.out.println("Failed to create rental.");
        }
    }

   
    public void returnRental(int rentalId, LocalDate actualReturnDate) {

        boolean isReturned = rentalService.returnRental(rentalId, actualReturnDate);

        if (isReturned) {
            System.out.println("Rental returned successfully.");
        } else {
            System.out.println("Failed to return rental.");
        }
    }
}
