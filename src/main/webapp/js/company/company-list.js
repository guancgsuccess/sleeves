window.onload=function () {
    checkCollection();
};

function checkCollection() {
    /*需要登陆人的id,和对应公司的id*/
    var companyId = document.getElementById("companyId").value;
    var clientId = document.getElementById("clientId").value;
    if(clientId!=null){
        if (window.XMLHttpRequest){
            xhr = new XMLHttpRequest();
        }else {
            xhr = new ActiveXObject('Microsoft.XMLHTTP')
        }

        var url="/collection/checkIsCollectionCompany?clientId="+clientId+"&companyId="+companyId;
        xhr.open("GET",url,true);
        xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
        xhr.onreadystatechange = CompanyCollection;
        xhr.send();
    }
}

function CompanyCollection() {
    var element = document.getElementById("collImg");   //获取星星图片路径
    if(xhr.readyState==4 && xhr.status==200) {
        var result = JSON.parse(xhr.responseText);

        if(result==-1){
            console.log("页面中显示为灰色星星111111111111");
            element.src="/img/company/xing.png";
            document.getElementById("collection").innerText="收藏";
        }else if(result==0){
            console.log("页面中显示为灰色星星22222222222222");
            element.src="/img/company/xing.png";
            document.getElementById("collection").innerText="收藏";
        }else{
            console.log("页面中显示为黄色星星33333333333333");
            element.src="/img/company/liangxing.png";
            document.getElementById("collection").innerText="已收藏";
        }
    }
}

/*--------------------------------点击收藏触发-------------------------------------------*/

function changeCollection(){
        /*需要登陆人的id,和对应公司的id*/
        var clientId = document.getElementById("clientId").value;
        var companyId = document.getElementById("companyId").value;

        if (window.XMLHttpRequest){
             xhr = new XMLHttpRequest();
        }else {
             xhr = new ActiveXObject('Microsoft.XMLHTTP')
        }

        var url="/collection/getCompanyCollection?clientId="+clientId+"&companyId="+companyId;
        xhr.open("GET",url,true);
        xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
        xhr.onreadystatechange = processCompanyCollection;
        xhr.send(null);
}

function processCompanyCollection() {
    var element = document.getElementById("collImg");
    if(xhr.readyState==4 && xhr.status==200){
            console.log("==="+xhr.responseText)
            var result = JSON.parse(xhr.responseText);
            if(result==0){
                element.src="/img/company/liangxing.png";
                document.getElementById("collection").innerText="已收藏";
            }else if(result==1){
                element.src="/img/company/liangxing.png";
                document.getElementById("collection").innerText="已收藏";
            }else{
                element.src="/img/company/xing.png";
                document.getElementById("collection").innerText="收藏";
            }

    }
}


/*-----------------------------------分页---------------------------------------------*/

function getNextCompanyEvaluation() {

    var companyId = document.getElementById("companyId").value;
    var page = Number.parseInt(document.getElementById("currentPageCode").innerText)+1;

    var condition = "companyId="+companyId+"&currenPageCodeStr="+page;
    var url ="/company/companyDetailByPage?"+encodeURI(encodeURI(condition));
    if(window.XMLHttpRequest){
        xhr = new XMLHttpRequest(); //for ie7+,FireFox,Chorme,Opera,Safai...
    }else{
        xhr = new ActiveXObject('Microsoft.XMLHTTP');//for ie6
    }
    xhr.open("GET",url,true);
    xhr.setRequestHeader("Content-type","application/json");
    xhr.onreadystatechange= companyEvaluationByPage;
    xhr.send();
}

function getLastCompanyEvaluation() {

    var companyId = document.getElementById("companyId").value;
    var page = Number.parseInt(document.getElementById("currentPageCode").innerText)-1;

    var condition = "companyId="+companyId+"&currenPageCodeStr="+page;
    var url ="/company/companyDetailByPage?"+encodeURI(encodeURI(condition));
    if(window.XMLHttpRequest){
        xhr = new XMLHttpRequest(); //for ie7+,FireFox,Chorme,Opera,Safai...
    }else{
        xhr = new ActiveXObject('Microsoft.XMLHTTP');//for ie6
    }
    xhr.open("GET",url,true);
    xhr.setRequestHeader("Content-type","application/json");
    xhr.onreadystatechange= companyEvaluationByPage;
    xhr.send();
}

