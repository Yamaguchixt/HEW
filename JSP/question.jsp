<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Style-Type" content="text/css" />
        <meta http-equiv="Content-Script-Type" content="text/javascript" />
         <link href="/HEW/CSS/common.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="/HEW/JavaScript/jquery-1.11.2.js"></script>
        <script type="text/javascript" src="/HEW/JavaScript/common.js"></script>

        <title>チャンピョンアンケート</title>
        <style>
        	 
        	 body {
   	             color :#FFF;
             } 
        	h2 {
        		text-align :center;	
        		font-size :3em;
        		margin-top :100px;
        		margin-bottom :100px;
        		text-indent :0em;
        		
        	}
        	/*champion icon */	
             .icon{
            	display :block;
            	width :150px;
            	height :150px;
            	margin :0px;
            	float :left;
            } 
             #input{
             	width :1000px;
             	height :100px;
             	padding :;
             }
            input[type="text"]  {
             	color :#AAA;
             }
             #submit {
             	float :right;
             	margin-right :100px;
				display :inline-bolck;
             	width :300px;
             	height :70px;
             }
        </style>
	</head>
<body>

<div id="wrapper">
	<h2>あなたのお気に入りを教えてください</h2>
	
		<div id="content">
		
			<form action="./database/DB_favarite.jsp" method="post">
		
				<div id="input"> <!--  このTextが変更されるたびに入力から正規表現をつくって、championと照合し、表示を決定する -->
					<input type="text" name="serch" value="絞り込み検索ができます" onfocus="erase()" id="serch" onChange="test()" />
					<input type="submit" value="このチャンピョンに投票する" id="submit" />		
				</div>
				
                <script type="text/javascript" >
                //<![CDATA[
                           
                //アイコン生成     
 				for(var i = 0 ; i <=122 ; i++){
 					document.write("<p class='icon' id='"+i+"' ><input type='radio' name='select'  value="+championName[i]+" />"+championName[i]+" <img src='http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/"+championName[i]+".png' /> </p>");
 				}               
                
 				//textにfocusされたらデフォルトの文字をけす
 				function erase(){
 					var element = document.getElementById("serch");
 					var num = element.value;
 					var string = "絞り込み検索ができます";
 					if(num == string){
 						document.getElementById("serch").value = "";
 						element.style.color="#000";
 					}
 				}
                           
                 function test(){
                	 //textの入力から正規表現つくる
                	var words = document.getElementById("serch").value;
                	//入力が空になったら、絞り込み直しとしてすべての要素を再表示する 
                	 if(words == ""){
                		var array = document.getElementsByClassName("icon");
                		for(var i in array){
                			$(function(){$(array[i]).fadeIn("slow")});
                		}
                	}
                	var regEx = new RegExp("^"+words+".*","i");
                	
                	for (var i = 0; i <=122; i++ ){
                	//matchしない要素はnoneにする要素は表示させる
                		if(!   (regEx.test(championName[i]))   ){
                			var element = document.getElementById(i);
                			//element.style.display = "none";
                			$(function(){$(element).fadeOut("slow")});
                		}else{
                			var element = document.getElementById(i);
                			$(function(){$(element).fadeIn("slow")});
                		}
                	}
                	 
                 }  //test()
                 //]]>
                </script>      
				
			</form>
		</div><!--  content -->	

</div><!--  wrapper -->
</body>
</html>