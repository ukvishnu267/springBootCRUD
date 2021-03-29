package com.example.demoFormySQL.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoFormySQL.model.Employee;
import com.example.demoFormySQL.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}
	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		this.employeeRepository.save(employee);
	}
	@Override
	public Employee getEmployeeById(long Id) {
		// TODO Auto-generated method stub
		Optional<Employee> optional = employeeRepository.findById(Id);
		Employee employee =null;
		if (optional.isPresent()) {
			employee = optional.get();
		}else {
			throw new RuntimeException("Employee not found for "+ Id);
		}
		return employee;
	}
	@Override
	public void deleteEmployeeById(long Id) {
		// TODO Auto-generated method stub
		this.employeeRepository.deleteById(Id);
		
	}

}
