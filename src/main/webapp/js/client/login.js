window.onload = function(){
    var loginForm = document.getElementById('loginForm');
    var clientTelephone = document.getElementById('clientTelephone');
    var clientPassword = document.getElementById('clientPassword');
    var remember = document.getElementById('remember');

    //页面初始化时，如果帐号密码cookie存在则填充
    if(getCookie('clientTelephone') && getCookie('clientPassword')){
        clientTelephone.value = getCookie('clientTelephone');
        clientPassword.value = getCookie('clientPassword');
        remember.checked = true;
    }
    //复选框勾选状态发生改变时，如果未勾选则清除cookie
    remember.onchange = function(){
        if(!this.checked){
            delCookie('clientTelephone');
            delCookie('clientPassword');
        }
    };
    //表单提交事件触发时，如果复选框是勾选状态则保存cookie
    loginForm.onsubmit = function(){
        if(remember.checked){
            setCookie('clientTelephone',clientTelephone.value,1); //保存帐号到cookie，有效期7天
            setCookie('clientPassword',clientPassword.value,1); //保存密码到cookie，有效期7天
        }
    };
};

//设置cookie
function setCookie(name,value,day){
    var date = new Date();
    date.setDate(date.getDate() + day);
    document.cookie = name + '=' + value + ';expires='+ date;
};

//获取cookie
function getCookie(name){
    var reg = RegExp(name+'=([^;]+)');
    var arr = document.cookie.match(reg);
    if(arr){
        return arr[1];
    }else{
        return '';
    }
};

//删除cookie
function delCookie(name){
    setCookie(name,null,-1);
}





function checkLoginName(){
    var clientTelephone = document.getElementById("clientTelephone").value;

    if(clientTelephone.length==0){
        document.getElementById("error-tip").innerText= "手机号不能为空";
        document.getElementById("loginButton").style.color = "white";
        document.getElementById("loginButton").disabled = true;
    }else {
        if (window.XMLHttpRequest) {
            xhr = new XMLHttpRequest();
        } else {
            xhr = new ActiveXObject('Microsoft.XMLHTTP');
        }

        var url = "/client/isClientRegister?clientTelephone="+clientTelephone;
        xhr.open("GET", url, true);
        xhr.onreadystatechange = processLoginIsRegister;
        xhr.send();
    }
}

function processLoginIsRegister() {
    if(xhr.readyState == 4 && xhr.status == 200) {
        var result = JSON.parse(xhr.responseText);
        if(result == 0){
            document.getElementById("error-tip").innerText = "手机号还未注册";
            document.getElementById("loginButton").style.color = "white";
            document.getElementById("loginButton").disabled = true;
        }else{
            document.getElementById("error-tip").innerText = null;
            document.getElementById("loginButton").style.color = "white";
            document.getElementById("loginButton").disabled = false;
        }
    }
}

function checkLoginPwd() {
    var clientPassword = document.getElementById("clientPassword").value;

    if(clientPassword.length!=0){
        document.getElementById("loginButton").style.color = "white";
        document.getElementById("error-tip1").innerText= null;
    }
}


function checkLoginButton() {
    var clientTelephone = document.getElementById("clientTelephone").value;
    var clientPassword = document.getElementById("clientPassword").value;

    if(clientTelephone.length==0){
        document.getElementById("loginButton").style.color = "white";
        document.getElementById("error-tip").innerText= "手机号不能为空";
        document.getElementById("loginButton").disabled = true;
        document.getElementById("loginButton").style.cursor="wait";
    }

    if(clientPassword.length==0){
        document.getElementById("loginButton").style.color = "white";
        document.getElementById("error-tip1").innerText= "密码不能为空";
        document.getElementById("loginButton").disabled = true;
        document.getElementById("loginButton").style.cursor="wait";
    }
}