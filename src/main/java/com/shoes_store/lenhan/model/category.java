package com.shoes_store.lenhan.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categories")
public class category {

	@Id
	@GeneratedValue
	private Integer id;
	private String category_name;
	
	public category() {
	}
	public category(Integer id, String category_name) {
		super();
		this.id = id;
		this.category_name = category_name;
	}
	
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	private Collection<product> products;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	@Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", name='" + category_name + '\'' +
                '}';
    }
	
}
