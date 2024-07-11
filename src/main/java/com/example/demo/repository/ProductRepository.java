package com.example.demo.repository;

import com.example.demo.domain.Product;



public interface ProductRepository extends JpaRepository<Product, Long> {
    // les méthodes saveAll() et autres méthodes CRUD sont héritées de JpaRepository
}
