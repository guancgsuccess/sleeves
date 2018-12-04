var xhr = null;

var url_index = "/index/loadCompanyInfo";
var url_raiders = "/index/loadRaidersInfo";
window.onload= function() {
    loadCompanyData(url_index);
};

function loadCompanyData(url_index) {
    if (window.XMLHttpRequest){
        xhr = new XMLHttpRequest();
    }else {
        xhr = new ActiveXObject('Microsoft.XMLHTTP')
    }
    xhr.open("GET",url_index);
    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
    xhr.onreadystatechange = getCompanyData;
    xhr.send();
}

function getCompanyData() {
    if(xhr.readyState==4 && xhr.status==200){

        var result = JSON.parse(xhr.responseText);

        var companyInfo = document.getElementById("company-info");
        companyInfo.innerHTML=" ";
        for(var i=0;i<result.length;i++){
            companyInfo.innerHTML+=`
                        <li>
                            <a href="/company/companyDetail?companyId=${result[i].companyId}">
                                <img src="/${result[i].field2}"  />
                            </a>
                            <label class="describe">
                                <a href="/company/companyDetail?companyId=${result[i].companyId}">
                                    ${result[i].companyName}
                                </a>
                            </label>
                        </li>
                    `
        }

        loadRaidersData(url_raiders);
    }
}

function loadRaidersData(url_raiders) {
    if (window.XMLHttpRequest){
        xhr = new XMLHttpRequest();
    }else {
        xhr = new ActiveXObject('Microsoft.XMLHTTP')
    }

    xhr.open("GET",url_raiders,true);
    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
    xhr.onreadystatechange = getRaidersData;
    xhr.send(null);
}

function getRaidersData() {
    if(xhr.readyState==4 && xhr.status==200){
        var list = JSON.parse(xhr.responseText);

        var raidersBody = document.getElementById("raiders-info");
        raidersBody.innerHTML = " ";
        for(var j=0;j<list.length;j++){
            raidersBody.innerHTML +=`
                            <li>
								<div class="raiders-name">
									<label>装修攻略</label>
									<span>
									    <a href="/raiders/raidersInfo?raidersId=${list[j].raidersId}" target="_blank">
                                            ${list[j].raidersTitle}
									    </a>
									</span>
								</div>
								<div class="raiders-content">
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${list[j].raidersIntroduce}
								</div>
							</li>                       
             `
        }


    }
}


/*-----------------------------------------------------------*/
function checkPlace({innerText: cityName}){
    document.getElementById("position").innerText=cityName

    var placeName = document.getElementById("position").innerText
    console.log("接受到的地点名称为:" +placeName)

    var url_index = "/index/loadCompanyInfoByCity?placeName="+placeName;
    xhr.open("GET",url_index);
    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
    xhr.onreadystatechange = getCompanyDataByCity;
    xhr.send();
}

function getCompanyDataByCity() {
    if(xhr.readyState==4 && xhr.status==200){
        var cityInfo = JSON.parse(xhr.responseText);

        var companyBody = document.getElementById("company-info");
        companyBody.innerHTML=" ";
        for(var i=0;i<cityInfo.length;i++){
            companyBody.innerHTML+=`
                        <li>
                            <a href="/company/companyDetail?companyId=${cityInfo[i].companyId}">
                                <img src="/${cityInfo[i].field2}"  />
                            </a>
                            <label class="describe">
                                <a href="/company/companyDetail?companyId=${cityInfo[i].companyId}">
                                    ${cityInfo[i].companyName}
                                </a>
                            </label>
                        </li>
                    `
        }
    }
}