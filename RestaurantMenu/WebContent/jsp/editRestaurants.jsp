<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<jsp:include page="_head.jsp"></jsp:include>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit Restaurants</title>
</head>
<body>
	<jsp:include page="_header.jsp"></jsp:include>
	<div class="container">
		<h1>Restaurants</h1>
		<table class="edit">
			<c:forEach items="${restaurants}" var="rest">
				<tr>
					<td class="name"><a href="editRestaurant.do?id=${rest.id}">${rest.name}</a></td>
					<td>${rest.formatCuisine()}</td>
					<td>${rest.formatPhoneNumber()}</td>
					<td>${rest.address.street}</td>
					<td>
						<form action="deleteRestaurant.do" method="POST">
							<input type="hidden" name="id" value="${rest.id}" />
							<input type="submit" value="Delete" />
						</form>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<jsp:include page="_footer.jsp"></jsp:include>
</body>
</html>