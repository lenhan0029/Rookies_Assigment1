package com.shoes_store.lenhan.services;

import java.util.List;

import com.shoes_store.lenhan.dto.request.productUpdateDTO;
import com.shoes_store.lenhan.dto.response.productResponseDTO;
import com.shoes_store.lenhan.model.product;


public interface productService {
	public List<product> getAllProduct();
	
	public product getProductById(Integer id);
	
	public List<product> getProductByBrandId(Integer id);
	
	public productResponseDTO getProductDTOById(Integer id);
	
	public productResponseDTO createProduct(productUpdateDTO dto);
	
	public productResponseDTO updateProduct(Integer id,productUpdateDTO dto);
	
	public void deleteProduct(Integer id);
}
