package com.phoenixjcam.data.offices.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.phoenixjcam.data.offices.model.OfficesModel;
import com.phoenixjcam.data.utils.DataUtilities;

@Repository
public class OfficesDAOImpl implements OfficesDAO
{
	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}

	@Override
	public List<OfficesModel> getOffices()
	{
		// TODO Auto-generated method stub  getCurrentSession().createQuery("from CustomersModel").list()
		List<OfficesModel> officesList = DataUtilities.castList(OfficesModel.class, 	getCurrentSession().createQuery("from OfficesModel").list());
		
		return officesList;
	}

}
