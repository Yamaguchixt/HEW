var count = 0;
var loadingImg = new Array();


loadingImg[0] = "/HEW/images/champions/loading/irelia.jpg";
loadingImg[1] = "/HEW/images/champions/loading/jarvan4.jpg";
loadingImg[2] = "/HEW/images/champions/loading/jinx.jpg";
loadingImg[3] = "/HEW/images/champions/loading/aatrox.jpg";
loadingImg[4] = "/HEW/images/champions/loading/ahri.jpg";
loadingImg[5] = "/HEW/images/champions/loading/ahri2.jpg";
loadingImg[6] = "/HEW/images/champions/loading/akali.jpg";
loadingImg[7] = "/HEW/images/champions/loading/alister.jpg";
loadingImg[8] = "/HEW/images/champions/loading/annie3.jpg";
loadingImg[9] = "/HEW/images/champions/loading/azir.jpg";
loadingImg[10] = "/HEW/images/champions/loading/draven2.jpg";
loadingImg[11] = "/HEW/images/champions/loading/katarina.jpg";
loadingImg[12] = "/HEW/images/champions/loading/leblanc.jpg";
loadingImg[13] = "/HEW/images/champions/loading/khazix.jpg";
loadingImg[14] = "/HEW/images/champions/loading/jayce.jpg";
loadingImg[15] = "/HEW/images/champions/loading/ezreal.jpg";
loadingImg[16] = "/HEW/images/champions/loading/draven2.jpg";





//indexのimgを変更する
function changeImg(i){
	
    count = Math.floor(Math.random()*17);
	document.getElementById("title_img"+i).src = loadingImg[count];
	count++;
}


//スライドでテキストを表示
$(function(){
	$(".dd:not(:first)").css("display","none");
	$("#content h2").click(function(){
		if($("+.dd",this).css("display")=="none"){
			$(".dd").slideUp("slow");
			$("+.dd",this).slideDown("slow");
		}
	});
});


//オススメの画像のsubをmainにおきかえる

/*$(function(){
	$("#subImg a").mouseover(function(){
		$("#mainImg img").attr("src",$(this).attr("href"));
	});
});
*/

$(function(){
	$("#subImg a").mouseover(function(){
		$("#mainImg img").before("<img src='"+$(this).attr("href")+"'width='743' height='438'>");
		$("#mainImg img:last").fadeOut("slow",function(){
			$(this).remove();
		});
	});
});











