<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="_head.jsp" />
<title>Restaurants</title>
</head>
<body>
	<jsp:include page="_header.jsp" />
	<div class="container">
		<h1>Restaurants</h1>
		<table class="list">
			<c:forEach items="${restaurants}" var="rest">
				<tr>
					<td class="name"><a href="getRestaurant.do?id=${rest.id}">${rest.name}</a></td>
					<td>${rest.formatCuisine()}</td>
					<td>${rest.formatPhoneNumber()}</td>
					<td>${rest.address.street}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div class="clear"></div>
	<jsp:include page="_footer.jsp" />
</body>
</html>