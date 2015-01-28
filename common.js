var count = 0;
var loadingImg = new Array();


loadingImg[0] = new Image();
loadingImg[0].src = "./images/champions/loading/irelia.jpg";
loadingImg[1] = new Image();
loadingImg[1].src = "./images/champions/loading/jarvan4.jpg";
loadingImg[2] = new Image();
loadingImg[2].src = "./images/champions/loading/jinx.jpg";




function changeImg(i){
	
    count = Math.floor(Math.random()*3);
	document.getElementById("title_img"+i).src = loadingImg[count].src;
	count++;
}