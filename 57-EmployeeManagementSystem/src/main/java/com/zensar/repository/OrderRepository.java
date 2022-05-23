package com.zensar.repository;



import com.zensar.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;



public interface OrderRepository extends JpaRepository<Order,Integer> {



}