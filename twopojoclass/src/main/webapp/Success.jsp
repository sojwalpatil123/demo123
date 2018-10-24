<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">

function add()
{
	document.myform.action="register";
	document.myform.submit();
	
	}
function edit()
{
	document.myform.action="edit";
	document.myform.submit();
	
	}
function del()
{
	document.myform.action="del";
	document.myform.submit();
	
	}

</script>
</head>
<body>

<form name="myform">
<center>
<h3>Success Page</h3>
<table border="3">

<tr><th>Id</th><th>Name</th><th>Address</th><th>Mobile</th><th>Username</th><th>Password</th></tr>
<c:forEach items="${list}" var="s">

<tr>
<td><input type="radio" name="id" value="${s.id}"></td>
<td>${s.name}</td>
<td>${s.address}</td>
<td>${s.mobile}</td>
<td>${s.login.username}</td>
<td>${s.login.password}</td>

</tr>
</c:forEach>
<tr><td colspan="6"><input type="button" value="add" onclick="add()">
<input type="button" value="edit" onclick="edit()">
<input type="button" value="del" onclick="del()">

</td></tr>





</table>



</center>
</form>


</body>
</html>