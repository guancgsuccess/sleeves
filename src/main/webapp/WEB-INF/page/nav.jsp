<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/10/24
  Time: 8:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>导航部分</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/nav.css">
    <script src="${pageContext.request.contextPath}/js/client/nav.js"></script>
</head>
<body>
    <div id="nav-body">
        <div class="logo">
            <a href="${pageContext.request.contextPath}/index">
                <img src="${pageContext.request.contextPath}/img/page/logo.png" style="width: 240px; height: 75px;"/>
            </a>
        </div>
        <div class="nav-content">
            <ul>
                <li><a href="${pageContext.request.contextPath}/index">首页</a></li>
                <li><a href="${pageContext.request.contextPath}/rendering/renderingAll">效果图</a></li>
                <li><a href="${pageContext.request.contextPath}/raidersUI/raidersAll">装修攻略</a></li>
                <li><a href="${pageContext.request.contextPath}/company/allByPage">装修公司</a></li>
            </ul>
        </div>
        <div class="search-body">
            <input type="text" id="search" class="form-control" placeholder="搜装修公司" onkeydown="javascript:if(event.keyCode==13) showCompanyList();">
            <button type="button" class="btn btn-primary" onclick="showCompanyList()" id="searcherButton">搜索</button>

        </div>
    </div>
</body>
</html>
