function imgOver(img) {
    document.getElementById("bi").src = img.src;
    img.className = "previewSmallImg"
}
function imgOut(img) {
    img.className = "viewSmallImg";
}