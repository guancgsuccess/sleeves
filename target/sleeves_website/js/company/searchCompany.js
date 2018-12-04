//分隔URL中的参数的函数
function getSearchString(key, Url) {
    alert("url = " + url)
    var str = Url;
    str = str.substring(1, str.length); // 获取URL中?之后的字符（去掉第一位的问号）
    // 以&分隔字符串，获得类似name=xiaoli这样的元素数组
    var arr = str.split("&");
    var obj = new Object();

    // 将每一个数组元素以=分隔并赋给obj对象
    for (var i = 0; i < arr.length; i++) {
        var tmp_arr = arr[i].split("=");
        obj[decodeURIComponent(tmp_arr[0])] = decodeURIComponent(tmp_arr[1]);
    }
    return obj[key];
}

var xhr = null;
function searchCompany() {
    var search = window.location.pathname;


    var searchArr= search.split("/");

    var news = searchArr[2];


    var url = "/search/searchCompany?news="+news;
    var newUrl = encodeURI(url);

    if(window.XMLHttpRequest){
        xhr = new XMLHttpRequest();
    }else{
        xhr = new ActiveXObject('Microsoft.XMLHTTP');
    }
    xhr.open("GET",newUrl,true);
    xhr.setRequestHeader("Content-type","application/json");
    xhr.onreadystatechange = showCompany;
    xhr.send();
}

function showCompany() {
    if(xhr.readyState ==4 && xhr.status ==200) {
        console.log(xhr.responseText);
        var result = JSON.parse(xhr.responseText);
        var company = document.getElementById("company");
        company.innerHTML = " ";

        for (var i = 0; i < result.length; i++) {

            var pathtotal = result[i].field1;
            var path = pathtotal.split(",");
            console.log("图片路径 = " + path[i]);
            company.innerHTML += `
                <a href="/company/companyDetail?companyId=${result[i].companyId}" >
                    <div class="company-info">
                       <span class="company-name" id="companyName" style="color: black;">${result[i].companyName}</span>
                        <div class="phone" id="companyPhone">${result[i].companyTelephone}</div>
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





    }
}
