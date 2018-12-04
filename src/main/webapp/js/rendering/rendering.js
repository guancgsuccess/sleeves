/**
 * Created by Administrator on 2018\10\22 0022.
 */

$(function () {
    //选中filter下的所有a标签，为其添加hover方法，该方法有两个参数，分别是鼠标移上和移开所执行的函数。
    $("#filter a").hover(
        function () {
            $(this).addClass("seling");
        },
        function () {
            $(this).removeClass("seling");
        }
    );


    //选中filter下所有的dt标签，并且为dt标签后面的第一个dd标签下的a标签添加样式seled。(感叹jquery的强大)
    $("#filter dt+dd a").attr("class", "seled"); /*注意：这儿应该是设置(attr)样式，而不是添加样式(addClass)，
     不然后面通过$("#filter a[class='seled']")访问不到class样式为seled的a标签。*/

    //为filter下的所有a标签添加单击事件
    $("#filter a").click(function () {
        $(this).parents("dl").children("dd").each(function () {
            //下面三种方式效果相同（第三种写法的内部就是调用了find()函数，所以，第二、三种方法是等价的。）
            //$(this).children("div").children("a").removeClass("seled");
            //$(this).find("a").removeClass("seled");
            $('a',this).removeClass("seled");
        });

        $(this).attr("class", "seled");
        var Selecteds = RetSelecteds();
        //alert(RetSelecteds()); //返回选中结果

        selectRenderingByConditions(Selecteds);
    });
    //alert(RetSelecteds()); //返回选中结果
});

function RetSelecteds() {
    var result = "";
    $("#filter a[class='seled']").each(function () {
        result += $(this).html()+"\n";
    });
    return result;
}

