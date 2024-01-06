package com.spring.CRUD.operation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
//@EntityScan("")
@SpringBootApplication
//@ComponentScan("com.spring.CRUD.operation.Repository")
public class SpringCrudOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudOperationApplication.class, args);
	}

}
