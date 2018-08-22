package com.services;

import java.util.Set;

import com.bean.Employee;
import com.exception.DuplicateIdException;

public interface EmployeeServices {

	public void addEmp(Employee e) throws DuplicateIdException;
	public Set<Employee> getAllEmployees();
	public void updateEmployee(int id, Employee e);
	public void deleteEmployee(int id);
	public Employee getEmployee(int employeeid); 
}
