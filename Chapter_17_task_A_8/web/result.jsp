<%--
  Created by IntelliJ IDEA.
  User: dlitvinko
  Date: 8/21/2019
  Time: 4:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Результаты</title>
</head>
<body>
<h1>Ответ: </h1>
<div>



</div>

<form name="Simple" action="resservlet" method="POST">
    <input type="submit" name="button" value="На главную"/>
</form>

${messages}

</body>
</html>
