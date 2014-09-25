package com.phoenixjcam.data.orders.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders", schema = "db_jv_crm")
public class OrdersModel
{
	@Id
	@Column(name = "orderNumber", nullable = false)
	private int orderNumber;

	@Column(name = "orderDate", nullable = false)
	private Date orderDate;

	@Column(name = "requiredDate", nullable = false)
	private Date requiredDate;

	@Column(name = "shippedDate", nullable = false)
	private Date shippedDate;

	@Column(name = "status", nullable = false, length = 15)
	private String status;

	@Column(name = "comments", nullable = false)
	private String comments;

	@Column(name = "customerNumber", nullable = false)
	private int customerNumber;

	public int getOrderNumber()
	{
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber)
	{
		this.orderNumber = orderNumber;
	}

	public Date getOrderDate()
	{
		return orderDate;
	}

	public void setOrderDate(Date orderDate)
	{
		this.orderDate = orderDate;
	}

	public Date getRequiredDate()
	{
		return requiredDate;
	}

	public void setRequiredDate(Date requiredDate)
	{
		this.requiredDate = requiredDate;
	}

	public Date getShippedDate()
	{
		return shippedDate;
	}

	public void setShippedDate(Date shippedDate)
	{
		this.shippedDate = shippedDate;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getComments()
	{
		return comments;
	}

	public void setComments(String comments)
	{
		this.comments = comments;
	}

	public int getCustomerNumber()
	{
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber)
	{
		this.customerNumber = customerNumber;
	}

}
