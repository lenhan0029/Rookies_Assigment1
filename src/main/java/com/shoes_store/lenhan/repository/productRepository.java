package com.shoes_store.lenhan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.shoes_store.lenhan.model.product;

public interface productRepository extends JpaRepository<product, Integer>{
	
	@Query("select u from product u left join u.brand ar where ar.id = :brandid")
	List<product> getProductByBrandId(@Param("brandid") Integer brandid);
	
	@Query("SELECT MAX(p.id) FROM product p")
	public Integer MaxId();
}
