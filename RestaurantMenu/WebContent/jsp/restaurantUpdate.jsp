<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<jsp:include page="_head.jsp" />
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>${restaurant.name}</title>
</head>
<body>
	<jsp:include page="_header.jsp" />
	<div class="container">
		<h1>${restaurant.name}</h1>
		<div class="address">
			${restaurant.formatPhoneNumber()} <br />
			<c:choose>
				<c:when test="${restaurant.address != null}">
					${restaurant.address.street} <br />
					${restaurant.address.city}, ${restaurant.address.state.getAbbreviation()} ${restaurant.address.zip}
				</c:when>
				<c:when test="${restaurant.address.street == null}">
					<form action="addAddress.do" method="POST">
						<input type="hidden" name="restID" value="${restaurant.id}" /><br />
						<input type="text" name="street" placeholder="Street" /><br />
						<input type="text" name="city" placeholder="City" /><br />
						<select name="state">
							<c:forEach items="${states}" var="s">
								<option value="${s}">${s}</option>
							</c:forEach>
						</select><br />
						<input type="text" name="zip" placeholder="Zip" /><br />
						<input type="submit" name="Create Address" />
					</form>
				</c:when>
			</c:choose>	 
		</div>
	</div>
	<jsp:include page="_footer.jsp" />
</body>
</html>