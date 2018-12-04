<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/11/6
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <style>
        #error-body{
            width: 600px;
            height: 400px;
            margin: 100px 0px 0px 300px;
        }

    </style>
</head>
<body>

    <div id="error-body">
        <a href="${pageContext.request.contextPath}/index">
            <img src="${pageContext.request.contextPath}/img/error.png" style="width: 600px;height: 400px;">
        </a>
    </div>

</body>
</html>
