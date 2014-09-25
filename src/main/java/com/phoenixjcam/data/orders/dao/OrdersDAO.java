package com.phoenixjcam.data.orders.dao;

import java.util.List;

import com.phoenixjcam.data.orders.model.OrdersModel;

public interface OrdersDAO
{
	List<OrdersModel> getOrders();
}
