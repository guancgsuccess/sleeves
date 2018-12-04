<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/10/12
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>网页头部</title>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/top.css">
    <script type="text/javascript" src="https://webapi.amap.com/maps?v=1.4.10&key=bc622a320ac21cc94cb1c2fdfde90ff0"></script>

</head>
<body>

    <div id="header">
        <div id="location" class="location">
            <em></em>
            <label id="position" class="place"></label>
            <div id="change-body" class="change">[切换]
                <div id="place-body">
                    <div class="city-name">地区</div>
                    <ul>
                        <li><a class="placeName" href="javascript:void(0);" onclick="checkPlace(this)">虎丘区</a></li>
                        <li><a class="placeName" href="javascript:void(0);" onclick="checkPlace(this)">平江区</a></li>
                        <li><a class="placeName" href="javascript:void(0);" onclick="checkPlace(this)">吴中区</a></li>
                        <li><a class="placeName" href="javascript:void(0);" onclick="checkPlace(this)">吴江区</a></li>
                        <li><a class="placeName" href="javascript:void(0);" onclick="checkPlace(this)">高新区</a></li>
                        <li><a class="placeName" href="javascript:void(0);" onclick="checkPlace(this)">沧浪区</a></li>
                        <li><a class="placeName" href="javascript:void(0);" onclick="checkPlace(this)">工业园区</a></li>
                    </ul>
                </div>
            </div>
        </div>

        <div class="topInfo">
            <ul>
                <li>
                    <c:choose>
                        <c:when test="${empty client.clientName}">
                            <a href="${pageContext.request.contextPath}/clientUI/register" target="_parent">注册</a> &nbsp;&nbsp;&nbsp;
                            <a href="${pageContext.request.contextPath}/clientUI/login" target="_parent">登录</a>
                        </c:when>
                        <c:otherwise>
                            <a href="javascript:void(0)" style="color: #3ac569;font-size: 14px">${client.clientName}</a>
                            <a href="${pageContext.request.contextPath}/client/clientOut">退出</a>
                        </c:otherwise>
                    </c:choose>
                </li>
                <li><a href="${pageContext.request.contextPath}/clientUI/personCenter" target="_blank">个人中心</a></li>
                <li><a href="${pageContext.request.contextPath}/clientUI/aboutUs" target="_blank">关于我们</a></li>
                <li><a href="${pageContext.request.contextPath}/advice" target="_blank">意见反馈</a></li>
            </ul>
        </div>
    </div>

    <script>
        var map = new AMap.Map('container', {
            resizeEnable: true
        });
        //借助于浏览器定位
        AMap.plugin('AMap.Geolocation', function() {
            var geolocation = new AMap.Geolocation({
                enableHighAccuracy: true,//是否使用高精度定位，默认:true
                timeout: 10000,          //超过10秒后停止定位，默认：5s
                buttonPosition:'RB',    //定位按钮的停靠位置
                buttonOffset: new AMap.Pixel(10, 20),//定位按钮与设置的停靠位置的偏移量，默认：Pixel(10, 20)
                zoomToAccuracy: true,   //定位成功后是否自动调整地图视野到定位点

            });
            map.addControl(geolocation);
            geolocation.getCurrentPosition(function(status,result){
                if(status=='complete'){
                    onComplete(result)
                }else{
                    onError(result)
                }
            });
        });
        //解析定位结果
        function onComplete(data) {
            document.getElementById("position").innerText=data.addressComponent.district;
        }
        //解析定位错误信息
        function onError(data) {
            alert("error")
        }

        /*------------------------------------------------------------*/
        const locationBody = document.getElementById("location")
        const changeBody = document.getElementById("change-body")
        const placeBody = document.getElementById("place-body")

        changeBody.onmouseover = () => {
            placeBody.style ="display: block;"
        }

        locationBody.onmouseleave = () => {
            placeBody.style = "display: none;"
        }

        placeBody.onmouseleave = () => {
            placeBody.style = "display: none;"
        }


    </script>

</body>
</html>


