package com.controller;

import java.io.IOException;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Employee;
import com.services.EmployeeServices;

@Controller
public class EmployeeController {

	Logger logger = Logger.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeServices employeeService;

	@RequestMapping(value = "/")
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

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView updateContact(@ModelAttribute int id, @ModelAttribute Employee employee) {
		ModelAndView model = new ModelAndView();
		logger.info("Update an Employee");
		model.setViewName("update");
		employeeService.updateEmployee(id, employee);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/delete")
	public ModelAndView deleteContact(HttpServletRequest request) {
		int eid = Integer.parseInt(request.getParameter("eid"));
		logger.info("Delete an Employee");
		employeeService.deleteEmployee(eid);
		
		return new ModelAndView("redirect:/");
	}

}
