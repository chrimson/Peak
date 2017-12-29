<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>JPAD Test</title>
</head>
<body>
	<form action="ATest" method="GET">
		JPAD Test
		<p />
		
		<a href="Default.jsp">Home</a>
		<p />
		
		Object
		<br />
		<input type="submit" name="op" value="Create" />
		<input type="submit" name="op" value="Access" />
		<input type="submit" name="op" value="Modify" />
		<input type="submit" name="op" value="Delete" />
		<p />
	
		Access
		<br />
		<input type="submit" name="op" value="Login" />
		<input type="submit" name="op" value="Logoff" />
		<input type="submit" name="op" value="Fail" />
		<input type="submit" name="op" value="Reset" />
	</form>
</body>
</html>