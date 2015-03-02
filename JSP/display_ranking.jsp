<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Style-Type" content="text/css" />
        <meta http-equiv="Content-Script-Type" content="text/javascript" />
        <link href="/HEW/CSS/common.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="/HEW/JavaScript/jquery-1.11.2.js"></script>
        <script type="text/javascript" src="/HEW/JavaScript/common.js"></script>
		
		<title>ランキング</title>
		<style>
			#plot{
				width :1100;
				height :10000px;
			}
			#imgfield{
				width :70px;
				height :8700px;
				float :left;
				margin :489px 0px 0px 100px;
			}
			.icon{
				width :50px;
				height :63px;
				
			}
			#graphfield{
				width :900px;
				height :10000px;
				float :left;
				margin :30px 80px 0px 0px;
			}
			.imgfieldsub{
				margin-top :11px;
			}
		</style>
	</head>
	<body>
	<div id="wrapper">
		<div id="plot">
			
			<div id="imgfield">
				
				<div id="imgfield1">
					<script type="text/javascript" >
 						for(var i = 0 ; i <=20 ; i++){
 							document.write("<p class='icon' id='"+i+"' ><img src='http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/"+championName[i]+".png' width='60px' height='64px' /> </p>");
 						}               
				</script>
				</div>
				
				<div class="imgfieldsub">
					<script type="text/javascript" >
 						for(var i = 21 ; i <=40 ; i++){
 							document.write("<p class='icon' id='"+i+"' ><img src='http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/"+championName[i]+".png' width='60px' height='64px' /> </p>");
 						}               
				</script>
				</div>
				<div class="imgfieldsub">
					<script type="text/javascript" >
 						for(var i = 41 ; i <=60 ; i++){
 							document.write("<p class='icon' id='"+i+"' ><img src='http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/"+championName[i]+".png' width='60px' height='64px' /> </p>");
 						}               
				</script>
				</div>
				<div class="imgfieldsub">
					<script type="text/javascript" >
 						for(var i = 61 ; i <=80 ; i++){
 							document.write("<p class='icon' id='"+i+"' ><img src='http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/"+championName[i]+".png' width='60px' height='64px' /> </p>");
 						}               
				</script>
				</div>
				<div class="imgfieldsub">
					<script type="text/javascript" >
 						for(var i = 81 ; i <=100 ; i++){
 							document.write("<p class='icon' id='"+i+"' ><img src='http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/"+championName[i]+".png' width='60px' height='64px' /> </p>");
 						}               
					</script>
				</div>
				<div class="imgfieldsub">
					<script type="text/javascript" >
 						for(var i = 101 ; i <=122 ; i++){
 							document.write("<p class='icon' id='"+i+"' ><img src='http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/"+championName[i]+".png' width='60px' height='64px' /> </p>");
 						}               
					</script>
				</div>
				
				
			</div><!-- close imgfield -->
			
			<div id="graphfield">
				<img src="/HEW/RankingBarGraph" alt="graph" width="900" height="8700" />
			</div><!--  close graphfield -->	<div class="clear"></div>
		
		
		</div>
	</div> <!--  close wrapper -->
	</body>
</html>