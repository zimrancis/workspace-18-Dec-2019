package com.ciphersnippet.findbyidandname.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ciphersnippet.findbyidandname.model.Employee;
@RepositoryRestResource(collectionResourceRel = "employee", path = "employee")
public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
	List<Employee> findByFirstname(String firstname);
/* * * * *
 *1. With FirstName [Hit on the URL below:] 
 *http://localhost:8080/employee/search/findByFirstname?firstname=David
 *Spring Data will automatically generate the query behind the scene 
 *“SELECT * FROM EMPLOYEE WHERE FIRSTNAME = ?”
 * * * * */
	List<Employee> findByLastname(String lastname);
	
	List<Employee> findByIdAndLastname(Long id, String lastname);
/* * * * *
 *2. With Id and LastName [Hit on the URL below:] 
 *http://localhost:8080/employee/search/findByIdAndLastname?id=1&lastname=Scholes-edited
 *The query generated “SELECT * FROM EMPLOYEE WHERE ID= ? AND LASTNAME = ?”
 ** * * */	
	List<Employee> findByIdAndFirstname(Long id, String firstname);
}
