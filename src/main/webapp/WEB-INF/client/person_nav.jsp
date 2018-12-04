<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/11/2
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人中心的导航</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/client/person_nav.css">
    <script src="${pageContext.request.contextPath}/js/collection/collection.js"></script>
</head>
<body>

<div class="person-right">
    <div class="client-profile">
        <img id="headImageBig" src="${client.clientProfile}" />
        <span>${client.clientName}</span>
    </div>

    <div class="nav-body">
        <div class="personCenter">
            <a href="${pageContext.request.contextPath}/clientUI/personCenter">个人中心首页</a>
        </div>
        <ul>
            <li class="first-title">我的个人资料</li>
            <li>
                <a href="${pageContext.request.contextPath}/clientUI/personInfo">个人资料</a>
            </li>
            <li>
                <a href="${pageContext.request.contextPath}/clientUI/updatePwd">修改密码</a>
            </li>

            <li class="first-title">我的收藏管理</li>
            <li>
                <a href="javascript:void(0);" onclick="click2CompanyCollection()">装修公司</a>
            </li>
            <li>
                <a href="javascript:void(0);" >效果图</a>
            </li>

            <li class="first-title">我的订单管理</li>
            <li>
                <a href="javascript:void(0);" onclick="click2ReceiveAddress()">收件人管理</a>
            </li>
            <li>
                <a href="${pageContext.request.contextPath}/orderUI/myOrder">我的订单</a>
            </li>
        </ul>
        <input style="display: none;" id="clientId" value="${client.clientId}">
    </div>
</div>

<script>
    var xhr = null;

    function click2ReceiveAddress() {
        var clientId = document.getElementById("clientId").value;
        console.log("address clientId:" +clientId)

        if (window.XMLHttpRequest){
            xhr = new XMLHttpRequest();
        }else {
            xhr = new ActiveXObject('Microsoft.XMLHTTP')
        }
        var url = "/receiveAddress/countClientIsAddress?clientId="+clientId;
        xhr.open("GET",url,true);
        xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
        xhr.onreadystatechange = isHaveAddress;
        xhr.send();
    }

    function isHaveAddress() {
        if (xhr.readyState == 4 && xhr.status == 200) {
            var result = JSON.parse(xhr.responseText);
            console.log("地址数量" + result)
            if (result > 0) {
                window.location.href = "/existAddress";
            } else {
                window.location.href = "/emptyAddress";
            }
        }
    }



</script>

</body>
</html>
