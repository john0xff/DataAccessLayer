package com.phoenixjcam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.phoenixjcam.data.customers.model.CustomersModel;
import com.phoenixjcam.data.customers.service.CustomersService;
import com.phoenixjcam.data.employees.model.EmployeesModel;
import com.phoenixjcam.data.employees.service.EmployeesService;
import com.phoenixjcam.data.offices.model.OfficesModel;
import com.phoenixjcam.data.offices.service.OfficesService;

@Controller
public class MainController
{
	// customers table
	@Autowired
	CustomersService customerService;
	
	// employees table
	@Autowired
	EmployeesService employeesService;
	
	@Autowired
	OfficesService officesService;

	@RequestMapping(value =
	{ "/", "/home" }, method = RequestMethod.GET)
	public ModelAndView home()
	{
		ModelAndView modelAndView = new ModelAndView("home");

		return modelAndView;
	}

	/**
	 * customers table test
	 * 
	 * test of customers data layer (methods, data ~ ) if in table is to many records (raws) it can crash.. then try
	 * debug by index
	 */
	@RequestMapping(value = "customers", method = RequestMethod.GET)
	public ModelAndView getCustomers()
	{
		// CustomersModel customerByIndex = customerService.getCustomers().get(5);

		List<CustomersModel> customerList = customerService.getCustomers();

		// customerList.get(2);

		ModelAndView modelAndView = new ModelAndView("dataList");
		modelAndView.addObject("customersList", customerList);

		return modelAndView;
	}

	// employees
	@RequestMapping(value = "employees", method = RequestMethod.GET)
	public ModelAndView getEmployees()
	{
		// TODO from index to index -> select form db some data but don't get it all like now.
		// It's not efficient and nobody will need million rows 
		List<EmployeesModel> employeesList = employeesService.getEmployees();

		ModelAndView modelAndView = new ModelAndView("dataList");
		modelAndView.addObject("employeesList", employeesList);

		return modelAndView;
	}

	// offices
	@RequestMapping(value = "offices", method = RequestMethod.GET)
	public ModelAndView getOffices()
	{
		List<OfficesModel> officesList = officesService.getOffices();

		ModelAndView modelAndView = new ModelAndView("dataList");
		modelAndView.addObject("officesList", officesList);

		return modelAndView;
	}

	// orderdetails

	// orders

	// payments

	// productlines

	// products

	// users

	// user_roles
}
