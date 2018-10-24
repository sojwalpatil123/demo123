<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="update">
<center>
<pre>
<h2>Edit page</h2>


<input type="hidden" name="id" value="${eds.id}">

Name:<input type="text" name="name" value="${eds.name }">

Address:<input type="text" name="address" value="${eds.address}">

Mobile:<input type="text" name="mobile" value="${eds.mobile}">

Username:<input type="text" name="username"value="${eds.login.username}">

password:<input type="text" name="password" value="${eds.login.password}">

<input type="submit" value="Submit">


</pre>


</center>


</form>


</body>
</html>