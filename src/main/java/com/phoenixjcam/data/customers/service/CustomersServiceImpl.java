package com.phoenixjcam.data.customers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.phoenixjcam.data.customers.dao.CustomersDAO;
import com.phoenixjcam.data.customers.model.CustomersModel;

@Service
@Transactional
public class CustomersServiceImpl implements CustomersService
{
	@Autowired
	CustomersDAO customerDAO;

	@Override
	public List<CustomersModel> getCustomers()
	{
		List<CustomersModel> customerList = customerDAO.getCustomers();
		
		return customerList;
	}

}
