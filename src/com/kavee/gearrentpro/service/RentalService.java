package com.kavee.gearrentpro.service;

import com.kavee.gearrentpro.dao.RentalDAO;
import com.kavee.gearrentpro.entity.Rental;
import java.time.LocalDate;

public class RentalService {

    private final RentalDAO rentalDAO = new RentalDAO();

    public boolean createRental(Rental rental) {
        return rentalDAO.createRental(rental); 
    }

    public boolean returnRental(int rentalId, LocalDate actualReturnDate) {
        return rentalDAO.returnRental(rentalId, actualReturnDate); 
    }
}
