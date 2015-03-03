<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import ="riot.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="Content-Style-Type" content="text/css" />
    <meta http-equiv="Content-Script-Type" content="text/javascript" />
     <link href="/HEW/CSS/common.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="/HEW/JavaScript/jquery-1.11.2.js"></script>
    <script type="text/javascript" src="/HEW/JavaScript/common.js"></script>

<title>League of legendsをはじめよう</title>

	<style>
		#relative {
			width :1200px;
			height :600px;
			position :relative;
		}
		.absolute {
			position :absolute;
			width :300px;
			height :500px;
			overflow :hidden;
		}
		#title_img0 {	top :0px; left :0px;}
		#title_img1 { 	top :0px; left :310px;}
		#title_img2 {	top :0px; left :620px;}
		#title_img3 {	top :0px; left :930px;}
			
		#freetoplaycontainer{
			padding :30px 0px 30px 0px;
			width :1200px;
			height :400px;
		}	
		.freetoplay{
			width :120px;
			height :120px;
			float :left;
			margin :0px;
			
		}
		.h2{
			font-size :2em;
			width :900px;	height :80px;
			padding-top :40px;
			padding-left:20px;
			text-align :left;
			float :left;
			color :#FFF;
			order :solid 1px #CCC;
		}
		
		a:visited{
			color :#CCC;
		}
		
		#thread {
			text-decoration :none;
		}
		.icon{
			width :100px; height :100px;  
			border-radius :40px;
			overflow :hidden;
			float :left;
		}
		
	</style>
<%
	 String[] freeToPlay = ChampionApi.getFreeToPlay(); 
%>
	
	
</head>

