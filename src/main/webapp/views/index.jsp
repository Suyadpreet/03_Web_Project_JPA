<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello Welcome to Jsp page</h1>
<p><font color = 'green'>${msg}</font></p>
<form:form action = "save" method  = "post" modelAttribute = "stds">
	<!-- 
	<form:input path="name" type = "text"/>
	<input type = "submit" value = "Redirect">
	 -->
	<table>
		<tr>
			<td>Name : </td>
			<td><form:input path="name" /></td>
		</tr>
		<tr>
			<td>Email : </td>
			<td><form:input path="email" /></td>
		</tr>
		<tr>
			<td>Gender : </td>
			<td>
				<form:radiobuttons path="gender" items = "${gnd}"/>
				<!-- 
				<form:radiobutton path="gender" value = "M"/>Male
				<form:radiobutton path="gender" value = "F"/>Fe-Male
				 -->
			</td>
		</tr>
		<tr>
			<td>Courses :</td>
			<td>
				<form:select path="courses">
					<form:option value="">-Select-</form:option>
					<!-- 
					<form:option value="java">java</form:option>
					<form:option value="python">python</form:option>
					<form:option value="Devops">Devops</form:option>
					 -->
					 <form:options items = "${crs}"/>
				</form:select>
			</td>
		</tr>
		<tr>
			<td>Timing :</td>
			<td>
			<!-- 
				<form:checkbox path="timing" value = "morning"/>Morning
				<form:checkbox path="timing" value = "afternoon"/>Afternoon
				<form:checkbox path="timing" value = "Evening"/>Evening
				<form:checkbox path="timing" value = "Night"/>Night
			 -->
			 <form:checkboxes items="${tmg}" path="timing"/>
			</td>
		</tr>
		<tr>
			<td></td>
			<td><input type = "submit" value = "Redirect"></td>
		</tr>
	</table>
</form:form>


<!-- 
 <form action="welcome">
 	<input type = "submit" value = "Redirect"/>
 </form>
  -->
</body>
</html>