package com.spring.CRUD.operation;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="employee")
public class Employee{
        
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	     private Integer id;
	@Column(name="first_name")
	     private String FirstName;
	@Column(name="last_name")
	     private String LastName;
	@Column(name="email")
	     private String Email;
	@Override
	public String toString() {
		return "Employee [FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email + "]";
	}
	public Employee() {
		super();
	}
	
	
}

