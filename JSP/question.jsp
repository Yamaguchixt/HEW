<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Style-Type" content="text/css" />
        <meta http-equiv="Content-Script-Type" content="text/javascript" />
         <link href="../CSS/common.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="../JavaScript/jquery-1.11.2.js"></script>
        <script type="text/javascript" src="../JavaScript/common.js"></script>

        <title>チャンピョンアンケート</title>
        <style>
        
        	h2 {
        		text-align :center;	
        		font-size :3em;
        		margin-top :100px;
        		margin-bottom :100px;
        		text-indent :0em;
        		
        	}
        
        	#content{
        		padding-left :50px;	
        	
        	}
             body {
   	             color :#FFF;
             } 
             
             .champion{
             	float :left;
             	overfloa :auto;
             	width :200px;
             	margin-right :20px;
             	text-align: center;
             }
             
             
        </style>
	</head>
<body>
<div id="wrapper">
	<h2>あなたのお気に入りを教えてください</h2>
	
		<div id="content">
			<form action="./database/DB_favarite.jsp" method="post">
				<div class="champion" >
					<img src="http://ddragon.leagueoflegends.com/cdn/img/champion/loading/Aatrox_0.jpg" alt="img" width="200" height="400"  />
					<input type="radio" name="select"  value="Aatrox" />Aatrox
				</div>
				<div class="champion" >
					<img src="http://ddragon.leagueoflegends.com/cdn/img/champion/loading/Ahri_0.jpg" alt="img" width="200" height="400"  />
					<input type="radio" name="select"  value="" />Aatrox
				</div>
				<div class="champion" >
					<img src="http://ddragon.leagueoflegends.com/cdn/img/champion/loading/Annie_0.jpg" alt="img" width="200" height="400"  />
					<input type="radio" name="select"  value="" />Aatrox
				</div>
				<div class="champion" >
					<img src="http://ddragon.leagueoflegends.com/cdn/img/champion/loading/Amumu_0.jpg" alt="img" width="200" height="400"  />
					<input type="radio" name="select"  value="" />Aatrox
				</div>
				<div class="champion" >
					<img src="http://ddragon.leagueoflegends.com/cdn/img/champion/loading/Azir_0.jpg" alt="img" width="200" height="400"  />
					<input type="radio" name="select"  value="" />Aatrox
				</div>
				<br />
	<input type="submit" />		
			
			</form>
		</div><!--  content -->	

	
</div><!--  wrapper -->
</body>
</html>