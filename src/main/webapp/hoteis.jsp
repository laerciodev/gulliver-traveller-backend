<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<jsp:useBean id="Hoteis" type="java.util.ArrayList" scope="request" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Hoteis</title>
</head>
<body>
	<h1>Lista de hóteis</h1>
	<ul>
		<c:forEach var = "hotel" items="${Hoteis}">
	    	<li>
	    		Nome: <c:out value = "${hotel.nome}"/><br>
	    		Endereço: <c:out value = "${hotel.endereco}"/><br />
	    		Classificação: <c:out value = "${hotel.classificacao}"/><br />
	    		Diária:  <c:out value = "${hotel.valorDiaria}"/>
	    	</li>
	    	<hr>
		</c:forEach>	
	</ul>
</body>
</html>