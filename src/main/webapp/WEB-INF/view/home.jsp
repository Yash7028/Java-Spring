<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">
   <script type="text/javascript" src="<c:url value="/resources/js/script.js"/>"></script>
</head>
<body>
	<div class="text-center ">
		<h1>Home Page</h1>
		<a href="register" class="btn btn-sm btn-primary">Register</a> <a
			href="google" class="btn btn-sm btn-danger">Google</a> <a
			href="yahoo" class="btn btn-sm btn-warning">Yahoo</a>
			<a href="load_file_upload" class="btn btn-sm btn-primary">File upload</a>
		<div class="container mt-3">
			<div class="row">
				<div class="col-md-8 offset-md-2">
					<div class="card">
						<div class="card-body">
						<h4>My Search Engine</h4>
							<form action="search" method="post">
								<div class="mb-3">
									<input type="text" name="keyword" class="form-control">
									<button class="btn btn-sm btn-primary mt-3" onclick="donebtn()">Google</button>
									
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
		integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
		integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
		crossorigin="anonymous"></script>
</body>
</html>