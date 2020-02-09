package io.springBootStart.employee;




import java.sql.Date;
import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;

//public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	public List<Employee> findByDepartment(String department);

	// income Greater Than 
		@Query("SELECT i FROM Employee i WHERE i.income > ?1")
	public List<Employee> findByIncomeGreaterThan(int income);
		
		
		//update department 
		@Modifying
		@Query("update Employee e set e.department = ?1 where e.name = ?2")
		int updateDepartment(String department, String name);
		
	
		// after
		@Query("SELECT d FROM Employee d WHERE d.createdAt > ?1")
		List<Employee> findByCreatedAfter(Date after);
		
		
		// income Greater Than and date after 
		@Query("SELECT i FROM Employee i WHERE i.income > ?1 AND i.createdAt > ?2")
		public List<Employee> findByIncomeGreaterDateAfter(int income, Date after);

}
