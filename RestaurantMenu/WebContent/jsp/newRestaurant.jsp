<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>New Restaurant</title>
	<jsp:include page="_head.jsp" />
</head>
<body>
	<jsp:include page="_header.jsp" />
	<div class="container">
		<h1>New Restaurant</h1>
		
		<form action="createRestaurant.do" method="POST">
			<h2>Create a new restaurant</h2>
			<input type="text" placeholder="Name" name="name" /><br />
			<input type="text" placeholder="Phone" name="phone" /><br />
			<select name="cuisine">
			<c:forEach items="${cuisines}" var="c">
				<option value="${c}">${c}</option>
			</c:forEach>
			</select><br />
			<input type="submit" value="Create">
		</form>
	</div>
	<jsp:include page="_footer.jsp" />
</body>
</html>
