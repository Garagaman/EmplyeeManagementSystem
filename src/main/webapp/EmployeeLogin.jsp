<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="test.LoginEmployeeBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome User</title>
</head>
<body>
<%
		LoginEmployeeBean leb=(LoginEmployeeBean)session.getAttribute("lebean");
		out.println("Welcome  ("+leb.geteId()+")"+leb.getfName()+"<br>");
%>
<a href="">BookStore</a>
<a href="elogout">Logout</a>
</body>
</html>