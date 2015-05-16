<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table class="table table-striped" border="1px" cellpadding="0" cellspacing="0" >
<thead>
<tr>
<th width="10%">id</th><th width="15%">name</th><th width="10%">type</th><th width="10%">actions</th>
</tr>
</thead>
<tbody>
<c:forEach var="mtLoginAttempt" items="${mtLoginAttemptList}">
<tr>
	<td>${mtLoginAttempt.id}</td>
	<td>${mtLoginAttempt.ip_address}</td>
	<td>${mtLoginAttempt.login}</td>
	<td>
	<a href="${pageContext.request.contextPath}/mtLogin/edit/${mtLoginAttempt.id}.html">Edit</a><br/>
	<a href="${pageContext.request.contextPath}/mtLogin/delete/${mtLoginAttempt.id}.html">Delete</a><br/>
	</td>
</tr>
</c:forEach>
</tbody>
</table>

<p><a href="${pageContext.request.contextPath}/index.html">Home page</a></p>
</body>
</html>