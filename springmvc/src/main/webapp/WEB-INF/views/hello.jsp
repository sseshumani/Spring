<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!-- <!DOCTYPE html>  -->

<html>
<head>
<meta charset="ISO-8859-1">
<title>first spring mvc</title>
</head>
<body>
<h1>Hello from first spring mvc</h1>

<%

Integer id=(Integer)request.getAttribute("id");
String name=(String)request.getAttribute("name");
Integer salary=(Integer)request.getAttribute("salary");
out.println("ID:"+id +"Name:"+name +"salary:"+salary);


%>

<b>ID: ${id}</b>
<b>Name: ${name}</b>
<b>Salary: ${salary}</b>

</body>
</html>