window.onload=function load() {
    check(clickEle);
};


var xhr = null;
// 判断手机号是否注册过
function checkTelephone(){
    var clientTelephone = document.getElementById("registerPhone").value;
    var phoneRegex = /^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\d{8}$/;

    if(clientTelephone.length ==0 ){
        document.getElementById("error-tip1").innerText = "手机号不能为空";
        document.getElementById("sendButton").disabled=true;
        document.getElementById("sendButton").style.color="white";
        document.getElementById("registerButton").disabled=true;
        document.getElementById("registerButton").style.cursor="auto";
    }else{
        if(!(phoneRegex.test(clientTelephone))){
            document.getElementById("error-tip1").innerText = "手机号格式错误";
            document.getElementById("sendButton").style.color="white";
            document.getElementById("sendButton").disabled=true;
            document.getElementById("sendButton").style.cursor="auto";
            document.getElementById("registerButton").disabled=true;
            document.getElementById("registerButton").style.cursor="auto";
        }else{

            if(window.XMLHttpRequest){
                xhr = new XMLHttpRequest();
            }else{
                xhr = new ActiveXObject('Microsoft.XMLHTTP');
            }
            var url = "/client/isClientRegister?clientTelephone="+clientTelephone;
            xhr.open("GET",url,true);
            xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;");
            xhr.onreadystatechange = processTelephone;
            xhr.send();
        }
    }
}

    function processTelephone() {

        if(xhr.readyState == 4 && xhr.status == 200) {
            var result = JSON.parse(xhr.responseText);

            if(result == 0){  //客户还未注册时,表示客户可以注册
                document.getElementById("error-tip1").innerText = null;
                document.getElementById("sendButton").disabled=false;//设置发送验证码按钮可用
                document.getElementById("sendButton").style.cursor="pointer";//设置验证码按钮小手状态
                document.getElementById("registerButton").disabled=false;//设置提交按钮可用
                document.getElementById("registerButton").style.cursor="pointer";//设置提交按钮小手状态
            }else{            //客户已经注册,表示客户不可以注册
                document.getElementById("registerButton").style.color="black";
                document.getElementById("error-tip1").innerText = "手机号已经被使用,请重新输入";
                document.getElementById("sendButton").style.cursor="auto";  //设置按钮箭头状态
                document.getElementById("sendButton").disabled=true;//设置按钮不可用
                document.getElementById("registerButton").style.cursor="auto";  //设置按钮箭头状态
                document.getElementById("registerButton").disabled=true;//设置按钮不可用
            }
        }
    }


// 判断用户名
function checkUserName(){
    //获取客户用户名
    var username = document.getElementById("username").value;
    if(username.length==0){
        document.getElementById("error-tip2").innerText="用户名不能为空";
        document.getElementById("registerButton").style.cursor="auto";
    }else{
        document.getElementById("error-tip2").innerText=null;
        document.getElementById("registerButton").disabled=false;
        document.getElementById("registerButton").style.cursor="pointer";
    }
}

// 判断密码
function checkPassword(){
    var password = document.getElementById("password").value;
    var passwordRegex = /^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,16}$/;

    if(password.length==0){
        document.getElementById("error-tip3").innerText="密码不能为空";
        document.getElementById("registerButton").disabled=true;
        document.getElementById("registerButton").style.cursor="auto";
    }else if(!(passwordRegex.test(password))){
        document.getElementById("error-tip3").innerText="密码至少为8位且必须含有字母,数字";
        //让注册按钮不可用
        document.getElementById("registerButton").disabled=true;
        document.getElementById("registerButton").style.cursor="wait";
    }else{
        document.getElementById("error-tip3").innerText=null;
        document.getElementById("sendButton").style.cursor="pointer";
        document.getElementById("registerButton").disabled=false;
        document.getElementById("registerButton").style.cursor="pointer";
    }
}


var InterValObj; //timer变量，控制时间
var count=59;
var curCount;

