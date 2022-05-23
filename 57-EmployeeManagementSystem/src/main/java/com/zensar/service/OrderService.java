package com.zensar.service;



import com.zensar.entity.Order;
import com.zensar.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class OrderService {

@Autowired
private OrderRepository repository;

public Order saveOrder(Order order) {
return repository.save(order);
}
}