package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}

