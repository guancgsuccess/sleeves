var xhr = null;


var url_raidersAll="/raiders/raidersAll"; //分页获得所有装修攻略的路径
var url_raidersEight="/raiders/raidersEight"; //获得前8名装修攻略文章的攻略

window.onload=function(){
    getRaidersAll(url_raidersAll);
};


//页面加载完加载所有攻略数据
function getRaidersAll(url_raidersAll) {

    if (window.XMLHttpRequest){
        xhr = new XMLHttpRequest();
    }else {
        xhr = new ActiveXObject('Microsoft.XMLHTTP')
    }

    xhr.open("GET",url_raidersAll,true);
    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
    xhr.onreadystatechange = getRaiders;
    xhr.send(null);
}


function getRaiders() {
    if(xhr.readyState==4 && xhr.status==200){

        var result = JSON.parse(xhr.responseText);
        //数据渲染
        console.log(result);
        var raiders = result.modelList;
        console.log(raiders);
        var raidersInfo = document.getElementById("raiders-info")
        raidersInfo.innerHTML = " ";
        for (var i = 0; i< raiders.length; i++) {
            raidersInfo.innerHTML += `<li>
                <div class="raiders-images">
                    <a href="/raiders/raidersInfo?raidersId=${raiders[i].raidersId}" target="_blank">
                        <img src="/${raiders[i].raidersImgPath}">
                    </a>
                </div>
                <div class="raiders-info">
                    <div class="raiders-title">
                        <a href="/raiders/raidersInfo?raidersId=${raiders[i].raidersId}" target="_blank">${raiders[i].raidersTitle}</a>
                    </div>
                    <div class="raiders-content">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${raiders[i].raidersIntroduce}   
                        <a href="/raiders/raidersInfo?raidersId=${raiders[i].raidersId}" target="_blank">   [阅读全文]   </a>
                    </div>
                    <div class="date-time">${raiders[i].raidersDate}</div>
                </div>
            </li>
            `
        }



        //页面渲染
        var splitPage = document.getElementById("split-page");
        splitPage.innerHTML = "";

        var url_raidersAll="/raiders/raidersAll";


        //首页<span class="one-span">
        var url_fight_page = url_raidersAll+"/page/"+1;
        var fight_page_href='javascript:getRaidersAll("'+url_fight_page+'")';
        var fightPageEle="<span class=\"one-span\"><a href='"+fight_page_href+"'>首页</a></span> ";
        splitPage.innerHTML+=fightPageEle;


        //(1)上一页
        if(result.currentPageCode !=1){// 不是首页，则显示上一页

            var url_pre_page = url_raidersAll +"/page/"+(result.currentPageCode-1);
            var  href='javascript:getRaidersAll("'+url_pre_page+'")';
            var prePageEle = "<span class=\"first-span\"><a  href='"+href+"'> 上一页</a></span>";
            splitPage.innerHTML+=prePageEle;
        }


        //(2)当前页码
        var currentPageEle = "<span class=\"two-span\"><label>显示&nbsp;&nbsp;" +
            result.currentPageCode +
            "&nbsp;&nbsp;|</label><b>"+result.totalPages+"</b>";
        splitPage.innerHTML+=currentPageEle;

        //(3)下一页
        if(result.currentPageCode != result.totalPages){

            var url_next_page=url_raidersAll+"/page/"+(result.currentPageCode+1);
            var  next_href='javascript:getRaidersAll("'+url_next_page+'")';
            var nextPageInfo = "<span class=\"three-span\"><a  href='"+next_href+"'>下一页</a></span>";
            splitPage.innerHTML+=nextPageInfo;
        }

        //(4)尾页
        var url_finally_page = url_raidersAll+"/page/"+(result.totalPages);
        var finally_page_href='javascript:getRaidersAll("'+url_finally_page+'")';
        var finallyPageEle="<span class=\"finally-span\"><a href='"+finally_page_href+"'>尾页</a></span> ";
        splitPage.innerHTML+=finallyPageEle;

        //(5)页码其他信息
        var othersEle = "<span class=\"four-span\">页数</span>"+
            "<input class=\"page-input\" type=\"text\" name=\"page\" id='skipPageCode'/>" +
            "<input onclick='skip()' type=\"submit\" value=\"跳转\" class=\"page-button\" />";
            splitPage.innerHTML+=othersEle;

        getEightRaiders(url_raidersEight);
    }



}

//获得排名前八名的攻略
function getEightRaiders() {

    if (window.XMLHttpRequest){
        xhr = new XMLHttpRequest();
    }else {
        xhr = new ActiveXObject('Microsoft.XMLHTTP')
    }

    xhr.open("GET",url_raidersEight,true);
    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
    xhr.onreadystatechange = getRaidersEight;
    xhr.send(null);
}

function getRaidersEight() {

    if(xhr.readyState==4 && xhr.status==200){
        console.log("前八名的攻略:" +xhr.responseText);
        var list = JSON.parse(xhr.responseText);

         var raidersArticle = document.getElementById("raiders-article");
         raidersArticle.innerHTML = " ";
         for(var j=0;j<list.length;j++){
             raidersArticle.innerHTML +=`
                            <a href="/raiders/raidersInfo?raidersId=${list[j].raidersId}" target="_blank">
                                <li>${list[j].raidersTitle}</li>
                            </a>                        
             `
         }
    }
}

function skip() {
    var url_raidersAll="/raiders/raidersAll";
    var skipPageCode = document.getElementById("skipPageCode").value;
    console.log("跳转的值为:" +skipPageCode);
    if(skipPageCode!=null && skipPageCode!=""){
        var url_skip_page = url_raidersAll+"/page/"+skipPageCode;
        getRaidersAll(url_skip_page);
    }
}