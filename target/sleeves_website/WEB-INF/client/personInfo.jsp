<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/11/1
  Time: 16:28
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

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/client/personInfo.css">
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
                <a href="${pageContext.request.contextPath}/clientUI/personInfo">&nbsp;我的个人资料&nbsp;&nbsp;>&nbsp;&nbsp;</a>
                <span>我的个人资料</span>
            </div>

            <jsp:include page="${pageContext.request.contextPath}/WEB-INF/client/person_nav.jsp" />

            <div id="left" class="person-left">
                <div class="personInfo-title">
                    <span>我的个人资料</span>
                </div>
                <form action="${pageContext.request.contextPath}/clientInfo/clientUpdate" method="post">
                    <span>用&nbsp;&nbsp;户&nbsp;&nbsp;名&nbsp;:</span>
                    <label>${client.clientName}</label>
                    <div>
                        <span>昵&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;称&nbsp;:</span>
                        <input name="clientField1" id="clientField1" class="info" type="text" value="${client.clientField1}" />
                    </div>
                    <div>
                        <span>性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别&nbsp;:</span>
                        <input name="clientGender" checked="checked" type="radio"  value="1" />&nbsp;&nbsp;男
                        <input name="clientGender" type="radio"  value="0" />&nbsp;&nbsp;女
                    </div>
                    <div>
                        <span>年&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;龄&nbsp;:</span>
                        <input name="clientAge" id="clientAge" class="info" type="text" value="${client.clientAge}" />
                    </div>
                    <div>
                        <span>邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱&nbsp;:</span>
                        <input name="clientEmail" id="clientEmail" class="info" type="text" value="${client.clientEmail}" />
                    </div>
                    <div>
                        <span>地&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;址&nbsp;:</span>
                        <input name="clientAddress" id="clientAddress" class="info" type="text" value="${client.clientAddress}" />
                        <label id="errorInfo"></label>
                    </div>

                    <button type="submit" id="submit-button" class="btn btn-primary">提交</button>
                </form>
            </div>


        </div>
    </div>

<%-----------------------------------------------------------------%>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/footer.jsp" />


</body>
</html>
