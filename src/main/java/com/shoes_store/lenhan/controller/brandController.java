package com.shoes_store.lenhan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoes_store.lenhan.model.brand;
import com.shoes_store.lenhan.repository.brandRepository;

@RestController
@RequestMapping("/brand")
public class brandController {
	@Autowired
	private brandRepository repository;
	
	@GetMapping
	public List<brand> getAllBrands(){
		return this.repository.findAll();
	}
	
	@GetMapping("/{id}")
	public brand getBrand(@PathVariable Integer id) {
		return this.repository.getReferenceById(id);
	}
	
}
