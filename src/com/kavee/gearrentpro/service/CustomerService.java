package com.kavee.gearrentpro.service;

import com.kavee.gearrentpro.dao.CustomerDAO;
import com.kavee.gearrentpro.entity.Customer;

public class CustomerService {

    private final CustomerDAO customerDAO;

    public CustomerService() {          
        customerDAO = new CustomerDAO();
    }

    public boolean addCustomer(Customer customer) {
        if (customer == null) return false;
        if (customer.getCode() == null || customer.getCode().isEmpty()) return false;
        if (customer.getName() == null || customer.getName().isEmpty()) return false;

        return customerDAO.add(customer);
    }
}
