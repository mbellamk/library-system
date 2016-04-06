<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>    
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
<h3 style="font-family:sans-serif;font:bold; color:#461D7C">Add a book to the Catalog</h3>
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
  <form:form  action="insert" method="post" modelAttribute="bookForm" style="border-radius: 5px;background-color: #f2f2f2;padding: 20px;width:500px;">
    <fieldset>
       <form:label path="bookName">
       BookName: <form:errors path="bookName" cssStyle="color:red"/> 
       </form:label>
       <form:input path="bookName" style="width: 50%;padding: 4px 4px;margin: 8px 31px;display: inline-block;border: 1px solid #ccc;border-radius: 4px;box-sizing: border-box;"/><br/>
       
       <form:label path="bookAuthor">
       BookAuthor: <form:errors path="bookAuthor" cssStyle="color:red"/> 
       </form:label>
       <form:input path="bookAuthor" style="width: 50%;padding: 4px 4px;margin: 8px 24px;display: inline-block;border: 1px solid #ccc;border-radius: 4px;box-sizing: border-box;"/> <br/>
       
       <form:label path="bookPublisher">
       BookPublisher: <form:errors path="bookPublisher" cssStyle="color:red"/> 
       </form:label>
       <form:input path="bookPublisher" style="width: 50%;padding: 4px 4px;margin: 8px 8px;display: inline-block;border: 1px solid #ccc;border-radius: 4px;box-sizing: border-box;"/> <br/>
       
       <form:label path="bookCategory">
       BookCategory: <form:errors path="bookCategory" cssStyle="color:red"/> 
       </form:label>
       <form:input path="bookCategory" style="width: 50%;padding: 4px 4px;margin: 8px 12px;display: inline-block;border: 1px solid #ccc;border-radius: 4px;box-sizing: border-box;"/> <br/>
       
       <form:label path="bookIsbn">
       BookIsbn: <form:errors path="bookIsbn" cssStyle="color:red"/> 
       </form:label>
       <form:input path="bookIsbn" style="width: 50%;padding: 4px 4px;margin: 8px 43px;display: inline-block;border: 1px solid #ccc;border-radius: 4px;box-sizing: border-box;"/> <br/>
       <form:label path="totalCopies">
       TotalCopies: <form:errors path="totalCopies" cssStyle="color:red"/> 
       </form:label>
       <form:input path="totalCopies" style="width: 50%;padding: 4px 4px;margin: 8px 25px;display: inline-block;border: 1px solid #ccc;border-radius: 4px;box-sizing: border-box;"/> <br/>
       
       <form:label path="availableCopies">
       AvailableCopies: <form:errors path="availableCopies" cssStyle="color:red"/> 
       </form:label>
       <form:input path="availableCopies" style="width: 50%;padding: 4px 4px;margin: 8px 0;display: inline-block;border: 1px solid #ccc;border-radius: 4px;box-sizing: border-box;"/> <br/>
       
       <input type="submit" value="Save" style="width: 30%;background-color: #461D7C;color: white;padding: 14px 20px;margin: 8px 0;border: none;border-radius: 4px;">
    </fieldset>
  </form:form>

</body>
</html>