package com.shoes_store.lenhan.services;

import java.util.List;

import com.shoes_store.lenhan.dto.request.brandUpdateDTO;
import com.shoes_store.lenhan.dto.response.brandResponseDTO;
import com.shoes_store.lenhan.model.brand;

public interface brandService {
	
	public List<brand> getAllBrand();
	
	public brand getBrandById(Integer id);
	
	public brandResponseDTO getBranđDTOById(Integer id);
	
	public brandResponseDTO createBrand(brandUpdateDTO brand);
	
	public brandResponseDTO updateBrand(Integer id,brandUpdateDTO brand);
	
	public void deleteBrand(Integer id);
	
}
