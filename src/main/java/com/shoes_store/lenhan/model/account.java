package com.shoes_store.lenhan.model;

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
	public account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public account(Integer id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="customerid", referencedColumnName = "id")
	private customer customer;
	
	@ManyToOne
	@JoinColumn(name="roleid")
	private role role;
	public Integer getId() {
		return id;
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
		return "account [id=" + id + ", user_name=" + username + ", password=" + password + "]";
	}
	
	
}
