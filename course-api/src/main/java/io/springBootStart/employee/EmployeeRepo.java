package io.springBootStart.employee;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
	
	public List<Employee> findByDepartment(String department);
	//public List<Employee> updateByDepartment(String department);

}
