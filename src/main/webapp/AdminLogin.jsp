<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="test.AdminBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	AdminBean ab = (AdminBean)session.getAttribute("abean");
	out.println("Welcome Admin:"+ab.getfName()+"<br>");
%>
	<a href="employee.html"> Add Employee</a>
		<a href="view"> View Employees</a>
		<a href="logout">LogOut</a>
</body>
</html>