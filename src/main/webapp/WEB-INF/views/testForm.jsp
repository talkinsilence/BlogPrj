<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<form action = "testView.jsp" method = "post">
	<input type = "text" name = "txt"/>
	<input type = "submit" value = "submit"/>
</form>
</body>
</html>
