package org.example.kethucmodule4.repository;

import org.example.kethucmodule4.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Products,Long> {
}
