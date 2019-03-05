<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="myFunction" uri="MyFunctions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update User</title>
</head>
<body>

<!-- get the user first  -->
<c:forEach items="${users}" var="u"> 
	<c:if test="${u.email==param.email }"> 
	<c:set var="user" value="${u}"></c:set>
	</c:if>
</c:forEach>


<h1>Update User</h1>  
<form action="UpdateUser" method="post">  
<table>  
<tr><td>Name:</td><td> <input type="text" name="name"  value="${user.name}"  /> </td></tr>  
<tr><td>Password:</td><td>  
<input type="password" name="password" value="${user.password}"  /></td></tr>  
<tr><td>Email:</td><td><input type="email" name="email" value="${user.email}" readonly /></td></tr>  
<tr><td>Sex:</td><td>  
<input type="radio" name="sex" value="male"/>Male   
<input type="radio" name="sex" value="female"/>Female </td></tr>  
<tr><td>Country:</td><td>  
<select name="country" style="width:155px">  
<option>Bangladesh</option>  
<option>India</option>  
<option>Pakistan</option>  
<option>Afghanistan</option>  
<option>Berma</option>  
<option>Other</option>  
</select>  
</td></tr>  
<tr><td colspan="2"><input type="submit" value="Update User"/></td></tr>  
</table>  
</form> 
</body>
</html>