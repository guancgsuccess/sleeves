<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/11/6
  Time: 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单支付-袖装</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/order/simpleAlert.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/order/order_pay.css">
</head>
<body>
    <div id="main">
        <div id="header">
            <div class="order">确认订单</div>
        </div>

        <div id="content">
            <div class="comment"><b>提交订单成功,请确定订单信息</b></div>

            <div class="form">
                <div class="phone">手机号:&nbsp;${design.field2}</div>
                <div class="money">付款金额:&nbsp;￥${design.designPrice}</div>
            </div>

        </div>

        <hr>

        <div id="footer">
        <a href="${pageContext.request.contextPath}/index" onclick="nextBackIndex()" class="index">返回首页</a>

        <div class="fastener ">
            <a href="javascript:void(0);" onclick="nextOrderSure()" class="sure">确认订单</a>
        </div>
    </div>

        <input style="display: none;" id="clientId" value="${client.clientId}">
        <input style="display: none;" id="designId" value="${design.designId}">

    </div>

<script>
    var xhr = null;
    function nextOrderSure() {
        let clientId = document.getElementById("clientId").value;
        console.log("客户id为:" +clientId)
        let designId = document.getElementById("designId").value;
        console.log("方案id为:" +designId);
        var dblChoseAlert = simpleAlert({
            "title": "袖装友情提示",
            "content": "你已支付成功!",
            "buttons": {
                "确定": function () {
                    if (window.XMLHttpRequest) {
                        xhr = new XMLHttpRequest();
                    } else {
                        xhr = new ActiveXObject('Microsoft.XMLHTTP')
                    }

                    var url = "/order/rePay?clientId=" + clientId + "&designId=" + designId;
                    xhr.open("GET", url, true);
                    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
                    xhr.onreadystatechange = processCancelPay;
                    xhr.send();
                },
            }
        });


    }


    function processCancelPay() {
        if(xhr.readyState==4 && xhr.status==200){
            var result = JSON.parse(xhr.responseText);
            if(result==1){
                window.location.href="/index"
            }
        }
    }

    function nextBackIndex() {
        window.location.href="/index"
    }
</script>
    <script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
    <script src="${pageContext.request.contextPath}/js/order/simpleAlert.js"></script>
</body>
</html>
