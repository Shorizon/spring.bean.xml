package com.qa.java.spring.ioc.beans;

import java.time.LocalDate;

public class Order {

	private int id;
	private int customerId;
	private double orderValue;
	private String orderDate;


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public double getOrderValue() {
		return orderValue;
	}



	public void setOrderValue(double orderValue) {
		this.orderValue = orderValue;
	}



	public String getOrderDate() {
		return orderDate;
	}



	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}



	@Override
	public String toString() {
		return "(id=" + id + ", customerId=" + customerId + ", orderValue=" + orderValue + ", orderDate="
				+ orderDate + ")";
	}



}
