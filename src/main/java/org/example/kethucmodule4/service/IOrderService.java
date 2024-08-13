package org.example.kethucmodule4.service;

import org.example.kethucmodule4.model.Orders;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public interface IOrderService {
    Iterable<Orders> findAll();

    Orders findById(Long id);

    void save(Orders orders);

    Iterable<Orders> findByDay(LocalDate dayMin, LocalDate dayMax);
}
