<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>    
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:set var="url" value="${pageContext.request.contextPath}"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<c:set var="url" value="${pageContext.request.contextPath}"/>
</head>
<body>
<h3 style="font-family:sans-serif;font:bold; color:#461D7C">Popular books</h3>
<div style="overflow-x:auto;">
<table style="width:auto;border-collapse: collapse;border: 1px solid black;">
    <thead style="text-align:center ;padding: 8px;background-color: #FDD023;color: white;border: 1px solid black;">
      <tr style="border: 1px solid black; ">
      	<th style="text-align:center ;padding: 8px;border: 1px solid black;"><a href="${url}/student/list" style="color: #461D7C;">View List of Books</a></th>
      	<th style="text-align:center ;padding: 8px;border: 1px solid black;"><a href="${url}/student/list" style="color: #461D7C;">Reserve Book</a></th>
      	<th style="text-align:center ;padding: 8px;border: 1px solid black;"><a href="${url}/student/popularlist" style="color: #461D7C;">Popular Books</a></th>
      	<th style="text-align:center ;padding: 8px;border: 1px solid black;"><a href="${url}/student/search" style="color: #461D7C;">Search for a Book</a></th>
       </tr>
    </thead>
</table><br><br>
<table style="width:100%;border-collapse: collapse;border: 1px solid black;">
    <thead style="text-align:center ;padding: 8px;background-color: #461D7C;color: white;border: 1px solid black;">
      <tr style="border: 1px solid black; ">
        <th style="text-align:center ;padding: 8px;border: 1px solid black;">Book Name</th>
        <th style="text-align:center ;padding: 8px;border: 1px solid black;">Author</th>
        <th style="text-align:center ;padding: 8px;border: 1px solid black;">Publisher</th>
        <th style="text-align:center ;padding: 8px;border: 1px solid black;">category</th>
        <th style="text-align:center ;padding: 8px;border: 1px solid black;">ISBN</th>
       </tr>
    </thead>
    <tbody style="border: 1px solid black;">
  <c:forEach var="pbook" items="${popularBookList}">
      <tr style="border: 1px solid black;">
        <td style="border: 1px solid black;padding: 8px;font-size:medium; ">${pbook.bookName}</td>
        <td style="border: 1px solid black;padding: 8px;font-size:medium; ">${pbook.bookAuthor}</td>
        <td style="border: 1px solid black;padding: 8px;font-size:medium; ">${pbook.bookPublisher}</td>
        <td style="border: 1px solid black;padding: 8px;font-size:medium; ">${pbook.bookCategory}</td>
        <td style="border: 1px solid black;padding: 8px;font-size:medium; ">${pbook.bookIsbn}</td>
      </tr>
  </c:forEach>
    </tbody>
  </table>
</div>
</body>
</html>