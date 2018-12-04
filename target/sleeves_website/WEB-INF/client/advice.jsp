<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/10/24
  Time: 12:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>意见反馈-袖装网</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/client/advice.css" />
</head>
<body>

    <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/new_top.jsp" />
    <%-------------------------------------------------------------%>
    <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/nav.jsp" />
    <%-------------------------------------------------------------%>
        <div id="advice-body">
            <div class="advice-title">
                意见反馈<span>Feedback</span>
            </div>
            <div class="advice-content">
                <span class="title">反馈内容</span>
                <form>
                    <textarea name="advice" placeholder="我们非常重视您的建议，请在这里填写告诉我们"></textarea>
                </form>
            </div>
            <div class="telephone">
                <span class="phone-name">联系电话</span>
                <input type="text" class="phone-input" placeholder="请输入你的手机号码"/>
                <label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(袖装将对您的联系方式严格保密)</label>
            </div>

            <button class="advice-button" type="button" onclick="submitCommit()">提交</button>
        </div>
    <%-------------------------------------------------------------%>
    <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/footer.jsp" />

<script>

    function submitCommit() {
        alert("您的意见已成功提交");
        window.location.href="/client/advice.jsp";
    }

</script>
</body>
</html>
