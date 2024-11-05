<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<style>
.center {
	text-align: center;
	border: 1px solid black;
}

table.classCenter {
	margin-left: auto;
	margin-right: auto;
}
</style>
</head>
<body bgcolor="lavender">
	<div class="center">
		<h1>Show Complaint Details</h1>
		<c:if test="${not empty complaintBeans}">
			<table border="1" class="classCenter">
				<tr>
					<th>Complaint Id</th>
					<th>Customer Name</th>
					<th>Complaint Type</th>
					<th>Description</th>
					<th>Date of Incidence</th>
					<th>Loss of Amount</th>
				</tr>
				
		       	<c:forEach var="complaint" items="${complaintBeans}">
					<tr>
						<td align="right"><c:out value="${complaint.complaintId}" /></td>
						<td><c:out value="${complaint.customerName}" /></td>
						<td><c:out value="${complaint.complaintTypeId}" /></td>
						<td><c:out value="${complaint.description}" /></td>
						<td align="center"><fmt:formatDate
								value="${complaint.dateOfIncidence}" pattern="dd-MMM-yyyy" /></td>
						<td align="right"><c:out value="${complaint.amount}" /></td>
					</tr>
				</c:forEach>
				
			</table>
		</c:if>
		<c:if test="${empty complaintBeans}">
			<center>
				<table>
					<tr>
						<td><b style="color: blue;">No records Found...</b></td>
					</tr>
				</table>
			</center>
		</c:if>

		<br/> <a href="index.jsp">HOME</a> <br /> <br />

	</div>
</body>
</html>