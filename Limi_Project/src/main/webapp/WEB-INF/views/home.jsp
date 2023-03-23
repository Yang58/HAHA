<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Home</title>
</head>
<body>

	<select name="gender">
		<option value="">선택</option>
		<c:forEach items="${list}" var="list">
			<c:if test="${list.code eq 'A1'}">
				<option value="">${list.name}</option>
			</c:if>
		</c:forEach>
	</select>
	
		<select name="gender">
		<option value="">선택</option>
		<c:forEach items="${list}" var="list">
			<c:if test="${list.code eq 'A2'}">
				<option value="">${list.name}</option>
			</c:if>
		</c:forEach>
	</select>
	
</body>
</html>
