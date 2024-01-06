package com.spring.CRUD.operation.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.CRUD.operation.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Serializable> {

}
