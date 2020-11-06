<%@page import="com.cdac.dto.*"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account list</title>
</head>
<body>
	
	<table align="center" >
		<%
			List<Account> elist = (List<Account>)request.getAttribute("expList");
				for(Account exp : elist){
		%>
		<tr>
		<td>
				<%=exp.getAccountNo()%>
			</td>
			<td>
				<%=exp.getfName()%>
			</td>
			<td>
				<%=exp.getlName()%>
			</td>
			<td>
				<%=exp.getDate()%>
			</td>
			<td>
				<%=exp.getGender()%>
			</td>
			<td>
				<%=exp.getDateOfBirth()%>
			</td>
			<td>
				<a href="account_delete.htm?accountId=<%=exp.getAccountId()%>">Delete</a>
			</td>
			<td>
				<a href="account_update_form.htm?accountId=<%=exp.getAccountId()%>">Update</a>
			</td>
		</tr>
		<% } %>
		<tr>
			<td>
				<a href="home.jsp" >Back</a>
			</td>
			<td>
				
			</td>
		</tr>
	</table>
	
</body>
</html>