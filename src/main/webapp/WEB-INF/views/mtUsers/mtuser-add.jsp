<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
     
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Add strategy page</title>
</head>
<body>
<h1>Add User page</h1>
<p>Here you can add a new strategy.</p>
<form:form method="POST" commandName="mtuser" action="${pageContext.request.contextPath}/mtuser/add.html">
<table>
<tbody>
 <tr>
  <td>Name:</td>
  <td><form:input path="NAME" /></td>
 </tr>
 <tr>
  <td>Username:</td>
  <td><form:input path="USERNAME" /></td>
 </tr>
 <tr>
  <td>Email:</td>
  <td><form:input path="EMAIL" /></td>
 </tr>
 <tr>
  <td>Password:</td>
  <td><form:input path="PASSWORD" /></td>
 </tr>
 <tr>
  <td>SALT:</td>
  <td><form:input path="SALT" /></td>
 </tr>
  <tr>
  <td>ROLE:</td>
  <td><form:input path="ROLE" /></td>
 </tr>
  <tr>
  <td>Status:</td>
  <td><form:input path="STATUS" /></td>
 </tr>
 <tr>
    <td>FIRST LOGIN:</td>
  	<td><form:input path="FIRST_LOGIN" /></td>
 </tr>
<tr>
	<td>REG_DATE:</td>
  	<td><form:input path="REG_DATE" /></td>
</tr>
<tr>
	<td>MODIF_DATE:</td>
  	<td><form:input path="MODIF_DATE" /></td>
</tr>
 <tr>
  <td><input type="submit" value="Add" /></td>
  <td></td>
 </tr>
</tbody>
</table>
</form:form>
 
<p><a href="${pageContext.request.contextPath}/index.html">Home page</a></p>
</body>
</html>