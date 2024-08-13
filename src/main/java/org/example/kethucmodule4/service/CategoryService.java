package org.example.kethucmodule4.service;

import org.example.kethucmodule4.model.Categories;
import org.example.kethucmodule4.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService implements ICategoryService{
    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public Iterable<Categories> findAll() {
        return categoryRepo.findAll();
    }
}
