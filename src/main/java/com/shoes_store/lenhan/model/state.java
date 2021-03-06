package com.shoes_store.lenhan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="states")
public class state {
	@Id
	@GeneratedValue
	private Integer id;
	private String state;
	public state() {
		super();
		// TODO Auto-generated constructor stub
	}
	public state(Integer id, String state) {
		super();
		this.id = id;
		this.state = state;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "state [id=" + id + ", state=" + state + "]";
	}
	
	
}
