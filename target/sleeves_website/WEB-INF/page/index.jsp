<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/10/12
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>袖装网</title>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index.css">

</head>
<body>

        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/top.jsp" />

<%--*******************************************************************--%>
        <div id="page-body">

            <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/nav.jsp"/>


            <div id="major-body">
            <%-------------------轮播图----------------------------%>

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
                            <img src="${pageContext.request.contextPath}/img/page/carouselImg2.jpg">
                        </div>
                        <div class="carousel-item">
                            <img src="${pageContext.request.contextPath}/img/page/carousel1Img.jpg">
                        </div>
                        <div class="carousel-item">
                            <img src="${pageContext.request.contextPath}/img/page/carouselImg.jpg">
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

            <%----------------------------------------------------%>
                <div class="select1">
                    <div class="select-title">————&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;找装修&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;————</div>
                    <ul id="company-info">

                    </ul>
                </div>

                <div class="select2">
                    <div class="select-title">————&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;看攻略&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;————</div>
                    <ul id="raiders-info">

                    </ul>
                </div>

                <div class="select3">
                    <div class="select-title">————&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;看设计&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;————</div>

                    <div class="first-images">
                        <img class="img1" src="${pageContext.request.contextPath}/img/page/pageDes1.jpg" />
                        <img class="img2" src="${pageContext.request.contextPath}/img/page/pageDes2.jpg" />
                    </div>
                    <div class="second-images">
                        <img class="img3" src="${pageContext.request.contextPath}/img/page/pageDes3.jpg" />
                        <img class="img4" src="${pageContext.request.contextPath}/img/page/pageDes4.jpg" />
                    </div>
                    <div class="third-images">
                        <img class="img5" src="${pageContext.request.contextPath}/img/page/pageDes5.jpg" />
                        <img class="img6" src="${pageContext.request.contextPath}/img/page/pageDes6.jpg" />
                    </div>
                </div>
            </div>
        </div>

        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/footer.jsp" />

        <script src="${pageContext.request.contextPath}/js/client/index.js"></script>
</body>
</html>
