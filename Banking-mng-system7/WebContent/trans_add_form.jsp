<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Account Form</title>
</head>
<body>
	<spr:form action="trans_add.htm" method="post" commandName="trans" >
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
				Name :
			</td>
			<td>
				<spr:input path="name"/>
			</td>
		</tr>
		
		
	
		<tr>
			<td>
				Amount:
			</td>
			<td>
				<spr:input path="amount"/>
			</td>
		</tr>
		
		<tr>
			<td>
				Current-Bal:
			</td>
			<td>
				<spr:input path="currentBal"/>
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
				TransactionType:
			</td>
			<td>
				<form:select path="transType">  
                <form:option value="deposit" label="Deposit"/>  
                <form:option value="withdraw" label="Withdraw"/>  
                </form:select>  
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