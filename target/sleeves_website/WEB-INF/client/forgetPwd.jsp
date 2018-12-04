<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/10/12
  Time: 23:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>忘记密码页面</title>
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/client/forgetPwd.css">
    <script>
        function changeImg() {
            document.getElementById("validateCodeImg").src="${pageContext.request.contextPath}/ValidateCode?"+Math.random();
        }
    </script>
    <script src="${pageContext.request.contextPath}/js/client/forgetPwd.js"></script>
</head>
<body>

<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/new_top.jsp" />
<%--------------------------------------------------------------------------%>

    <div id="forgetPwd-body">

        <div id="header-body">
            <div class="logo">
                <a href="${pageContext.request.contextPath}/index">
                    <img src="${pageContext.request.contextPath}/img/page/logo.png" style="width: 240px; height: 80px;"/>
                </a>
            </div>
            <span class="title">密码重置</span>
        </div>

        <div class="modifiy-body">
            <div class="modifiy-step">
                <ul>
                    <li>
                        <em class="first_step">1</em>
                        <b></b>
                        <span>确认账号</span>
                    </li>
                    <li>
                        <em id="second_step">2</em>
                        <b></b>
                        <span>安全验证</span>
                    </li>
                    <li>
                        <em id="third_step">3</em>
                        <b></b>
                        <span>重置密码</span>
                    </li>
                    <li id="finally_step" class="lastLi">
                        <em id="four_step">4</em>
                        <span>完成</span>
                    </li>
                </ul>
            </div>

            <div class="major_body">

                <%--====忘记密码第一部分=======--%>
                <div id="sure-account" class="sure-account">
                    <form class="account-info">
                        <ul>
                            <li>
                                <label>账号</label>
                                <input name="clientTelephone" id="clientTelephone" type="text" placeholder="请输入您的手机号" />
                                <em id="errorMessage1"></em>
                            </li>
                            <li class="surePwd">
                                <label>验证码</label>
                                <input name="validateCode" id="validateCode" type="text" placeholder="请输入验证码" />
                                <img id="validateCodeImg" src="${pageContext.request.contextPath}/ValidateCode" onclick="changeImg()">
                                <span><a href="javascript:void(0)" onclick="changeImg()">换一张</a></span>
                                <em id="errorMessage2"></em>
                            </li>
                        </ul>
                        <input onclick="firstStepButton()" type="button" value="下一步" class="next-button"/>
                    </form>
                </div>

                <%--====忘记密码第二部分=======--%>
                <div id="code_body" class="code_body">
                    <div class="codeTitle">
                        <label>点击获取验证码,我们会将验证短信发送到您的手机&nbsp;
                            <span id="phone" type="text"><b>${client1.clientTelephone}</b>,请在下方输入完成验证！</span>
                        </label>
                    </div>
                    <div class="codeInfo">
                        <span>短信验证码</span>
                        <input id="verificationCode" class="codeInput" type="text" placeholder="请输入验证码" />
                        <input id="getForgetPwdButton" type="button" onclick="getForgetPwdCode()" value="获取验证码">
                        <label id="forgetPwdError"></label>
                    </div>
                    <input onclick="secondStepButton()" class="twoNextStep" type="button" value="下一步" />
                </div>

                <%--====忘记密码第三部分=======--%>
                <div id="rePwd_body" class="rePwd_body">
                    <div class="forgetPwd_title">验证成功，请重新设定您的密码</div>
                          <div class="password_info">
                              <label>新密码</label>
                              <input name="clientPassword" id="forgetPwd" type="password" onblur="checkForgetPwd()"/>
                              <span id="forgetPwdError1"></span>
                          </div>
                          <div class="rePassword_info">
                              <label>确认新密码</label>
                              <input name="clientRePassword" id="forgetRePwd" type="password" onblur="checkForgetRePwd()"/>
                              <span id="forgetPwdError2"></span>
                          </div>
                          <input onclick="thirdStepButton()" class="third_button" type="submit" value="下一步" />
                </div>

                <%--====忘记密码第四部分=======--%>
                <div id="success_body" class="reset_content_email">
                     <dl>
                          <dt class="reset_success"></dt>
                         <dd>
                             <h1>新密码设置成功！</h1>
                         </dd>
                     </dl>
                </div>

            </div>
        </div>
    </div>

<%--------------------------------------------------------------------------%>
    <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/footer.jsp" />
</body>
</html>
