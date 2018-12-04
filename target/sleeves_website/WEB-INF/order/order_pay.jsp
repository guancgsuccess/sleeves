<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/11/4
  Time: 13:47
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
        <a href="${pageContext.request.contextPath}/index" class="index" onclick="backIndex()">返回首页</a>

        <div class="fastener ">
            <a href="javascript:void(0);" onclick="cancelOrder()" class="cancel">取消支付</a>
            <a href="javascript:void(0);" onclick="getSureOrder()" class="sure">确认支付</a>
        </div>
    </div>

        <input style="display: none;" id="clientId" value="${client.clientId}">
        <input style="display: none;" id="designId" value="${design.designId}">

    </div>


    <script>
    var xhr = null;
    let clientId = document.getElementById("clientId").value;
    console.log("客户id为:" +clientId)
    let designId = document.getElementById("designId").value;
    console.log("方案id为:" +designId);

    function cancelOrder() {
        //单次双选弹框
        var dblChoseAlert = simpleAlert({
            "title": "袖装友情提示",
            "content": "是否取消",
            "buttons": {
                "确定": function () {
                    if (window.XMLHttpRequest) {
                        xhr = new XMLHttpRequest();
                    } else {
                        xhr = new ActiveXObject('Microsoft.XMLHTTP')
                    }

                    var url = "/order/get2CancelOrder?clientId=" + clientId + "&designId=" + designId;
                    xhr.open("GET", url, true);
                    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
                    xhr.onreadystatechange = cancelOrderResult;
                    xhr.send();
                    dblChoseAlert.close();
                },
                "取消": function () {
                    dblChoseAlert.close();
                }
            }
        })

    }

        function cancelOrderResult() {
        if(xhr.readyState==4 && xhr.status==200) {

            var result = JSON.parse(xhr.responseText);
            if (result === 1) {
                console.log("8888888888888888888888888888")
                window.location.href = "/sureOrder";
            }
        }
    }

    function getSureOrder() {
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

                    var url = "/order/submitDesignOrder?clientId=" + clientId + "&designId=" + designId;
                    xhr.open("GET", url, true);
                    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
                    xhr.send();
                    xhr.onreadystatechange = sureOrderResult;
                    dblChoseAlert.close();
                },
            }
        });
    }

        function sureOrderResult() {
        if(xhr.readyState==4 && xhr.status==200) {

            var result = JSON.parse(xhr.responseText);
            if(result===1){
                window.location.href="/index"
            }else{
                window.location.href="/sureOrder"
            }
        }
    }

    function backIndex() {
        window.location.href="/index"
    }
</script>

    <script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
    <script src="${pageContext.request.contextPath}/js/order/simpleAlert.js"></script>
</body>
</html>
