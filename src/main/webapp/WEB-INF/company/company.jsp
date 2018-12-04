<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/10/20
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>裝修公司-袖装网</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/company/xiaoguotu.js"></script>
    <script src="${pageContext.request.contextPath}/js/company/jquery-2.1.4.min.js"></script>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/company/company.css" type="text/css">
</head>
<body>

<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/new_top.jsp" />
<%-----------------------------------------------------------------------------%>

<div id="company-body">

    <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/nav.jsp" />


    <div id="major-body">

        <div class="left">

            <div class="company-title">
                <ul>
                    <li>
                        <a href="${pageContext.request.contextPath}/index">苏州装修&nbsp;&nbsp;></a>
                    </li>
                    <li>
                        <a href="#">苏州装修公司</a>
                    </li>
                </ul>
            </div>

            <div id="filter">
                <dl>
                    <dt>风格：</dt>
                    <dd><div onclick="changeStyle(this)" ><a>不限</a></div></dd>
                    <dd><div onclick="changeStyle(this)" ><a>简约</a></div></dd>
                    <dd><div onclick="changeStyle(this)" ><a>中式</a></div></dd>
                    <dd><div onclick="changeStyle(this)" ><a>古典</a></div></dd>
                    <dd><div onclick="changeStyle(this)" ><a>田园</a></div></dd>
                    <dd><div onclick="changeStyle(this)" ><a>现代</a></div></dd>
                </dl>
                <script>
                    function changeStyle(style) {
                        document.getElementById("style").value=style.innerText;
                    }
                </script>

                <dl>
                    <dt>区域：</dt>
                    <dd><div onclick="chaneCity(this)" ><a>不限</a></div></dd>
                    <dd><div onclick="chaneCity(this)"><a>虎丘区</a></div></dd>
                    <dd><div onclick="chaneCity(this)"><a>平江区</a></div></dd>
                    <dd><div onclick="chaneCity(this)"><a>吴中区</a></div></dd>
                    <dd><div onclick="chaneCity(this)"><a>吴江区</a></div></dd>
                    <dd><div onclick="chaneCity(this)"><a>高新区</a></div></dd>
                    <dd><div onclick="chaneCity(this)"><a>沧浪区</a></div></dd>
                    <dd><div onclick="chaneCity(this)"><a>工业园区</a></div></dd>
                </dl>
                <script>
                    function chaneCity(area) {
                        document.getElementById("area").value=area.innerText;
                    }

                </script>
                <dl>
                    <dt>价位：</dt>
                    <dd><div onclick="changePrice(this)"><a>不限</a></div></dd>
                    <dd><div onclick="changePrice(this)"><a>0-3万</a></div></dd>
                    <dd><div onclick="changePrice(this)"><a>3-5万</a></div></dd>
                    <dd><div onclick="changePrice(this)"><a>5-8万</a></div></dd>
                    <dd><div onclick="changePrice(this)"><a>8-12万</a></div></dd>
                    <dd><div onclick="changePrice(this)"><a>12-18万</a></div></dd>
                    <dd><div onclick="changePrice(this)"><a>18-30万</a></div></dd>
                    <dd><div onclick="changePrice(this)"><a>30-100万</a></div></dd>
                </dl>
                <script>
                    function changePrice(price) {
                        var newPrice = price.innerText;

                        var minPrice = null;
                        var maxPrice = null;
                        if (newPrice != "不限") {
                            minPrice = newPrice.split("-")[0];
                            maxPrice = newPrice.split("-")[1];
                            maxPrice = maxPrice.substring(0, maxPrice.length-1);
                        }
                        document.getElementById("minPrice").value=minPrice;
                        document.getElementById("maxPrice").value=maxPrice;
                    }
                </script>
            </div>

            <%----------------------隐藏域--------------------------------%>
            <input type="hidden"  id="style" value="不限">
            <input type="hidden"  id="area" value="不限">
            <input type="hidden"  id="minPrice" value="">
            <input type="hidden"  id="maxPrice" value="">
            <%------------------------------------------------------%>

            <div id="allCompany">
                <c:forEach var ="entry" items="${map}">
                    <div class="company-info">
                        <a href="${pageContext.request.contextPath}/company/companyDetail?companyId=${entry.key.companyId}">
                            <span class="company-name">${entry.key.companyName}</span>
                        </a>
                        <img src="${pageContext.request.contextPath}/img/telphone.png" style="width:20px;height: 20px; margin: -6px 0px 0px -145px">
                        <div class="phone">${entry.key.companyTelephone}</div>
                        <div class="company-images">
                            <a href="${pageContext.request.contextPath}/company/companyDetail?companyId=${entry.key.companyId}">
                                <c:forEach var ="entryImg" items="${entry.value}">
                                    <img src="${entryImg.renderingImagesPath}"/>
                                </c:forEach>
                            </a>
                        </div>
                    </div>
                </c:forEach>
            </div>

            <div id="split-page" class="page-split">
        <span class="one-span">
            <a href="${pageContext.request.contextPath}/company/allByPage?page=1">首页</a>
        </span>
                <c:if test="${pageModel.currentPageCode != 1}">
            <span class="first-span">
                <a href="${pageContext.request.contextPath}/company/allByPage?page=${pageModel.currentPageCode-1}">上一页</a>
            </span>
                </c:if>

                <span class="two-span">
            <label>显示&nbsp;&nbsp;${pageModel.currentPageCode}&nbsp;&nbsp;|</label>
            <b>${pageModel.totalPages}</b>
        </span>
                <c:if test="${pageModel.currentPageCode != pageModel.totalPages}">
            <span class="three-span">
                <a href="${pageContext.request.contextPath}/company/allByPage?page=${pageModel.currentPageCode+1}">下一页</a>
            </span>
                </c:if>

                <span class="finally-span">
            <a href="${pageContext.request.contextPath}/company/allByPage?page=${pageModel.totalPages}">尾页</a>
        </span>

                <span class="four-span">页数</span>
                <input class="page-input" type="text" id="entry" name="page" onkeyup="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}" onafterpaste="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"/>
                <input type="submit" value="跳转" class="page-button" onclick="getPage()"/>
            </div>

        </div>


        <div class="right">
            <div class="name-sort">
                <img src="${pageContext.request.contextPath}/img/company/right.png">
                &nbsp;本月推荐&nbsp;
                <img src="${pageContext.request.contextPath}/img/company/left.png" />
            </div>
            <ul>
                <li>
                    <a href="${pageContext.request.contextPath}/company/companyDetail?companyId=${companies[0].companyId}">
                        <img src="${pageContext.request.contextPath}/${companies[0].companyPassword}">
                        <span>${companies[0].companyName}</span>
                    </a>
                </li>

                <li>
                    <a href="${pageContext.request.contextPath}/company/companyDetail?companyId=${companies[1].companyId}">

                        <img src="${pageContext.request.contextPath}/${companies[1].companyPassword}">
                        <span>${companies[1].companyName}</span>
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/company/companyDetail?companyId=${companies[2].companyId}">

                        <img src="${pageContext.request.contextPath}/${companies[2].companyPassword}">
                        <span>${companies[2].companyName}</span>
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/company/companyDetail?companyId=${companies[3].companyId}">

                        <img src="${pageContext.request.contextPath}/${companies[3].companyPassword}">
                        <span>${companies[3].companyName}</span>
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/company/companyDetail?companyId=${companies[4].companyId}">

                        <img src="${pageContext.request.contextPath}/${companies[4].companyPassword}">
                        <span>${companies[4].companyName}</span>
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/company/companyDetail?companyId=${companies[5].companyId}">

                        <img src="${pageContext.request.contextPath}/${companies[5].companyPassword}">
                        <span>${companies[5].companyName}</span>
                    </a>
                </li>


            </ul>

        </div>
    </div>

</div>

<%------------------------------------------------------------------------------%>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/footer.jsp" />
</body>
</html>
