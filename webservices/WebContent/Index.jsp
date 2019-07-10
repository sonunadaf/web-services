<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Data</title>
<script type="text/javascript" src="js/util.js"></script>
</head>
<body>

	<table>
		<tr>
			<td>Name :</td>
			<td><input type="text" name="userName" id="userName" /></td>
		</tr>
		<tr>
			<td>Email :</td>
			<td><input type="text" name="email" id="email" /></td>
		</tr>
		<tr>
			<td>Contact Number :</td>
			<td><input type="text" name="cNumber" id="cNumber"></td>
		</tr>
		<tr>
			<td><input type="submit" onclick="addUser()" /></td>
		</tr>
	</table>
	<a href="userDetail.jsp">UserDetail</a>
	<a href="Update.jsp">update</a>

</body>
</html>