package org.example.kethucmodule4.repository;

import org.example.kethucmodule4.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface OrderRepo extends JpaRepository<Orders,Long> {
    @Query("select o from Orders o where " +
            "(:dayMin is null or o.buyDay >= :dayMin ) and " +
            "(:dayMax is null or o.buyDay <= :dayMax)")
    Iterable<Orders> findAll(@Param("dayMin") LocalDate dayMin,
                             @Param("dayMax") LocalDate dayMax);
}
