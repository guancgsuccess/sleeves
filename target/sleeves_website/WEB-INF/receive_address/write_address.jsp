<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/11/3
  Time: 23:56
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

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/receive_address/update_address.css">
</head>
<body>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/new_top.jsp" />
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/nav.jsp" />
<%-------------------------------------------------------------%>
<script language="JavaScript" src="${pageContext.request.contextPath}/js"></script>
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
                <span>添加新收货人</span>
            </div>
            <div class="first-info">
                <span>所在地区</span>
                <label>江苏省</label>
                <label>苏州市</label>
                <select id="select_id">
                    <option>虎丘区</option>
                    <option>平江区</option>
                    <option>吴中区</option>
                    <option>吴江区</option>
                    <option>高新区</option>
                    <option>沧浪区</option>
                    <option>工业园区</option>
                </select>
            </div>
            <div class="first-info">
                <span>详细地址</span>
                <input id="address-detail" class="address_info" type="text" placeholder="建议您如实填写详细收货地址，如街道名称、门牌号码、楼层和房间号等信息"/>
            </div>
            <div class="first-info">
                <span>收件人姓名</span>
                <input id="receive-name"  type="text" class="other-input" style="font-size: 13px;" />
            </div>
            <div class="first-info">
                <span>手机号码</span>
                <input id="telephone"  type="text" class="other-input" style="font-size: 13px;" />
            </div>

            <button type="submit" class="btn btn-primary" onclick="saveWriteAddress()">保存</button>
        </div>
    </div>
</div>
<%-------------------------------------------------------------%>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/footer.jsp" />


<script>
    var xhr = null;
    function saveWriteAddress() {
        var sel = document.getElementById("select_id");
        var addressName = sel.options[sel.selectedIndex].value;
        console.log("地区为："+addressName)
        var addressDetail = document.getElementById("address-detail").value;
        console.log("详细地址: " + addressDetail)
        var receiveName = document.getElementById("receive-name").value;
        console.log("收件人姓名: " + receiveName);
        var telephone = document.getElementById("telephone").value;
        console.log("手机号码 : " + telephone);
        var clientId = document.getElementById("clientId").value;
        console.log("用户Id = " + clientId);

        if (window.XMLHttpRequest){
            xhr = new XMLHttpRequest();
        }else {
            xhr = new ActiveXObject('Microsoft.XMLHTTP')
        }

        var url = "/receiveAddress/saveNewAddress?addressName="+addressName+"&addressDetail="+addressDetail+"&clientName="+receiveName+"&clientTelephone="+telephone+"&clientId="+clientId+"&defaultAddress=0"+"&fields1=1";
        var newUrl = encodeURI(encodeURI(url));
        xhr.open("GET",url,true);
        xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
        xhr.onreadystatechange = updateReceiveAddress;
        xhr.send();
    }

    function updateReceiveAddress() {
        if(xhr.readyState==4 && xhr.status==200){

            console.log("修改地址的结果:" +xhr.responseText);
            var result = JSON.parse(xhr.responseText);

            if(result===1){
                var clientId = document.getElementById("clientId").value;
                console.log("address clientId:" +clientId)

                if (window.XMLHttpRequest){
                    xhr = new XMLHttpRequest();
                }else {
                    xhr = new ActiveXObject('Microsoft.XMLHTTP')
                }
                var url = "/receiveAddress/clientIsAddress?clientId="+clientId;
                xhr.open("GET",url,true);
                xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
                xhr.onreadystatechange = isHaveAddress;
                xhr.send();
            }else {
                window.location.href="/emptyAddress";
            }
        }
    }

    function isHaveAddress() {
        window.location.href="/existAddress";
    }
</script>
</body>
</html>
