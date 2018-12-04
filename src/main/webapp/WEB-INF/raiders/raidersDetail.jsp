<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/10/23
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>

<html>
<head>
    <title>装修攻略知识详情-袖装网</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/raiders/raidersDetail.css" />
    <script src="${pageContext.request.contextPath}/js/raiders/raidersDetail.js"></script>
</head>
<body>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/new_top.jsp" />
<%-------------------------------------------------%>

    <div id="raidersDetail-body">
        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/nav.jsp" />
        <%-------------------------------------------------------------%>

        <div class="major-body">
            <div class="raiders-location">
                <span>
                    当前位置:&nbsp;&nbsp;&nbsp;装修攻略&nbsp;&nbsp;>&nbsp;&nbsp;${raiders1.raidersTitle}
                </span>
            </div>
            <img src="${pageContext.request.contextPath}/img/page/raidersDetail.jpg" />
            <div class="left">
                <div class="article-title">
                    ${raiders1.raidersTitle}
                </div>
                <div class="article-add-time">

                    <span>发布时间:&nbsp;&nbsp;&nbsp;
                        <fmt:formatDate value='${raiders1.raidersDate}' pattern='yyyy-MM-dd'/>
                    </span>
                </div>

                <div class="article-body">
                    <div class="article-img">
                        <img src="${pageContext.request.contextPath}/${raiders1.raidersImgPath}" />
                    </div>
                    <div class="first-content">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        ${raiders1.raidersContent1}
                    </div>
                    <div class="first-content">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        ${raiders1.raidersContent2}
                    </div>
                    <div class="first-content">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        ${raiders1.raidersContent3}
                    </div>
                    <div class="first-content">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        ${raiders1.raidersContent4}
                    </div>
                </div>

                <button class="praise" onclick="checkPraise()">
                    <img src="${pageContext.request.contextPath}/img/praise.jpg" >
                    <span>点赞</span>
                    <strong id="praise-number">${raiders1.raidersPraise}</strong>
                </button>

                <button class="collection" onclick="checkCollection()">
                    <img src="${pageContext.request.contextPath}/img/collection.jpg" >
                    <span>收藏</span>
                    <strong id="collection-number">${raiders1.collectNumber}</strong>
                </button>

            </div>
            <div class="right">
                <%--<a href="http://91.jiaju.sina.com.cn/bj/">
                    <img src="${pageContext.request.contextPath}/img/adver2.jpg" style="width: 100px; height: 150px;">
                </a>
                <a href="http://news.7gz.com/zt/bjllb/index.shtml?utm_source=sina&utm_medium=snjj&&utm_campaign=jjdd20161228">
                    <img src="${pageContext.request.contextPath}/img/adver3.jpg" style="width: 100px; height: 150px;">
                </a>

                <a href="http://anli.jiaju.sina.com.cn/?wt_campaign=M_568C69EA4E91E&wt_source=PDPS_5642B044546B28&wt_campaign=M_56931EBA8C529&wt_source=PDPS_5642B484A7B211&mz_ca=2039737&mz_sp=75ZT3&mz_sb=1">
                    <img src="${pageContext.request.contextPath}/img/adver4.jpg" style="width: 100px; height: 150px;">
                </a>--%>
            </div>
        </div>

    </div>


<%-------------------------------------------------%>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/footer.jsp" />
</body>
</html>
