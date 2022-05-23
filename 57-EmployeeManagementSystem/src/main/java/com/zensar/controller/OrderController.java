package com.zensar.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.zensar.entity.Order;
import com.zensar.service.OrderService;




@RestController
@RequestMapping("/order")
public class OrderController {

@Autowired
private OrderService service;

@PostMapping("/bookOrders")
public Order bookOrder(@RequestBody Order order) {
return service.saveOrder(order);
}



}