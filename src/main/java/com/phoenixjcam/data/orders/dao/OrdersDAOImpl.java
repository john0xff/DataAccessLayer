package com.phoenixjcam.data.orders.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.phoenixjcam.data.orders.model.OrdersModel;
import com.phoenixjcam.data.utils.DataUtilities;

@Repository
public class OrdersDAOImpl implements OrdersDAO
{
	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}

	@Override
	public List<OrdersModel> getOrders()
	{
		List<OrdersModel> ordersList = DataUtilities.castList(OrdersModel.class, getCurrentSession().createQuery("from OrdersModel").list());

		return ordersList;
	}

}
