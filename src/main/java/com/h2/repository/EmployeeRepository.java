package com.h2.repository;

import org.springframework.data.repository.CrudRepository;

import com.h2.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
