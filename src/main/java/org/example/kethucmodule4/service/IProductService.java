package org.example.kethucmodule4.service;

import org.example.kethucmodule4.model.Products;
import org.springframework.stereotype.Service;

@Service
public interface IProductService {
    Iterable<Products> findAll();
}
