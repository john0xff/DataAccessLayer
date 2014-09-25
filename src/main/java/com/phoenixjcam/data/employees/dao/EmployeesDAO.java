package com.phoenixjcam.data.employees.dao;

import java.util.List;

import com.phoenixjcam.data.employees.model.EmployeesModel;

public interface EmployeesDAO
{
	List<EmployeesModel> getEmployees();
}