//检查获得验证码按钮()
function getVerificationCode() {
    var clientTelephone = document.getElementById("registerPhone").value;
    var phoneRegex = /^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\d{8}$/;

    if(clientTelephone.length==0){
        document.getElementById("sendButton").style.color="white";
        document.getElementById("sendButton").disabled=true;
        document.getElementById("sendButton").style.cursor="auto";
        document.getElementById("error-tip1").innerText="手机号不能为空";
    }else{
        if(!(phoneRegex.test(clientTelephone))) {
            document.getElementById("sendButton").style.color="white";
            document.getElementById("sendButton").disabled=true;
            document.getElementById("sendButton").style.cursor="auto";
            document.getElementById("error-tip1").innerText = "手机号格式错误";
        }else{
            document.getElementById("error-tip1").innerText = null;

            if(window.XMLHttpRequest){
                xhr = new XMLHttpRequest();
            }else{
                xhr = new ActiveXObject('Microsoft.XMLHTTP');
            }

            curCount=count;
            document.getElementById("sendButton").style.color="white";
            document.getElementById("sendButton").disabled = true;
            document.getElementById("sendButton").style.cursor="wait";
            document.getElementById("sendButton").value=curCount+"s重新发送";
            InterValObj=window.setInterval(SetRemainTime,1000);
            var url = "/client/checkVerificationCode?clientTelephone="+clientTelephone;
            xhr.open("GET",url,true);
            xhr.send();
        }
    }
}

//设置时间
function SetRemainTime() {
    if(curCount==1){
        window.clearInterval(InterValObj);
        document.getElementById("sendButton").style.color="black";
        document.getElementById("sendButton").value="发送验证码";
        document.getElementById("sendButton").disabled = false;
        document.getElementById("sendButton").style.cursor="pointer";

        document.getElementById("registerButton").disabled=true;
        document.getElementById("registerButton").style.cursor="auto";
    }else {
        --curCount;
        document.getElementById("sendButton").style.color="black";
        document.getElementById("sendButton").value=curCount+"s重新发送";
        document.getElementById("registerButton").disabled=false;
        document.getElementById("registerButton").style.cursor="pointer";
    }
}

//选中复选框,按钮颜色改变
function check(clickEle){
    var status = clickEle.checked;
    if(status) {
        document.getElementById("registerButton").style.color="white";
        document.getElementById("registerButton").disabled = false;
        document.getElementById("registerButton").style.cursor="pointer";
        document.getElementById("registerButton").style.background="#2b90d9";
    }

    if(!status){
        document.getElementById("registerButton").style.color="white";
        document.getElementById("registerButton").style.background="gray";
        //提交按钮无法使用
        document.getElementById("registerButton").disabled = true;
        document.getElementById("registerButton").style.cursor="wait";
    }
}


//检查点击注册按钮
function checkRegister () {
    //依次获取注册时输入的值
    var clientTelephone = document.getElementById("registerPhone").value;
    var clientName = document.getElementById("username").value;
    var clientPassword = document.getElementById("password").value;
    var verificationCode = document.getElementById("VerificationCode").value;

    if(clientTelephone.length==0){
        document.getElementById("error-tip1").innerText="手机号不能为空";
        document.getElementById("registerButton").style.color="black";
        document.getElementById("registerButton").disabled = true;
        //让发送验证码按钮无法点击
        document.getElementById("sendButton").disabled = true;
        document.getElementById("sendButton").style.cursor="auto";
    }

    if(clientName.length==0){
        document.getElementById("registerButton").disabled = true;
        document.getElementById("error-tip2").innerText="用户名不能为空";
        document.getElementById("registerButton").style.color="black";

    }

    if(clientPassword.length==0){
        document.getElementById("registerButton").disabled = true;
        document.getElementById("error-tip3").innerText="密码不能为空";
        document.getElementById("registerButton").style.color="black";
    }

    if(verificationCode.length==0){
        document.getElementById("registerButton").disabled = true;
        document.getElementById("error-tip4").innerText = "验证码不能为空";
        document.getElementById("registerButton").style.color="black";
    }


}

