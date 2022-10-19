package com.qa.java.spring.ioc.beans;
import java.util.List;

public class Customer {

	
	private int id;	private String name;	private String email;	private String contactNo;	private List<Order> ordersList;
	
	
	public Customer(int id, String name, String email, String contactNo, List<Order> ordersList) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contactNo = contactNo;
		this.ordersList = ordersList;
	}

	
	public void init() {
		System.out.println("Init method of Customer Bean");
	}
	
	public void destroy() {
		System.out.println("Destroy method of Customer Bean");
	}
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo + "\n"
				+ "ordersList=" + ordersList ;
	}

	

}
