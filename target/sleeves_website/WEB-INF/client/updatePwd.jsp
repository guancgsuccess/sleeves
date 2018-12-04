<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/11/1
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>后台管理中心-袖装网</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/client/updatePwd.css">
    <script>
        function changeImg() {
            document.getElementById("validateCodeImg").src="${pageContext.request.contextPath}/ValidateCode?"+Math.random();
        }
    </script>
    <script src="${pageContext.request.contextPath}/js/client/updatePwd.js"></script>

</head>
<body>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/new_top.jsp" />
<%-----------------------------------------------------------------%>

    <div id="personCenter-body">
        <div class="person-title">
            <div class="logo-img">
                <a href="${pageContext.request.contextPath}/index">
                    <img src="${pageContext.request.contextPath}/img/page/logo.png" />
                </a>
            </div>
            <span>个人中心首页</span>
        </div>

        <div class="person-body">
            <div class="person-left-title">
                <a href="${pageContext.request.contextPath}/clientUI/personCenter">个人中心首页&nbsp;&nbsp;>&nbsp;&nbsp;</a>
                <a href="${pageContext.request.contextPath}/clientUI/updatePwd">&nbsp;修改密码&nbsp;&nbsp;>&nbsp;&nbsp;</a>
                <span>修改密码</span>
            </div>

            <%--------------------------------------------------------------------%>
            <jsp:include page="${pageContext.request.contextPath}/WEB-INF/client/person_nav.jsp" />
            <%--------------------------------------------------------------------%>

            <div id="left" class="person-left">
                <div class="personInfo-title">
                    <span>修改密码</span>
                </div>
                <form action="${pageContext.request.contextPath}/updatePwd/clientUpdatePwd" method="post">
                    <span>手机号码&nbsp;:</span>
                    <label id="clientTelephone">${client.clientTelephone}</label>
                    <div>
                        <span>验&nbsp;&nbsp;证&nbsp;码&nbsp;:</span>
                        <input id="validateCode" name="validateCode" class="info" type="text" />
                        <img class="code-img" id="validateCodeImg" src="${pageContext.request.contextPath}/ValidateCode" onclick="changeImg()" />
                        <a href="javascript:void(0)" onclick="changeImg()">换一张</a>
                        <i id="error-tip1">${validateCodeError}</i>
                    </div>
                    <div>
                        <span>短&nbsp;&nbsp;信&nbsp;码&nbsp;:</span>
                        <input name="verificationCode" id="verificationCode" class="info" type="text" />
                        <input id="sendCodeButton" type="button" class="send-button" value="发送验证码" onclick="sendValidateCodeSMS()"/>
                        <i id="error-tip2">${verificationCodeError}</i>
                    </div>
                    <div>
                        <span>旧&nbsp;&nbsp;密&nbsp;码&nbsp;:</span>
                        <input id="oldPassword" name="oldPassword" class="info" type="password" onblur="checkOldPassword()"/>
                        <i id="error-tip3">${oldPasswordError}</i>
                    </div>
                    <div>
                        <span>新&nbsp;&nbsp;密&nbsp;码&nbsp;:</span>
                        <input id="newPassword" name="newPassword" type="password" onblur="checkNewPassword()" class="info" />
                        <i id="error-tip4"></i>
                    </div>
                    <div>
                        <span>确认密码&nbsp;:</span>
                        <input id="rePassword" name="rePassword" type=password class="info" onblur="checkRePassword()"/>
                        <i id="error-tip5"></i>
                    </div>

                    <button id="updateButton" type="submit" class="btn btn-primary" onclick="checkUpdatePwd()">提交</button>

                </form>
            </div>

        </div>
    </div>

<%-----------------------------------------------------------------%>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/footer.jsp" />
</body>
</html>
