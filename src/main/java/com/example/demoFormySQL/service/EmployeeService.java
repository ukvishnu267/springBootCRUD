package com.example.demoFormySQL.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.demoFormySQL.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long Id);
	void deleteEmployeeById(long Id);
    Page <Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);


}
