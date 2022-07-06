package com.shoes_store.lenhan.model;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="accounts")
public class account {
	@Id
	@GeneratedValue
	private Integer id;
	private String username;
	private String password;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="customerid", referencedColumnName = "id")
	private customer customer;
	
	@ManyToOne
	@JoinColumn(name="roleid",referencedColumnName = "id")
	private role role;
	public account() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public account(Integer id, String username, String password, com.shoes_store.lenhan.model.customer customer,
			com.shoes_store.lenhan.model.role role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.customer = customer;
		this.role = role;
	}


	
	public Integer getId() {
		return id;
	}
	public customer getCustomer() {
		return customer;
	}
	public void setCustomer(customer customer) {
		this.customer = customer;
	}
	
	public role getRole() {
		return role;
	}


	public void setRole(role role) {
		this.role = role;
	}


	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "account [id=" + id + ", username=" + username + ", password=" + password + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(customer, id, password, role, username);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		account other = (account) obj;
		return Objects.equals(customer, other.customer) && Objects.equals(id, other.id)
				&& Objects.equals(password, other.password) && Objects.equals(role, other.role)
				&& Objects.equals(username, other.username);
	}


	
	
	
}
