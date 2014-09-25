package com.phoenixjcam.data.payments.dao;

import java.util.List;

import com.phoenixjcam.data.payments.model.PaymentsModel;

public interface PaymentsDAO
{
	public List<PaymentsModel> getPayments();
}
