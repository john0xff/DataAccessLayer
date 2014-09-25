package com.phoenixjcam.data.payments.service;

import java.util.List;

import com.phoenixjcam.data.payments.model.PaymentsModel;

public interface PaymentsService
{
	public List<PaymentsModel> getPayments();
}