var xhr = null;
function selectRenderingByConditions(Selecteds){
    var result = Selecteds.split("\n");

    var minRenderingArea = null;
    var maxRenderingArea = null;
    var area = result[2].split("-");

    if(result[2] !="不限"){
        minRenderingArea = area[0];
        maxRenderingArea = area[1];
    }
    var condition = "renderingStyle="+result[0]+"&renderingHouseType="+result[1]+"&minRenderingArea="+minRenderingArea+"&maxRenderingArea="+maxRenderingArea+"&currenPageCodeStr=1";
    var url = "/rendering/getRenderingWithConditions?"+ encodeURI(encodeURI(condition)) ;

    if(window.XMLHttpRequest){
        xhr = new XMLHttpRequest();
    }else{
        xhr = new ActiveXObject("Microsoft.XMLHTTP");
    }
    xhr.open("GET",url,true);
    xhr.setRequestHeader("Content-type","application/json");
    xhr.onreadystatechange = showList;
    xhr.send();
}
function getRenderingWithPage(url) {
    urlChange = encodeURI(encodeURI(url));
    if(window.XMLHttpRequest){
        xhr = new XMLHttpRequest(); //for ie7+,FireFox,Chorme,Opera,Safai...
    }else{
        xhr = new ActiveXObject('Microsoft.XMLHTTP');//for ie6
    }
    xhr.open("GET",urlChange,true);
    xhr.setRequestHeader("Content-type","application/json");
    xhr.onreadystatechange= showList;

    xhr.send();
}

    function showList() {
        if(xhr.readyState==4 && xhr.status==200){
            //alert(xhr.responseText);
            console.log(xhr.responseText);
            var result = JSON.parse(xhr.responseText);
            var arr = result.modelList;
            console.log("id==========="+arr[0].renderingId)
            console.log("结果:"+arr)

            var rendering = document.getElementById("rendering");
            var page = document.getElementById("split-page");

            rendering.innerHTML = " ";

            for (var i = 0; i < arr.length; i++) {
                rendering.innerHTML += `
                            <li>
                                <div class="small-img">
                                    <a href="/rendering/renderingDetail?renderingId=${arr[i].renderingId}">
                                        <img src="${arr[i].filed1}">
                                    </a>
                                </div>
                                <div class="img-info">
                                    <a href="/rendering/renderingDetail?renderingId=${arr[i].renderingId}">
                                        ${arr[i].renderingDescription}
                                    </a>
                                </div>
                            </li>
                `
            }

            console.log("当前页码 = " + result.currentPageCode);
            console.log("总页码 = " + result.totalPages);
            var manner = document.getElementById("manner").value;
            var houseType = document.getElementById("houseType").value;
            var minAcreage = null;
            var maxAcreage = null;
            var minAcreageStr = document.getElementById("minAcreage").value;
            var maxAcreageStr = document.getElementById("maxAcreage").value;
            if (minAcreageStr !="" && maxAcreageStr !=""){
                minAcreage = minAcreageStr;
                maxAcreage = maxAcreageStr;
            }
            console.log("最小面积 = " +minAcreage)
            console.log("最大面积 = " +maxAcreage)

            page.innerHTML = " ";

            //首页<span class="one-span">
            var condition = "renderingStyle="+manner+"&renderingHouseType="+houseType+"&minRenderingArea="+minAcreage+"&maxRenderingArea="+maxAcreage+"&currenPageCodeStr=1";
            var url = "/rendering/getRenderingWithConditions?"+ condition ;

            var fight_page_href='javascript:getRenderingWithPage("'+url+'")';
            var fightPageEle="<span class=\"one-span\"><a href='"+fight_page_href+"'>首页</a></span> ";
            page.innerHTML+=fightPageEle;

            //(1)上一页
            if(result.currentPageCode !=1){// 不是首页，则显示上一页
                var condition = "renderingStyle="+manner+"&renderingHouseType="+houseType+"&minRenderingArea="+minAcreage+"&maxRenderingArea="+maxAcreage+"&currenPageCodeStr="+(Number.parseInt(result.currentPageCode)-1);
                var url = "/rendering/getRenderingWithConditions?"+ condition ;

                var  href='javascript:getRenderingWithPage("'+url+'")';
                var prePageEle = "<span class=\"first-span\"><a  href='"+href+"'> 上一页</a></span>";
                page.innerHTML+=prePageEle;
            }


            //(2)当前页码
            console.log("当前页码======================== " + result.currentPageCode)

            var currentPageEle = "<span class=\"two-span\"><label>显示&nbsp;&nbsp;" +
                result.currentPageCode +
                "&nbsp;&nbsp;|</label><b>"+result.totalPages+"</b>";
            page.innerHTML+=currentPageEle;

            //(3)下一页

            if(result.currentPageCode != result.totalPages){
                var condition = "renderingStyle="+manner+"&renderingHouseType="+houseType+"&minRenderingArea="+minAcreage+"&maxRenderingArea="+maxAcreage+"&currenPageCodeStr="+(Number.parseInt(result.currentPageCode)+1);
                var url = "/rendering/getRenderingWithConditions?"+ condition ;

                var  next_href='javascript:getRenderingWithPage("'+url+'")';
                var nextPageInfo = "<span class=\"three-span\"><a  href='"+next_href+"'>下一页</a></span>";
                page.innerHTML+=nextPageInfo;
            }

            //(4)尾页
            var condition = "renderingStyle="+manner+"&renderingHouseType="+houseType+"&minRenderingArea="+minAcreage+"&maxRenderingArea="+maxAcreage+"&currenPageCodeStr="+result.totalPages;
            var url = "/rendering/getRenderingWithConditions?"+ condition ;

            var finally_page_href='javascript:getRenderingWithPage("'+url+'")';
            var finallyPageEle="<span class=\"finally-span\"><a href='"+finally_page_href+"'>尾页</a></span> ";
            page.innerHTML+=finallyPageEle;

            //(5)页码其他信息
            var othersEle = "<span class=\"four-span\">页数</span>"+
                "<input class=\"page-input\" type=\"text\" name=\"page\" id='skipPageCode'/>" +
                "<input onclick='skipPagination()' type=\"submit\" value=\"跳转\" class=\"page-button\" />";
            page.innerHTML+=othersEle;
        }
    }

function skipPagination() {
    var skipPageCode = document.getElementById("skipPageCode").value;
    console.log("跳转的值为:" +skipPageCode);
    var manner = document.getElementById("manner").value;
    var houseType = document.getElementById("houseType").value;
    var minAcreage = null;
    var maxAcreage = null;
    var minAcreageStr = document.getElementById("minAcreage").value;
    var maxAcreageStr = document.getElementById("maxAcreage").value;
    if (minAcreageStr !="" && maxAcreageStr !=""){
        minAcreage = minAcreageStr;
        maxAcreage = maxAcreageStr;
    }
    if(skipPageCode!=null && skipPageCode!=""){
        var condition = "renderingStyle="+manner+"&renderingHouseType="+houseType+"&minRenderingArea="+minAcreage+"&maxRenderingArea="+maxAcreage+"&currenPageCodeStr="+skipPageCode;
        var url = "/rendering/getRenderingWithConditions?"+ condition ;
        getRenderingWithPage(url);
    }
}

function changePage() {
    var page = document.getElementById("pageCode").value;
    window.location.href="/rendering/renderingAll?page=" + page;
}
