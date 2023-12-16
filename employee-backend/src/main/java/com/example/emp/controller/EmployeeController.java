package com.example.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.emp.Repository.EmployeeRepository;
import com.example.emp.model.Employee;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class EmployeeController {
     @Autowired
     private EmployeeRepository emp;
     
     @GetMapping("/employees")
     public List<Employee> getAllEmployees(){
    	return emp.findAll();
     }
     @PostMapping("/employees")
     public Employee saveEmployeeDetails(@RequestBody Employee employee) {
         return emp.save(employee);
     }
     @GetMapping("/employees/{id}")
     public Employee getSingleEmployee(@PathVariable Long id) {
    	 return emp.findById(id).get();
     }
     @PutMapping("/employees")
     public Employee updateEmployee(@RequestBody Employee employee) {
    	 return emp.save(employee);
     }
     @DeleteMapping("/employees/{id}")
     public ResponseEntity<HttpStatus> deleteEmployeeById(@PathVariable Long id) {
    	 emp.deleteById(id);
    	 return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
     }
  
}

