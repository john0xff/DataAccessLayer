package com.phoenixjcam.data.payments.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payments", schema = "db_jv_crm")
public class PaymentsModel implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "customerNumber", nullable = false)
	private int customerNumber;

	@Id
	@Column(name = "checkNumber", nullable = false, length = 50)
	private String checkNumber;

	@Column(name = "paymentDate", nullable = false)
	private Date paymentDate;

	@Column(name = "amount", nullable = false)
	private Double amount;

	public int getCustomerNumber()
	{
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber)
	{
		this.customerNumber = customerNumber;
	}

	public String getCheckNumber()
	{
		return checkNumber;
	}

	public void setCheckNumber(String checkNumber)
	{
		this.checkNumber = checkNumber;
	}

	public Date getPaymentDate()
	{
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate)
	{
		this.paymentDate = paymentDate;
	}

	public Double getAmount()
	{
		return amount;
	}

	public void setAmount(Double amount)
	{
		this.amount = amount;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

}
