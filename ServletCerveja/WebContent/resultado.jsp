<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resultado</title>
</head>
<body>
<h1>Sele��o de Cervejas</h1>
<%
	List marcas = (List) request.getAttribute("marcas");
	Iterator it = marcas.iterator();
	
	while(it.hasNext()) {
%>
	<br/>Experimente: 
<%= it.next() %>
<%
	}
%>


</body>
</html>