function getFirstCompanyEvaluation() {

    var companyId = document.getElementById("companyId").value;
    var page =1;

    var condition = "companyId="+companyId+"&currenPageCodeStr="+page;
    var url ="/company/companyDetailByPage?"+encodeURI(encodeURI(condition));
    if(window.XMLHttpRequest){
        xhr = new XMLHttpRequest(); //for ie7+,FireFox,Chorme,Opera,Safai...
    }else{
        xhr = new ActiveXObject('Microsoft.XMLHTTP');//for ie6
    }
    xhr.open("GET",url,true);
    xhr.setRequestHeader("Content-type","application/json");
    xhr.onreadystatechange= companyEvaluationByPage;
    xhr.send();
}
function getFinallyCompanyEvaluation() {

    var result = JSON.parse(xhr.responseText);
    var companyId = document.getElementById("companyId").value;
    var page =result.totalPages;

    var condition = "companyId="+companyId+"&currenPageCodeStr="+page;
    var url ="/company/companyDetailByPage?"+encodeURI(encodeURI(condition));
    if(window.XMLHttpRequest){
        xhr = new XMLHttpRequest(); //for ie7+,FireFox,Chorme,Opera,Safai...
    }else{
        xhr = new ActiveXObject('Microsoft.XMLHTTP');//for ie6
    }
    xhr.open("GET",url,true);
    xhr.setRequestHeader("Content-type","application/json");
    xhr.onreadystatechange= companyEvaluationByPage;
    xhr.send();
}

function companyEvaluationByPage() {
    if(xhr.readyState ==4 && xhr.status ==200){

        var result = JSON.parse(xhr.responseText);
        var arr = result.modelList;



        var  bigPage = document.getElementById("split-page");
        var comment = document.getElementById("changeComment");
        comment.innerHTML = " ";
        for (var i = 0; i < arr.length; i++) {
            comment.innerHTML = `
                <div class="comment">
                    <div class="detail">
                        <img src="${arr[i].evaluation_content}">
                        <div class="nickName">
                            <span>${arr[i].client_name}</span>
                        </div>
                        <div class="time">
                            <span>${arr[i].evaluation_time}</span>
                        </div>
                    </div>
                    <div class="comment-content">
                        <span>${arr[i].evaluation_content}</span>
                    </div>
                </div>
            `
        }


        bigPage.innerHTML = " ";
        //首页<span class="one-span">

        var firstPage = "<span class=\"one-span\">\n" +
            "                    <a href=\"javascript:getFirstCompanyEvaluation()\">首页</a>\n" +
            "                </span>";
        bigPage.innerHTML+=firstPage;

        //(1)上一页
        if(result.currentPageCode !=1){// 不是首页，则显示上一页

            var condition = "companyId="+companyId+"&currenPageCodeStr="+(Number.parseInt(result.currentPageCode)-1);
            var url ="/company/companyDetailByPage?"+condition;

            var  href='javascript:getCompanyEvaluationWithPage("'+url+'")';
            var prePageEle = "<span class=\"first-span\"><a  href='"+href+"'> 上一页</a></span>";
            bigPage.innerHTML+=prePageEle;
        }


        //(2)当前页码
        console.log("当前页码======================== " + result.currentPageCode)

        var currentPageEle = "<span class=\"two-span\"><label>显示&nbsp;&nbsp;" +
            result.currentPageCode +
            "&nbsp;&nbsp;|</label><b>"+result.totalPages+"</b>";
        bigPage.innerHTML+=currentPageEle;

        //(3)下一页

        if(result.currentPageCode != result.totalPages){
            var condition = "companyId="+companyId+"&currenPageCodeStr="+(Number.parseInt(result.currentPageCode)+1);
            var url ="/company/companyDetailByPage?"+condition;

            var  next_href='javascript:getCompanyEvaluationWithPage("'+url+'")';
            var nextPageInfo = "<span class=\"three-span\"><a  href='"+next_href+"'>下一页</a></span>";
            bigPage.innerHTML+=nextPageInfo;
        }

        //(4)尾页
        var condition = "companyId="+companyId+"&currenPageCodeStr="+result.totalPages;
        var url ="/company/companyDetailByPage?"+condition;

        var finally_page_href='javascript:getCompanyEvaluationWithPage("'+url+'")';
        var finallyPageEle="<span class=\"finally-span\"><a href='"+finally_page_href+"'>尾页</a></span> ";
        bigPage.innerHTML+=finallyPageEle;

        //(5)页码其他信息
        var othersEle = "<span class=\"four-span\">页数</span>"+
            "<input class=\"page-input\" type=\"text\" name=\"page\" id='skipPageCode'/>" +
            "<input onclick='skipPage()' type=\"submit\" value=\"跳转\" class=\"page-button\" />";
        bigPage.innerHTML+=othersEle;

    }
}
