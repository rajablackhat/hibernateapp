<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Admission</title>
</head>
<body>
<form method="post" action="Admission">
<table align="center">
<tr><th>Name</th><td><input type="text" name="stname" value="" required /></td></tr>
<tr><th>Roll no</th><td><input type="text" name="roll" value="" /></td></tr>
<tr><th>Course</th><td><input type="text" name="course" value=""  required/></td></tr>
<tr><th>Fees</th><td><input type="text" name="fees" value="" required /></td></tr>
</table>
<br>
<br>
<input type="submit" name="submit" value="Submit" style="margin-left:360px;" />
</form>
</body>
</html>