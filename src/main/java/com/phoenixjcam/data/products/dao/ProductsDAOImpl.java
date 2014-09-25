package com.phoenixjcam.data.products.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.phoenixjcam.data.products.model.ProductsModel;
import com.phoenixjcam.data.utils.DataUtilities;

@Repository
public class ProductsDAOImpl implements ProductsDAO
{
	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}

	@Override
	public List<ProductsModel> getProducts()
	{
		List<ProductsModel> productsList = DataUtilities.castList(ProductsModel.class, getCurrentSession().createQuery("from ProductsModel").list());

		return productsList;
	}

}
