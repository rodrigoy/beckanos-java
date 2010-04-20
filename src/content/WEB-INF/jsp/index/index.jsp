<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>http://wbotelhos.wordpress.com</title>
	</head>
	<body>
		<form action="<c:url value='/usuario/consultar'/>">
			Consultar: <input type="text" name="nome"/><br/>
			<input id="buscar" type="submit"/>
		</form>
	</body>
</html>