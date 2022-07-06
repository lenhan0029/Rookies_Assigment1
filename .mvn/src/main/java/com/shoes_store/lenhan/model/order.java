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
	@JoinColumn(name="customerid")
	private account customer;
	
	@ManyToOne
	@JoinColumn(name="employeeid")
	private account employee;
	private Date ordereddate;
	private Date handleddate;
	
	@ManyToOne
	@JoinColumn(name="stateid")
	private state state;

	@OneToMany(mappedBy = "order")
	private Collection<orderdetail> orderdetails;
	public order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public order(Integer id, account customer, account employee, Date ordereddate, Date handleddate,
			com.shoes_store.lenhan.model.state state) {
		super();
		this.id = id;
		this.customer = customer;
		this.employee = employee;
		this.ordereddate = ordereddate;
		this.handleddate = handleddate;
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

	public Date getOrdereddate() {
		return ordereddate;
	}

	public void setOrdereddate(Date ordereddate) {
		this.ordereddate = ordereddate;
	}

	public Date getHandleddate() {
		return handleddate;
	}

	public void setHandleddate(Date handleddate) {
		this.handleddate = handleddate;
	}

	public state getState() {
		return state;
	}

	public void setState(state state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "order [id=" + id + ", customer=" + customer + ", employee=" + employee + ", ordereddate="
				+ ordereddate + ", handleddate=" + handleddate + ", state=" + state + "]";
	}
	
	
}
