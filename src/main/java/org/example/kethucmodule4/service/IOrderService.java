package org.example.kethucmodule4.service;

import org.example.kethucmodule4.model.Orders;
import org.springframework.stereotype.Service;

@Service
public interface IOrderService {
    Iterable<Orders> findAll();

    Orders findById(Long id);

    void save(Orders orders);
}
