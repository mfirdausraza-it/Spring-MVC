<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</p>

	<form action="signup" method="get">
		<input type="submit" value="SignUp">	
	</form>
	<form action="signin" method="get">
	<input type="submit" value="SignIn">
	</form>

</body>
</html>