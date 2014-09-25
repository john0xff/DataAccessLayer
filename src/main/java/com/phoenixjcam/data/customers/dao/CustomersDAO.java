package com.phoenixjcam.data.customers.dao;

import java.util.List;

import com.phoenixjcam.data.customers.model.CustomersModel;

public interface CustomersDAO
{
	public List<CustomersModel> getCustomers();
}
