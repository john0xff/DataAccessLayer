package com.phoenixjcam.data.customers.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers", catalog = "db_jv_crm")
public class CustomersModel
{
	@Id
	@Column(name = "customerNumber", nullable = false)
	private int customerNumber;

	@Column(name = "customerName", nullable = false, length = 50)
	private String customerName;

	@Column(name = "contactLastName", nullable = false, length = 50)
	private String contactLastName;

	@Column(name = "contactFirstName", nullable = false, length = 50)
	private String contactFirstName;

	@Column(name = "phone", nullable = false, length = 50)
	private String phone;

	@Column(name = "addressLine1", nullable = false, length = 50)
	private String addressLine1;

	@Column(name = "addressLine2", nullable = true, length = 50)
	private String addressLine2;

	@Column(name = "city", nullable = false, length = 50)
	private String city;

	@Column(name = "state", nullable = true, length = 50)
	private String state;

	@Column(name = "postalCode", nullable = true, length = 15)
	private String postalCode;

	@Column(name = "country", nullable = true, length = 15)
	private String country;

	@Column(name = "salesRepEmployeeNumber", nullable = true)
	private Integer salesRepEmployeeNumber;

	@Column(name = "creditLimit", nullable = true)
	private Double creditLimit;

	public int getCustomerNumber()
	{
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber)
	{
		this.customerNumber = customerNumber;
	}

	public String getCustomerName()
	{
		return customerName;
	}

	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}

	public String getContactLastName()
	{
		return contactLastName;
	}

	public void setContactLastName(String contactLastName)
	{
		this.contactLastName = contactLastName;
	}

	public String getContactFirstName()
	{
		return contactFirstName;
	}

	public void setContactFirstName(String contactFirstName)
	{
		this.contactFirstName = contactFirstName;
	}

	public String getPhone()
	{
		return phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public String getAddressLine1()
	{
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1)
	{
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2()
	{
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2)
	{
		this.addressLine2 = addressLine2;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public String getPostalCode()
	{
		return postalCode;
	}

	public void setPostalCode(String postalCode)
	{
		this.postalCode = postalCode;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	public int getSalesRepEmployeeNumber()
	{
		return salesRepEmployeeNumber;
	}

	public void setSalesRepEmployeeNumber(int salesRepEmployeeNumber)
	{
		this.salesRepEmployeeNumber = salesRepEmployeeNumber;
	}

	public double getCreditLimit()
	{
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit)
	{
		this.creditLimit = creditLimit;
	}

}
