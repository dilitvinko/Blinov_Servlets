<%--
  Created by IntelliJ IDEA.
  User: dlitvinko
  Date: 8/21/2019
  Time: 3:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Параллелипипеда</title>
</head>
<body>
<h1>Вычесление обьема Параллелипипеда</h1>

<form name="Simple" action="myservl" method="POST">
    <div>
        <span> Введите сторону а: </span>
        <input type="number" name="a" />
    </div>
    <div>
        <span> Введите сторону b: </span>
        <input type="number" name="b" />
    </div>
    <div>
        <span> Введите сторону c: </span>
        <input type="number" name="c" />
    </div>

    <input type="submit" name="button" value="Посчитать обьем параллелипипеда"/>

    <input type="hidden" name="whatJSPuse" value="parall_2"/>
</form>
</body>
</html>
