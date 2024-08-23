<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <%@ page import="java.util.List"%> --%>
<%@page isELIgnored="false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>

<%-- 	<%
	String className = (String) request.getAttribute("class");
	Integer rollNumber = (Integer) request.getAttribute("regNumber");
	List<String> nameList = (List<String>) request.getAttribute("nameList");
	%>
	<h1>Login Page</h1>
	<h3>
		Class Name:
		<%=className%>
	</h3>
	<h3>
		Roll Number:
		<%=rollNumber%>
	</h3>

	<ul>
		<%
		for (String n : nameList) {
		%>
		<li><%=n%></li>
		<%
		}
		%>
	</ul> --%>
	
	<h4>class :${className} </h4>
	<h4>reg num : ${regNumber} </h4>
	<h4>name : ${nameList[0]}</h4>
	

</body>
</html>


