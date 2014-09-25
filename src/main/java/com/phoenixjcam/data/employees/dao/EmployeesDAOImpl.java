package com.phoenixjcam.data.employees.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.phoenixjcam.data.employees.model.EmployeesModel;
import com.phoenixjcam.data.utils.DataUtilities;

@Repository
public class EmployeesDAOImpl implements EmployeesDAO
{
	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}

	@Override
	public List<EmployeesModel> getEmployees()
	{
		List<EmployeesModel> employeesList = DataUtilities.castList(EmployeesModel.class, getCurrentSession().createQuery("from EmployeesModel").list());

		return employeesList;
	}

}
