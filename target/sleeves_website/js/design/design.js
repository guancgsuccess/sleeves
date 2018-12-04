function jumpPage() {

    var page = document.getElementById("pageCode").value;
    var companyId = document.getElementById("companyId").innerText;
    var companyName = document.getElementById("companyName").innerText;

        console.log("page = " + page + "companyId = " + companyId + "companyName = " + companyName);
    window.location.href="/design/getDesignByPage?pages="+page+"&companyId="+companyId+"&companyName="+companyName;

    console.log("/design/getDesignByPage?pages="+page+"companyId="+companyId+"companyName="+companyName);

}