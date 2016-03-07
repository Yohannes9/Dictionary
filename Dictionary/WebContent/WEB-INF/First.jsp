<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Kafi-Amaari-Ingliize Dikshineeri</h2>
	<input type="text" id="Eid"/>
	
	 <form:form method="POST" commandName="miho" action="shadib">
		<table>
			<tr>
				<td><form:label path="kafi">Kafi</form:label></td>
				<td><form:input path="kafi" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form> 
	<input type="button" value="Mihe gedoch" /> 
	
</body>
</html>