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
@Table(name="orders")
public class order {
	@Id
	@GeneratedValue
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private account customer;
	
	@ManyToOne
	@JoinColumn(name="employee_id")
	private account employee;
	private Date ordered_date;
	private Date handled_date;
	
	@ManyToOne
	@JoinColumn(name="state_id")
	private state state;

	@OneToMany(mappedBy = "order")
	private Collection<orderdetail> orderdetails;
	public order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public order(Integer id, account customer, account employee, Date ordered_date, Date handled_date,
			com.shoes_store.lenhan.model.state state) {
		super();
		this.id = id;
		this.customer = customer;
		this.employee = employee;
		this.ordered_date = ordered_date;
		this.handled_date = handled_date;
		this.state = state;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public account getCustomer() {
		return customer;
	}

	public void setCustomer(account customer) {
		this.customer = customer;
	}

	public account getEmployee() {
		return employee;
	}

	public void setEmployee(account employee) {
		this.employee = employee;
	}

	public Date getOrdered_date() {
		return ordered_date;
	}

	public void setOrdered_date(Date ordered_date) {
		this.ordered_date = ordered_date;
	}

	public Date getHandled_date() {
		return handled_date;
	}

	public void setHandled_date(Date handled_date) {
		this.handled_date = handled_date;
	}

	public state getState() {
		return state;
	}

	public void setState(state state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "order [id=" + id + ", customer=" + customer + ", employee=" + employee + ", ordered_date="
				+ ordered_date + ", handled_date=" + handled_date + ", state=" + state + "]";
	}
	
	
}
