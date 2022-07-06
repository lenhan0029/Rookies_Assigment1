package com.shoes_store.lenhan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoes_store.lenhan.model.cart;

public interface cartRepository extends JpaRepository<cart, Integer>{
	
}
