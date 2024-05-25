<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Employee</title>
</head>
<body>
		<%
		AdminBean ab = (AdminBean)session.getAttribute("abean");
			out.println("Page belongs to admin:-"+ab.getfName()+"<br>");
		EmployeeBean eb = (EmployeeBean)request.getAttribute("emp");
		%>
			<form action = "update" method ="post">
			<input type="hidden" name="eid" value=<%=eb.geteId() %>>
			Basic Salary:<input type="text" name="bSal "value=<%=eb.getbSal() %>><br>
			HRA(0.93-0.91)<input type="text" name="hr" value=<%=eb.getHra() %>><br>
			DA(0.63-0.61)<input type="text" name="d" value=<%=eb.getDa() %>><br>
			<input type="submit" value="UpdateEmloyee">
			</form>
</body>
</html>