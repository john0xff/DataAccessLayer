package com.phoenixjcam.data.payments.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.phoenixjcam.data.payments.model.PaymentsModel;
import com.phoenixjcam.data.utils.DataUtilities;

@Repository
public class PaymentsDAOImpl implements PaymentsDAO
{
	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}

	@Override
	public List<PaymentsModel> getPayments()
	{
		List<PaymentsModel> paymentList = DataUtilities.castList(PaymentsModel.class, getCurrentSession().createQuery("from PaymentsModel").list());

		return paymentList;
	}
}
