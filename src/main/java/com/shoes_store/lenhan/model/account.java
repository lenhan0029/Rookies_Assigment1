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
	private String user_name;
	private String password;
	public account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public account(Integer id, String user_name, String password) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.password = password;
	}
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="customer_id", referencedColumnName = "id")
	private customer customer;
	
	@ManyToOne
	@JoinColumn(name="role_id")
	private role role;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "account [id=" + id + ", user_name=" + user_name + ", password=" + password + "]";
	}
	
	
}
