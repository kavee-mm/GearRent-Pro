package com.kavee.gearrentpro.controller;

import com.kavee.gearrentpro.entity.Equipment;
import com.kavee.gearrentpro.entity.Category;
import com.kavee.gearrentpro.entity.Branch;
import com.kavee.gearrentpro.service.EquipmentService;

public class EquipmentController {

    private final EquipmentService equipmentService;

    public EquipmentController() {
        equipmentService = new EquipmentService();
    }

    
    public void addEquipment(String brand,
                             String model,
                             int purchaseYear,
                             double baseDailyPrice,
                             double deposit,
                             String status,
                             Category category,
                             Branch branch) {

        Equipment equipment = new Equipment();
        equipment.setBrand(brand);
        equipment.setModel(model);
        equipment.setPurchaseYear(purchaseYear);
        equipment.setBaseDailyPrice(baseDailyPrice);
        equipment.setDeposit(deposit);
        equipment.setStatus(status);
        equipment.setCategory(category);
        equipment.setBranch(branch);

        boolean isAdded = equipmentService.addEquipment(equipment);

        if (isAdded) {
            System.out.println("Equipment added successfully.");
        } else {
            System.out.println("Failed to add equipment.");
        }
    }
}
