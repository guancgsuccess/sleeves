//分隔URL中的参数的函数
function getSearchString(key, Url) {
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
function checkPraise() {
    //获取url中的参数
    var search = window.location.search;
    var id = getSearchString('raidersId',search);
    console.log("****获得到的id为:" +id);

    if(window.XMLHttpRequest){
        xhr = new XMLHttpRequest();
    }else{
        xhr = new ActiveXObject('Microsoft.XMLHTTP');
    }
    var number = document.getElementById("praise-number").innerText;

    var url = "/raiders/updateRaidersByPraise?number="+number+"&id="+id;
    xhr.open("GET",url,true);
    xhr.onreadystatechange = processPraiseNumber;
    xhr.send();
}

function processPraiseNumber() {
    if(xhr.readyState==4 && xhr.status==200){
        var result = JSON.parse(xhr.responseText);
        if(result==1){
            document.getElementById("praise-number").innerText = parseInt(document.getElementById("praise-number").innerText)+1;
        }else{
            alert("点赞失败 ！");
        }
    }
}


function checkCollection() {
    //获取url中的参数
    var search = window.location.search;
    var id = getSearchString('raidersId',search);

    if(window.XMLHttpRequest){
        xhr = new XMLHttpRequest();
    }else{
        xhr = new ActiveXObject('Microsoft.XMLHTTP');
    }
    var number = document.getElementById("collection-number").innerText;

    var url = "/raiders/updateRaisersByCollection?number="+number+"&id="+id;
    xhr.open("GET",url,true);
    xhr.onreadystatechange = processCollectionNumber;
    xhr.send();
}

function processCollectionNumber() {
    if(xhr.readyState==4 && xhr.status==200){
        var result = JSON.parse(xhr.responseText);
        if(result==1){
            document.getElementById("collection-number").innerText = parseInt(document.getElementById("collection-number").innerText)+1;
        }else{
            alert("收藏失败 ！");
        }
    }
}
