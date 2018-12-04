var xhr = null;

/*---------------------第一步---------------------------------*/
function firstStepButton() {
    //获得当前输入的手机号的值
    var clientTelephone = document.getElementById("clientTelephone").value;
    //获得当前输入的图形验证码的值
    var validateCode = document.getElementById("validateCode").value;

    if(clientTelephone.length==0){
        document.getElementById("errorMessage1").innerText = "手机号不能为空";
    }else if(validateCode.length==0){
        document.getElementById("errorMessage2").innerText = "验证码不能为空";
    }else{

        if(window.XMLHttpRequest){
            xhr = new XMLHttpRequest();
        }else{
            xhr = new ActiveXObject('Microsoft.XMLHTTP');
        }

        var url="/client/forgetPwdFirstStrep?clientTelephone="+clientTelephone+"&validateCode="+validateCode;
        xhr.open("GET",url,true);
        xhr.withCredentials = true;
        xhr.setRequestHeader("Content-Type", "application/json");
        xhr.onreadystatechange = processForgetPwd;
        xhr.send();
    }
}

    function processForgetPwd() {
        if(xhr.readyState == 4 && xhr.status == 200){
            var result = JSON.parse(xhr.responseText);

            if(result==1){
                //让下一个圆圈背景变为绿色
                document.getElementById("second_step").style.background = "#3ac569";
                //让当前div隐藏
                document.getElementById("sure-account").style.display = "none";
                //让下一个div出现
                document.getElementById("code_body").style.display = "inline";
            }else if(result==0){
                document.getElementById("errorMessage2").innerText = "验证码输入错误";
            }else{
                document.getElementById("errorMessage1").innerText = "手机号还未注册";
            }
        }
    }


/*---------------------第二步---------------------------------*/
var InterValObj; //timer变量，控制时间
var count=59;
var curCount;

function getForgetPwdCode() {
    //获得到当前客户的手机号
    var clientTelephone = document.getElementById("phone").value;
    if(window.XMLHttpRequest){
        xhr = new XMLHttpRequest();
    }else{
        xhr = new ActiveXObject('Microsoft.XMLHTTP');
    }

    curCount=count;
    document.getElementById("getForgetPwdButton").setAttribute("disabled",true);
    document.getElementById("getForgetPwdButton").style.cursor="auto";
    document.getElementById("getForgetPwdButton").value=curCount+"s重新发送";
    InterValObj=window.setInterval(SetRemainTime,1000);

    var url="/client/getForgetPwd?clientTelephone="+clientTelephone;
    xhr.open("GET",url,true);
    xhr.send();
}

//设置时间
function SetRemainTime() {
    if(curCount==1){
        window.clearInterval(InterValObj);
        document.getElementById("getForgetPwdButton").removeAttribute("disabled");
        document.getElementById("getForgetPwdButton").value="发送验证码";
        document.getElementById("getForgetPwdButton").style.cursor="pointer";
    }else {
        --curCount;
        document.getElementById("getForgetPwdButton").value=curCount+"s重新发送";
    }
}

function secondStepButton() {
    //获得当前输入框中输入的短信验证码
    var verificationCode = document.getElementById("verificationCode").value;

    if(verificationCode.length==0){
        document.getElementById("forgetPwdError").innerText = "短信验证码不能为空";
    }else{

        if(window.XMLHttpRequest){
            xhr = new XMLHttpRequest();
        }else{
            xhr = new ActiveXObject('Microsoft.XMLHTTP');
        }

        var url="/client/forgetPwdSecondStep?verificationCode="+verificationCode;
        xhr.open("GET",url,true);
        xhr.onreadystatechange = processSecondStep;
        xhr.send();
    }
}

    function processSecondStep() {
    if(xhr.readyState == 4 && xhr.status == 200){
        var result = JSON.parse(xhr.responseText);

        if(result==1){
            document.getElementById("third_step").style.background = "#3ac569";
            document.getElementById("code_body").style.display = "none";
            document.getElementById("rePwd_body").style.display = "inline";
        }else{
            document.getElementById("forgetPwdError").innerText = "短信验证码错误";
        }
    }
}

/*-----------------------第三步----------------------------------*/
//检查新密码
function checkForgetPwd() {
    var forgetPwd = document.getElementById("forgetPwd").value;
    if(forgetPwd.length==0){
        document.getElementById("forgetPwdError1").innerText = "密码不能为空";
    }else{
        document.getElementById("forgetPwdError1").innerText = null;
    }
}

//检查确认新密码
function checkForgetRePwd() {
    var forgetRePwd = document.getElementById("forgetRePwd").value;
    if(forgetRePwd.length==0){
        document.getElementById("forgetPwdError2").innerText = "密码不能为空";
    }else{
        document.getElementById("forgetPwdError2").innerText = null;
    }
}

function thirdStepButton() {
    var clientPassword = document.getElementById("forgetPwd").value;
    var clientRePassword = document.getElementById("forgetRePwd").value;

    if(clientPassword.length==0){
        document.getElementById("forgetPwdError1").innerText = "密码不能为空";
    }else if(clientRePassword.length==0){
        document.getElementById("forgetPwdError2").innerText = "密码不能为空";
    }else {
        if(window.XMLHttpRequest){
            xhr = new XMLHttpRequest();
        }else{
            xhr = new ActiveXObject('Microsoft.XMLHTTP');
        }

        var url="/client/forgetPwdThirdStrep?clientPassword="+clientPassword+"&clientRePassword="+clientRePassword;
        xhr.open("POST",url,true);
        xhr.onreadystatechange = processForgetPwdThirdStep;
        xhr.send();
    }
}

    function processForgetPwdThirdStep() {

    if (xhr.readyState == 4 && xhr.status == 200) {
        var result = JSON.parse(xhr.responseText);
        if (result == 1) {
            document.getElementById("four_step").style.background = "#3ac569";
            document.getElementById("rePwd_body").style.display = "none";
            document.getElementById("success_body").style.display = "inline";
        } else {
            document.getElementById("forgetPwdError2").innerText = "两次密码不一样";
        }
    }
}
