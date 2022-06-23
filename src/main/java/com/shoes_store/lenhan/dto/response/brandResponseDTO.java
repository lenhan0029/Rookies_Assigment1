package com.shoes_store.lenhan.dto.response;

public class brandResponseDTO {
	private Integer id;
	private String brand_name;
	public brandResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public brandResponseDTO(Integer id, String brand_name) {
		super();
		this.id = id;
		this.brand_name = brand_name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	
}
