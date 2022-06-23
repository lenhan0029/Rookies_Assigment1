package com.shoes_store.lenhan.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class role {
	@Id
	@GeneratedValue
	private Integer id;
	private String role;
	public role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public role(Integer id, String role) {
		super();
		this.id = id;
		this.role = role;
	}
	
	@OneToMany(mappedBy = "role")
	private Collection<account> accounts;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "role [id=" + id + ", role=" + role + "]";
	}
	
}
