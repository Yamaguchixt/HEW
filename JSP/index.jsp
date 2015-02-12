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

<title>League of legendsをはじめよう</title>
</head>

<body>
	<div id="wrapper">
	<div id="header">
	  <div id="header_title">
		 <div id="title_lol">League of legends</div>
		 <div id="title_hazimeyou">をはじめよう</div>
	  </div> <div class="clear"></div>

		<img id="title_img1" onmouseover="changeImg(1)" src="/HEW/images/champions/loading/ezreal.jpg" alt="title" width="264" height="480" />
		<img id="title_img2"  onmouseover="changeImg(2)" src="/HEW/images/champions/loading/ahri.jpg" alt="title" width="264" height="480" />
		<img id="title_img3"  onmouseover="changeImg(3)" src="/HEW/images/champions/loading/alister.jpg" alt="title" width="264" height="480" />
		<img id="title_img4"  onmouseover="changeImg(4)" src="/HEW/images/champions/loading/azir.jpg" alt="title" width="264" height="480" />	
		
	</div> <!--  close header -->
	
	
	<div id="content">
	 <h2 >League of legends ってなに？</h2>
         <div class="dd"><p>legue of legendsは、プレイヤーがひとりのチャンピョンを操作しながら、5v5で戦う、MOBAです。<br />
	 			シンプルな操作ながら、初心者から競技レベルのプレイヤーまで幅広く楽しめるゲームです。<br />
	 			選べるチャンピョンは現在123体おり、今もなお増え続けるともに、毎月、ゲームのバランス調整が施されています。<br />
	 			日本の運営しか体験したことのない人々にとって衝撃的な運営体制はriotgamesが行っています。
	 	</p></div>
	 <h2>ゲームからeスポーツへ</h2>
	 	<div class="dd"><p>スポーツを人間が考案した施設や技術、ルールに則って営まれる、遊戯・競争・肉体鍛錬の要素を含む身体や頭脳を使った行為として定義するならばleague of legendsのプレイ体験はスポーツです。<br />
				riotは世界各国(アメリカ、EU,中国、韓国、台湾、ブラジル、トルコ、東南アジア)でサービスを提供しており、各国がそれぞれトップのリーグをもっています。<br />
	 		 トップリーグのチームはメンバーが共同生活を営み、日々、プレイのレベル向上をはかっており、これはオーナー企業、スポンサー支援に支えられています。日産はCurceGamingのスポンサーです。<br />
	 		 アメリカや中国では、大学間のリーグも開催され、まさにeスポーツとして、地位を向上させています。
	  </p></div>
	 <h2>あなたにオススメのchampionはこれだ</h2> 
	<div class="dd"> <p>123体のチャンピョンの中から、あなたにオススメのチャンピョンをセレクトします。<br />
	 		是非、質問に答えて、あなたのお気に入りを見つけてください<br />
	 		<a href="/HEW/JSP/recommend_champion.jsp">オススメチャンピョンをみつける</a>
	 </p></div>
	 <h2>あなたのサモナーネイムを調べる</h2> 
	<div class="dd" >
	        <form action="/HEW/JSP/riot/summonerNameToId.jsp" action="post" style=" display :inline ;">
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
	 	
	 </div>
	
	</div><!-- close content -->
	
	 
<p style="height:200px; display :none">
</p>	
	
	

	
	
	</div> <!--  close wrapper -->
</body>

</html>