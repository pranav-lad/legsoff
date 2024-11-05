<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complaint Report</title>
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
		<h1><u>Complaint Report Details</u></h1>
		<form:form method="post" modelAttribute="dateRangeBean"
			action="complaintReportForm.html">
			<table class="classCenter" >
				<tr>
					<td>From Date <b style="color: blue;">[dd-MMM-yyyy]</b></td>
					<td><form:input path="fromDate" /></td>
				</tr>
				<tr>
					<td>To Date<b style="color: blue;">[dd-MMM-yyyy]</b></td>
					<td><form:input path="toDate" /></td>
				</tr>
				<tr>
					<td><br />
					<input type="submit" value="Fetch"></td>
				</tr>

			</table>
		</form:form>
		 <a href="index.jsp">HOME</a> <br /> <br />
	</div>
</body>
</html>