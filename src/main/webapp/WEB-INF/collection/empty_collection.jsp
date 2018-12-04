<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/11/1
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>后台管理中心-袖装网</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/collection/empty_company.css">
    <script src="${pageContext.request.contextPath}/js/collection/collection.js"></script>
</head>
<body>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/new_top.jsp" />
<%------------------------------------------------%>

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
                <a href="">个人中心首页&nbsp;&nbsp;>&nbsp;&nbsp;</a>
                <span>装修公司收藏</span>
            </div>

            <jsp:include page="${pageContext.request.contextPath}/WEB-INF/client/person_nav.jsp" />

            <div id="left" class="person-left">
                <div class="personInfo-title">
                    <span>装修公司收藏</span>
                </div>
                <div class="unImages">
                    <img src="${pageContext.request.contextPath}/img/unCompanyCollection.png" />
                </div>
                <h2>您还没有收藏任何装修公司</h2>
            </div>

        </div>
    </div>

<%------------------------------------------------%>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/footer.jsp" />
</body>
</html>
