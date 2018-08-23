package com.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.exception.DuplicateIdException;

@Service
public class EmployeeServiceImpl implements EmployeeServices{

	static Set<Employee> employees = new HashSet<Employee>();
	static {
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		

		try {
			employees.add(new Employee(101, "Sam", "sam@gmail.com", "312 ,Mason Street, San Francisco", sdf.parse("04-23-2017")));
			employees.add(new Employee(102, "Tom", "tom@gmail.com", "312 , Jason Street, Indiana", sdf.parse("02-25-2017")));
			employees.add(new Employee(103,"Terry","terry@gmail.com","312 , Cedar Heights, California", sdf.parse("02-04-2016")));
			employees.add(new Employee(104,"Jerry", "jerry@gmail.com","312 , Malcon Street, Memphsis", sdf.parse("02-06-2013")));
			employees.add(new Employee(105,"George", "george@gmail.com","312 , N Johnson Street, San Diago", sdf.parse("06-18-2018")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void addEmp(Employee e) throws DuplicateIdException{
		
		for (Employee temp : employees) {
			if (temp.getId() == e.getId()) {
				throw new DuplicateIdException("Id already exists.");
			}
		}
		employees.add(e);
		System.out.println(employees);
		
	}

	@Override
	public Set<Employee> getAllEmployees() {
		
		return employees;
	}

	@Override
	public void updateEmployee(int id, Employee e) {
		Employee emp = new Employee();
		
		for (Employee temp : employees) {
			if (temp.getId() == id)
				emp = temp;
		}
		
		emp.setName(e.getName());
		emp.setEmail(e.getEmail());
		emp.setAddress(e.getAddress());
		emp.setDoj(e.getDoj());
		
	}
	
	public Employee getEmployee(int employeeid) {
		Employee e = new Employee();
		for (Employee temp : employees) {
			if (temp.getId() == employeeid)
				e = temp;
		}
		return e;
	}

	@Override
	public void deleteEmployee(int id) {
		
		Employee e = null;
		for (Employee temp : employees) {
			if (temp.getId() == id)
				e = temp;
		}
		employees.remove(e);

	}
	
	

}
