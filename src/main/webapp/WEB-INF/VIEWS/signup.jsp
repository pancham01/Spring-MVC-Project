<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Sign Up</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }

        .container {
            width: 400px;
            margin: 50px auto;
            padding: 25px;
            background-color: white;
            border-radius: 8px;
            box-shadow: 0px 0px 10px #aaa;
        }

        h2 {
            text-align: center;
            color: #333;
        }

        label {
            display: block;
            margin-top: 12px;
            font-weight: bold;
        }

        input, textarea, select {
            width: 100%;
            padding: 9px;
            margin-top: 5px;
            box-sizing: border-box;
        }

        .gender {
            width: auto;
        }

        .btn {
            width: 100%;
            margin-top: 20px;
            padding: 10px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        .btn:hover {
            background-color: #0056b3;
        }
    </style>
</head>

<body>

<div class="container">

    <h2>User Sign Up</h2>

    <form:form action="${pageContext.request.contextPath}/signup"
               method="post"
               modelAttribute="user">

        <!-- Username -->
        <label>Username</label>
        <form:input path="username" placeholder="Enter username" />

        <!-- Password -->
        <label>Password</label>
        <form:password path="password" placeholder="Enter password" />

        <!-- Gender -->
        <label>Gender</label>

        <form:radiobutton path="gender" value="Male" cssClass="gender" />
        Male

        <form:radiobutton path="gender" value="Female" cssClass="gender" />
        Female

        <form:radiobutton path="gender" value="Other" cssClass="gender" />
        Other

        <!-- Age -->
        <label>Age</label>
        <form:input path="age" type="number" placeholder="Enter age" />

        <!-- Address -->
        <label>Address</label>
        <form:textarea path="address"
                       rows="4"
                       placeholder="Enter your address" />

        <!-- Email -->
        <label>Email</label>
        <form:input path="email"
                    type="email"
                    placeholder="Enter email address" />

        <!-- Submit -->
        <input type="submit" value="Sign Up" class="btn" />

    </form:form>

</div>

</body>
</html>