package com.phoenixjcam.data.orders.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.phoenixjcam.data.orders.dao.OrdersDAO;
import com.phoenixjcam.data.orders.model.OrdersModel;

@Service
@Transactional
public class OrdersServiceImpl implements OrdersService
{
	@Autowired
	private OrdersDAO ordersDAO;

	@Override
	public List<OrdersModel> getOrders()
	{
		List<OrdersModel> ordersList = ordersDAO.getOrders();

		return ordersList;
	}

}
