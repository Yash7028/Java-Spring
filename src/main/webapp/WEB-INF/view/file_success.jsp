<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous" >
<link rel="stylesheet" href="<c:url value="/resources/css/styl.css"/>" >
   <script type="text/javascript" src="<c:url value="/resources/js/script.js"/>"></script>
</head>
<body>


<div class="text-center">
<h1>File Uploaded Successfully</h1>
<img alt="userImg" src="<c:url value="resources/img/${imgname}"></c:url>">
</div>

</body>
</html>