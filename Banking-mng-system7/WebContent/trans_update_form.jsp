<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Trans Form</title>
</head>
<body>
	<spr:form action="trans_update.htm" method="post" commandName="trans" >
	<table align="center" >
		<tr>
			<td>
				
			</td>
			<td>
				<spr:hidden path="transId"/>
			</td>
		</tr>
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
				Trans-Type:
			</td>
			<td>
				<spr:input path="transType"/>
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
				<a href="trans_list.htm" >Back</a>
			</td>
			<td>
				<input type="submit" value="Update" >
			</td>
		</tr>
	</table>
	</spr:form>
</body>
</html>