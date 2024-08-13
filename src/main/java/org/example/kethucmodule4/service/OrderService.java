package org.example.kethucmodule4.service;

import org.example.kethucmodule4.model.Orders;
import org.example.kethucmodule4.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class OrderService implements IOrderService {
@Autowired
private OrderRepo orderRepo;
    @Override
    public Iterable<Orders> findAll() {
        return orderRepo.findAll();
    }

    @Override
    public Orders findById(Long id) {
        return orderRepo.findById(id).orElse(null);
    }

    @Override
    public void save(Orders orders) {
        orderRepo.save(orders);
    }

    @Override
    public Iterable<Orders> findByDay(LocalDate dayMin, LocalDate dayMax) {
        return orderRepo.findAll(dayMin,dayMax);
    }
}
