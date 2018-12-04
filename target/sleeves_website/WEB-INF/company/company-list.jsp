<%--
  Created by IntelliJ IDEA.
  User: 翟博文
  Date: 2018/10/19
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>裝修公司详情-袖装网</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/company/company-list.css">
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/company/company-list.css">
    <script src="${pageContext.request.contextPath}/js/company/company-list.js"></script>
</head>
<body >

<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/new_top.jsp" />
<%------------------------------------------------------------------------------------------%>
        <div id="main">
            <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/nav.jsp"/>

            <div id="main-top">
            <ul>
                <li>
                    <a href="${pageContext.request.contextPath}/index">苏州装修 </a>
                    <span>&nbsp;&gt;&nbsp;</span>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/company/allByPage">苏州装修公司</a>
                    <span>&nbsp;&gt;&nbsp;</span>
                </li>
                <li>${company.companyName}</li>
            </ul>
        </div>

            <%------------- 隐藏域 ------------%>
            <input id="clientId" style="display: none" value="${client.clientId}" />
            <input id="companyId" style="display: none" value="${company.companyId}" />

            <div id="main-content">
                <div id="main-left">
                <!--轮播图-->
                <div id="demo" class="carousel slide" data-ride="carousel">

                    <!-- 指示符 -->
                    <ul class="carousel-indicators">
                        <li data-target="#demo" data-slide-to="0" class="active"></li>
                        <li data-target="#demo" data-slide-to="1"></li>
                        <li data-target="#demo" data-slide-to="2"></li>
                        <li data-target="#demo" data-slide-to="3"></li>
                        <li data-target="#demo" data-slide-to=" "></li>
                    </ul>

                    <!-- 轮播图片 -->
                    <div class="carousel-inner">

                            <div class="carousel-item active">
                                <img src="${imgList.get(0).renderingImagesPath}">
                            </div>
                            <div class="carousel-item ">
                                <img src="${imgList.get(1).renderingImagesPath}">
                            </div>
                            <div class="carousel-item ">
                                <img src="${imgList.get(2).renderingImagesPath}">
                            </div>
                            <div class="carousel-item ">
                                <img src="${imgList.get(3).renderingImagesPath}">
                            </div>
                            <div class="carousel-item ">
                                <img src="${imgList.get(4).renderingImagesPath}">
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
            </div>

                <div id="main-right">
                    <div id="main-right-top">
                        <span class="com-name"><b>${company.companyName}</b></span>
                        <span class="ying lable">
                                营
                            <i></i>
                            </span>
                        <span class="reng lable">
                                认
                                <i></i>
                            </span>
                        <span class="bond lable">
                                保证金:&nbsp;
                                <i>￥${company.companyStatus}</i>
                            </span>
                    </div>
                    <div id="main-right-top-next">
                        <div class="company_legal_person">
                            <span class="person">公司法人&nbsp;:</span>
                            <span class="content">${company.companyLegalPerson}</span>
                        </div>
                        <div class="company_license_no">
                            <span class="person">营业执照&nbsp;:</span>
                            <span class="content">${company.companyLicenseNo}</span>
                        </div>
                        <div class="collect">
                            <img id="collImg" src="${pageContext.request.contextPath}/img/company/xing.png" >
                            <a onclick="changeCollection()" id="collection" style="cursor: pointer;">
                                收藏
                            </a>
                        </div>
                    </div>
                    <div id="main-right-middle">
                        <div class="plan">
                            <p class="number">${count}</p>
                            <p class="words">设计案例</p>
                        </div>
                    </div>
                    <div id="main-right-address">
                        <label>地址:</label>
                        <span class="address">${company.companyLocation}</span>
                    </div>
                    <div id="main-right-email">
                        <label>邮箱:</label>
                        <span class="email">${company.companyEmail}</span>
                    </div>
                    <div id="main-right-footer">
                    <button class="order">免费预约</button>
                    <button class="phone">
                        <img src="${pageContext.request.contextPath}/img/company/phone.png">
                        ${company.companyTelephone}
                    </button>

                </div>
                </div>
            </div>

            <div id="main-footer">

                <div class="main-footer-words">
                    <span class="order">设计案例</span>
                    <a href="${pageContext.request.contextPath}/design/getDesignByPage?companyId=${company.companyId}&companyName=${company.companyName}">全部${count}套 &nbsp;&gt;</a>
                </div>

                <div class="main-footer-img">
                    <c:forEach var="entry" items="${designList}">
                        <div class="card">
                            <a href="${pageContext.request.contextPath}/design/getDesignDetail?designId=${entry.designId}">
                                <div class="img-ct">
                                    <img src="${pageContext.request.contextPath}/${entry.field1}">
                                </div>
                                <div class="img-info">
                                    <p class="card-name">${entry.designName}</p>
                                    <p class="card-detail">${entry.designArea}/${entry.designStyle}/${entry.designHouseType}</p>
                                </div>
                            </a>
                        </div>
                    </c:forEach>

                </div>

                <div class="main-footer-team">
                    <div class="team">
                        <span>设计团队</span>
                    </div>
                    <div class="outerDesign">
                        <c:forEach var="entry" items="${designerList}">
                            <div class="desiger">
                                <a href="${pageContext.request.contextPath}/designer/getDesignerDetail?designerId=${entry.designerId}">
                                    <div class="desiger-img">
                                        <img src="${pageContext.request.contextPath}/${entry.designerImgPath}">
                                    </div>
                                    <div class="desiger-pro">
                                        <p class="desiger-pro-des">${entry.designerName}</p>
                                        <p class="desiger-pro-order">${entry.fields1}年经验</p>
                                    </div>
                                </a>
                            </div>
                        </c:forEach>
                    </div>
                </div>

        <%------------------------------------------------%>
        <div class="bigComment" id="changeComment">
                <div class="comment-title">
                    评论列表
                </div>

                <c:forEach var="entry" items="${evaluationMapList}">

                    <div class="big">
                        <div class="a">
                            <div class="b">
                                <div class="comment">
                                    <div class="detail">
                                        <img src="${entry.get("client_profile")}">
                                        <div class="nickName">
                                            <span>${entry.get("client_name")}</span>
                                        </div>
                                        <div class="time">
                                            <span>${entry.get("evaluation_time")}</span>
                                        </div>
                                    </div>
                                    <div class="comment-content">

                                        <span>${entry.get("evaluation_content")}</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                </c:forEach>

        </div>

        <div id="split-page" class="page-split" onload="">
            <span class="one-span">
                <a href="javascript:getFirstCompanyEvaluation()">首页</a>
            </span>
                    <c:if test="${page.currentPageCode != 1}">
                <span class="first-span">
                    <a href="javascript:getLastCompanyEvaluation()">上一页</a>
                </span>
                    </c:if>

                    <span class="two-span">
                        <label>显示&nbsp;&nbsp;<span id="currentPageCode">${page.currentPageCode}</span>&nbsp;&nbsp;|</label>
                        <b>${page.totalPages}</b>
                    </span>
                    <c:if test="${page.currentPageCode != page.totalPages}">
                        <span class="three-span">
                            <a href="javascript:getNextCompanyEvaluation()">下一页</a>
                        </span>
                            </c:if>

                            <span class="finally-span">
                                <a href="javascript:getFinallyCompanyEvaluation()">尾页</a>
                            </span>

                        <span class="four-span">页数</span>
                        <input class="page-input" type="text" id="entry" name="page" onkeyup="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}" onafterpaste="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"/>
                        <input type="submit" value="跳转" class="page-button" onclick="getPage()"/>

            </div>

    </div>

        </div>
<%------------------------------------------------------------------------------------------%>
    <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/footer.jsp" />


</body>
</html>
