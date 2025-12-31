package com.kavee.gearrentpro.entity;

public class Category {
    private String code;
    private String name;
    private double basePriceFactor;
    private double weekendMultiplier;
    private boolean active;

    public Category() {}

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getBasePriceFactor() { return basePriceFactor; }
    public void setBasePriceFactor(double basePriceFactor) { this.basePriceFactor = basePriceFactor; }

    public double getWeekendMultiplier() { return weekendMultiplier; }
    public void setWeekendMultiplier(double weekendMultiplier) { this.weekendMultiplier = weekendMultiplier; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
}
