package com.shoes_store.lenhan.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.shoes_store.lenhan.dto.request.brandUpdateDTO;
import com.shoes_store.lenhan.dto.response.ErrorResponse;
import com.shoes_store.lenhan.dto.response.brandResponseDTO;
import com.shoes_store.lenhan.exceptions.brandNotFoundException;
import com.shoes_store.lenhan.model.brand;
import com.shoes_store.lenhan.services.brandService;

@RestController
@RequestMapping("/brand")
public class brandController {
	private brandService brandservice;
	
	@Autowired
	public brandController(brandService brandservice) {
		this.brandservice = brandservice;
	}


	@GetMapping
	public List<brand> getAllBrands(){
		return this.brandservice.getAllBrand();
	}
	@GetMapping("/{id}")
	brand getBrandById(@PathVariable("id") Integer id) {
		return this.brandservice.getBrandById(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	brandResponseDTO createBrand(@Valid @RequestBody brandUpdateDTO dto) {
		return this.brandservice.createBrand(dto);
	}
	
	@PutMapping("/{id}")
	brandResponseDTO updateBrand(@PathVariable("id") Integer id,@RequestBody brandUpdateDTO dto) {
		return this.brandservice.updateBrand(id, dto);
	}
	
	@DeleteMapping("/{id}")
	public void deleteBrand(@PathVariable Integer id) {
		this.brandservice.deleteBrand(id);
	}
	
	@ExceptionHandler({ brandNotFoundException.class })
	protected ResponseEntity<ErrorResponse> handleBrandNotFoundException() {
		ErrorResponse error = new ErrorResponse("404", "Brand is Not Found");
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.NOT_FOUND);
	}
}
