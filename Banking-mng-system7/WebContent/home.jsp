<%@page import="com.cdac.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<table align="center" >
		<tr><td>&nbsp;&nbsp;</td></tr>
		<tr>
			<td> Welcome <%=(session.getAttribute("user")!=null) ? ((User)session.getAttribute("user")).getUserName() : "!!!!!!!!" %> </td>
		</tr>
		
		<tr>
			<td> <a href="prep_account_add_form.htm" >Account Add</a> </td>
		</tr>
	
		<tr>
			<td> <a href="account_list.htm" >Account Details</a> </td>
		</tr>
		<tr>
			<td> <a href="prep_trans_add_form.htm">Transction Add</a> </td>
		</tr>
	
		<tr>
			<td> <a href="trans_list.htm">Transction Details</a> </td>
		</tr>
		<tr>
			<td> <a href="logout.htm" >Logout</a> </td>
		</tr>
	</table>
</body>
</html>