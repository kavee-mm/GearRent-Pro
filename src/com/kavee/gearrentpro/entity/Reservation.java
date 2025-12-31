package com.kavee.gearrentpro.entity;

import java.time.LocalDate;

public class Reservation {
    private int id;
    private Equipment equipment;
    private Customer customer;
    private Branch branch;
    private LocalDate startDate;
    private LocalDate endDate;
    private String status;

    public Reservation() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Equipment getEquipment() { return equipment; }
    public void setEquipment(Equipment equipment) { this.equipment = equipment; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public Branch getBranch() { return branch; }
    public void setBranch(Branch branch) { this.branch = branch; }

    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getCode() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getCustomerCode() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getEquipmentCode() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getFromDate() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getToDate() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
