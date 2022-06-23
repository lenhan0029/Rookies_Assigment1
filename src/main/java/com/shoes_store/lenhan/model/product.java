package com.shoes_store.lenhan.model;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class product {
	@Id
	@GeneratedValue
	private Integer id;
	private String product_name;
	private Integer price;
	private String image;
	private Date created_date;
	private Date updated_date;
	private String description;
	
	public product() {
	}

	public product(Integer id, String product_name, Integer price, String image, Date created_date, Date updated_date,
			String description) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.price = price;
		this.image = image;
		this.created_date = created_date;
		this.updated_date = updated_date;
		this.description = description;
	}
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private category category;

	@ManyToOne
	@JoinColumn(name="brand_id")
	private brand brand;
	@OneToMany(mappedBy = "product")
	private Collection<rating> ratings;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Date getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "product [id=" + id + ", product_name=" + product_name + ", price=" + price + ", image=" + image
				+ ", created_date=" + created_date + ", updated_date=" + updated_date + ", description=" + description
				+ "]";
	}
	
	
}
