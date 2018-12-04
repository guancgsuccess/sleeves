<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/10/22
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
    <title>装修攻略知识-袖装网</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/raiders/raiders.css">
    <script src="${pageContext.request.contextPath}/js/raiders/raidersAll.js"></script>
</head>
<body>

<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/new_top.jsp" />
<%-------------------------------------------------%>
    <div id="raiders-body">

        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/nav.jsp" />
        <%---------------------------------------------------------%>

        <div id="demo" class="carousel slide" data-ride="carousel">
            <!-- 指示符 -->
            <ul class="carousel-indicators">
                <li data-target="#demo" data-slide-to="0" class="active"></li>
                <li data-target="#demo" data-slide-to="1"></li>
                <li data-target="#demo" data-slide-to="2"></li>
            </ul>

            <!-- 轮播图片 -->
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="${pageContext.request.contextPath}/img/page/raidersDetail1.jpg">
                </div>
                <div class="carousel-item">
                    <img src="${pageContext.request.contextPath}/img/page/raidersDetail.jpg">
                </div>
                <div class="carousel-item">
                    <img src="${pageContext.request.contextPath}/img/page1.jpg">
                </div>
            </div>

            <!-- 左右切换按钮 -->
            <a class="carousel-control-prev" href="#demo" data-slide="prev">
                <span class="carousel-control-prev-icon"></span>
            </a>
            <a class="carousel-control-next" href="#demo" data-slide="next">
                <span class="carousel-control-next-icon"></span>
            </a>
        </div>


        <div id="major-body">
            <div class="left">
                <div class="raiders-article">装修攻略热门排行榜</div>
                <div class="article-li">
                    <ol id="raiders-article">

                    </ol>
                </div>

                <div class="advertise">
                    <a href="http://www.zx123.cn/zb/">
                        <img src="${pageContext.request.contextPath}/img/page/advertise.jpg" />
                    </a>
                </div>
            </div>


            <div class="right">

                <div class="raiders-category">
                    <span>装修攻略</span>
                </div>

                <div class="raiders-right">
                    <ul id="raiders-info">

                    </ul>
                </div>

                <%------------分页-----------------%>
                <div id="split-page" class="page-split">

                </div>
            </div>
        </div>
    </div>

<%-------------------------------------------------%>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/footer.jsp" />

</body>
</html>
