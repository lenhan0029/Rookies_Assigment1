package com.shoes_store.lenhan.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="brands")
public class brand {
	@Id
	@GeneratedValue
	private Integer id;
	private String brand_name;
	
	
	public brand() {
		
	}
	public brand(String brand_name) {
		this.brand_name=brand_name;
	}
	public brand(Integer id, String brand_name) {
		this.id=id;
		this.brand_name=brand_name;
	}

	@OneToMany(mappedBy = "brand", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Collection<product> products;
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
	@Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", name='" + brand_name + '\'' +
                '}';
    }
}
