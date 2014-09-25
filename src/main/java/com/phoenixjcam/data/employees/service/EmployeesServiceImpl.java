package com.phoenixjcam.data.employees.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.phoenixjcam.data.employees.dao.EmployeesDAO;
import com.phoenixjcam.data.employees.model.EmployeesModel;

@Service
@Transactional
public class EmployeesServiceImpl implements EmployeesService
{
	@Autowired
	EmployeesDAO employeesDAO;

	@Override
	public List<EmployeesModel> getEmployees()
	{
		List<EmployeesModel> employeesList = employeesDAO.getEmployees();

		return employeesList;
	}

}
