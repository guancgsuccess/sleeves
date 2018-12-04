var xhr = null;

/*-------------------------------页面加载时----------------------------------------------*/
window.onload=function load() {
    document.getElementById("status1").style.borderBottom="1px solid red";
    document.getElementById("status2").style.borderBottom=null;
    document.getElementById("status3").style.borderBottom=null;
    if (window.XMLHttpRequest){
        xhr = new XMLHttpRequest();
    }else {
        xhr = new ActiveXObject('Microsoft.XMLHTTP')
    }
    var clientId = document.getElementById("clientId").value;
    var url = "/order/loadOrderInfo?clientId="+clientId;
    xhr.open("POST",url,true);
    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
    xhr.onreadystatechange = getAllOrder;
    xhr.send();
};

    function getAllOrder() {
        if(xhr.readyState==4 && xhr.status==200) {
            console.log("返回的结果:"+xhr.responseText);

            var result = JSON.parse(xhr.responseText);
            var allInfo = document.getElementById("all-info");
            allInfo.innerHTML="";

            for (var i=0;i<result.length;i++){
                allInfo.innerHTML+=`
                            <div class="order-info">
								<div class="order-no">${result[i].designOrderNo}</div>
								<div class="design-info">
								    <a href="/design/getDesignDetail?designId=${result[i].designId}">
									    <img src="/${result[i].field1}" />
									</a>
									<span>
									    <a href="/design/getDesignDetail?designId=${result[i].designId}" style="text-decoration: none;color: black;">
                                            ${result[i].designName}
                                        </a>
                                   </span>
									<ul>
										<li>户型&nbsp;:&nbsp;${result[i].designHouseType}</li>
                                        <li>风格&nbsp;:&nbsp;${result[i].designStyle}</li>
                                        <li>面积&nbsp;:&nbsp;${result[i].designArea}㎡</li>
									</ul>
								</div>
								<div class="price">￥<b>${result[i].designPrice}</b></div>
							</div>                 
                `
            }


        }

    }

/*------------------------------------------------------------------------------------*/

function selectThisOne(){
    document.getElementById("status1").style.borderBottom="1px solid red";
    document.getElementById("status2").style.borderBottom=null;
    document.getElementById("status3").style.borderBottom=null;

    if (window.XMLHttpRequest){
        xhr = new XMLHttpRequest();
    }else {
        xhr = new ActiveXObject('Microsoft.XMLHTTP')
    }
    var clientId = document.getElementById("clientId").value;
    var url = "/order/loadOrderInfo?clientId="+clientId;
    xhr.open("POST",url,true);
    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
    xhr.onreadystatechange = getAllOrder;
    xhr.send();
}
/*------------------------------------------------------------------------------------*/
function selectThiTwo(){
    document.getElementById("status1").style.borderBottom=null;
    document.getElementById("status3").style.borderBottom=null;
    document.getElementById("status2").style.borderBottom="1px solid red";

    if (window.XMLHttpRequest){
        xhr = new XMLHttpRequest();
    }else {
        xhr = new ActiveXObject('Microsoft.XMLHTTP')
    }
    var clientId = document.getElementById("clientId").value;
    var url = "/order/clickNoPay?clientId="+clientId;
    xhr.open("POST",url,true);
    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
    xhr.onreadystatechange = getNoOrder;
    xhr.send();
}

    function getNoOrder() {
        if(xhr.readyState==4 && xhr.status==200) {
        console.log("返回的结果:"+xhr.responseText);

        var result = JSON.parse(xhr.responseText);
        var allInfo = document.getElementById("all-info");
        allInfo.innerHTML="";
        for(var i=0;i<result.length;i++){
            allInfo.innerHTML+=`
                            <div class="order-info">
								<div class="order-no">${result[i].designOrderNo}</div>
							    <div class="design-info">
								    <a href="/design/getDesignDetail?designId=${result[i].designId}">
									    <img src="/${result[i].field1}" />
									</a>
									<span>
									    <a href="/design/getDesignDetail?designId=${result[i].designId}" style="text-decoration: none;color: black;">
                                            ${result[i].designName}
                                        </a>
                                   </span>
									<ul>
										<li>户型&nbsp;:&nbsp;${result[i].designHouseType}</li>
                                        <li>风格&nbsp;:&nbsp;${result[i].designStyle}</li>
                                        <li>面积&nbsp;:&nbsp;${result[i].designArea} ㎡</li>
									</ul>
								</div>
								<input style="display: none;" id="designId" value="${result[i].designId}">
								<div class="price">￥<b>${result[i].designPrice}</b></div>
							    <div class="evaluate"><a href="javascript:void(0);" onclick="goPay()">待付款</a></div>
							</div>          
            `
        }
    }
    }


function goPay() {
    var clientId = document.getElementById("clientId").value;
    var designId = document.getElementById("designId").value;
    console.log("点击付款时:" +clientId+","+designId);

    if (window.XMLHttpRequest){
        xhr = new XMLHttpRequest();
    }else {
        xhr = new ActiveXObject('Microsoft.XMLHTTP')
    }
    var url = "/order/goToPay?clientId="+clientId+"&designId="+designId;
    xhr.open("POST",url,true);
    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
    xhr.onreadystatechange = rePayMoney;
    xhr.send();
}

    function rePayMoney() {
        if(xhr.readyState==4 && xhr.status==200){
            var result = JSON.parse(xhr.responseText);
            if(result===1){
                console.log("再次付款----")
                window.location.href="/cancelAfterPay";
            }
        }
    }

/*---------------------------------------------------------------------------------*/
function selectThisThree(){
    document.getElementById("status1").style.borderBottom=null;
    document.getElementById("status2").style.borderBottom=null;
    document.getElementById("status3").style.borderBottom="1px solid red";

    if (window.XMLHttpRequest){
        xhr = new XMLHttpRequest();
    }else {
        xhr = new ActiveXObject('Microsoft.XMLHTTP')
    }
    var clientId = document.getElementById("clientId").value;
    var url = "/order/clickYesPay?clientId="+clientId;
    xhr.open("POST",url,true);
    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
    xhr.onreadystatechange = getYesOrder;
    xhr.send();
}

    function getYesOrder() {
    console.log("返回的结果:"+xhr.responseText);

    var result = JSON.parse(xhr.responseText);
    var allInfo = document.getElementById("all-info");
    allInfo.innerHTML="";

    for(var i=0;i<result.length;i++){
        allInfo.innerHTML+=`
                            <div class="order-info">
								<div class="order-no">${result[i].designOrderNo}</div>
								<div class="design-info">
									<a href="/design/getDesignDetail?designId=${result[i].designId}">
									    <img src="/${result[i].field1}" />
									</a>
									<span>
									    <a href="/design/getDesignDetail?designId=${result[i].designId}" style="text-decoration: none;color: black;">
                                            ${result[i].designName}
                                        </a>
                                   </span>
									<ul>
										<li>户型&nbsp;:&nbsp;${result[i].designHouseType}</li>
                                        <li>风格&nbsp;:&nbsp;${result[i].designStyle}</li>
                                        <li>面积&nbsp;:&nbsp;${result[i].designArea} ㎡</li>
									</ul>
								</div>
								<div class="price">￥<b>${result[i].designPrice}</b></div>
								<div class="evaluate">已付款</div>
							</div>
            `
    }
}