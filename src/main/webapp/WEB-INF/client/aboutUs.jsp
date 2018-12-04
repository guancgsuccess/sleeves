<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/11/5
  Time: 0:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>关于我们-袖装网</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/client/aboutUs.css">
</head>
<body>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/new_top.jsp" />
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/nav.jsp" />
<%-----------------------------------------------------%>

        <div id="aboutUs-body">
            <div id="picture">
                <img src="${pageContext.request.contextPath}/img/backgroud.jpg">
            </div>
            <div id="photograph">
                <b>Sleeves</b>
            </div>

            <div class="person">
                <div class="img"><img src="${pageContext.request.contextPath}/img/member1.jpg"></div>

                <div class="paragraph"><p>毕业于大庆师范学院，逻辑思维能力强，做事条理清晰，经常穿梭于各大IT论坛与网站，热衷计算机及互联网技术，具备一定的抗压能力，执行力较强。 —— 褚静莹</p></div>
            </div>

            <div class="person">
                <div class="img"><img src="${pageContext.request.contextPath}/img/member2.jpg"></div>

                <div class="paragraph"><p>毕业于大庆师范学院，性格随和，平时爱好逛CSDN、博客园等技术论坛，也会不定期去牛客网、慕课网等网站发表自己对于计算机行业的意见。 —— 翟博文</p></div>
            </div>

            <div class="person">
                <div class="img"><img src="${pageContext.request.contextPath}/img/member3.jpg"></div>

                <div class="paragraph"><p>毕业于淮南师范学院，性格随和，平时爱好逛CSDN、博客园等技术论坛，也会不定期去牛客网、慕课网等网站发表自己对于计算机行业的意见。 —— 何杰</p></div>
            </div>

            <div class="person">
                <div class="img"><img src="${pageContext.request.contextPath}/img/member4.jpg"></div>

                <div class="paragraph"><p>毕业于皖西学院，对于工作我认真对待，对于生活我积极向上，对于未来我有无限憧憬。 —— 薛成志</p></div>
            </div>
        </div>



<%-----------------------------------------------------%>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/footer.jsp" />
</body>
</html>
