<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/10/26
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>所有方案页面</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/design/designAll.css">
</head>
<body>

<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/new_top.jsp" />
<%-------------------------------------------------%>

    <div id="design-body">

        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/nav.jsp" />
        <%----------------------------------------------------------%>
        <div class="design-top">
            <ul>
                <li>
                    <a href ="">公司名&nbsp;</a>
                    <i class="small">&gt;</i>
                </li>
                <li>
                    <a href="">案例名字&nbsp;</a>
                    <i class="small">&gt;</i>
                </li>
                <li>案例列表</li>
            </ul>
        </div>

        <div class="classify">
            <div class="classify-title">
                <span>面积</span>

                <div class="reset-with">
                    <ul>
                        <li>
                            <a rel="noflow" href="">不限</a>
                        </li>
                        <li>
                            <a rel="noflow" href="">35-45</a>
                        </li>
                        <li>
                            <a rel="noflow" href="">45-55</a>
                        </li>
                        <li>
                            <a rel="noflow" href="">55-75</a>
                        </li>
                        <li>
                            <a rel="noflow" href="">75-95</a>
                        </li>
                        <li>
                            <a rel="noflow" href="">95-110</a>
                        </li>
                        <li>
                            <a rel="noflow" href="">110-120</a>
                        </li>
                        <li>
                            <a rel="noflow" href="">120-130</a>
                        </li>
                    </ul>
                </div>
            </div>

            <div class="classify-title">
                <span>户型</span>

                <div class="reset-with">
                    <ul>
                        <li>
                            <a rel="noflow" href="">不限</a>
                        </li>
                        <li>
                            <a rel="noflow" href="#">一居</a>
                        </li>
                        <li>
                            <a rel="noflow" href="">二居</a>
                        </li>
                        <li>
                            <a rel="noflow" href="">三居</a>
                        </li>
                        <li>
                            <a rel="noflow" href="">大户型</a>
                        </li>
                        <li>
                            <a rel="noflow" href="">复式楼</a>
                        </li>
                        <li>
                            <a rel="noflow" href=l">单身公寓</a>
                        </li>
                    </ul>
                </div>
            </div>

            <div class="classify-title">
                <span>风格</span>

                <div class="reset-with">
                    <ul>
                        <li>
                            <a rel="noflow" href="#">不限</a>
                        </li>
                        <li>
                            <a rel="noflow" href="">中式</a>
                        </li>
                        <li>
                            <a rel="noflow" href="">现代</a>
                        </li>
                        <li>
                            <a rel="noflow" href="#">简约</a>
                        </li>
                        <li>
                            <a rel="noflow" href="">古典</a>
                        </li>
                        <li>
                            <a rel="noflow" href="">美式</a>
                        </li>
                    </ul>
                </div>
            </div>

            <div class = "design-plan">
                <ul>
                    <li>
                        <div class = "hot-heading">
                            <a href="">
                                <img src="${pageContext.request.contextPath}/img/page2.jpg">
                            </a>
                        </div>
                        <div class="design-name">
                            <a href="">
                                若水天装饰
                            </a>
                        </div>
                        <span>84㎡&nbsp;/&nbsp;一居&nbsp;/&nbsp;简约</span>
                    </li>
                    <li>
                        <div class = "hot-heading">
                            <a href="">
                                <img src="${pageContext.request.contextPath}/img/page2.jpg">
                            </a>
                        </div>
                        <div class="design-name">
                            <a href="">
                                若水天装饰
                            </a>
                        </div>
                        <span>84㎡&nbsp;/&nbsp;一居&nbsp;/&nbsp;简约</span>
                    </li>
                    <li>
                        <div class = "hot-heading">
                            <a href="">
                                <img src="${pageContext.request.contextPath}/img/page2.jpg">
                            </a>
                        </div>
                        <div class="design-name">
                            <a href="">
                                若水天装饰
                            </a>
                        </div>
                        <span>84㎡&nbsp;/&nbsp;一居&nbsp;/&nbsp;简约</span>
                    </li>
                </ul>

            </div>
        </div>
    </div>

<%-------------------------------------------------%>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/footer.jsp" />

</body>
</html>
