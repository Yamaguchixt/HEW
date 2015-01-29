var count = 0;
var loadingImg = new Array();


loadingImg[0] = "./images/champions/loading/irelia.jpg";
loadingImg[1] = "./images/champions/loading/jarvan4.jpg";
loadingImg[2] = "./images/champions/loading/jinx.jpg";
loadingImg[3] = "./images/champions/loading/aatrox.jpg";
loadingImg[4] = "./images/champions/loading/ahri.jpg";
loadingImg[5] = "./images/champions/loading/ahri2.jpg";
loadingImg[6] = "./images/champions/loading/akali.jpg";
loadingImg[7] = "./images/champions/loading/alister.jpg";
loadingImg[8] = "./images/champions/loading/annie3.jpg";
loadingImg[9] = "./images/champions/loading/azir.jpg";
loadingImg[10] = "./images/champions/loading/draven2.jpg";
loadingImg[11] = "./images/champions/loading/katarina.jpg";
loadingImg[12] = "./images/champions/loading/leblanc.jpg";
loadingImg[13] = "./images/champions/loading/khazix.jpg";
loadingImg[14] = "./images/champions/loading/jayce.jpg";
loadingImg[15] = "./images/champions/loading/ezreal.jpg";
loadingImg[16] = "./images/champions/loading/draven2.jpg";





//indexのimgを変更する
function changeImg(i){
	
    count = Math.floor(Math.random()*17);
	document.getElementById("title_img"+i).src = loadingImg[count];
	count++;
}

$(function(){
	$("#test").css("color","red");
});


$(function(){
	$(".dd:not(:first)").css("display","none");
	$("#content h2").click(function(){
		if($("+.dd",this).css("display")=="none"){
			$(".dd").slideUp("slow");
			$("+.dd",this).slideDown("slow");
		}
	});
});




