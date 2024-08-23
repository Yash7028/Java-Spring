<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <%@ page import="java.util.List"%> --%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<%-- 	<%
	String name = (String) request.getAttribute("name");
	Integer roll = (Integer) request.getAttribute("roll");
	List<String> nameList = (List<String>) request.getAttribute("nameList");
	%>
	<h1>Home Page</h1>
	<h3>
		Name:
		<%=name%></h3>
		<h3>Roll Number :<%= roll %></h3>
	<h3>Names List:</h3>
	<ul>
		<%
		for (String n : nameList) {
		%>
		<li><%=n%></li>
		<%
		}
		%>
	</ul> --%>
	<h1>Home Page</h1>
	<h3>Name:${name}</h3>
	<h3>Roll Number : ${roll}</h3>
	<h3>Names List: ${nameList}</h3>
	
	<c:forEach items="${nameList }" var="n">
	<h3><c:out value="${n}"></c:out></h3>
	<h2>${n }</h2>
	</c:forEach>
	<a href="login">Login</a>
</body>
</html>
