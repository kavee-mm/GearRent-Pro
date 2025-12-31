package com.kavee.gearrentpro.controller;
import com.kavee.gearrentpro.entity.Branch;
import com.kavee.gearrentpro.service.BranchService;

public class BranchController {

    private final BranchService branchService;

    public BranchController() {
        branchService = new BranchService();
    }

   
    public void addBranch(String code, String name, String address, String contact) {

        Branch branch = new Branch();
        branch.setCode(code);
        branch.setName(name);
        branch.setAddress(address);
        branch.setContact(contact);

        boolean isAdded = branchService.addBranch(branch);

        if (isAdded) {
            System.out.println("Branch added successfully.");
        } else {
            System.out.println("Failed to add branch.");
        }
    }
}
