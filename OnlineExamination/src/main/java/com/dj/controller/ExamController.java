package com.dj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dj.domain.Employee;
import com.dj.service.EmployeeService;

@Controller
@RequestMapping("/dj")
public class ExamController {
	@Autowired
	EmployeeService employeeService;
	@RequestMapping(value="/form", method=RequestMethod.GET)
	public ModelAndView viewEmployeeForm(@ModelAttribute Employee employee) {
		return new ModelAndView("view");
	}
	
	@RequestMapping(value="/addemployee", method=RequestMethod.POST)
	public String addnewEmployee(@ModelAttribute @Validated Employee employee, BindingResult result, Model model) {
		if(!result.hasErrors()) {
			System.out.println("employee::"+employee);
			employeeService.addEmployees(employee);
		}
		return "view";
	}
	@RequestMapping(value= "/list" ,method=RequestMethod.GET)
	public ModelAndView getListAll() {
		List<Employee> employeeList = employeeService.getList();
		System.out.println("controller::"+employeeList);
		return new ModelAndView("displayList", "employeeList", employeeList);
	}
	
	@RequestMapping(value="/delete/{eid}", method=RequestMethod.GET)
	public ModelAndView getDelete(@PathVariable("eid") Integer eid ) {
		employeeService.delete(eid);
		List<Employee> employeeList = employeeService.getList();
		System.out.println("controller::"+employeeList);
		return new ModelAndView("displayList", "employeeList", employeeList);
	}
	@RequestMapping(value="/edit/{eid}",method=RequestMethod.GET)
	public ModelAndView edit(@PathVariable("eid") Integer eid) {
		System.out.println("chits::"+employee);
		return null;
		
	}
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	 public ModelAndView update(@PathVariable("id") int id){
	  ModelAndView model = new ModelAndView("customer/form");
	  Customer customer = customerService.findCustomerById(id);
	  model.addObject("customerForm", customer);
	  
	  return model;
	
}
