<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>USER REGISTRATION FORM</h1>

	<form action="saveuser">
		<table>
			<tr>
				<td>USER FIRST NAME</td>
				<td><input type="text" name="fName"></td>
			</tr>
			
			<tr>
				<td>USER LAST NAME</td>
				<td><input type="text" name="lName"></td>
			</tr>
			
			<tr>
				<td>EMAIL</td>
				<td><input type="text" name="email"></td>
			</tr>

			<tr>
				<td>USERNAME</td>
				<td><input type="text" name="uName"></td>
			</tr>

			<tr>
				<td>PASSWORD</td>
				<td><input type="text" name="password">
			</tr>

			<tr>
				<td><input type="Submit" value="REGISTER"></td>
			</tr>
		</table>
	</form>
</body>
</html>