<%--
  Created by IntelliJ IDEA.
  User: 翟博文
  Date: 2018/11/3
  Time: 0:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>装修公司-袖装网</title>
    <script src="${pageContext.request.contextPath}/js/company/searchCompany.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/company/searchCompany.css">
</head>
<body onload="searchCompany()">
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/new_top.jsp" />
    <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/nav.jsp"/>
    <div id="company">
       <img id="loading" src="${pageContext.request.contextPath}/img/loading.jpg">
    </div>
    <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/footer.jsp" />
</body>
</html>
