package com.shoes_store.lenhan.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orderdetails")
public class orderdetail {
	@Id
	@GeneratedValue
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="orderid")
	private order order;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="quantityid")
	private quantity quantitys;
	private Integer quantity;
	public orderdetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public orderdetail(Integer id, com.shoes_store.lenhan.model.order order,
			com.shoes_store.lenhan.model.quantity quantitys, Integer quantity) {
		super();
		this.id = id;
		this.order = order;
		this.quantitys = quantitys;
		this.quantity = quantity;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public order getOrder() {
		return order;
	}
	public void setOrder(order order) {
		this.order = order;
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
		return "orderdetail [id=" + id + ", order=" + order + ", quantitys=" + quantitys + ", quantity=" + quantity
				+ "]";
	}
	
}
