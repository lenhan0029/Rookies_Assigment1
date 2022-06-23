package com.shoes_store.lenhan.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ratings")
public class rating {
	@Id
	@GeneratedValue
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="product_id")
	private product product;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="customer_id")
	private customer customer;
	private Integer star_rating;
	private String comment;
	public rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	public rating(Integer id, com.shoes_store.lenhan.model.product product,
			com.shoes_store.lenhan.model.customer customer, Integer star_rating, String comment) {
		super();
		this.id = id;
		this.product = product;
		this.customer = customer;
		this.star_rating = star_rating;
		this.comment = comment;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public product getProduct() {
		return product;
	}
	public void setProduct(product product) {
		this.product = product;
	}
	public customer getCustomer() {
		return customer;
	}
	public void setCustomer(customer customer) {
		this.customer = customer;
	}
	public Integer getStar_rating() {
		return star_rating;
	}
	public void setStar_rating(Integer star_rating) {
		this.star_rating = star_rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "rating [id=" + id + ", product=" + product + ", customer=" + customer + ", star_rating=" + star_rating
				+ ", comment=" + comment + "]";
	}
	
}
