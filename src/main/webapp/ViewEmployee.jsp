<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import =" java.util.*,test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Employees</title>
<style>
		table,th,td{
					border:solid black 1px;
		}
</style>
</head>
<body>
<%
		AdminBean ab = (AdminBean)session.getAttribute("abean");
		ArrayList<EmployeeBean>al=(ArrayList<EmployeeBean>)session.getAttribute("alist");
		out.println("Page Belong to Admin:-"+ab.getfName()+"<br>");
			Iterator<EmployeeBean> it = al.iterator();
%>
	<table style="width:60px">
		<tr>
				<th>EmpId</th>
				<th>EmpName</th>
				<th>EmpDesg</th>
				<th>BasicSal</th>
				<th>HRA</th>
				<th>DA</th>
				<th>TotalSal</th>
		</tr>
		<%
				while(it.hasNext()){
					EmployeeBean eb = (EmployeeBean)it.next();
				%>
				<tr>
						<td><%=eb.geteId() %></td>
						<td><%=eb.geteName() %></td>
						<td><%=eb.geteDesg() %></td>
						<td><%=eb.getbSal() %></td>
						<td><%=eb.getHra() %></td>
						<td><%=eb.getDa() %></td>
						<td><%=eb.getTotsal() %>
						<td><a href="edit">Edit</a></td>
						<td><a href="delete">Delete</a></td>
				</tr>
			<% 
				}
		%>
	</table>
			<br>
			<a href="employee.html">Add Employee</a>
			<a href="logout">Logout</a>
</body>
</html>