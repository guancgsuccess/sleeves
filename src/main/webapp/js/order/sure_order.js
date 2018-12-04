/*-------------------------------------提交订单------------------------------------*/
function submitOrder() {
    console.log("经过了提交订单的函数");

    let clientId = document.getElementById("clientId").value;
    console.log("客户id为:" +clientId);
    let designId = document.getElementById("designId").value;
    console.log("方案id为:" +designId);
    let addressId = document.getElementById("addressId").value;
    console.log("地址id为:" +addressId);

    if(addressId===null){
        console.log("地址为空的函数");
        document.getElementById("noAddressTip").innerText="您还未添加地址";
    }else{
        if (window.XMLHttpRequest){
            xhr = new XMLHttpRequest();
        }else {
            xhr = new ActiveXObject('Microsoft.XMLHTTP')
        }

        var url = "/order/get2SubmitOrder?clientId="+clientId+"&designId="+designId+"&addressId="+addressId;
        xhr.open("GET",url,true);
        xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
        xhr.onreadystatechange = processSubmitOrder;
        xhr.send();
    }

}

function processSubmitOrder() {
    if(xhr.readyState==4 && xhr.status==200) {
        console.log(xhr.responseText);
        var result= JSON.parse(xhr.responseText);
        if(result===1){
            window.location.href="/orderPay";
        }

    }
}



/*
function click2Pay() {
    console.log("经过了insert order 的函数")
    let clientId = document.getElementById("clientId").value;
    console.log("客户id为:" +clientId)
    let designId = document.getElementById("designId").value;
    console.log("方案id为:" +designId)

    if (window.XMLHttpRequest){
        xhr = new XMLHttpRequest();
    }else {
        xhr = new ActiveXObject('Microsoft.XMLHTTP')
    }
    console.log("====================");
    var url = "/order/getDesignOrderId?clientId="+clientId+"&designId="+designId;
    xhr.open("GET",url,true);
    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
    xhr.onreadystatechange = getOrderId;
    xhr.send();
}

function getOrderId() {
    if(xhr.readyState==4 && xhr.status==200){
        console.log(xhr.responseText);
        var designOrder = JSON.parse(xhr.responseText);
        let orderId = designOrder.designOrderId;
        let orderPrice = designOrder.designOrderStatus;
        window.location.href="http://localhost:8888/pay?orderId="+orderId+"&orderPrice="+orderPrice;
    }
}*/
