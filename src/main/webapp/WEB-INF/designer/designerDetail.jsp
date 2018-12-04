<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/10/24
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>装修设计师-袖装网</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/designer/designDetail.css" />
</head>
<body>
    <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/new_top.jsp" />

    <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/nav.jsp"/>
    <%-----------------------------------------%>

    <div id="designer-body">
        <div class="designer-title">
			<span>
                ${companyName}&nbsp;&nbsp;&nbsp;&nbsp;>&nbsp;&nbsp;&nbsp;&nbsp;
				<label>${designer.designerName}</label>
			</span>
        </div>

        <div class="left">
            <div class="person-profile">
                <img src="${pageContext.request.contextPath}/${designer.designerImgPath}" />
                <span>${designer.designerName}</span>
                <label>${counts}套案列</label>
            </div>

            <div class="person-introduce">
                <span class="person-name">个人简介</span>
                <span>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${designer.designerIntroduction}
				</span>
            </div>

        </div>

        <div class="right">
            <div class="right-title">
                设计作品<span>${counts}套</span>
            </div>
            <div class="writing">
                <ul>
                    <c:forEach var="entry" items="${designList}">
                        <a href="${pageContext.request.contextPath}/design/getDesignDetail?designId=${entry.designId}">
                            <li>
                                <img src="${pageContext.request.contextPath}/${entry.field1}" />
                                <span>${entry.designName}</span>
                                <label>${entry.designArea}㎡&nbsp;/&nbsp;&nbsp;${entry.designHouseType}&nbsp;&nbsp;/&nbsp;&nbsp;${entry.designStyle}</label>
                            </li>
                        </a>
                    </c:forEach>
                </ul>
            </div>
        </div>
    </div>

    <%-----------------------------------------%>
    <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/footer.jsp" />

</body>
</html>
