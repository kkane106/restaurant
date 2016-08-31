<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<jsp:include page="_head.jsp" />	
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<jsp:include page="_header.jsp" />
	<div class="container">
		<form action="updateRestaurant.do" method="POST" >
			<input type="hidden" name="id" value="${restaurant.id}" />
			<h2><input type="text" name="name" value="${restaurant.name}" /></h2>
			<div class="address">
				<input type="text" name="phone" value="${restaurant.formatPhoneNumber()}" /> <br />
				<input type="text" name="street" value="${restaurant.address.street}"/> <br />
				<input type="text" name="city" value="${restaurant.address.city}"/>
				<select name="state">
					<c:forEach items="${states}" var="s">
						<c:choose>
							<c:when test="${!restaurant.address.state.getAbbreviation().equals(s)}">
								<option value="${s}">${s}</option>
							</c:when>
							<c:when test="${restaurant.address.state.getAbbreviation().equals(s)}">
								<option value="${s}" selected>${s}</option>
							</c:when>
						</c:choose>
					</c:forEach>
				</select>
				<input type="text" name="zip" value="${restaurant.address.zip}" /><br />
				<input type="submit" value="Update" />
			</div>
		</form>
	</div>
	<jsp:include page="_footer.jsp" />

</body>
</html>