package org.example.kethucmodule4.repository;

import org.example.kethucmodule4.model.Categories;
import org.example.kethucmodule4.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface CategoryRepo extends JpaRepository<Categories,Long> {

}
