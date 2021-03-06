package com.shoes_store.lenhan.model;

import java.util.Collection;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
//	@Enumerated(EnumType.STRING)
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
	public role(Integer id, String role, Set<account> accounts) {
		super();
		this.id = id;
		this.role = role;
		this.accounts = accounts;
	}

	@OneToMany(mappedBy = "role")
	private Set<account> accounts;
	
	
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


	public Set<account> getAccounts() {
		return accounts;
	}


	public void setAccounts(Set<account> accounts) {
		this.accounts = accounts;
	}


	@Override
	public String toString() {
		return "role [id=" + id + ", role=" + role + "]";
	}


	
}
