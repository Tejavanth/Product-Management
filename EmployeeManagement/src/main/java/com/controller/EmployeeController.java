package com.controller;

import java.io.IOException;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

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
	
	@Autowired
	private EmployeeServices employeeService;
	
	@RequestMapping(value="/")
	public ModelAndView listContact(ModelAndView model) throws IOException{
		Set<Employee> employees = employeeService.getAllEmployees();
		model.addObject("employees", employees);
		
		model.setViewName("home");
		
		return model;
	}
	
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Employee employee = new Employee();
		
		model.addObject("employee", employee);
		model.setViewName("new");
		return model;
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveContact(@ModelAttribute Employee employee) {
		employeeService.addEmp(employee);		
		return new ModelAndView("redirect:/");
	}
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView updateContact(@ModelAttribute int id, @ModelAttribute Employee employee) {
		ModelAndView model = new ModelAndView();
		
		model.setViewName("update");
		employeeService.updateEmployee(id,employee);		
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value = "/delete")
	public ModelAndView deleteContact(HttpServletRequest request) {
		int eid = Integer.parseInt(request.getParameter("eid"));
		
		employeeService.deleteEmployee(eid);;
		return new ModelAndView("redirect:/");
	}
	


}
