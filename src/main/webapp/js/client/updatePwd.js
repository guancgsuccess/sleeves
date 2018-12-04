var xhr = null;





window.onload=function () {
    updateTelephone();  //对手机号码进行加密
};

function updateTelephone() {
    var phone = document.getElementById("clientTelephone").innerText;
    console.log("====="+phone);
    //将手机号加密为188****6446
    var encryptPhone = phone.substr(0,3) +'****'+phone.substr(7);
    console.log("*****"+encryptPhone);
    document.getElementById("clientTelephone").innerText = encryptPhone;
}


var InterValObj; //timer变量，控制时间
var count=59;
var curCount;

function sendValidateCodeSMS() {
    //图形验证码值
    var validateCode = document.getElementById("validateCode").value;
    //需要判断前面空的图形验证码是否为空
    if(validateCode.length ==0){
        document.getElementById("sendCodeButton").setAttribute("disabled",true);
        document.getElementById("error_tip1").innerText = "验证码不能为空";
    }else{
        console.log("经过了这里")
        document.getElementById("sendCodeButton").setAttribute("disabled",false);
        document.getElementById("sendCodeButton").style.cursor="pointer";

        if(window.XMLHttpRequest){
            xhr = new XMLHttpRequest();
        }else{
            xhr = new ActiveXObject('Microsoft.XMLHTTP');
        }

        curCount=count;
        document.getElementById("sendCodeButton").setAttribute("disabled",true);
        document.getElementById("sendCodeButton").style.cursor="auto";
        document.getElementById("sendCodeButton").value=curCount+"s重新发送";
        InterValObj=window.setInterval(setRemainTime,1000);
        var url="/client/sendUpdateCode";
        xhr.open("POST",url,true);
        xhr.send();
    }
}

//设置时间
function setRemainTime() {
    if(curCount==1){
        window.clearInterval(InterValObj);
        document.getElementById("sendCodeButton").removeAttribute("disabled");
        document.getElementById("sendCodeButton").value="发送验证码";
        document.getElementById("sendCodeButton").style.cursor="pointer";
    }else {
        --curCount;
        document.getElementById("sendCodeButton").value=curCount+"s重新发送";
    }
}

/*-------------检查旧密码--------------------------*/
function checkOldPassword() {
    //旧密码
    var oldPassword = document.getElementById("oldPassword").value;
    if(oldPassword.length == 0) {
        document.getElementById("error-tip3").innerText = "旧密码不能为空";
    }else{
        document.getElementById("error-tip3").innerText = null;
    }
}

/*------------检查新密码---------------------*/
function checkNewPassword() {
    //旧密码
    var oldPassword = document.getElementById("oldPassword").value;
    //新密码
    var newPassword = document.getElementById("newPassword").value;

    if(newPassword.length == 0){
        document.getElementById("error-tip4").innerText = "新密码不能为空";
    }else if(oldPassword==newPassword){
        document.getElementById("error-tip4").innerText = "新密码和旧密码不能相等";
    }else{
        document.getElementById("error-tip4").innerText = null;
    }
}

/*-------------检查确认密码--------------------------*/
function checkRePassword() {
    //新密码
    var newPassword = document.getElementById("newPassword").value;
    //确认密码
    var rePassword = document.getElementById("rePassword").value;
    if(rePassword.length==0){
        document.getElementById("error-tip5").innerText = "确认密码不能为空";
    }else if(newPassword!=rePassword){
        document.getElementById("error-tip5").innerText = "确认密码与新密码不相等";
    }else{
        document.getElementById("error-tip5").innerText = null;
    }
}


/*------------检查点击修改密码按钮时-----------*/
function checkUpdatePwd() {
    //图形验证码值
    var validateCode = document.getElementById("validateCode").value;
    //短信验证码
    var verificationCode = document.getElementById("verificationCode").value;
    //旧密码
    var oldPassword = document.getElementById("oldPassword").value;
    //新密码
    var newPassword = document.getElementById("newPassword").value;
    //确认密码
    var rePassword = document.getElementById("rePassword").value;
    //修改按钮
    var updateButton= document.getElementById("updateButton");

    if(validateCode.length==0||verificationCode.length==0||oldPassword.length==0||newPassword.length==0||rePassword.length==0){
        updateButton.setAttribute("disabled",true);
        updateButton.style.cursor = "auto";
    }else{
        updateButton.removeAttribute("disabled");
        updateButton.style.cursor = "pointer";
    }


}