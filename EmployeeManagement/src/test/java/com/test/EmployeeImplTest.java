package com.test;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.bean.Employee;
import com.exception.DuplicateIdException;
import com.services.EmployeeServiceImpl;
import com.services.EmployeeServices;

@RunWith(JUnit4.class)
public class EmployeeImplTest {

	EmployeeServices employeeService = new EmployeeServiceImpl();
	SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");

	@Test
	public void testAddEmployee() throws ParseException {

		employeeService.addEmp(
				new Employee(1, "Sam", "sam@gmail.com", "312 ,Mason Street, San Francisco", sdf.parse("04-23-2017")));

		assertEquals(5, employeeService.getAllEmployees().size());
		

	}

	@Test(expected = DuplicateIdException.class)
	public void testAddEmployeeWithDuplicateId() {
		try {
			employeeService.addEmp(new Employee(1, "Sam", "sam@gmail.com", "312 ,Mason Street, San Francisco",
					sdf.parse("04-23-2017")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testGetAllEmployees() {

		Set<Employee> employees = employeeService.getAllEmployees();
		
		assertEquals(5,employees.size());
	}

	@Test
	public void testDeleteEmployee() {

		employeeService.deleteEmployee(103);
		assertEquals(4,employeeService.getAllEmployees().size());
	}
	
	

}
