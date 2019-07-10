<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Detail</title>
<script type="text/javascript" src="js/util.js"></script>
</head>
<body>
	<input type="text" id="userId" name="userId" />
	<input type="submit" onclick="getUserDetail()" value="search" />
	<br></br> Name
	<input type="text" id="userName" name="userName" /> Email
	<input type="text" id="email" name="email" /> Contact
	<input type="text" id="contact" name="contact" />
	<br></br>
	<br></br>
	Enter deleted id : <input type="text" id="did"><button onclick="deleteById()" >Delete Id</button>
	
	
</body>
</html>