package org.example.kethucmodule4.repository;

import org.example.kethucmodule4.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Categories,Long> {
}
