package com.spring.CRUD.operation.Service;

import java.util.List;

import com.spring.CRUD.operation.Employee;

public interface EmployeeService {
	
	
	public String upsert(Employee employee);
	public Employee getById(Integer id);
	
	public List<Employee> getAllEmployee();
	
	public String deleteById(Integer id);
	

}
