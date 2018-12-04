<%--
  Created by IntelliJ IDEA.
  User: 翟博文
  Date: 2018/10/29
  Time: 8:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="utf-8" />
    <title>袖装家居效果图</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/rendering/renderingDetail.css" />
    <script src="${pageContext.request.contextPath}/js/rendering/renderingDetail.js"></script>
</head>
<body>

<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/new_top.jsp" />
    <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/nav.jsp" />
<%-------------------------------------------------------------------------------------%>
    <div id="renderingDetail-body">
        <div class="rendering-title">
            <a href="${pageContext.request.contextPath}/WEB-INF/rendering/renderingAll.jsp">装修效果图</a>
            <span>>热门混搭客厅装饰图片大全</span>
        </div>

        <div class="left">
            <div id="bigImg">
                <img id="bi" src="${renderingImgList[0].renderingImagesPath}">
                <img class="aa" src="${pageContext.request.contextPath}/img/aa.png" />
                <a href="#">收藏</a>
            </div>

            <div id="smallImg">
                <ul>

                    <c:forEach var="entry" items="${renderingImgList}">
                        <li><img class="viewSmallImg" src="${entry.renderingImagesPath}" onmouseover="imgOver(this)" onmouseout="imgOut(this)"></li>
                    </c:forEach>
                </ul>
            </div>
        </div>

        <div class="right">
            <div class="company-title">擅长该风格的公司</div>


            <c:forEach var="entry" items="${companyList}">

                <div class="company-info">
                    <img src="/${entry.companyPassword}" />
                    <span class="content2">${entry.companyLocation}</span>
                    <span class="content3">案例：5</span>
                    <span class="content1">${entry.companyName}</span>
                    <a href="${pageContext.request.contextPath}/company/companyDetail?companyId=${entry.companyId}">
                        <button class="company">看TA</button>
                    </a>
                </div>
            </c:forEach>
        </div>
    </div>
<%-------------------------------------------------------------------------------------%>
    <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/footer.jsp" />
</body>
</html>