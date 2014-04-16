<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>form_numeros</title>
</head>
<body>
<h1>Selecione um tipo de número</h1>
<form action="SelecaoNumero" method="post">
	<input type="radio" name="tipo" value="par"/>Par<br />
	<input type="radio" name="tipo" value="impar"/>Impar<br />
	
	<input type="submit" value="Selecionar"/>
</form>
</body>
</html>