package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Set;

import com.bean.Employee;
import com.exception.DuplicateIdException;
import com.services.EmployeeServiceImpl;
import com.services.EmployeeServices;

import junit.framework.TestCase;

public class EmployeeImplTest extends TestCase {

	EmployeeServices employeeServices;
	SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
	
	protected void setUp() throws Exception {
		super.setUp();
		employeeServices = new EmployeeServiceImpl();
	}

	public void testAddEmployee() throws ParseException {
		try {
			employeeServices.addEmp(createEmployee());
		} catch (DuplicateIdException e) {
			e.getMessage();
		}
		
	}

	public void testGetAllEmployees() {

		Set<Employee> employees = employeeServices.getAllEmployees();
		Employee employee = employees.iterator().next();

		assertEquals(101, employee.getId());

	}
	
	public void testDeleteEmployee() {

		employeeServices.deleteEmployee(103);

	}

	private Employee createEmployee() throws ParseException {
		
		Employee e1 = new Employee(101, "Sam", "sam@gmail.com", "312 ,Mason Street, San Francisco", sdf.parse("04-23-2017"));
		
		return e1;
		
	}
}
