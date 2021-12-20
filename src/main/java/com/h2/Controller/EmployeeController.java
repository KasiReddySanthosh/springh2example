package com.h2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.h2.model.Employee;
import com.h2.service.EmployeeService;

@RestController

public class EmployeeController {
	
@Autowired
EmployeeService employeeService;

@GetMapping("/employee")
 private List<Employee> getAllEmployees(){
	 return employeeService.getAllEmployees();
 }

@GetMapping("/employee/{id}")
private void deleteEmployee(@PathVariable("id")int id) {
employeeService.delete(id);
}
}
