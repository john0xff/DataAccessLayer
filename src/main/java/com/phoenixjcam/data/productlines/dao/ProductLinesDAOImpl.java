package com.phoenixjcam.data.productlines.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.phoenixjcam.data.orders.model.OrdersModel;
import com.phoenixjcam.data.productlines.model.ProductLinesModel;
import com.phoenixjcam.data.utils.DataUtilities;

@Repository
public class ProductLinesDAOImpl implements ProductLinesDAO
{
	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}

	@Override
	public List<ProductLinesModel> getProductLines()
	{
		List<ProductLinesModel> productLines = DataUtilities.castList(ProductLinesModel.class, getCurrentSession().createQuery("from ProductLinesModel").list());
		
		return productLines;
	}

}
