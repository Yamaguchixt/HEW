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




var championName = new Array();
championName[0]="Aatrox";
championName[1]="Ahri";
championName[2]="Akali";
championName[3]="Alistar";
championName[4]="Amumu";
championName[5]="Anivia";
championName[6]="Annie";
championName[7]="Ashe";
championName[8]="Azir";
championName[9]="Blitzcrank";
championName[10]="Brand";
championName[11]="Braum";
championName[12]="Caitlyn";
championName[13]="Cassiopeia";
championName[14]="Chogath";
championName[15]="Corki";
championName[16]="Darius";
championName[17]="Diana";
championName[18]="DrMundo";
championName[19]="Draven";
championName[20]="Elise";
championName[21]="Evelynn";
championName[22]="Ezreal";
championName[23]="FiddleSticks";
championName[24]="Fiora";
championName[25]="Fizz";
championName[26]="Galio";
championName[27]="Gangplank";
championName[28]="Garen";
championName[29]="Gnar";
championName[30]="Gragas";
championName[31]="Graves";
championName[32]="Hecarim";
championName[33]="Heimerdinger";
championName[34]="Irelia";
championName[35]="Janna";
championName[36]="JarvanIV";
championName[37]="Jax";
championName[38]="Jayce";
championName[39]="Jinx";
championName[40]="Kalista";
championName[41]="Karma";
championName[42]="Karthus";
championName[43]="Kassadin";
championName[44]="Katarina";
championName[45]="Kayle";
championName[46]="Kennen";
championName[47]="Khazix";
championName[48]="KogMaw";
championName[49]="Leblanc";
championName[50]="LeeSin";
championName[51]="Leona";
championName[52]="Lissandra";
championName[53]="Lucian";
championName[54]="Lulu";
championName[55]="Lux";
championName[56]="Malphite";
championName[57]="Malzahar";
championName[58]="Maokai";
championName[59]="MasterYi";
championName[60]="MissFortune";
championName[61]="Mordekaiser";
championName[62]="Morgana";
championName[63]="Nami";
championName[64]="Nasus";
championName[65]="Nautilus";
championName[66]="Nidalee";
championName[67]="Nocturne";
championName[68]="Nunu";
championName[69]="Olaf";
championName[70]="Orianna";
championName[71]="Pantheon";
championName[72]="Poppy";
championName[73]="Quinn";
championName[74]="Rammus";
championName[75]="RekSai";
championName[76]="Renekton";
championName[77]="Rengar";
championName[78]="Riven";
championName[79]="Rumble";
championName[80]="Ryze";
championName[81]="Sejuani";
championName[82]="Shaco";
championName[83]="Shen";
championName[84]="Shyvana";
championName[85]="Singed";
championName[86]="Sion";
championName[87]="Sivir";
championName[88]="Skarner";
championName[89]="Sona";
championName[90]="Soraka";
championName[91]="Swain";
championName[92]="Syndra";
championName[93]="Talon";
championName[94]="Taric";
championName[95]="Teemo";
championName[96]="Thresh";
championName[97]="Tristana";
championName[98]="Trundle";
championName[99]="Tryndamere";
championName[100]="TwistedFate";
championName[101]="Twitch";
championName[102]="Udyr";
championName[103]="Urgot";
championName[104]="Varus";
championName[105]="Vayne";
championName[106]="Veigar";
championName[107]="Velkoz";
championName[108]="Vi";
championName[109]="Viktor";
championName[110]="Vladimir";
championName[111]="Volibear";
championName[112]="Warwick";
championName[113]="MonkeyKing";
championName[114]="Xerath";
championName[115]="XinZhao";
championName[116]="Yasuo";
championName[117]="Yorick";
championName[118]="Zac";
championName[119]="Zed";
championName[120]="Ziggs";
championName[121]="Zilean";
championName[122]="Zyra";

//画像の自動切り替え
/*
function changeImgByTimer(){
	var index = Math.floor(Math.random()*122);  //どのチャンピョンを使うか
	var subIndex = index % 4;								//どのスキンを使うか	
	count = (count+1)%4;//どの画像を変更するか
	var element = document.getElementById("title_img"+count);
	
	document.getElementById("title_img"+count).src="http://ddragon.leagueoflegends.com/cdn/img/champion/loading/"+championName[index]+"_"+subIndex+".jpg";
}
*//*
$(function(){
	var i;
	setInterval(
			function(){
				for (i=0; i<4 ; i++){
					var index = Math.floor(Math.random()*122)%123;  
					var subIndex = index % 2;							
					$("#title_img"+i+" img:first").after('<img src="http://ddragon.leagueoflegends.com/cdn/img/champion/loading/'+championName[index]+'_'+subIndex+'.jpg" alt="title" error="altanate('+i+')" />');
					$("#title_img"+i+" img:first").fadeOut("slow",function(){
						$(this).remove();
						 
					});
					 
				}
			}
			,3000
	);
});*/
$(function(){
	var timer = 3000;
	setInterval(
			function(){
					var index = Math.floor(Math.random()*122)%123;  
					var subIndex = index % 2;							
					$("#title_img0 img:first").after('<img src="http://ddragon.leagueoflegends.com/cdn/img/champion/loading/'+championName[index]+'_'+subIndex+'.jpg"  />');
					$("#title_img0 img:first").fadeOut(1000,function(){
						$(this).remove();
					});
			}
			,3220
	);
	
	setInterval(
			function(){
					var index = Math.floor(Math.random()*122)%123;  
					var subIndex = index % 2;							
					$("#title_img1 img:first").after('<img src="http://ddragon.leagueoflegends.com/cdn/img/champion/loading/'+championName[index]+'_'+subIndex+'.jpg" alt="title"  />');
					$("#title_img1 img:first").fadeOut(1000,function(){
						$(this).remove();
					});
			}
			,3370
	);
	
	setInterval(
			function(){
					var index = Math.floor(Math.random()*122)%123;  
					var subIndex = index % 2;							
					$("#title_img2 img:first").after('<img src="http://ddragon.leagueoflegends.com/cdn/img/champion/loading/'+championName[index]+'_'+subIndex+'.jpg" alt="title"  />');
					$("#title_img2 img:first").fadeOut(1000,function(){
						$(this).remove();
					});
			}
			,3490
	);
	
	setInterval(
			function(){
					var index = Math.floor(Math.random()*122)%123;  
					var subIndex = index % 2;							
					$("#title_img3 img:first").after('<img src="http://ddragon.leagueoflegends.com/cdn/img/champion/loading/'+championName[index]+'_'+subIndex+'.jpg" alt="title" />');
					$("#title_img3 img:first").fadeOut(1000,"linear",function(){
						$(this).remove();
					});
			}
			,3220
	);
});

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

$(function(){
	$("#subImg a").mouseover(function(){
		$("#mainImg img").before("<img src='"+$(this).attr("href")+"'width='743' height='438'>");
		$("#mainImg img:last").fadeOut("slow",function(){
			$(this).remove();
		});
	});
});











