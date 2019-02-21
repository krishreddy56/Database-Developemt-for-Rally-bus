<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin</title>
<link rel="stylesheet" href="<c:url value='/styles/main.css'/> ">

</head>
<body style="background-image:url(images/admin1.jpg)">


<form id=form1 action="AdminLogin" method="post">  
<div id="content">
			<h2 align="center">Admin Login</h2>
</div>

<table align="center">
	
	<tr><td >Username:</td><td><input type="text" name="email" required></td></tr> <br> 
	<tr><td >Password:</td><td><input type="password" name="password" required></td></tr><br>
</table>
<input  type="submit" value="login" style="margin-left: 50%" />
</form> 
</body>
</html>