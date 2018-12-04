<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/11/3
  Time: 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>后台管理中心-袖装网</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/order/my_order.css">
    <script src="${pageContext.request.contextPath}/js/order/my_order.js"></script>
</head>

<body>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/new_top.jsp" />
<%--------------------------------------------------------------------%>
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
            <span>我的订单</span>
        </div>


       <jsp:include page="${pageContext.request.contextPath}/WEB-INF/client/person_nav.jsp" />

        <div class="person-left">
            <div class="personInfo-title">
                <span>我的订单</span>
            </div>
            <div class="order-status">
                <ul>
                    <li id="status1"><a href="javascript:void(0);" onclick="selectThisOne()">全部</a></li>
                    <li id="status2"><a href="javascript:void(0);" onclick="selectThiTwo()">未支付</a></li>
                    <li id="status3"><a href="javascript:void(0);" onclick="selectThisThree()">已支付</a></li>
                </ul>
            </div>

            <div id="all-info" class="all-info">

            </div>


        </div>
        <input style="display: none;" id="clientId" value="${client.clientId}">

    </div>
</div>
<%-----------------------------------------------------------------------------------%>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/footer.jsp" />

</body>
</html>
