package com.shoes_store.lenhan.services.impl;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoes_store.lenhan.dto.request.productUpdateDTO;
import com.shoes_store.lenhan.dto.response.productResponseDTO;
import com.shoes_store.lenhan.exceptions.productNotFoundException;
import com.shoes_store.lenhan.model.product;
import com.shoes_store.lenhan.repository.productRepository;
import com.shoes_store.lenhan.services.productService;

@Service
public class productServiceImpl implements productService{

	private productRepository productrepository;
	private ModelMapper modelmapper;
	
	@Autowired
	public productServiceImpl(productRepository productrepository, ModelMapper modelmapper) {
		this.productrepository = productrepository;
		this.modelmapper = modelmapper;
	}
	
	@Override
	public List<product> getAllProduct() {
		return this.productrepository.findAll();
	}


	@Override
	public product getProductById(Integer id) {
		Optional<product> productoptional = this.productrepository.findById(id);
		product product =productoptional.get();
		return product;
	}

	@Override
	public List<product> getProductByBrandId(Integer id) {
		List<product> productlist = this.productrepository.getProductByBrandId(id);
		return productlist;
		
	}

	@Override
	public productResponseDTO getProductDTOById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public productResponseDTO createProduct(productUpdateDTO dto) {
		
		product product = modelmapper.map(dto, product.class);
		product savedproduct = productrepository.save(product);
		// TODO Auto-generated method stub
		return modelmapper.map(savedproduct, productResponseDTO.class);
	}

	@Override
	public productResponseDTO updateProduct(Integer id, productUpdateDTO dto) {
		Optional<product> productoptional = this.productrepository.findById(id);
		if(productoptional.isPresent()) {
			throw new productNotFoundException();
		}
		product product = productoptional.get();
		modelmapper.map(dto, product);
		product = productrepository.save(product);
		return modelmapper.map(product, productResponseDTO.class);
	}

	@Override
	public void deleteProduct(Integer id) {
		
		
	}

}
