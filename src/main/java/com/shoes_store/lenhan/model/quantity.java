package com.shoes_store.lenhan.model;


import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="quantity")
public class quantity {
	@Id
	@GeneratedValue
	private Integer id;
	private Integer quantity;
	
	@OneToMany(mappedBy = "quantitys")
	private Collection<cart_detail> cart_details;
	
	@OneToMany(mappedBy = "quantitys")
	private Collection<order_detail> order_details;

	public quantity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public quantity(Integer id, Integer quantity, Collection<cart_detail> cart_details) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.cart_details = cart_details;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Collection<cart_detail> getCart_details() {
		return cart_details;
	}

	public void setCart_details(Collection<cart_detail> cart_details) {
		this.cart_details = cart_details;
	}

	@Override
	public String toString() {
		return "quantity [id=" + id + ", quantity=" + quantity + ", cart_details=" + cart_details + "]";
	}
	
}
