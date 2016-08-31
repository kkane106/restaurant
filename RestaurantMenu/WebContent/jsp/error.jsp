<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="_head.jsp"></jsp:include>
<title>Error</title>
</head>
<body>
	<jsp:include page="_header.jsp"></jsp:include>
	<div class="container">
		<div class="error">
		<c:choose>
			<c:when test="${error == 404}">
				Restaurant not found
				<div><img src="imgs/error_404.jpg"></div>
				<a href="listRestaurants.do">Try again?</a>
			</c:when>
			<c:when test="${error == 500}">
				Something has gone awry!
				<div><img src="imgs/error_500.jpeg"></div>
				<a href="listRestaurants.do">Try again?</a>
			</c:when>
		</c:choose>
		</div>
	</div>
</body>
</html>