<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Article added</title>
</head>
<body>
	<c:if test="${not empty article}">
		<h1><c:out value="${article.title}"/></h1>	
		<p>
			<c:out value="${article.content}"/>
		</p>	
	</c:if>
	<c:if test="${not empty article.tags}">
		<c:forEach var="tag" items="${article.tags}">
			<li><c:out value="${tag}"/></li>
		</c:forEach>
	</c:if>
</body>
</html>