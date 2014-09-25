package com.phoenixjcam.data.orderdetails.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.phoenixjcam.data.orderdetails.model.OrderDetailsModel;
import com.phoenixjcam.data.utils.DataUtilities;

@Repository
public class OrderDetailsDAOImpl implements OrderDetailsDAO
{
	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}

	@Override
	public List<OrderDetailsModel> getOrderDetails()
	{	
		List<OrderDetailsModel> orderDetailsList = DataUtilities.castList(OrderDetailsModel.class, getCurrentSession().createQuery("from OrderDetailsModel").list());

		return orderDetailsList;
	}
}
