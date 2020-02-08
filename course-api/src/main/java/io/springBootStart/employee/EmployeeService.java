package io.springBootStart.employee;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.dialect.pagination.TopLimitHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

//Business service
@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;

	
	public List<Employee> getAllEmployee(){
		
		
		List<Employee> employees = new ArrayList<>();
		employeeRepo.findAll()
		.forEach(employees::add);
		return employees;
		
	}
	
	
	public Employee getEmployee(int id) {
		return employeeRepo.findOne(id);
		
	}
	
	


	public void addEmployee(Employee employee) {
		employeeRepo.save(employee);
		
		
	}

	public void updateEmployee(int id, Employee employee) {
		employeeRepo.save(employee);
		
	}
	
	//update department 
	public void updateEmployeeDepartment(String department, Employee employee) {
		employeeRepo.save(employee);
		
	}


	public void deleteEmployee(int id) {
		employeeRepo.delete(id);
		
	}


	public List<Employee> getEmployeeByDepartment(String department) {
		
		return employeeRepo.findByDepartment(department);
	}
	

	// income Greater Than 
	public List<Employee> getEmployeeByIncome(int income) {
		
		return employeeRepo.findByIncomeGreaterThan(income);
	}
	
	
	// income Greater Than 
//		public List<Employee> getDateBefore(Date createdAt) {
//			
//			return employeeRepo.findByCreatedBefore(createdAt);
//		}
	
	


	
	



}
