<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/10/12
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>登录-袖装网</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/client/login.css">
    <script src="${pageContext.request.contextPath}/js/client/login.js"></script>
</head>
<body>

    <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/new_top.jsp" />
<%-----------------------------------------------------------------------------------%>
    <div id="login-body">

        <div id="title-content">
            <div class="logo">
                <a href="${pageContext.request.contextPath}/index">
                    <img src="${pageContext.request.contextPath}/img/page/logo.png" style="width: 250px; height: 100%;"/>
                </a>
            </div>
            <div class="welcome">欢迎登录</div>
        </div>

        <div id="body-content">
            <div class="login-left">
                <img src="${pageContext.request.contextPath}/img/page/common.png" style="width: 500px;height: 400px;"/>
            </div>

            <div class="login-right">
            <form action="${pageContext.request.contextPath}/client/clientLogin" method="post" class="login-form" id="loginForm">

                <div class="login-title">用户登录</div>
                <input name="clientTelephone" id="clientTelephone" class="loginName" type="text" placeholder="手机号" onblur="checkLoginName()" /> <br />
                <span id="error-tip"></span>

                <input name="clientPassword" id="clientPassword" class="clientPassword" type="password" placeholder="密码" onblur="checkLoginPwd()" /><br />
                <span id="error-tip1">${loginErrorMsg}</span>

                <div class="auto-login-content">
                    <div class="auto-login-content1">
                        <input id="remember" type="checkbox" />
                        <span>下次自动登录</span>
                    </div>
                    <div class="auto-login-content2">
                        <a href="${pageContext.request.contextPath}/clientUI/forgetPwd" target="_blank">忘记密码?</a>
                    </div>
                </div>
                <input onclick="checkLoginButton()" id="loginButton" type="submit" class="login-button" value="登录"/>
            </form>
        </div>
        </div>

    </div>

<%-----------------------------------------------------------------------------------%>
    <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/footer.jsp" />
</body>
</html>
