package com.services;

import java.util.Set;

import com.bean.Employee;

public interface EmployeeServices {

	public void addEmp(Employee e);
	public Set<Employee> getAllEmployees();
	public void updateEmployee(int id, Employee e);
	public void deleteEmployee(int id);
	

	
	
}
