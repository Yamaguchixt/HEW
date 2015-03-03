<%@ page language="java"  contentType="text/html; charset=UTF-8 " pageEncoding="UTF-8"%>
<%@ page import ="riot.*" %>
<%@ page import ="org.json.*" %>
<%@ page import = "java.util.*" %>
<%@ page import ="riot.MatchHistory.GameInfo" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="Content-Style-Type" content="text/css" />
    <meta http-equiv="Content-Script-Type" content="text/javascript" />
     <link href="/HEW/CSS/common.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="/HEW/JavaScript/jquery-1.11.2.js"></script>
    <script type="text/javascript" src="/HEW/JavaScript/common.js"></script>	
	
	<title>Match History</title>
	
<%
	String summonerName = request.getParameter("summonerName");
	ArrayList<GameInfo> gameList = null;
	 gameList = MatchHistory.createMatchHistory(summonerName);
	
	
	
	GameInfo game1  = gameList.get(0);
	GameInfo game2  = gameList.get(1);
	GameInfo game3  = gameList.get(2);
	GameInfo game4  = gameList.get(3);
	GameInfo game5  = gameList.get(4);
	GameInfo game6  = gameList.get(5);
	GameInfo game7  = gameList.get(6);
	GameInfo game8  = gameList.get(7);
	GameInfo game9  = gameList.get(8);
	GameInfo game10= gameList.get(9);
	
