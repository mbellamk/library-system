<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<c:set var="url" value="${pageContext.request.contextPath}"/>
</head>
<body>
<div style="text-align:center;">
<table>
	<tr>
		<td style="width: 70%;">
			<p style="color: #461D7C; font-family:fantasy;font-style:inherit;font-size:large; ">Login Successful</p><br>
			<a href="menu2">Click Here</a> to go to Admin Menu
		</td>
		<td>
			<img src="http://hkpteam.clan.su/login.png">
		</td>
	<tr>
	<tr>
		<td>
			
		</td>
		<td>
			<img src="http://www.econflo.com/images/welcome_admin.gif">
		</td>
	</tr>
</table>
</div>
</body>
</html>