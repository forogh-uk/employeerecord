package io.springBootStart.employee;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity

public class Employee {
	
	
	@Id
	private int id;
	private String name;
	private int payroll;
	private String postcode;
	private int income;
	private String department;
	@CreationTimestamp
    private Date createdAt;
	
	
	
	public Employee() {
		
	}
	

	public Employee(int id, String name, int payroll, String postcode, int income, String department, Date createdAt) {
		super();
		this.id = id;
		this.name = name;
		this.payroll = payroll;
		this.postcode = postcode;
		this.income = income;
		this.department = department;
		this.createdAt = createdAt;
	}






	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPayroll() {
		return payroll;
	}
	public void setPayroll(int payroll) {
		this.payroll = payroll;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	public int getIncome() {
		return income;
	}


	public void setIncome(int income) {
		this.income = income;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	

}
