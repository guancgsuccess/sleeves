function sureOrder() {
    console.log("执行了确定订单的js函数")
    let clientId = document.getElementById("clientId").value;
    let companyId = document.getElementById("companyId").value;
    let designId = document.getElementById("designId").value;
    console.log("clientId="+clientId+","+"companyId="+companyId+"designId="+designId)

    if (window.XMLHttpRequest){
        xhr = new XMLHttpRequest();
    }else {
        xhr = new ActiveXObject('Microsoft.XMLHTTP')
    }

    var url="/receiveAddress/getAllData?clientId="+clientId+"&companyId="+companyId+"&designId="+designId;
    xhr.open("GET",url,true);
    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
    xhr.onreadystatechange = defaultAddress;
    xhr.send();
}

function defaultAddress() {
    if(xhr.readyState==4 && xhr.status==200) {
        let message = JSON.parse(xhr.responseText);
        console.log(message);

        if(message==1){
            window.location.href="/sureOrder"
        }else{

        }
    }
}