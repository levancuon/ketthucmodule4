package org.example.kethucmodule4.service;

import org.example.kethucmodule4.model.Categories;

public interface ICategoryService {
    Iterable<Categories> findAll();
}
