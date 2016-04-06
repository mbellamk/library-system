<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>    
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<c:set var="url" value="${pageContext.request.contextPath}"/>
<title>Insert title here</title>
</head>
<body>
<table style="width:auto;border-collapse: collapse;border: 1px solid black;">
    <thead style="text-align:center ;padding: 8px;background-color: #FDD023;color: white;border: 1px solid black;">
      <tr style="border: 1px solid black; ">
      	<th style="text-align:center ;padding: 8px;border: 1px solid black;"><a href="${url}/admin/list" style="color: #461D7C;">View List of Books</a></th>
      	<th style="text-align:center ;padding: 8px;border: 1px solid black;"><a href="${url}/admin/insert" style="color: #461D7C;">Add a Book</a></th>
            	<th style="text-align:center ;padding: 8px;border: 1px solid black;"><a href="${url}/admin/list" style="color: #461D7C;">Update Book</a></th>
      	<th style="text-align:center ;padding: 8px;border: 1px solid black;"><a href="${url}/admin/responsibility" style="color: #461D7C;">Responsibilities</a></th>
       </tr>
    </thead>
</table><br><br>
<p style="color: #461D7C; font-family:fantasy;font-style:inherit;font-size:large; ">You have successfully updated the book with id ${bookId}</p>  
</body>
</html>