<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Elibrary</title>
<link rel="stylesheet" href="<c:url value='/styles/main.css'/> ">
<script type="text/javascript" src="javascript/validation.js"></script>
<%@ include file="header.jsp" %> 
</head>
<body id=admin style="background-image:url(images/rallybus.jpg)">
<form id=form1 action="AddBus" method="post" onsubmit="return validate()">  
<div id="content">
			<h2>Add Bus</h2>
</div>
<table>
	<tr><td>BusId</td><td><input type="text" name="busid" required></td></tr> <br> 
	<tr><td>Capacity</td><td><input type="text" name="capacity" required></td></tr><br>
	<tr><td>Model</td><td><input type="text" name="model" required></td></tr> <br> 
	<tr><td>Make</td><td><input type="text" name="make" required></td></tr><br>
	
	
       
	</table>
<input type="submit" value="Add"/>  
</form> 
</body>
</html>