<body>
  <div id="wrapper">
	<div id="header">
	  <div id="header_title">
		 <div id="title_lol">League of legends</div>
		 <div id="title_hazimeyou">をはじめよう</div>
	  </div> <div class="clear"></div>
	<div id="relative">
		<div class="absolute" id="title_img0">
			<img  onerror="changeImg(0)" src="http://ddragon.leagueoflegends.com/cdn/img/champion/loading/Ezreal_0.jpg" alt="title"  />
		</div>
		<div class="absolute" id="title_img1">
			<img   onerror="changeImg(1)" src="http://ddragon.leagueoflegends.com/cdn/img/champion/loading/Ahri_0.jpg" alt="title"  />
		</div>
		<div class="absolute" id="title_img2">
			<img  onerror="changeImg(2)" src="http://ddragon.leagueoflegends.com/cdn/img/champion/loading/Azir_0.jpg" alt="title"  />
		</div>
		<div class="absolute" id="title_img3">
			<img  onerror="changeImg(3)" src="http://ddragon.leagueoflegends.com/cdn/img/champion/loading/Jinx_2.jpg" alt="title"  />	
		</div>
	</div>	
	</div> <!--  close header -->
	
	
	<div id="content"><%-- javascriptが#content h2と指定しているので、残す。  --%>
	
		
		 <div class="icon"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/Lulu.png" / style="float :left;">	 
		 </div>
         <h2 class="h2" >League of legends ってなに？</h2>
         <div class="dd">
         	<p>league of legendsは、プレイヤーがひとりのチャンピョンを操作しながら、5v5で戦う、MOBAです。<br />
                シンプルな操作ながら、初心者から競技レベルのプレイヤーまで幅広く楽しめるゲームです。<br />
                選べるチャンピョンは現在123体おり、今もなお増え続けるともに、毎月、ゲームのバランス調整が施されています。<br />
                日本の運営しか体験したことのない人々にとって衝撃的な運営体制はriotgamesが行っています。
             </p>
          </div><div class="clear"></div>
		
		<div class="icon"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/Singed.png" / style="float :left;">	 
		 </div>	
	 <h2 class="h2">ゲームからeスポーツへ</h2>
	 	<div class="dd"><p>スポーツを人間が考案した施設や技術、ルールに則って営まれる、遊戯・競争・肉体鍛錬の要素を含む身体や頭脳を使った行為として定義するならばleague of legendsのプレイ体験はスポーツです。<br />
				riotは世界各国(アメリカ、EU,中国、韓国、台湾、ブラジル、トルコ、東南アジア)でサービスを提供しており、各国がそれぞれトップのリーグをもっています。<br />
	 		 トップリーグのチームはメンバーが共同生活を営み、日々、プレイのレベル向上をはかっており、これはオーナー企業、スポンサー支援に支えられています。日産はCurceGamingのスポンサーです。<br />
	 		 アメリカや中国では、大学間のリーグも開催され、まさにeスポーツとして、地位を向上させています。
	    </p></div><div class="clear"></div>
	    
	 
	    <div class="icon"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/Katarina.png" / style="float :left;">	 
		 </div> 
	 <h2 class="h2">あなたのサモナーネイムを調べる</h2> 
		<div class="dd" >
	        <form action="/HEW/JSP/member/match_history.jsp" action="post" style=" display :inline ;">
	        	<p>
                  サモナーネイムを入力してください<br />
                  <input type="text" name="summonerName"/>
                <input type="submit" />
                <%
                	String errorMessage = (String)request.getAttribute("errorMessage");
                	if(errorMessage != null){
                		out.println(errorMessage);
                	}
                %>
                </p>
          	 </form>
		 </div><div class="clear"></div>
	 
	 
	 <div class="icon"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/Graves.png" / style="float :left;">	 
		 </div>
	 <h2 class="h2">チャンピョン人気投票</h2>
	 	<div class="dd"><p>
	 		あなたのお気に入りのチャンピョンを投票して、ランキングを確認しましょう
			<a href="/HEW/JSP/question.jsp" >人気投票へ</a>	
	 	</p></div><div class="clear"></div>
	 	
	 	
	 <div class="icon"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/Yasuo.png" / style="float :left;">	 
		 </div>	
	 <h2 class="h2">新規メンバー登録</h2>
	 	<div class="dd"><p>
	 	メンバー登録
	 	<a href="/HEW/JSP/login/register_form.jsp">メンバー登録へ</a>
	 	</p></div><div class="clear"></div>
	 	
	 	
	 <div class="icon"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/Jinx.png" / style="float :left;">	 
		 </div>	
	 <a id="thread" href="/HEW/JSP/board/threadlist.jsp"><h2 class="h2">Thread一覧へ</h2></a>
	 	<div class="dd"><p>
	 		
      
			
	 	</p></div><div class="clear"></div>
	 
	 
	 <div class="icon"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/Azir.png" / style="float :left;">	 
		 </div>
	 <h2 class="h2">グラフ表示</h2>	
	 <div class="dd"><p>
	 <img src="/HEW/images/Winrate.jpeg" />
	 </p></div><div class="clear"></div>
	 
	 <div class="icon"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/Thresh.png" / style="float :left;">	 
		 </div>
	 <h2 class="h2">今週のFree to play</h2>
	 <div class="dd" id="freetoplaycontainer">
	 	<div class="freetoplay"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/<%= freeToPlay[0] %>.png "  /></div>
	 	<div class="freetoplay"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/<%= freeToPlay[1] %>.png "  /></div>
	 	<div class="freetoplay"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/<%= freeToPlay[2] %>.png "  /></div>
	 	<div class="freetoplay"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/<%= freeToPlay[3] %>.png "  /></div>
	 	<div class="freetoplay"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/<%= freeToPlay[4] %>.png "  /></div>
	 	<div class="freetoplay"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/<%= freeToPlay[5] %>.png "  /></div>
	 	<div class="freetoplay"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/<%= freeToPlay[6] %>.png "  /></div>
	 	<div class="freetoplay"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/<%= freeToPlay[7] %>.png "  /></div>
	 	<div class="freetoplay"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/<%= freeToPlay[8] %>.png "  /></div>
	 	<div class="freetoplay"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/<%= freeToPlay[9] %>.png "  /></div>
	</div><div class="clear"></div>
	
	<a href="http://localhost:8080/HEW/JSP/index.jsp">
	<div id="toTOP"style="width :150px; height: 150px;  position :fixed; bottom :20px; right :50px; color :#FFF; opacity :0.4" onmouseover ="teemo()"	 onmouseout="killteemo()">
		<p style="">TOPへ</p>
		<div style="width :120px; height :120px; overflow :hidden; border-radius :30px;"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/Teemo.png" /></div>
	</div>
	</a>
	<script type="text/javascript">
	function teemo(){
		document.getElementById("toTOP").style.opacity ="1.0";
	}
	function killteemo(){
		 document.getElementById("toTOP").style.opacity = "0.4";
	}
	</script>
	 
	</div><!-- close content -->
  </div> <!--  close wrapper -->

</body>

</html>