<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/10/12
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>袖装家具装修设计效果图</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/rendering/rendering.js"></script>
    <script src="${pageContext.request.contextPath}/js/rendering/jquery-2.1.4.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/rendering/renderingAll.css">
</head>
<body>

<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/new_top.jsp" />
    <%-----------------------------------------------------------------------------%>


    <div id="renderingAll-body">

        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/nav.jsp" />

        <div id="major-body">
            <div class="top-img">
                <img src="${pageContext.request.contextPath}/img/rendering/1.jpg" />
            </div>

            <div class="rendering-title">
                <ul>
                    <li>
                       装修效果图&nbsp; &nbsp; &nbsp;   >   &nbsp; &nbsp; &nbsp;
                    <li>
                    &nbsp; &nbsp; &nbsp;家装效果
                    </li>
                </ul>
            </div>

            <div id="filter">
                <dl>
                    <dt>风格：</dt>
                    <dd><div onclick="changeManner(this)"><a>不限</a></div></dd>
                    <dd><div onclick="changeManner(this)"><a>中式</a></div></dd>
                    <dd><div onclick="changeManner(this)"><a>现代</a></div></dd>
                    <dd><div onclick="changeManner(this)"><a>简约</a></div></dd>
                    <dd><div onclick="changeManner(this)"><a>简欧</a></div></dd>
                    <dd><div onclick="changeManner(this)"><a>古典</a></div></dd>
                    <dd><div onclick="changeManner(this)"><a>美式</a></div></dd>
                </dl>
                <script>
                    function changeManner(manner) {
                        document.getElementById("manner").value=manner.innerText;
                    }
                </script>
                <dl>
                    <dt>户型：</dt>
                    <dd><div onclick="changeHouseType(this)"><a>不限</a></div></dd>
                    <dd><div onclick="changeHouseType(this)"><a>一居</a></div></dd>
                    <dd><div onclick="changeHouseType(this)"><a>二居</a></div></dd>
                    <dd><div onclick="changeHouseType(this)"><a>三居</a></div></dd>
                    <dd><div onclick="changeHouseType(this)"><a>大户型</a></div></dd>
                    <dd><div onclick="changeHouseType(this)"><a>复式楼</a></div></dd>
                    <dd><div onclick="changeHouseType(this)"><a>单身公寓</a></div></dd>
                </dl>
                <script>
                    function changeHouseType(houseType) {
                        document.getElementById("houseType").value=houseType.innerText;
                    }
                </script>
                <dl>
                    <dt>面积：</dt>
                    <dd><div onclick="changeAcreage(this)"><a>不限</a></div></dd>
                    <dd><div onclick="changeAcreage(this)"><a>35-45</a></div></dd>
                    <dd><div onclick="changeAcreage(this)"><a>45-55</a></div></dd>
                    <dd><div onclick="changeAcreage(this)"><a>55-75</a></div></dd>
                    <dd><div onclick="changeAcreage(this)"><a>75-95</a></div></dd>
                    <dd><div onclick="changeAcreage(this)"><a>95-110</a></div></dd>
                    <dd><div onclick="changeAcreage(this)"><a>110-120</a></div></dd>
                    <dd><div onclick="changeAcreage(this)"><a>120-130</a></div></dd>
                </dl>
                <script>
                    function changeAcreage(acreage) {
                        var newAcreage = acreage.innerText;
                        var minAcreace = null;
                        var maxAcreace = null;
                        if (newAcreage != "不限") {
                            minAcreace = newAcreage.split("-")[0];
                            maxAcreace = newAcreage.split("-")[1];
                        }
                        document.getElementById("minAcreage").value=minAcreace;
                        document.getElementById("maxAcreage").value=maxAcreace;
                    }
                </script>
            </div>
            <input type="hidden"  id="manner" value="不限">
            <input type="hidden"  id="houseType" value="不限">
            <input type="hidden"  id="minAcreage" value="">
            <input type="hidden"  id="maxAcreage" value="">

            <div class="rendering-img">
                <div class = "rendering-title1">
                    <span>首页&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/</span>
                    <a class="active">效果图</a>
                </div>

                <div class="rendering-images">
                    <ul class="images-ul" id="rendering">
                        <c:forEach var="entry" items="${renderingList}">
                            <li>
                                <div class="small-img">
                                    <a href="${pageContext.request.contextPath}/rendering/renderingDetail?renderingId=${entry.renderingId}">
                                        <img src="${entry.filed1}">
                                    </a>
                                </div>
                                <div class="img-info">
                                    <a href="${pageContext.request.contextPath}/rendering/renderingDetail?renderingId=${entry.renderingId}">
                                        ${entry.renderingDescription}
                                    </a>
                                </div>
                            </li>
                        </c:forEach>
                    </ul>
                </div>


                <div id="split-page" class="page-split">
                    <span class="one-span">
                        <a href="${pageContext.request.contextPath}/rendering/renderingAll?page=1">首页</a>
                    </span>
                    <c:if test="${page.currentPageCode != 1}">
                        <span class="first-span">
                            <a href="${pageContext.request.contextPath}/rendering/renderingAll?page=${page.currentPageCode-1}">上一页</a>
                        </span>
                    </c:if>

                    <span class="two-span">
                    <label>显示&nbsp;&nbsp;${page.currentPageCode}&nbsp;&nbsp;|</label>
                    <b>${page.totalPages}</b>
                    </span>
                    <c:if test="${page.currentPageCode != page.totalPages}">
                        <span class="three-span">
                            <a href="${pageContext.request.contextPath}/rendering/renderingAll?page=${page.currentPageCode+1}">下一页</a>
                        </span>
                    </c:if>

                    <span class="finally-span">
                    <a href="${pageContext.request.contextPath}/rendering/renderingAll?page=${page.totalPages}">尾页</a>
                </span>

                    <span class="four-span">页数</span>
                    <input class="page-input" type="text" id="pageCode" name="page" onkeyup="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}" onafterpaste="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"/>
                    <input type="submit" value="跳转" class="page-button" onclick="changePage()"/>
                </div>

            </div>
        </div>

    </div>


    <%------------------------------------------------------------------------------%>
    <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/footer.jsp" />
</body>
</html>
