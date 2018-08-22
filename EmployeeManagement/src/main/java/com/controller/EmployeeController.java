package com.controller;

import java.io.IOException;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Employee;
import com.services.EmployeeServices;

@Controller
public class EmployeeController {

	Logger logger = Logger.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeServices employeeService;

	@RequestMapping(value = "/")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
	public ModelAndView listContact(ModelAndView model) throws IOException {
		Set<Employee> employees = employeeService.getAllEmployees();
		logger.info("Adding Employee Objects");
		model.addObject("employees", employees);

		model.setViewName("home");

		return model;
	}

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	
	public ModelAndView newContact(ModelAndView model) {
		Employee employee = new Employee();
		logger.info("Creating a new Employee");
		model.addObject("employee", employee);
		model.setViewName("new");
		return model;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveContact(@ModelAttribute Employee employee) {
		logger.info("In save method");
		employeeService.addEmp(employee);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView updateContact(@RequestParam int id, @ModelAttribute Employee employee) {
		ModelAndView model = new ModelAndView();
		logger.info("Update an Employee");
		model.setViewName("update");
		model.addObject("emplyee", employee);
		employeeService.updateEmployee(id, employee);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		
		logger.info("In Edit method of Employee");
		int employeeid = Integer.parseInt(request.getParameter("id"));
		Employee employee = employeeService.getEmployee(employeeid);
		ModelAndView model = new ModelAndView("update");
		model.addObject("employee", employee);
		return model;
	}

	@RequestMapping(value = "/delete")
	public ModelAndView deleteContact(HttpServletRequest request) {
		int eid = Integer.parseInt(request.getParameter("eid"));
		logger.info("Delete an Employee");
		employeeService.deleteEmployee(eid);
		
		return new ModelAndView("redirect:/");
	}
	

}