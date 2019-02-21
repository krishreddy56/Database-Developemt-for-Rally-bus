
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
<form id=form1 action="AddTrip" method="post" onsubmit="return validate()">  
<div id="content">
			<h2>Add Trip</h2>
</div>
<table>
	<tr><td>EventId</td><td><input type="text" name="eventid" required></td></tr> <br> 
	<tr><td>EventCategory</td><td><input type="text" name="category" required></td></tr><br>
	<tr><td>Depart Date</td><td><input type="text" name="ddate" required></td></tr> <br> 
	<tr><td>Return Date</td><td><input type="text" name="rdate" required></td></tr><br>
	<tr><td>Charge</td><td><input type="text" name="charge" required></td></tr><br>
	
       
	</table>
<input type="submit" value="Add"/>  
</form> 
</body>
</html>