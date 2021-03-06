<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- 1 customers list -->
	<c:if test="${not empty customersList}">
		<h3>Customers list:</h3>
		<h4>ID    |   Name</h4>
		<c:forEach items="${customersList}" var="item">
			${item.customerNumber}
    		${item.customerName}<br>
		</c:forEach>
	</c:if>
	
	<!-- 2 employees list -->
	<c:if test="${not empty employeesList}">
		<h3>Employees list:</h3>
		<h4>ID    |   Name</h4>
		<c:forEach items="${employeesList}" var="item">
			${item.employeeNumber}
    		${item.lastName}<br>
		</c:forEach>
	</c:if>
	
	<!-- 3 offices list -->
	<c:if test="${not empty officesList}">
		<h3>Offices list:</h3>
		<h4>Code    |   City</h4>
		<c:forEach items="${officesList}" var="item">
			${item.officeCode}
    		${item.city}<br>
		</c:forEach>
	</c:if>
	
	<!-- 4 orderdetails  list -->
	<c:if test="${not empty orderDetailsList}">
		<h3>Order Details list:</h3>
		<h4>Code    |   City</h4>
		<c:forEach items="${orderDetailsList}" var="item">
			${item.orderNumber} ->
    		${item.productCode}<br>
		</c:forEach>
	</c:if>
	
	<!-- 5 orders  list -->
	<c:if test="${not empty ordersList}">
		<h3>Orders list:</h3>
		<h4>Code    |   City</h4>
		<c:forEach items="${ordersList}" var="item">
			${item.orderNumber} ->
    		${item.orderDate}<br>
		</c:forEach>
	</c:if>
	
	<!-- 6 payments list -->
	<c:if test="${not empty paymentsList}">
		<h3>Payments list:</h3>
		<h4>Date    |   Amount</h4>
		<c:forEach items="${paymentsList}" var="item">
			${item.paymentDate} ->
    		${item.amount}<br>
		</c:forEach>
	</c:if>
	
	<!-- 7 productlines list -->
	<c:if test="${not empty productLinesList}">
		<h3>Product Lines list:</h3>
		<h4>productLine    |   	textDescription</h4>
		<c:forEach items="${productLinesList}" var="item">
			${item.productLine} ->
    		${item.textDescription}<br><br>
		</c:forEach>
	</c:if>
	
	<!-- 8 products list -->
	<c:if test="${not empty productsList}">
		<h3>Products list:</h3>
		<h4>productCode    |   		productName</h4>
		<c:forEach items="${productsList}" var="item">
			${item.productCode} ->
    		${item.productName}<br><br>
		</c:forEach>
	</c:if>
	
</body>
</html>