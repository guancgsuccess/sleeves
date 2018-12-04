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
    <title>注册-袖装网</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/client/register.css">
    <script src="${pageContext.request.contextPath}/js/client/register.js"></script>
</head>
<body>

<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/new_top.jsp" />
<%-----------------------------------------------------------------------------%>
    <div id="register-body">

        <div id="title-content">
            <div class="logo">
                <a href="${pageContext.request.contextPath}/index">
                    <img src="${pageContext.request.contextPath}/img/page/logo.png" style="width: 250px; height: 100%;"/>
                </a>
            </div>
            <div class="welcome">欢迎注册</div>
        </div>

        <div id="body-content">
            <%-------------- 图片 ---------------%>
            <div class="register-left">
                <img src="${pageContext.request.contextPath}/img/page/common.png" />
            </div>

            <%-------------- 注册信息 ------------%>
            <div class="register-right">
                <form action="${pageContext.request.contextPath}/client/clientRegister" method="post" class="register-form">
                    <div class="register-title">用户注册</div>

                    <input name="clientTelephone" id="registerPhone" type="text" class="registerPhone" placeholder="手机号" onblur="checkTelephone()"/><br />
                    <span id="error-tip1"></span>

                    <input name="clientName" id="username" type="text" class="username" placeholder="用户名" onblur="checkUserName()"/><br />
                    <span id="error-tip2"></span>

                    <input name="clientPassword" id="password" type="password" class="password" placeholder="密码" onblur="checkPassword()"/><br />
                    <span id="error-tip3"></span>

                    <div class="confirmation">
                        <input name="verificationCode"  class="sure-password" type="text" id="VerificationCode" placeholder="验证码"  />
                        <input id="sendButton" class="sure-button" type="button" onclick="getVerificationCode()" value="发送验证码至手机" />
                    </div>
                    <span id="error-tip4">${codeError}</span>

                    <div class="read-inform">
                        <input type="checkbox" onclick="check(this)" />
                        <span style="font-size: 13px;"> 我已阅读并接受
                                <a href="http://www.to8to.com/about/law.html" target="_blank" style="color: #3AC569; text-decoration: none;">《袖装用户服务协议》</a>
                        </span>
                    </div>

                    <input type="submit" class="register-button" id="registerButton" onclick="checkRegister()" value="立即注册"/>

                    <a href="${pageContext.request.contextPath}/clientUI/login" class="fast-login">立即登录</a>
                </form>
            </div>
        </div>
    </div>
<%------------------------------------------------------------------------------%>
    <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/footer.jsp" />
</body>
</html>
