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
     //   alert("返回选中结果:"+Selecteds); //返回选中结果
        getCompanyWithConditions(Selecteds);
    });
    // alert(RetSelecteds()); //返回选中结果
});

function RetSelecteds() {
    var result = "";
    $("#filter a[class='seled']").each(function () {
        result += $(this).html()+"\n";
    });
    return result;
}


var xhr = null;


function getCompanyWithConditions(Selecteds) {
  //  alert("getCompanyWithConditionsgetCompanyWithConditionsgetCompanyWithConditionsgetCompanyWithConditionsgetCompanyWithConditions");
    var result =Selecteds.split("\n");
    var minPrice = null;
    var maxPrice = null;

    if (result[2] != "不限") {
        minPrice = result[2].split("-")[0];
        maxPrice = result[2].split("-")[1];
        maxPrice = maxPrice.substring(0, maxPrice.length-1);
    }

  var condition = "designStyle="+result[0]+"&companyLocation="+result[1]+"&minPriceStr="+minPrice+"&maxPriceStr="+maxPrice+"&currenPageCodeStr=0";
  //  var condition = "designStyle=简约&companyLocation=吴中&minPriceStr5&maxPriceStr=8"
    var url ="/company/getWithConditions?"+encodeURI(encodeURI(condition));
    if(window.XMLHttpRequest){
        xhr = new XMLHttpRequest(); //for ie7+,FireFox,Chorme,Opera,Safai...
    }else{
        xhr = new ActiveXObject('Microsoft.XMLHTTP');//for ie6
    }
    xhr.open("GET",url,true);
    xhr.setRequestHeader("Content-type","application/json");
    xhr.onreadystatechange= showList;

    xhr.send();
}

function getCompanyWithPage(url) {
    urlChange = encodeURI(encodeURI(url));
    if(window.XMLHttpRequest){
        xhr = new XMLHttpRequest();
    }else{
        xhr = new ActiveXObject('Microsoft.XMLHTTP');//for ie6
    }
    xhr.open("GET",urlChange,true);
    xhr.setRequestHeader("Content-type","application/json");
    xhr.onreadystatechange= showList;

    xhr.send();
}


function showList(){
    if(xhr.readyState ==4 && xhr.status ==200){
        let result = JSON.parse(xhr.responseText);
        console.log(xhr.responseText);

        let arr = result.modelList;

        var company = document.getElementById("allCompany");
        var page = document.getElementById("split-page");

        company.innerHTML =" ";

        for (var i = 0; i < arr.length; i++) {
            var name = arr[i].companyName;
            console.log("***************="+name)
            var pathtotal = arr[i].field1;
            var path = pathtotal.split(",");
            console.log("图片路径 = " + path[i]);

            company.innerHTML +=`
                    <a href="/company/companyDetail?companyId=${arr[i].companyId}" style="color: black;">
                    <div class="company-info">
                       <span class="company-name" id="companyName">${arr[i].companyName}</span>
                        <div class="phone" id="companyPhone">${arr[i].companyTelephone}</div>
                        <div class="company-images">

                            <img id="companyImgPath1" src="${path[0]}"/>
                            <img id="companyImgPath2" src="${path[1]}"/>
                            <img id="companyImgPath3" src="${path[2]}"/>
                            <img id="companyImgPath4" src="${path[3]}"/>
                        </div>
                    </div>

                </a>
            `
        }

        console.log("当前页码 = " + result.currentPageCode);
        console.log("总页码 = " + result.totalPages);
        var style = document.getElementById("style").value;
        var area = document.getElementById("area").value;
        var minPrice = null;
        var maxPrice = null;
        var minPriceStr = document.getElementById("minPrice").value;
        var maxPriceStr = document.getElementById("maxPrice").value;
        if (minPriceStr !="" && maxPriceStr !=""){
            minPrice = minPriceStr;
            maxPrice = maxPriceStr;
        }
        console.log("最大价格 = " +maxPrice)
        console.log("最小价格 = " +minPrice)

        page.innerHTML = " ";

        //首页<span class="one-span">
        var condition = "designStyle="+style+"&companyLocation="+area+"&minPriceStr="+minPrice+"&maxPriceStr="+maxPrice+"&currenPageCodeStr=0";
        var url ="/company/getWithConditions?"+condition;

        var fight_page_href='javascript:getCompanyWithPage("'+url+'")';
        var fightPageEle="<span class=\"one-span\"><a href='"+fight_page_href+"'>首页</a></span> ";
        page.innerHTML+=fightPageEle;

        //(1)上一页
        if(result.currentPageCode !=1){// 不是首页，则显示上一页
            var condition = "designStyle="+style+"&companyLocation="+area+"&minPriceStr="+minPrice+"&maxPriceStr="+maxPrice+"&currenPageCodeStr="+(Number.parseInt(result.currentPageCode)-1);
            var url ="/company/getWithConditions?"+condition;

            var  href='javascript:getCompanyWithPage("'+url+'")';
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
            var condition = "designStyle="+style+"&companyLocation="+area+"&minPriceStr="+minPrice+"&maxPriceStr="+maxPrice+"&currenPageCodeStr="+(Number.parseInt(result.currentPageCode)+1);
            var url ="/company/getWithConditions?"+condition;

            var  next_href='javascript:getCompanyWithPage("'+url+'")';
            var nextPageInfo = "<span class=\"three-span\"><a  href='"+next_href+"'>下一页</a></span>";
            page.innerHTML+=nextPageInfo;
        }

        //(4)尾页
        var condition = "designStyle="+style+"&companyLocation="+area+"&minPriceStr="+minPrice+"&maxPriceStr="+maxPrice+"&currenPageCodeStr="+result.totalPages;
        var url ="/company/getWithConditions?"+condition;

        var finally_page_href='javascript:getCompanyWithPage("'+url+'")';
        var finallyPageEle="<span class=\"finally-span\"><a href='"+finally_page_href+"'>尾页</a></span> ";
        page.innerHTML+=finallyPageEle;

        //(5)页码其他信息
        var othersEle = "<span class=\"four-span\">页数</span>"+
            "<input class=\"page-input\" type=\"text\" name=\"page\" id='skipPageCode'/>" +
            "<input onclick='skipPage()' type=\"submit\" value=\"跳转\" class=\"page-button\" />";
        page.innerHTML+=othersEle;
    }
}
function skipPage() {
    var skipPageCode = document.getElementById("skipPageCode").value;
    console.log("跳转的值为:" +skipPageCode);
    var style = document.getElementById("style").value;
    var area = document.getElementById("area").value;
    var minPrice = null;
    var maxPrice = null;
    var minPriceStr = document.getElementById("minPrice").value;
    var maxPriceStr = document.getElementById("maxPrice").value;
    if (minPriceStr !="" && maxPriceStr !=""){
        minPrice = minPriceStr;
        maxPrice = maxPriceStr;
    }


    if(skipPageCode!=null && skipPageCode!=""){
        var condition = "designStyle="+style+"&companyLocation="+area+"&minPriceStr="+minPrice+"&maxPriceStr="+maxPrice+"&currenPageCodeStr="+skipPageCode;
        var url ="/company/getWithConditions?"+condition;

        getCompanyWithPage(url);
    }
}

function getPage() {

    var page = document.getElementById("entry").value;
    window.location.href="/company/allByPage?page=" + page;
}