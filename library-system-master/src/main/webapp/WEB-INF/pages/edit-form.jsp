<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>    
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:set var="url" value="${pageContext.request.contextPath}"/>
</head>
<body>
  
   <form:form  action="${url}/admin/edit/${bookForm.bookId}" method="post" modelAttribute="bookForm" style="border-radius: 5px;background-color: #f2f2f2;padding: 20px;">
    <fieldset>
       <legend> Edit Book data</legend><br/>
       <form:label path="bookId">
        BookId: <form:errors path="bookId" cssStyle="color:red"/> 
       <form:input readonly="true" path="bookId" style="width: 20%;padding: 4px 4px;margin: 8px 81px;display: inline-block;border: 1px solid #ccc;border-radius: 4px;box-sizing: border-box;"/><br/>
       
       BookName: <form:errors path="bookName" cssStyle="color:red"/> 
       </form:label>
       <form:input path="bookName" style="width: 20%;padding: 4px 4px;margin: 8px 61px;display: inline-block;border: 1px solid #ccc;border-radius: 4px;box-sizing: border-box;"/><br/>
       
       <form:label path="bookAuthor">
       BookAuthor: <form:errors path="bookAuthor" cssStyle="color:red"/> 
       </form:label>
       <form:input path="bookAuthor" style="width: 20%;padding: 4px 4px;margin: 8px 31px;display: inline-block;border: 1px solid #ccc;border-radius: 4px;box-sizing: border-box;"/> <br/>
       
       <form:label path="bookPublisher">
       BookPublisher: <form:errors path="bookPublisher" cssStyle="color:red"/> 
       </form:label>
       <form:input path="bookPublisher" style="width: 20%;padding: 4px 4px;margin: 8px 31px;display: inline-block;border: 1px solid #ccc;border-radius: 4px;box-sizing: border-box;"/> <br/>
       
       <form:label path="bookCategory">
       BookCategory: <form:errors path="bookCategory" cssStyle="color:red"/> 
       </form:label>
       <form:input path="bookCategory" style="width: 20%;padding: 4px 4px;margin: 8px 31px;display: inline-block;border: 1px solid #ccc;border-radius: 4px;box-sizing: border-box;"/> <br/>
       
       <form:label path="bookIsbn">
       BookIsbn: <form:errors path="bookIsbn" cssStyle="color:red"/> 
       </form:label>
       <form:input path="bookIsbn" style="width: 20%;padding: 4px 4px;margin: 8px 31px;display: inline-block;border: 1px solid #ccc;border-radius: 4px;box-sizing: border-box;"/> <br/>
       
       <form:label path="totalCopies">
       TotalCopies: <form:errors path="totalCopies" cssStyle="color:red"/> 
       </form:label>
       <form:input path="totalCopies" style="width: 20%;padding: 4px 4px;margin: 8px 31px;display: inline-block;border: 1px solid #ccc;border-radius: 4px;box-sizing: border-box;"/> <br/>
       
       <form:label path="availableCopies">
       AvailableCopies: <form:errors path="availableCopies" cssStyle="color:red"/> 
       </form:label>
       <form:input path="availableCopies" style="width: 20%;padding: 4px 4px;margin: 8px 31px;display: inline-block;border: 1px solid #ccc;border-radius: 4px;box-sizing: border-box;"/> <br/>
       
        <input type="submit" value="Update" style="width: 30%;background-color: #461D7C;color: white;padding: 14px 20px;margin: 8px 0;border: none;border-radius: 4px;">
    </fieldset>
   
  </form:form>

</body>
</html>