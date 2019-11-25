<%--
  Created by IntelliJ IDEA.
  User: dlitvinko
  Date: 8/21/2019
  Time: 2:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Куб</title>
</head>
<body>
<h1>Вычесление обьема куба</h1>

<form name="Simple" action="myservl" method="POST">
    <div>
        <span> Введите сторону а: </span>
        <input type="number" name="a" />
    </div>
    <input type="submit" name="button" value="Посчитать обьем куба"/>

    <input type="hidden" name="whatJSPuse" value="kub_1"/>
</form>
</body>
</html>
