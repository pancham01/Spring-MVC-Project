<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>HI WELCOME MR. ${user.username} HERE YOU CAN EXPLORE YOUR
		PROFILE</h1>
	<h2>These are your details:</h2>
	<h3>Username : ${user.username}</h3>
	<h3>Gender : ${user.gender}</h3>
	<h3>Age : ${user.age}</h3>
	<h3>Email : ${user.email}</h3>
	<h3>Address : ${user.address}</h3>

</body>
</html>