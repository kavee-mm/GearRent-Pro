package com.kavee.gearrentpro.service;

import com.kavee.gearrentpro.dao.BranchDAO;
import com.kavee.gearrentpro.entity.Branch;

public class BranchService {

    private final BranchDAO branchDAO;

    public BranchService() {
        branchDAO = new BranchDAO();
    }

    public boolean addBranch(Branch branch) {
        if (branch == null) return false;
        if (branch.getCode() == null || branch.getCode().isEmpty()) return false;
        if (branch.getName() == null || branch.getName().isEmpty()) return false;
        if (branch.getAddress() == null || branch.getAddress().isEmpty()) return false;
        if (branch.getContact() == null || branch.getContact().isEmpty()) return false;

        return branchDAO.add(branch);
    }
}
