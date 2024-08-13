package org.example.kethucmodule4.service;

import org.example.kethucmodule4.model.Products;
import org.example.kethucmodule4.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Iterable<Products> findAll() {
        return productRepository.findAll();
    }
}
