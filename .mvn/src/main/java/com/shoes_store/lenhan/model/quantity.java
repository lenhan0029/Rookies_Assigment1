package com.shoes_store.lenhan.model;


import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="quantity")
public class quantity {
	@Id
	@GeneratedValue
	private Integer id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="productid")
	private product product;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="sizeid")
	private size size;
	private Integer quantity;
	
	@OneToMany(mappedBy = "quantitys")
	private Collection<cartdetail> cartdetails;
	
	@OneToMany(mappedBy = "quantitys")
	private Collection<orderdetail> orderdetails;

	public quantity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public quantity(Integer id, Integer quantity, Collection<cartdetail> cartdetails) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.cartdetails = cartdetails;
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

	public Collection<cartdetail> getCart_details() {
		return cartdetails;
	}

	public void setCart_details(Collection<cartdetail> cartdetails) {
		this.cartdetails = cartdetails;
	}

	@Override
	public String toString() {
		return "quantity [id=" + id + ", quantity=" + quantity + ", cart_details=" + cartdetails + "]";
	}
	
}
