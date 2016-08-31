<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="_head.jsp"></jsp:include>
<title>${restaurant.name}</title>
</head>
<body>
<jsp:include page="_header.jsp"></jsp:include>
	<div class="container">
		<h1>${restaurant.name}</h1>
		<div class="address">
			${restaurant.formatPhoneNumber()} <br />
			${restaurant.address.street} <br />
			${restaurant.address.city}, ${restaurant.address.state.getAbbreviation()} ${restaurant.address.zip}
			 
		</div>
		<table class="menu">
			<thead>
				<tr>
					<th colspan="2">${restaurant.menu.getName()}</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${restaurant.menu.menuItems}" var="i">
					<tr>
						<td class="price" rowspan="2">$${i.price}</td>
						<td class="itemName">${i.name}</td>
					</tr>
					<tr>
						<td class="description"><i>${i.description}</i></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>