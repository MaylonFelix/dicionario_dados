<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Seleção de Cervejas</title>
</head>
<body>

	<form method="post" action="SelecaoCerveja">
		<p>Selecione as características da cerveja desejada</p>
		Cor: 
			<select name="cor">
				<option>Clara</option>
				<option>Translúcida</option>
				<option>Marrom</option>
				<option>Escura</option>
			</select> 
			<br/><br/> 
			<input type="submit" value="Consultar"></input>
	</form>
</body>
</html>
