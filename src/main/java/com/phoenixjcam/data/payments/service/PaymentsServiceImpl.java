package com.phoenixjcam.data.payments.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.phoenixjcam.data.payments.dao.PaymentsDAO;
import com.phoenixjcam.data.payments.model.PaymentsModel;

@Service
@Transactional
public class PaymentsServiceImpl implements PaymentsService
{
	@Autowired
	private PaymentsDAO paymentDAO;

	@Override
	public List<PaymentsModel> getPayments()
	{
		List<PaymentsModel> paymentList = paymentDAO.getPayments();

		return paymentList;
	}

}
