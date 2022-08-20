<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Hello Dear!  please login here</h2>
<form action="detail" method="post">
<input type="text" name="exisuserid" placeholder="please enter you userId">
<input type="password" name="existpass" placeholder="Enter your password">
<input type="submit" value="Login">

</form>
<p>${msg}</p>

</body>
</html>