<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>File Consumer Complaint Online</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
}

.center {
	text-align: center;
	border: 1px solid black;
}
</style>
</head>
<body bgcolor="lavender">
	<div class="center">
		<center>
			<h2>
				<u>File complaint</u>
			</h2>
		
						<form:form action="complaintForm.html" modelAttribute="complaintBean">
				<table>
					<tr>
						<th align="left">Customer Name</th>
						<td><form:input path="customerName" size="28" /></td>
						<td><form:errors path="customerName" cssClass="error"></form:errors></td>
					</tr>
					<tr>
						<th align="left">Complaint Type</th>
						<td><form:select path="complaintTypeId">
								<form:option value="">----Select------</form:option>
								<form:options items="${complaintTypes}" />
							</form:select></td>
						<td><form:errors path="complaintTypeId" cssClass="error" /></td>
					</tr>
					<tr>
						<th align="left">Description</th>
						<td><form:input path="description" size="28" /></td>
						<td><form:errors path="description" cssClass="error" /></td>
					</tr>
					<tr>
						<th align="left">Date of Incidence <br /> [dd-MMM-yyyy]
						</th>
						<td><form:input path="dateOfIncidence" size="28" /></td>
						<td><form:errors path="dateOfIncidence" cssClass="error" /></td>
					</tr>
					<tr>
						<th align="left">Total loss of amount <br /> from this
							incident
						</th>
						<td><form:input path="amount" size="28"/></td>
						<td><form:errors path="amount" cssClass="error" /></td>
					</tr>
				</table>
				<br />
				<br />
				<input type="submit" value="Submit Complaint" />

			</form:form>
			<br /> <a href="index.jsp">HOME</a> <br /> <br />
		</center>
	</div>
</body>
</html>