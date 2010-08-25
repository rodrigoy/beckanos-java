<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Beckanos - A Rede Social da PRW Energia!</title>
		<link href="<c:url value='/css/styles.css'/>" media="screen" rel="stylesheet" type="text/css"/>
	</head>
	<body>
		<div id="login_div">
		<c:if test="${erro != null}"><div id="erro_div">${erro}</div></c:if>
		<c:if test="${mensagem != null}"><div id="mensagem_div">${mensagem}</div></c:if>
		<span class="titulo">Beckanos</span><br/><span class="descricao">a rede social da PRW Energia</span><br/>
		
		<form action="<c:url value='/autenticar'/>" method="post">
			<table class="login_table">
			<tr><td>Usu&aacute;rio:</td><td><input type="text" name="login"/></td></tr>
			<tr><td>Senha:</td><td><input type="password" name="senha"/></td></tr>
			<tr><td colspan="2" style="text-align: right"><input id="login" type="submit" value="Login"/></td></tr>
			</table>
		</form>
		
		<hr/>
		</div>
	</body>
</html>