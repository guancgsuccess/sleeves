function click2CompanyCollection() {
    var clientId = document.getElementById("clientId").value;
    console.log("查找的到的客户id为:" +clientId);

    if (window.XMLHttpRequest){
        xhr = new XMLHttpRequest();
    }else {
        xhr = new ActiveXObject('Microsoft.XMLHTTP')
    }

    var url = "/collection/getCompanyByClientId?clientId="+clientId;
    xhr.open("GET",url,true);
    xhr.setRequestHeader("Content-Type","application/json;charset=utf-8");
    xhr.onreadystatechange = processCollection;
    xhr.send();
}

function processCollection() {
    if(xhr.readyState==4 && xhr.status==200){
        var result = JSON.parse(xhr.responseText);
        console.log(result);
        if(result===0){
            console.log("经过了result=0的地方");
            window.location.href="/emptyCollection";
        }else{
            console.log("经过了result=1的地方");
            window.location.href="/existCollection";
        }
    }
}