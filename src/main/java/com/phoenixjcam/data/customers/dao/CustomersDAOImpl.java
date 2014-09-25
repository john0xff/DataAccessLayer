package com.phoenixjcam.data.customers.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.phoenixjcam.data.customers.model.CustomersModel;
import com.phoenixjcam.data.utils.DataUtilities;

@Repository
public class CustomersDAOImpl implements CustomersDAO
{
	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}

	@Override
	public List<CustomersModel> getCustomers()
	{
		//@SuppressWarnings("unchecked")
		//List<CustomersModel> customersList = getCurrentSession().createQuery("from CustomersModel").list();

		// the same as above but without warnings cuz castList() method makes casting
		List<CustomersModel> customersList = DataUtilities.castList(CustomersModel.class, getCurrentSession().createQuery("from CustomersModel").list());
		
		return customersList;
	}



}
