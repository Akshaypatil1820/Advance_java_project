<%@page import="com.cdac.dto.*"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Trans list</title>
</head>
<body>
	
	<table align="center" >
		<%
			List<Trans> elist = (List<Trans>)request.getAttribute("expList");
				for(Trans exp : elist){
		%>
		<tr>
		<td>
				<%=exp.getAccountNo()%>
			</td>
			<td>
				<%=exp.getName()%>
			</td>
			<td>
				<%=exp.getTransType()%>
			</td>
			<td>
				<%=exp.getAmount()%>
			</td>
			<td>
				<%=exp.getCurrentBal()%>
			</td>
			<td>
				<%=exp.getDate()%>
			</td>
			<td>
				<a href="trans_delete.htm?transId=<%=exp.getTransId()%>">Delete</a>
			</td>
			<td>
				<a href="trans_update_form.htm?transId=<%=exp.getTransId()%>">Update</a>
			</td>
		</tr>
		<% } %>
		<tr>
			<td>
				<a href="home.jsp" >Back</a>
			</td>
			
		</tr>
	</table>
	
</body>
</html>