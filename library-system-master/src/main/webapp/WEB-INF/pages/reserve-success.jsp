<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<c:set var="url" value="${pageContext.request.contextPath}"/>
</head>
<body>
<table style="width:auto;border-collapse: collapse;border: 1px solid black;">
    <thead style="text-align:center ;padding: 8px;background-color: #FDD023;color: white;border: 1px solid black;">
      <tr style="border: 1px solid black; ">
      	<th style="text-align:center ;padding: 8px;border: 1px solid black;"><a href="${url}/student/list" style="color: #461D7C;">View List of Books</a></th>
      	<th style="text-align:center ;padding: 8px;border: 1px solid black;"><a href="${url}/student/list" style="color: #461D7C;">Reserve Book</a></th>
      	<th style="text-align:center ;padding: 8px;border: 1px solid black;"><a href="${url}/student/popularlist" style="color: #461D7C;">Popular Books</a></th>
      	<th style="text-align:center ;padding: 8px;border: 1px solid black;"><a href="#" style="color: #461D7C;">Search for a Book</a></th>
       </tr>
    </thead>
</table><br><br>
<p style="color: #461D7C; font-family:cursive; font-style:inherit;font-size:large;">You have successfully reserved the book.<br>
Please come to the library to pick your book during our library timings with your photo Id.
</p>

</body>
</html>