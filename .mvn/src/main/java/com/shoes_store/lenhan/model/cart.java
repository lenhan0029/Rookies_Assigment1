package com.shoes_store.lenhan.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="carts")
public class cart {
	@Id
	@GeneratedValue
	private Integer id;

	public cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public cart(Integer id) {
		super();
		this.id = id;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="customerid", referencedColumnName = "id")
	private customer customer;
	
	@OneToMany(mappedBy = "cart")
	private Collection<cartdetail> cartdetail;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "cart [id=" + id + ", customer=" + customer + "]";
	}
	
	
}
