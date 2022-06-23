package com.shoes_store.lenhan.model;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cart_details")
public class cart_detail {
	@Id
	@GeneratedValue
	private Integer id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="cart_id")
	private cart cart;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="quantity_id")
	private quantity quantitys;
	
	private Integer quantity;

	public cart_detail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public cart_detail(com.shoes_store.lenhan.model.cart cart, com.shoes_store.lenhan.model.quantity quantitys,
			Integer quantity) {
		super();
		this.cart = cart;
		this.quantitys = quantitys;
		this.quantity = quantity;
	}

	public cart getCart() {
		return cart;
	}

	public void setCart(cart cart) {
		this.cart = cart;
	}

	public quantity getQuantitys() {
		return quantitys;
	}

	public void setQuantitys(quantity quantitys) {
		this.quantitys = quantitys;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "cart_detail [cart=" + cart + ", quantitys=" + quantitys + ", quantity=" + quantity + "]";
	}
	
}
