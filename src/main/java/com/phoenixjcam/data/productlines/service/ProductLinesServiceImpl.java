package com.phoenixjcam.data.productlines.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.phoenixjcam.data.productlines.dao.ProductLinesDAO;
import com.phoenixjcam.data.productlines.model.ProductLinesModel;

@Service
@Transactional
public class ProductLinesServiceImpl implements ProductLinesService
{
	@Autowired
	private ProductLinesDAO productLinesDAO;

	@Override
	public List<ProductLinesModel> getProductLines()
	{
		List<ProductLinesModel> productLinesList = productLinesDAO.getProductLines();

		return productLinesList;
	}

}
