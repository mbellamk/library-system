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
<h3 style="font-family:sans-serif;font:bold; color:#461D7C">Admin Responsibilities</h3>
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

<p>
1. Manage the planning, administrative and budgetary functions of library and information services:-
<ul style="list-style-type:square">
<li>Establish and implement library and information policies and procedures</li>
<li>Admin should develop and manage convenient, accessible library and information services.</li>
<li>Manage the budget for library and information services, technology and media.</li>
<li>Develop and manage cost-effective library and information services, technology and media.</li>
<li>Order materials and maintain records for payment of invoices.</li>
</ul>
2. Provide effective access to library collections and resources:-
<ul style="list-style-type:square">
<li>Admin should develop and maintain collections management policies and procedures.</li>
<li>Perform original cataloguing and classification of print, audio-visual and electronic resources.</li>
<li>Develop and maintain special indexing systems and files for special collections.</li>
</ul>
3. Maintain the organization of library materials:-
<ul style="list-style-type:square">
<li>Admin should ensure an accurate inventory of resources.</li>
<li>Ensure efficient retrieval by users.</li>
<li>Search external database programs for the availability of cataloguing copy.</li>
<li>Maintain inventories, compile statistics and generate reports as required.</li>
<li>Develop and maintain cataloguing procedures.</li>
</ul>
4. Provide library services in response to the information needs of library users:-
<ul style="list-style-type:square">
<li>Admin should respond to daily on-site requests for information.</li>
<li>Train library users to effectively search the Library catalogue, Internet and other electronic resources.</li>
<li>Provide an interlibrary loan service for both book and audiovisual materials and maintain records.</li>
<li>Maintain records for the interlibrary loan service.</li>
</ul>
</p>

</body>
</html>