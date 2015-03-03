<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
	<span> 
	
	Cadastro realizado com sucesso !
	<br />
		
	ID .:<%= request.getAttribute("ID") %>
	<br />
		
	Nome .:<%= request.getAttribute("Nome") %>
	<br />
		
	CPF .:<%= request.getAttribute("CPF") %>
	<br />
		
	RG .:<%= request.getAttribute("RG") %>
	<br />
		
	Email .:<%= request.getAttribute("Email") %>
	<br />
		
	Sexo .:<%= request.getAttribute("Sexo") %>
	
	</span>
	
</body>
</html>