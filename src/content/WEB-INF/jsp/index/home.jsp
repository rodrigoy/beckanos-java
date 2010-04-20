<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Beckanos - Home</title>
		<link href="<c:url value='/css/styles.css'/>" media="screen" rel="stylesheet" type="text/css"/>
	</head>
	<body>
		<div id="content_div">
			<c:if test="${erro != null}"><div id="erro_div">${erro}</div></c:if>
			<c:if test="${mensagem != null}"><div id="mensagem_div">${mensagem}</div></c:if>
			
			<div id="actions_div">
				<a href="<c:url value='/home'/>">Home</a>
				<a href="<c:url value='/busca'/>">Busca</a>
				<a href="<c:url value='/logout'/>">Logout</a>
			</div>
			
			<div id="right_div">
			<img src="<c:url value='/images/2.png'/>"/>
			<span class="profile_login">@kentbeck</span><br/>
			Kent Beck<br/>
			<span class="profile_dados">Casado, 52 anos</span>
			</div>
			
			<div id="left_div">
			<span class="titulo">Beckanos</span><br/><span class="descricao">a rede social da PRW Energia</span><br/>
			
			<h2>O que está rolando na PRW Energia?</h2>
			
			Atualize seu status...<br/>
			<table>
			<tr>
				<td><img src="<c:url value='/images/2.png'/>"/></td>
				<td>
					<form>
					<textarea rows="2" cols="60"></textarea><br/>
					<input type="submit" value="Atualizar"/>
					</form>
				</td>
			</tr>
			</table>
			<hr/>
			<br/>
			<% for (int i=2; i<8; i++) { %>
			<table>
			<tr>
				<td><img src="<c:url value='/images/'/><%=i%>.png"/></td>
				<td>
				<span class="usuario_diz">@JonKern diz:</span>
				<div id="atualizacao_status">Blá blá blá blá blá blá....</div>
				<span class="tempo_atras">a 20 minutos atrás</span>
				</td>
			</tr>
			</table>
			<hr/>
			<% } %>
			</div>
		</div>
	</body>
</html>