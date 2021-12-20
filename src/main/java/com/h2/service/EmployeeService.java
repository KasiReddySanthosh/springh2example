package com.h2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h2.model.Employee;
import com.h2.repository.EmployeeRepository;
@Service
public class EmployeeService {
@Autowired
EmployeeRepository employeeRepository;
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		 employeeRepository.findAll().forEach(employee -> employees.add(employee));
		return employees;
	}
	
	public void delete(int id) {
		employeeRepository.deleteById(id);
	}

}
