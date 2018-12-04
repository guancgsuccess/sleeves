<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/11/2
  Time: 0:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>确认订单-袖装网</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/order/sure_order.css">
    <script src="${pageContext.request.contextPath}/js/order/sure_order.js"></script>
</head>
<body>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/new_top.jsp" />
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/nav.jsp" />
<%---------------------------------------------------------%>

    <div id="order-body">

        <div class="address">
            <div class="client-info">
                <span>收获人&nbsp;:&nbsp;&nbsp;&nbsp;${receiveAddress.clientName}</span>
                <i>${receiveAddress.clientTelephone}</i>
            </div>
            <div class="address-detail">
                        <span>
                            收货地址&nbsp;:&nbsp;&nbsp;&nbsp;
                            <b>${receiveAddress.addressDetail}</b>
                        </span>
                <p>(收货不便时,可选择免费代收货服务)</p>
            </div>
        </div>

        <div class="design-plan">
            <div class="company-info">
                <img src="${pageContext.request.contextPath}/${company.companyPassword}">
                <h3>${company.companyName}</h3>
            </div>
            <div class="design-info">
                <img src="${pageContext.request.contextPath}/${design.field1}" />
                <span>${design.designName}</span>
                <div class="designDetail">
                    <span>户型:&nbsp;&nbsp;${design.designHouseType}</span>
                    <span>风格:&nbsp;&nbsp;${design.designStyle}</span>
                    <span>面积:&nbsp;&nbsp;${design.designArea}㎡</span>

                </div>
                <label>￥&nbsp;${design.designPrice}</label>
            </div>
        </div>

        <div class="submit-order">
            <h4>合计金额&nbsp;:</h4>
            <span>￥&nbsp;${design.designPrice}</span>
            <button type="submit" onclick="submitOrder()">提交订单</button>
            <strong id="noAddressTip" style="color: red;font-size: 13px;"></strong>
        </div>
        <input style="display: none;" id="clientId" value="${client.clientId}">
        <input style="display: none;" id="addressId" value="${receiveAddress.addressId}">
        <input style="display: none;" id="designId" value="${design.designId}">
    </div>

<%---------------------------------------------------------%>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/footer.jsp" />
</body>
</html>
