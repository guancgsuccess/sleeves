<%--
  Created by IntelliJ IDEA.
  User: 10289
  Date: 2018/11/1
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>后台管理中心-袖装网</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/client/personCenter.css">
    <script src="${pageContext.request.contextPath}/js/collection/collection.js"></script>
</head>
<body>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/new_top.jsp" />
<%--------------------------------------------------------------%>

<div id="personCenter-body">
    <div class="person-title">
        <div class="logo-img">
            <a href="${pageContext.request.contextPath}/index">
                <img src="${pageContext.request.contextPath}/img/page/logo.png" />
            </a>
        </div>
        <span>个人中心首页</span>
    </div>

    <div class="person-body">

        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/client/person_nav.jsp" />

        <div id="left" class="person-left">
            <div class="profile" id="container1">
                <a  target="_parent" id="uploadImage1" style="...">
                    <img id="headImage" src="${client.clientProfile}" />
                </a>
            </div>
            <div class="client-info">
                <ul>
                    <li class="client_name">用户名</li>
                    <li class="client_id">业主 id : ${client.clientId}</li>
                </ul>
            </div>
            <div class="phone-body">
                <span class="sprite_img1  icon_email"></span>
                <div class="phone-info">
                    <label>手机号码绑定</label>
                    <div class="updatePhone">
                        <span>已绑定</span>
                        <a href="#">修改</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<%------------------------------------------------------------------%>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/page/footer.jsp" />


<script src="${pageContext.request.contextPath}/js/upload/plupload.full.min.js"></script>
<script src="${pageContext.request.contextPath}/js/upload/qiniu.min.js"></script>
<script>
    //引入Plupload 、qiniu.js后
    var uploader = Qiniu.uploader({
        runtimes: 'html5,flash,html4',    //上传模式,依次退化
        browse_button: 'uploadImage1',       //上传选择的点选按钮，**必需**
        //Ajax请求upToken的Url，**强烈建议设置**（服务端提供）
        //uptoken: 'JcizXMVETronZfp-PGoIjB8U6Ms7HCthUKV1JX1I:lICRqJm6bwaHBGKPhT87qXuZVtk=:eyJzY29wZSI6IjE1bS1pbWFnZXMtc3BhY2UiLCJkZWFkbGluZSI6MTUzOTc0OTYwMH0=',
        uptoken_url : '/upload/getToken', //若未指定uptoken_url,则必须指定 uptoken ,uptoken由其他程序生成
        unique_names: true, // 默认 false，key为文件名。若开启该选项，SDK为自动生成上传成功后的key（文件名）。
        save_key: true,   // 默认 false。若在服务端生成uptoken的上传策略中指定了 `sava_key`，则开启，SDK会忽略对key的处理
        domain: 'http://img.gcc666.top/',   //bucket 域名，下载资源时用到，**必需**
        get_new_uptoken: true,  //设置上传文件的时候是否每次都重新获取新的token
        container: 'container1',           //上传区域DOM ID，默认是browser_button的父元素，
        max_file_size: '100mb',           //最大文件体积限制
        //flash_swf_url: 'js/plupload/Moxie.swf',  //引入flash,相对路径
        max_retries: 3,                   //上传失败最大重试次数
        dragdrop: false,                   //开启可拖曳上传
        drop_element: 'container1',        //拖曳上传区域元素的ID，拖曳文件或文件夹后可触发上传
        chunk_size: '4mb',                //分块上传时，每片的体积
        auto_start: true,
        filters: {  //对上传文件类型进行限制
            mime_types : [
                { title : "Image files", extensions : "jpg,jpeg,png"}
            ],
            prevent_duplicates: false
        },

        //选择文件后自动上传，若关闭需要自己绑定事件触发上传
        init: {
            'FilesAdded': function(up, files) {
                plupload.each(files, function(file) {
                    // 文件添加进队列后,处理相关的事情
                });
            },
            'BeforeUpload': function(up, file) {
                // 每个文件上传前,处理相关的事情

            },
            'UploadProgress': function(up, file) {
                // 每个文件上传时,处理相关的事情
            },
            'FileUploaded': function(up, file, info) {

                var domain = up.getOption('domain');
                var res = JSON.parse(info);
                var sourceLink = domain + res.key; //获取上传成功后的文件的Url
                modifyHeadPortrait(sourceLink);


            },
            'Error': function(up, err, errTip) {
                //上传出错时,处理相关的事情
                alert("出错")
            },
            'UploadComplete': function() {
                //队列文件处理完毕后,处理相关的事情
            },
            'Key': function(up, file) {
                // 若想在前端对每个文件的key进行个性化处理，可以配置该函数
                // 该配置必须要在 unique_names: false , save_key: false 时才生效

                var key = "";
                // do something with key here
                return key;
            }
        }
    });
    function modifyHeadPortrait(sourceLink){
        let xhr=null;
        if(window.XMLHttpRequest){
            xhr = new XMLHttpRequest();
        }else{
            xhr = new ActiveXObject('Microsoft.XMLHTTP');
        }
        let url = "/client/modifyHeadPortrait?headUrl="+sourceLink;
        xhr.open("GET",url,true);
        xhr.onreadystatechange = modifyHeadPortraitProcess;
        xhr.send();
        function modifyHeadPortraitProcess() {
            if(xhr.readyState === 4 && xhr.status === 200) {
                let json=JSON.parse(xhr.responseText);
                if(json.msg===1){
                    document.getElementById("headImage").setAttribute("src",sourceLink.toString());
                    document.getElementById("headImageBig").setAttribute("src",sourceLink.toString());
                }
            }
        }
    }
</script>
</body>
</html>
