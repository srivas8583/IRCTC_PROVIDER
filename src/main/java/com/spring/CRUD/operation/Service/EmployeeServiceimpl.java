package com.spring.CRUD.operation.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.CRUD.operation.Employee;
import com.spring.CRUD.operation.Repository.EmployeeRepository;
@Service
public class EmployeeServiceimpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public String upsert(Employee employee) {
		employeeRepository.save(employee);//insert and update the  record 
		return "sucess";
	}

	@Override
	public Employee getById(Integer id) {
     Optional<Employee>findById= employeeRepository.findById(id);
      if(findById.isPresent()) {
       	return findById.get();
            }
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		employeeRepository.findAll();
		return null;
	}

	@Override
	public String deleteById(Integer id) {
		if(employeeRepository.existsById(id)) {
			employeeRepository.deleteById(id);
			
			return "Delete Sucess";
		}
		else {
			return "Id Not Found";
		}

	}

}