%>
	
	<style>
		body{color :#FFF;}
		.game{
			width :1100px;		height :200px;
			border :solid 1px #EEE;
			background-color :rgba(218,80,25,0.2);
			margin :30px auto 0px auto;
			padding-top :10px;
			border-radius : 30px;
		}
		
		.column1{
			width :150px;	height :200px;
			float :left;
			margin :0px 15px 0px 15px;
			padding :15px;
		}
				.championimg{	width :120px;	height :120px; border-radius :30px;	}
				.result{	width :150px;	heigth :50px;	 color :#DA5019; font-size :2em; margin:10px; padding-left :20px;}
				
		.column2{
			width :150px;	height :200px;
			float :left;
			margin :0px 15px 0px 15px;
			padding :15px;
		}
				.spell{width :70px;		height :70x;	}
				.type{width :150px; 	height :50px;  overflow:hidden; font-size :.8em;padding-top:10px;}
		
		.column3{
			width :150px;	height :200px;
			float :left;
			margin :0px 15px 0px 15px;
			padding :15px;
		}
				.score{	width :150px;	height :40px;	}
				
		.column4{
			width :400px;	height :200px;
			float :left;
			margin :0px 15px 0px 15px;
			padding :15px;
		}
				.itemarea{width :430px;	height:100px;}
				
				.item{
				width :64px;	height :64px;	
				float :left;
			}
		
		
	
	</style>
	
</head>
<body>



 <div id="wrapper">
 	
 	<div class="game" id="game1">
 	
 		<div class="column1">
 			<div class="championimg" ><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/<%= game1.championName %>.png" /></div>
 			<div class="result" id="resultgame1"><%= game1.result %></div>
 		</div><!--  close column1 -->
 	
 		<div class="column2">
 			<div class="spell"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/spell/<%= game1.spell1 %>.png" /></div>
 			<div class="spell"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/spell/<%= game1.spell2 %>.png" /></div>
 			<div class="type" ><%= game1.subType %></div>
 		</div><!--  close column2 -->
 	
 		<div class="column3">
 			<div class="score"><%= game1.championsKilled %>kill</div>
 			<div class="score"><%= game1.numDeaths %>death</div>
 			<div class="score"><%= game1.assists%>assist</div>
 			<div class="score"><%= game1.getTimeDifference() %></div>
 		</div><!--  close column3 -->
 		
 		<div class="column4">
 			<div class="itemarea">
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game1.item0 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game1.item1 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game1.item2 %>.png" /></div>
 			</div>
 			<div class="itemarea">
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game1.item3 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game1.item4 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game1.item5 %>.png" /></div>
 			</div>
 		</div><!--  close column4 -->
 		
 		
 	</div><!--  close game1 -->
 	
	<div class="game" id="game2">
 	
 		<div class="column1">
 			<div class="championimg" ><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/<%= game2.championName %>.png" /></div>
 			<div class="result" id="resultgame2"><%= game2.result %></div>
 		</div><!--  close column1 -->
 	
 		<div class="column2">
 			<div class="spell"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/spell/<%= game2.spell1 %>.png" /></div>
 			<div class="spell"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/spell/<%= game2.spell2 %>.png" /></div>
 			<div class="type" ><%= game2.subType %></div>
 		</div><!--  close column2 -->
 	
 		<div class="column3">
 			<div class="score"><%= game2.championsKilled %>kill</div>
 			<div class="score"><%= game2.numDeaths %>death</div>
 			<div class="score"><%= game2.assists%>assist</div>
 			<div class="score"><%= game2.getTimeDifference() %></div>
 		</div><!--  close column3 -->
 		
 		<div class="column4">
 			<div class="itemarea">
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game2.item0 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game2.item1 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game2.item2 %>.png" /></div>
 			</div>
 			<div class="itemarea">
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game2.item3 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game2.item4 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game2.item5 %>.png" /></div>
 			</div>
 		</div><!--  close column4 -->
	</div><!-- close game2 -->
	
	<div class="game" id="game3">
 	
 		<div class="column1">
 			<div class="championimg" ><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/<%= game3.championName %>.png" /></div>
 			<div class="result" id="resultgame3"><%= game3.result %></div>
 		</div><!--  close column1 -->
 	
 		<div class="column2">
 			<div class="spell"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/spell/<%= game3.spell1 %>.png" /></div>
 			<div class="spell"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/spell/<%= game3.spell2 %>.png" /></div>
 			<div class="type" ><%= game3.subType %></div>
 		</div><!--  close column2 -->
 	
 		<div class="column3">
 			<div class="score"><%= game3.championsKilled %>kill</div>
 			<div class="score"><%= game3.numDeaths %>death</div>
 			<div class="score"><%= game3.assists%>assist</div>
 			<div class="score"><%= game3.getTimeDifference() %></div>
 		</div><!--  close column3 -->
 			
 		
 		<div class="column4">
 			<div class="itemarea">
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game3.item0 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game3.item1 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game3.item2 %>.png" /></div>
 			</div>
 			<div class="itemarea">
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game3.item3 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game3.item4 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game3.item5 %>.png" /></div>
 			</div>
 		</div><!--  close column4 -->
	</div><!-- close game3 -->
	
	<div class="game" id="game4">
 	
 		<div class="column1">
 			<div class="championimg" ><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/<%= game4.championName %>.png" /></div>
 			<div class="result" id="resultgame4"><%= game4.result %></div>
 		</div><!--  close column1 -->
 	
 		<div class="column2">
 			<div class="spell"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/spell/<%= game4.spell1 %>.png" /></div>
 			<div class="spell"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/spell/<%= game4.spell2 %>.png" /></div>
 			<div class="type" ><%= game4.subType %></div>
 		</div><!--  close column2 -->
 	
 		<div class="column3">
 			<div class="score"><%= game4.championsKilled %>kill</div>
 			<div class="score"><%= game4.numDeaths %>death</div>
 			<div class="score"><%= game4.assists%>assist</div>
 			<div class="score"><%= game4.getTimeDifference() %></div>
 		</div><!--  close column3 -->
 		
 		<div class="column4">
 			<div class="itemarea">
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game4.item0 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game4.item1 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game4.item2 %>.png" /></div>
 			</div>
 			<div class="itemarea">
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game4.item3 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game4.item4 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game4.item5 %>.png" /></div>
 			</div>
 		</div><!--  close column4 -->
	</div><!-- close game4 -->
	
	<div class="game" id="game5">
 	
 		<div class="column1">
 			<div class="championimg" ><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/<%= game5.championName %>.png" /></div>
 			<div class="result" id="resultgame5"><%= game5.result %></div>
 		</div><!--  close column1 -->
 	
 		<div class="column2">
 			<div class="spell"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/spell/<%= game5.spell1 %>.png" /></div>
 			<div class="spell"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/spell/<%= game5.spell2 %>.png" /></div>
 			<div class="type" ><%= game5.subType %></div>
 		</div><!--  close column2 -->
 	
 		<div class="column3">
 			<div class="score"><%= game5.championsKilled %>kill</div>
 			<div class="score"><%= game5.numDeaths %>death</div>
 			<div class="score"><%= game5.assists%>assist</div>
 			<div class="score"><%= game5.getTimeDifference() %></div>
 		</div><!--  close column3 -->
 		
 		<div class="column4">
 			<div class="itemarea">
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game5.item0 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game5.item1 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game5.item2 %>.png" /></div>
 			</div>
 			<div class="itemarea">
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game5.item3 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game5.item4 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game5.item5 %>.png" /></div>
 			</div>
 		</div><!--  close column4 -->
	</div><!-- close game5 -->
	
	<div class="game" id="game6">
 	
 		<div class="column1">
 			<div class="championimg" ><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/<%= game6.championName %>.png" /></div>
 			<div class="result" id="resultgame6"><%= game6.result %></div>
 		</div><!--  close column1 -->
 	
 		<div class="column2">
 			<div class="spell"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/spell/<%= game6.spell1 %>.png" /></div>
 			<div class="spell"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/spell/<%= game6.spell2 %>.png" /></div>
 			<div class="type" ><%= game6.subType %></div>
 		</div><!--  close column2 -->
 	
 		<div class="column3">
 			<div class="score"><%= game6.championsKilled %>kill</div>
 			<div class="score"><%= game6.numDeaths %>death</div>
 			<div class="score"><%= game6.assists%>assist</div>
 			<div class="score"><%= game6.getTimeDifference() %></div>
 		</div><!--  close column3 -->
 		
 		<div class="column4">
 			<div class="itemarea">
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game6.item0 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game6.item1 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game6.item2 %>.png" /></div>
 			</div>
 			<div class="itemarea">
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game6.item3 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game6.item4 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game6.item5 %>.png" /></div>
 			</div>
 		</div><!--  close column4 -->
	</div><!-- close game6 -->
	
	<div class="game" id="game7">
 	
 		<div class="column1">
 			<div class="championimg" ><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/<%= game7.championName %>.png" /></div>
 			<div class="result" id="resultgame7"><%= game7.result %></div>
 		</div><!--  close column1 -->
 	
 		<div class="column2">
 			<div class="spell"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/spell/<%= game7.spell1 %>.png" /></div>
 			<div class="spell"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/spell/<%= game7.spell2 %>.png" /></div>
 			<div class="type" ><%= game7.subType %></div>
 		</div><!--  close column2 -->
 	
 		<div class="column3">
 			<div class="score"><%= game7.championsKilled %>kill</div>
 			<div class="score"><%= game7.numDeaths %>death</div>
 			<div class="score"><%= game7.assists%>assist</div>
 			<div class="score"><%= game7.getTimeDifference() %></div>
 		</div><!--  close column3 -->
 		
 		<div class="column4">
 			<div class="itemarea">
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game7.item0 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game7.item1 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game7.item2 %>.png" /></div>
 			</div>
 			<div class="itemarea">
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game7.item3 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game7.item4 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game7.item5 %>.png" /></div>
 			</div>
 		</div><!--  close column4 -->
	</div><!-- close game7 -->
	
	<div class="game" id="game8">
 	
 		<div class="column1">
 			<div class="championimg" ><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/<%= game8.championName %>.png" /></div>
 			<div class="result" id="resultgame8"><%= game8.result %></div>
 		</div><!--  close column1 -->
 	
 		<div class="column2">
 			<div class="spell"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/spell/<%= game8.spell1 %>.png" /></div>
 			<div class="spell"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/spell/<%= game8.spell2 %>.png" /></div>
 			<div class="type" ><%= game8.subType %></div>
 		</div><!--  close column2 -->
 	
 		<div class="column3">
 			<div class="score"><%= game8.championsKilled %>kill</div>
 			<div class="score"><%= game8.numDeaths %>death</div>
 			<div class="score"><%= game8.assists%>assist</div>
 			<div class="score"><%= game8.getTimeDifference() %></div>
 		</div><!--  close column3 -->
 		
 		<div class="column4">
 			<div class="itemarea">
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game8.item0 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game8.item1 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game8.item2 %>.png" /></div>
 			</div>
 			<div class="itemarea">
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game8.item3 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game8.item4 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game8.item5 %>.png" /></div>
 			</div>
 		</div><!--  close column4 -->
	</div><!-- close game8 -->
	
	<div class="game" id="game9">
 	
 		<div class="column1">
 			<div class="championimg" ><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/<%= game9.championName %>.png" /></div>
 			<div class="result" id="resultgame9"><%= game9.result %></div>
 		</div><!--  close column1 -->
 	
 		<div class="column2">
 			<div class="spell"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/spell/<%= game9.spell1 %>.png" /></div>
 			<div class="spell"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/spell/<%= game9.spell2 %>.png" /></div>
 			<div class="type" ><%= game9.subType %></div>
 		</div><!--  close column2 -->
 	
 		<div class="column3">
 			<div class="score"><%= game9.championsKilled %>kill</div>
 			<div class="score"><%= game9.numDeaths %>death</div>
 			<div class="score"><%= game9.assists%>assist</div>
 			<div class="score"><%= game9.getTimeDifference() %></div>
 		</div><!--  close column3 -->
 		
 		<div class="column4">
 			<div class="itemarea">
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game9.item0 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game9.item1 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game9.item2 %>.png" /></div>
 			</div>
 			<div class="itemarea">
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game9.item3 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game9.item4 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game9.item5 %>.png" /></div>
 			</div>
 		</div><!--  close column4 -->
	</div><!-- close game9 -->
	
	<div class="game" id="game10">
 	
 		<div class="column1">
 			<div class="championimg" ><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/<%= game10.championName %>.png" /></div>
 			<div class="result" id="resultgame10"><%= game10.result %></div>
 		</div><!--  close column1 -->
 	
 		<div class="column2">
 			<div class="spell"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/spell/<%= game10.spell1 %>.png" /></div>
 			<div class="spell"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/spell/<%= game10.spell2 %>.png" /></div>
 			<div class="type" ><%= game10.subType %></div>
 		</div><!--  close column2 -->
 	
 		<div class="column3">
 			<div class="score"><%= game10.championsKilled %>kill</div>
 			<div class="score"><%= game10.numDeaths %>death</div>
 			<div class="score"><%= game10.assists%>assist</div>
 			<div class="score"><%= game10.getTimeDifference() %></div>
 		</div><!--  close column3 -->
 		
 		<div class="column4">
 			<div class="itemarea">
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game10.item0 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game10.item1 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game10.item2 %>.png" /></div>
 			</div>
 			<div class="itemarea">
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game10.item3 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game10.item4 %>.png" /></div>
 				<div class="item"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/item/<%= game10.item5 %>.png" /></div>
 			</div>
 		</div><!--  close column4 -->
	</div><!-- close game10 -->
 
 
  </div><!-- close wrapper -->
	
 
	<script type="text/javascript">
	
		//勝敗に応じて　背景色と文字色を変更
		for (var i = 1 ; i < 11; i++){
			if(document.getElementById('resultgame'+i).textContent == "Win"){
				document.getElementById('resultgame'+i).style.color="#5ec84e";
				var element = document.getElementById('game'+i);
				$(element).css('background-color','rgba(94,200,78,0.2)');
			}
			
		}		
	$(function(){
			
			$.ajax({
				type:'GET',
				url:'http://localhost:8080/HEW/WinrateGraph?summonerName=<%=summonerName%>'
			});
	});
		
			
	</script>
	<a href="http://localhost:8080/HEW/JSP/index.jsp">
	<div id="toTOP"style="width :150px; height: 150px;  position :fixed; bottom :20px; right :50px; color :#FFF; opacity :0.1" onmouseover ="teemo()"	 onmouseout="killteemo()">
		<p style="">TOPへ</p>
		<div style="width :120px; height :120px; overflow :hidden; border-radius :30px;"><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/Teemo.png" /></div>
	</div>
	</a>
	<script type="text/javascript">
	function teemo(){
		document.getElementById("toTOP").style.opacity ="1.0";
	}
	function killteemo(){
		 document.getElementById("toTOP").style.opacity = "0.2";
	}
	</script>
	
</body>
</html>