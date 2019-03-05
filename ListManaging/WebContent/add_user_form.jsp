<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="myFunction" uri="MyFunctions" %>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Lists</title>
</head>

<body>

<div style="float:left ; width:800px;" >

<div style="width:350px;" >
<h1>Add New User</h1>  
<form action="AddUser" method="post">  
<table>  
<tr><td>Name:</td><td> <input type="text" name="name"     /> </td></tr>  
<tr><td>Password:</td><td>  
<input type="password" name="password"   /></td></tr>  
<tr><td>Email:</td><td><input type="email" name="email"   /></td></tr>  
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
<tr><td colspan="2"><input type="submit" value="Add User"/></td></tr>  
</table>  
</form>  
</div>

<div style="width:350px;text-align:right"> 

<table style=" border: 1px solid black;" >
  <tr >
    <th style=" border: 1px solid black;">Name</th>
    <th style=" border: 1px solid black;">Email</th>
    <th style=" border: 1px solid black;">Sex</th>
    <th style=" border: 1px solid black;">Country</th>
    <th style=" border: 1px solid black;">Update</th>
    <th style=" border: 1px solid black;">Delete</th>
  </tr>
  
  <c:forEach var="user" items="${users}"> 
  <tr style=" border: 1px solid black;">
    <td style=" border: 1px solid black;">${user.name}</td>
    <td style=" border: 1px solid black;">${user.email }</td>
    <td style=" border: 1px solid black;"> ${user.sex}</td>
    <td style=" border: 1px solid black;">${user.country}</td>
    <th style=" border: 1px solid black;"> <a href="update_user.jsp?email=${user.email}">Update</a>  </th>
    <th style=" border: 1px solid black;"><a href="DeleteUser?email=${user.email}">Delete</a> </th>
  </tr>
  </c:forEach>
</table>

</div>

</div>

</body>

</html>