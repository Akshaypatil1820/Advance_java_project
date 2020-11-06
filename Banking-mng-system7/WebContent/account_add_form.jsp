<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Account Form</title>
</head>
<body>
	<spr:form action="account_add.htm" method="post" commandName="account" >
	<table align="center" >
	<tr>
			<td>
				AccountNo :
			</td>
			<td>
				<spr:input path="accountNo"/>
			</td>
		</tr>
		<tr>
			<td>
				FName :
			</td>
			<td>
				<spr:input path="fName"/>
			</td>
		</tr>
		<tr>
			<td>
				LName:
			</td>
			<td>
				<spr:input path="lName"/>
			</td>
		</tr>
		<tr>
			<td>
				Date:
			</td>
			<td>
				<spr:input path="date"/>
			</td>
		</tr>
		
		
		<tr>
			<td>
				Gender :
			</td>
			<td>
				<spr:input path="gender"/>
			</td>
		</tr>
		<tr>
			<td>
				DateOfBirth:
			</td>
			<td>
				<spr:input path="dateOfBirth"/>
			</td>
		</tr>
		<tr>
			<td>
				<a href="home.jsp" >Back</a>
			</td>
			<td>
				<input type="submit"  value="Add" >
			</td>
		</tr>
	</table>
	</spr:form>
</body>
</html>