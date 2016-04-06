<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 
<h3 style="font-family:sans-serif;font:bold; color:#461D7C">Please enter your Username and Password to login into your account</h3>
<div style="text-align:center;">
	<form:form action="stulogin" method="post" modelAttribute="student" style="border-radius: 5px;background-color: #f2f2f2;padding: 20px;width:500px;margin: 0 auto;font-size: large;">
	
		User Name<span style="color:red;">*</span> : <form:input path="studentUsername" style="width: 55%;padding: 4px 4px;margin: 8px 29px;display: inline-block;border: 1px solid #ccc;border-radius: 4px;box-sizing: border-box; color:#461D7C;font-family:sans-serif;"/>
		<br><form:errors path="studentUsername" cssStyle="color:red"></form:errors>
	<br>
		Password<span style="color:red;">*</span> : <form:input type="password" path="studentPassword" style="width: 55%;padding: 4px 4px;margin: 8px 29px;display: inline-block;border: 1px solid #ccc;border-radius: 4px;box-sizing: border-box; color:#461D7C;font-family:sans-serif;"/>
		<form:errors path="studentPassword" cssStyle="color:red"></form:errors>
	<input type="submit" value="Login" style="width: 35%;background-color: #461D7C;color: white;padding: 14px 20px;margin: 0 auto;border: none;border-radius: 4px;"/>
	</form:form>
	</div>
</body>
</html>