package io.springBootStart.employee;

import java.util.List;

import org.hibernate.annotations.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;

//public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	public List<Employee> findByDepartment(String department);
	




	// income Greater Than 
		@Query("SELECT i FROM Employee i WHERE i.income > ?1")
	public List<Employee> findByIncomeGreaterThan(int income);

}
