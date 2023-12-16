package com.example.emp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.emp.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
                 
}
