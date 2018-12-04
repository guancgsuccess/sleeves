
<%--
  Created by IntelliJ IDEA.
  User: 翟博文
  Date: 2018/10/29
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>装修方案-袖装网</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/design/designTotal.css">
    <script src="${pageContext.request.contextPath}/js/design/design.js"></script>
</head>
<body>

<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/new_top.jsp" />

    <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/nav.jsp" />
    <%--------------------------------------------------------------%>

    <div id="design-body">
        <div class="design-top">
            <ul>
                <li>
                    <a href ="">苏州装修公司&nbsp;</a>
                    <i class="small">&gt;</i>
                </li>
                <li class="second-name">
                    <a href=""><span id="companyName">${companyName}&nbsp;</span></a>
                    <i class="small">&gt;</i>
                </li>
                <li>案例列表</li>
            </ul>
        </div>

        <div class = "design-plan">
                <ul>
                    <c:forEach var="entry" items="${designList}">
                        <li>
                            <div class = "hot-heading">
                                <a href="${pageContext.request.contextPath}/design/getDesignDetail?designId=${entry.designId}">
                                    <img src="${pageContext.request.contextPath}/${entry.field1}">
                                </a>
                            </div>
                            <div class="design-name">
                                <a href="${pageContext.request.contextPath}/design/getDesignDetail?designId=${entry.designId}">
                                    ${entry.designName}
                                </a>
                            </div>
                            <span>${entry.designArea}㎡&nbsp;/&nbsp;${entry.designHouseType}&nbsp;/&nbsp;${entry.designStyle}</span>
                        </li>
                    </c:forEach>

                </ul>
            </div>

        <div class="design-bottom">
            <%-- 分页 --%>
            <div class="page-split" id="page">
                <%-- 非首页,那就存在上一页 --%>
                <c:if test="${page.currentPageCode !=1}">
                            <span class="first-span">
                                <a href="${pageContext.request.contextPath}/design/getDesignByPage?pages=${page.currentPageCode -1}&companyId=${companyId}&companyName=${companyName}">上一页</a>
                            </span>
                </c:if>

                <span class="two-span">
                            <label >显示&nbsp;&nbsp;&nbsp;&nbsp;${page.currentPageCode}&nbsp;&nbsp;&nbsp;&nbsp;|</label>
                            <b>${page.totalPages}</b>
                </span>

                <%--非最后一页,存在下一页--%>
                <c:if test="${page.currentPageCode!=page.totalPages}">
                            <span class="three-span">
                                 <a href="${pageContext.request.contextPath}/design/getDesignByPage?pages=${page.currentPageCode +1}&companyId=${companyId}&companyName=${companyName}">下一页</a>
                            </span>
                </c:if>

                <span class="four-span">页数</span>

                <input name="page" id="pageCode" class="page-input" type="text" />
                <button  class="page-button" type="submit" onclick="jumpPage()">跳转</button>

            </div>

        </div>
    </div>

    <%--------------------------------------------------------------%>
    <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/footer.jsp" />
</body>
</html>
