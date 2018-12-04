<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/11/3
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>后台管理中心-袖装网</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/receive_address/exist_address.css">
</head>
<body onload="selectAddress()">
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/new_top.jsp" />
<%---------------------------------------------------------------------%>
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
            </div>
            <ul class="title-ul">
                <li>收货人</li>
                <li>所在地区</li>
                <li>详细地址</li>
                <li>手机号码</li>
                <li>操作</li>
            </ul>

                <ul class="other-ul" id="ul-other">

                </ul>

        </div>
    </div>
</div>


<%---------------------------------------------------------------------%>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/footer.jsp" />


<script>

    var xhr = null;
    function selectAddress() {
        var clientId = document.getElementById("clientId").value;

        if (window.XMLHttpRequest){
            xhr = new XMLHttpRequest();
        }else {
            xhr = new ActiveXObject('Microsoft.XMLHTTP')
        }

        var url = "/receiveAddress/clientIsAddress?clientId="+clientId;
        xhr.open("GET",url,true);
        xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
        xhr.onreadystatechange = displayAddress;
        xhr.send();
    }

    function displayAddress() {
        if(xhr.readyState==4 && xhr.status==200){
            console.log("返回的JSON数据为： " + xhr.responseText)
            var result = JSON.parse(xhr.responseText);

            var ul = document.getElementById("ul-other");
            ul.innerHTML = " ";
            for (var i = 0; i < result.length; i++) {

                ul.innerHTML += `

                    <input style="display: none;" id="addressId" value="\${result[i].addressId}">
                    <li>\${result[i].clientName}</li>
                    <li>\${result[i].addressName}</li>
                    <li>\${result[i].addressDetail}</li>
                    <li>\${result[i].clientTelephone}</li>
                    <li>
                        <a href="/receiveAddress/getAddressByAddressId?addressId=\${result[i].addressId}">修改</a>
                        <a href="/receiveAddress/deleteAddress?addressId=\${result[i].addressId}">删除</a>
                    </li>
            `
            }
        }
    }

</script>
</body>
</html>
