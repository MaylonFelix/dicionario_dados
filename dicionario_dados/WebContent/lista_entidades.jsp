
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:useBean id="dao" class="br.com.pix.persistence.EntidadeDAO" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Lista Entidades</title>
</head>
<body>

	<table>
		<!-- percorre contatos montando as linhas da tabela -->
		<c:forEach var="entidade" items="${dao.lista}">
			<tr>
				<td>${entidade.nome}</td>
				<c:choose>
					<c:when test="${not empty entidade.descricao}">
						<td>${entidade.descricao}</td>
					</c:when>
					<c:otherwise>
						<td><font color="red"> Nenhuma descrição informada</font></td>
  					</c:otherwise>
				</c:choose>
			</tr>
		</c:forEach>


		<br />
		<br />

		<table border="1">
			<c:forEach var="entidader" items="${dao.lista}" varStatus="id">
				<tr bgcolor="#${id.count % 2 == 0 ? 'aaee88' : 'ffffff' }">
					<td>${id.count}</td>
					<td>${entidader.nome}</td>
					<td>${entidader.descricao}</td>
				</tr>
			</c:forEach>
		</table>
	</table>



</body>
</html>