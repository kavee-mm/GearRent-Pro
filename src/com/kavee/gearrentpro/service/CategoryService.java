package com.kavee.gearrentpro.service;

import com.kavee.gearrentpro.dao.CategoryDAO;
import com.kavee.gearrentpro.entity.Category;

public class CategoryService {

    private final CategoryDAO categoryDAO;

    public CategoryService() {
        categoryDAO = new CategoryDAO();
    }

    public boolean addCategory(Category category) {
        if (category == null) return false;

    
        if (category.getName() == null || category.getName().isEmpty()) return false;


        return categoryDAO.add(category);
    }
}
