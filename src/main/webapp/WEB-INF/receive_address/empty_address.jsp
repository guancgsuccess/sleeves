<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/11/3
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>后台管理中心-袖装网</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/receive_address/empty_address.css">
</head>
<body>

<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/new_top.jsp" />
<%-------------------------------------------------------%>
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
            <a href="${pageContext.request.contextPath}/orderUI/myOrder">我的订单管理&nbsp;&nbsp;>&nbsp;&nbsp;</a>
            <span>收获人管理</span>
        </div>


      <jsp:include page="${pageContext.request.contextPath}/WEB-INF/client/person_nav.jsp" />

        <div class="person-left">
            <div class="personInfo-title">
                <span>收货人管理</span>
                <a href="${pageContext.request.contextPath}/saveAddress">增加新地址</a>
            </div>
            <ul>
                <li>收货人</li>
                <li>所在地区</li>
                <li>详细地址</li>
                <li>手机号码</li>
                <li>操作</li>
            </ul>
        </div>
    </div>
</div>
<%-------------------------------------------------------%>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/footer.jsp" />
</body>
</html>
