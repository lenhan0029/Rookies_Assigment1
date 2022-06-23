package com.shoes_store.lenhan.model;


import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="size")
public class size {
	
	@Id
	@GeneratedValue
	private Integer id;
	private Integer size;
	public size() {
		
	}
	
	public size(Integer size) {
		this.size=size;
	}
	
	public size(Integer id, Integer size) {
		this.id=id;
		this.size=size;
	}

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="quantity",
			joinColumns = @JoinColumn(name="size_id"),
			inverseJoinColumns = @JoinColumn(name="product_id"))
	private Collection<size> sizes;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "size [id=" + id + ", size=" + size + "]";
	}
	
	
}
