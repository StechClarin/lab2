package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    public void saveAll(List<Item> items);
}
