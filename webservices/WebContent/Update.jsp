<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="js/util.js"></script>
</head>
<body>
	<table>

		<tr>
			<td>Id :</td>
			<td><input type="text" name="userId" id="userId" /></td>
		</tr>

		<tr>
			<td>Name :</td>
			<td><input type="text" name="userN" id="userN" /></td>
		</tr>
		<tr>
			<td>Email :</td>
			<td><input type="text" name="emailId" id="emailId" /></td>
		</tr>
		<tr>
			<td>Contact Number :</td>
			<td><input type="text" name="cN" id="cN"></td>
		</tr>
	</table>
	<button onclick="updateUser()">update</button>
</body>
</html>