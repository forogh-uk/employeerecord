package io.springBootStart.employee;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRecord {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/employee")
	public List<Employee> record() {
		return employeeService.getAllEmployee();
	}
	
	@RequestMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return employeeService.getEmployee(id);
	}
	
	@RequestMapping("/employee/department/{department}")
	public List<Employee> getEmployeeByDepartment(@PathVariable String department) {
		return employeeService.getEmployeeByDepartment(department);
	}
	
	
	//income greater than
	@RequestMapping("/employee/income/{income}")
	public List<Employee> getEmployeeByIncome(@PathVariable int income){
		return employeeService.getEmployeeByIncome(income);
	}
	
	
	
	//date before
//		@RequestMapping("/employee/income/{createdAt}")
//		public List<Employee> getDateBefore(@PathVariable Date createdAt){
//			return employeeService.getDateBefore(createdAt);
//		}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/employee")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/employee/{id}")
	public void updateEmployee(@RequestBody Employee employee,@PathVariable int id ) {
		employeeService.updateEmployee(id ,employee);
	}
	
	//update department
	@RequestMapping(method = RequestMethod.PUT, value = "/employee/department/{department}")
	public void updateDepartment(@RequestBody Employee employee,@PathVariable String department ) {
		employeeService.updateEmployeeDepartment(department ,employee);
	}
	

	
	@RequestMapping(method = RequestMethod.DELETE, value = "/employee/{id}")
	public void deleteEmployee(@PathVariable int id ) {
		employeeService.deleteEmployee(id);
	}
	



}
