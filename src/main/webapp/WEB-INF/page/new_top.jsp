<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/10/12
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>网页头部</title>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/top.css">
</head>
<body>

    <div id="header">
        <div id="location" class="location">

        </div>

        <div class="topInfo">
            <ul>
                <li>
                    <c:choose>
                        <c:when test="${empty client.clientName}">
                            <a href="${pageContext.request.contextPath}/clientUI/register" target="_parent">注册</a> &nbsp;&nbsp;&nbsp;
                            <a href="${pageContext.request.contextPath}/clientUI/login" target="_parent">登录</a>
                        </c:when>
                        <c:otherwise>
                            <a href="javascript:void(0)" style="color: #3ac569;font-size: 14px">${client.clientName}</a>
                            <a href="${pageContext.request.contextPath}/client/clientOut">退出</a>
                        </c:otherwise>
                    </c:choose>
                </li>
                <li><a href="${pageContext.request.contextPath}/clientUI/personCenter" target="_blank">个人中心</a></li>
                <li><a href="${pageContext.request.contextPath}/clientUI/aboutUs" target="_blank">关于我们</a></li>
                <li><a href="${pageContext.request.contextPath}/advice" target="_blank">意见反馈</a></li>
            </ul>
        </div>
    </div>

</body>
</html>


