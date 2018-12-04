
<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/10/24
  Time: 21:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>方案详情-袖装网</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/designer/design.css">
    <script src="${pageContext.request.contextPath}/js/design/designDetail.js"></script>
</head>
<body>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/new_top.jsp" />

    <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/nav.jsp"/>
    <%-----------------------------------------%>

    <div id="designDetail-body">
        <div class="detail-title">
            <a href="${pageContext.request.contextPath}/company/companyDetail?companyId=${company.companyId}" style="color: black;">
                ${company.companyName}
            </a>
            &nbsp;&nbsp;><span>&nbsp;&nbsp;${design.designName}</span>
        </div>

        <div class="major-body">
            <span>${design.designName}</span>
            <img src="${pageContext.request.contextPath}/${designer.designerImgPath}" />
            <div class="designer-name">
                <img src="${pageContext.request.contextPath}/img/designerLogo.png" />
                <label>${designer.designerName}</label>
            </div>

            <div class="house-info">
                <img src="${pageContext.request.contextPath}/img/house.png" />
                <div class="houseInfo">
                    <ul>
                        <li>户型：${design.designHouseType}</li>
                        <li>风格：${design.designStyle}</li>
                        <li>面积：${design.designArea}㎡</li>
                        <li>造价：${design.designPrice}万元</li>
                        <li>装修工期：${design.designDuration}天</li>
                    </ul>
                </div>
            </div>

            <div class="image-info">
                <span>图片信息</span>
                <c:forEach var="entry" items="${renderingImgList}">
                    <div class="images">
                        <img class="house-img" src="${pageContext.request.contextPath}${entry.renderingImagesPath}" />
                    </div>
                </c:forEach>
            </div>
        </div>

        <div class="right">
            <div class="company-profile">
                <div class="profile">
                    <a href="${pageContext.request.contextPath}/company/companyDetail?companyId=${company.companyId}">
                        <img src="${pageContext.request.contextPath}/${company.companyPassword}">
                    </a>
                </div>
                <span>
                    <a href="${pageContext.request.contextPath}/company/companyDetail?companyId=${company.companyId}">
                        ${company.companyName}
                    </a>
                </span>
            </div>
            <button class="sure-order" type="button" onclick="sureOrder()">确认下单</button>
            <a href="${pageContext.request.contextPath}/company/companyDetail?companyId=${company.companyId}">
                <button class="page-button" type="button">公司主页</button>
            </a>
        </div>
<%---------------------------- 隐藏域 -----------------------------------------------%>
        <input id="clientId" style="display: none;" value="${client.clientId}">
        <input id="companyId" style="display: none;" value="${company.companyId}">
        <input id="designId" style="display: none;" value="${design.designId}">
    </div>


    <%-----------------------------------------%>
    <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/footer.jsp" />
</body>
</html>
