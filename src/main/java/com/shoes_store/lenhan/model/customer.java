package com.shoes_store.lenhan.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class customer {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String customer_name;
	private String email;
	private String phone_number;
	private String address;
	private String gender;
	private Integer age;

	public customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public customer(Integer id, String customer_name, String email, String phone_number, String address, String gender,
			Integer age) {
		super();
		this.id = id;
		this.customer_name = customer_name;
		this.email = email;
		this.phone_number = phone_number;
		this.address = address;
		this.gender = gender;
		this.age = age;
	}
	
	@OneToOne(mappedBy = "customer")
	private account account;
	
	@OneToOne(mappedBy = "customer")
	private cart cart;
	
	@OneToMany(mappedBy = "customer")
	private Collection<rating> ratingss;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "customer [id=" + id + ", customer_name=" + customer_name + ", email=" + email + ", phone_number="
				+ phone_number + ", address=" + address + ", gender=" + gender + ", age=" + age + "]";
	}
}