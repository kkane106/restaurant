<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>delicious.ly</title>
<jsp:include page="jsp/_head.jsp" />
</head>
<body>
	<jsp:include page="jsp/_header.jsp" />
	<div class="container">
		<div class="welcome">What looks delicious?</div>
		<jsp:include page="jsp/_cuisines.jsp"></jsp:include>
	</div>
	<jsp:include page="jsp/_footer.jsp" />
</body>
</html>