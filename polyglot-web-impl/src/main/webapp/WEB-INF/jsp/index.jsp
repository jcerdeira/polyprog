<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

	<title>Polyglot Web DEMO</title>
	
</head>

<body>

<center>

<h1>Polyglot Twitter !!!!</h1>
	
	<table>
	<tr>
	
	<form:form action="add.html">

	<td valign="center">
		<label for="twitt">Type your twitt: </label>
	</td>
	<td>
        <textarea type="text" id="twitt" name="twitt" rows="5" cols="80"></textarea></br></br>
     </td>
     </tr>
	<td>
		<label for="author">author: </label>
	</td>
	<td>
		<input type="text" id="author" name="author" maxlength="80" size="80"></input></br>
	</td>	
         
	</table>
    
		<INPUT type="submit" value="add" >
	</form:form>
</center>

<br><br><br>
<center>
<table>
<c:forEach var="twitt" items="${list}">
	<tr><td><textarea disabled="disable" readonly="readonly" rows="5" cols="80">${twitt.message}</textarea></td><tr>
	<tr><td><font size=2>Author: ${twitt.author}</font></td></tr>
	<tr><td><br></br></td></tr>
</c:forEach>
</table>

Implemented in : ${language}
<center>

</body>
</html>
