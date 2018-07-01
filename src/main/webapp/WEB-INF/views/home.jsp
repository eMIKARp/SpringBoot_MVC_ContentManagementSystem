<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring CMS</title>
</head>
<body>
	<h1><c:out value="${helloMessage}"/></h1>
	<form action="add" method=post>
		<input name="title" placeholder="title"/><br>
		<textarea name="content">Content here...</textarea><br>
		<input name="tags" placeholder="tags, tags, tags"/><br>
		<input type="submit" value="Add"/>	
	</form>
</body>
</html>