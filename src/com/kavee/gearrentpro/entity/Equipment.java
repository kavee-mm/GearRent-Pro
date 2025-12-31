package com.kavee.gearrentpro.entity;

public class Equipment {
    private int id;
    private String brand;
    private String model;
    private int purchaseYear;
    private double baseDailyPrice;
    private double deposit;
    private String status;
    private Category category;
    private Branch branch;

    public Equipment() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getPurchaseYear() { return purchaseYear; }
    public void setPurchaseYear(int purchaseYear) { this.purchaseYear = purchaseYear; }

    public double getBaseDailyPrice() { return baseDailyPrice; }
    public void setBaseDailyPrice(double baseDailyPrice) { this.baseDailyPrice = baseDailyPrice; }

    public double getDeposit() { return deposit; }
    public void setDeposit(double deposit) { this.deposit = deposit; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }

    public Branch getBranch() { return branch; }
    public void setBranch(Branch branch) { this.branch = branch; }

    public String getCode() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getCategoryCode() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public int getQty() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public double getPricePerDay() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setCode(String string) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setName(String string) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setCategoryCode(String string) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setQty(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setPricePerDay(double aDouble) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
