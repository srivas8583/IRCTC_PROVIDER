package com.spring.CRUD.operation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.CRUD.operation.Employee;
import com.spring.CRUD.operation.Service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired

	private EmployeeService employeeService;
	
	@PostMapping("/Employee")
      public ResponseEntity<String>createEmployee(@RequestBody Employee employee){
    	  String status = employeeService.upsert(employee);
    	  return new ResponseEntity<>(status,HttpStatus.CREATED);
      }
      
	@GetMapping("/Employee/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable Integer id){
		Employee employee = employeeService.getById(id);
		
		return new ResponseEntity<> (employee, HttpStatus.OK);
	}
	
	@GetMapping("/Employees")
	public ResponseEntity<List<Employee>> getAllEmployee(){
		 List<Employee> allEmployees= employeeService.getAllEmployee();
		 return new ResponseEntity<> ( allEmployees, HttpStatus.OK);
	}
	@PutMapping("/Employee")
    public ResponseEntity<String>updateEmployee(@RequestBody Employee employee){
  	  String status = employeeService.upsert(employee);
  	  return new ResponseEntity<>(status,HttpStatus.OK);
    }
	@DeleteMapping("/Employee/{id}")
    public ResponseEntity<String>deleteEmployee(@PathVariable Integer id){
  	  String status = employeeService.deleteById(id);
  	  return new ResponseEntity<>(status,HttpStatus.OK);
    }
}
