package io.springBootStart.employee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Employee {
	
	
	@Id
	private int id;
	private String name;
	private int payroll;
	private String postcode;
	private int income;
	private String department;
	
	
	
	


	public Employee(int id, String name, int payroll, String postcode, int income, String department) {
		super();
		this.id = id;
		this.name = name;
		this.payroll = payroll;
		this.postcode = postcode;
		this.income = income;
		this.department = department;
	}


	public Employee() {
		
	}
	
	
	public Employee(int id, String name, int payroll, String postcode) {
		super();
		this.id = id;
		this.name = name;
		this.payroll = payroll;
		this.postcode = postcode;
		
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


	public Employee(int id, String name, int payroll, String postcode, int income) {
		super();
		this.id = id;
		this.name = name;
		this.payroll = payroll;
		this.postcode = postcode;
		this.income = income;
	}


	


	
	
	
	

}
