<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EmployeeManagement</title>
</head>
<body>
<%
		AdminBean ab=(AdminBean)session.getAttribute("abean");
		out.println("Page belongs to admin"+ab.getfName()+"<br>");
		out.println("Employee Added Successfuly....<br><br>");
%>
	<a href="add">Add Employee&nbsp;</a>
	<a href="view">View Employee&nbsp;</a>
	<a href="logout">Logout&nbsp;</a>
</body>
</html>