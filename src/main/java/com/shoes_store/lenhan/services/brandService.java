package com.shoes_store.lenhan.services;

import java.util.List;

import com.shoes_store.lenhan.dto.response.brandResponseDTO;

public interface brandService {
	public List<brandResponseDTO> getAllBrands();
	public brandResponseDTO getBrand(int brand_id);
	public brandResponseDTO addBrand(brandResponseDTO brand);
	public brandResponseDTO updateBrand(int brand_id, brandResponseDTO brnad);
	public boolean deletaBrand(int brand_id);
}
