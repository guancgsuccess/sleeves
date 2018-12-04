<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/11/1
  Time: 19:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>后台管理中心-袖装网</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/order/simpleAlert.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/collection/exist_collection.css">
</head>
<body>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/new_top.jsp" />

<%---------------------------------------------------%>
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
            <span>装修公司收藏</span>
        </div>


        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/client/person_nav.jsp" />

        <div id="left" class="person-left">
            <div class="personInfo-title">
                <span>装修公司收藏</span>
            </div>
            <c:forEach var="company" items="${companyList}">
                <div class="company-info">
                    <a href="${pageContext.request.contextPath}/company/companyDetail?companyId=${company.companyId}">
                        <img src="${pageContext.request.contextPath}/${company.companyPassword}" />
                    </a>
                    <a href="${pageContext.request.contextPath}/company/companyDetail?companyId=${company.companyId}" style="color: black;">
                        <h3>${company.companyName}</h3>
                    </a>
                    <a href="javascript:void(0);" onclick="click2Delete()" class="delete">
                        删除
                    </a>
                </div>
                <input style="display: none;" value="${company.companyId}" id="companyId">
            </c:forEach>
        </div>
    </div>
</div>
<%---------------------------------------------------%>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/footer.jsp" />

<script>
    function click2Delete() {

        var dblChoseAlert = simpleAlert({
            "title":"袖装友情提示",
            "content":"确定删除!",
            "buttons":{
                "确定":function () {
                    if (window.XMLHttpRequest) {
                        xhr = new XMLHttpRequest();
                    } else {
                        xhr = new ActiveXObject('Microsoft.XMLHTTP')
                    }

                    var clientId = document.getElementById("clientId").value;
                    var companyId = document.getElementById("companyId").value;

                    var url = "/collection/deleteCollection?clientId=" + clientId + "&companyId=" + companyId;
                    xhr.open("GET", url, true);
                    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
                    xhr.onreadystatechange = processDeleteCollection;
                    xhr.send();
                    dblChoseAlert.close();
                },
                "取消":function () {
                    dblChoseAlert.close();
                }
            }
        });

    }

    function processDeleteCollection() {
        if(xhr.readyState==4 && xhr.status==200){
            var result = JSON.parse(xhr.responseText);
            console.log(result)
            if(result==1){
                window.location.href="/emptyCollection";
            }else{
                window.location.href="/existCollection";
            }
        }
    }
</script>

<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
<script src="${pageContext.request.contextPath}/js/order/simpleAlert.js"></script>
</body>
</html>
