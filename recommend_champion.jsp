<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
 <link href="./common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="./jquery-1.11.2.js"></script>
<script type="text/javascript" src="./common.js"></script>

<title>オススメ　チャンピョン</title>
</head>
<body>
<div id="wrapper">
	<div id="header">
	  <div id="header_title">
		 <div id="title_lol">League of legends</div>
		 <div id="title_hazimeyou">をはじめよう</div>
	  </div> <div class="clear"></div>

		<img id="title_img1" onmouseover="changeImg(1)" src="./images/champions/loading/ezreal.jpg" alt="title" width="264" height="480" />
		<img id="title_img2"  onmouseover="changeImg(2)" src="./images/champions/loading/ahri.jpg" alt="title" width="264" height="480" />
		<img id="title_img3"  onmouseover="changeImg(3)" src="./images/champions/loading/alister.jpg" alt="title" width="264" height="480" />
		<img id="title_img4"  onmouseover="changeImg(4)" src="./images/champions/loading/azir.jpg" alt="title" width="264" height="480" />	
		
	</div> <!--  close header -->
	
	<div id="recommend">
	
		<div class="question">
        <p style="margin :30px;">好きなvisualを選んでください</p>
                <form class="form" action="result.jsp" method="post">
                        <p class="radio"><input type="radio" name="answer" value="annie" />女の子</p>
                        <p class="radio"><input type="radio" name="answer" value="draven" />男の子</p>
                        <p class="radio"><input type="radio" name="answer" value="3" />忍者</p>
                        <p class="radio"><input type="radio" name="answer" value="4" />メカ</p>
                        <p class="radio"><input type="submit" value="送信" />
                </form>
         </div> 
	
	<div class="question">
        <p style="margin :30px;">好きな~を選んでください</p>
                <form class="form" action="result.jsp" method="post">
                        <p class="radio"><input type="radio" name="answer" value="annie" />女の子</p>
                        <p class="radio"><input type="radio" name="answer" value="b" />男の子</p>
                        <p class="radio"><input type="radio" name="answer" value="c" />忍者</p>
                        <p class="radio"><input type="radio" name="answer" value="d" />メカ</p>
                        <p class="radio"><input type="submit" value="送信" />
                </form>
         </div> 
         
         <div class="question">
        <p style="margin :30px;">好きな~を選んでください</p>
                <form class="form" action="result.jsp" method="post">
                        <p class="radio"><input type="radio" name="answer" value="1" />女の子</p>
                        <p class="radio"><input type="radio" name="answer" value="2" />男の子</p>
                        <p class="radio"><input type="radio" name="answer" value="3" />忍者</p>
                        <p class="radio"><input type="radio" name="answer" value="4" />メカ</p>
                        <p class="radio"><input type="submit" value="送信" />
                </form>
         </div> 
	
	
	</div><!--  close recommend -->

</div>
	
</body>
</html>