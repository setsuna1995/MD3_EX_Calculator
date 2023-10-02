<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Calculator" %>
</h1>
<br/>
<form action="${pageContext.request.contextPath}/hello-servlet" method="get">
    <label>First operand: </label>
    <input type="text" name="a"/><br/>
    <label>Second operand: </label>
    <input type="text" name="b"><br/>
    <select name="cal" id="calculator" style="width: 200px">
        <option value="+">Sum</option>
        <option value="*">Multi</option>
        <option value="-">Except</option>
        <option value="/">Divide</option>
    </select><br/>
<input type="submit" id="submit" value="Calculator">
</form>
</body>
</html>