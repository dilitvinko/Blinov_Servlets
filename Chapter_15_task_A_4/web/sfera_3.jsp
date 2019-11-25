<%--
  Created by IntelliJ IDEA.
  User: dlitvinko
  Date: 8/21/2019
  Time: 4:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Сфера</title>
</head>
<body>
<h1>Вычесление обьема сферы</h1>

<form name="Simple" action="myservl" method="POST">
    <div>
        <span> Введите радиус R: </span>
        <input type="number" name="r" />
    </div>
    <input type="submit" name="button" value="Вычислить обьём сферы"/>

    <input type="hidden" name="whatJSPuse" value="sfera_3"/>
</form>
</body>
</html>
