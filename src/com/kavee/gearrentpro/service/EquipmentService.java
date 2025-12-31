package com.kavee.gearrentpro.service;

import com.kavee.gearrentpro.dao.EquipmentDAO;
import com.kavee.gearrentpro.entity.Equipment;
import java.util.Collections;
import java.util.List;

public class EquipmentService {

    private final EquipmentDAO equipmentDAO;

    public EquipmentService() {
        equipmentDAO = new EquipmentDAO();
    }

    public boolean addEquipment(Equipment equipment) {
        if (equipment == null) return false;
        return equipmentDAO.add(equipment);
    }

   
    public Equipment getEquipmentById(int equipmentId) {
        
        return null;
    }

    public List<Equipment> getEquipmentByBranch(int branchId) {
       
        return Collections.emptyList();
    }
}
