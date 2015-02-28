<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import ="HEW.*" %>
<%@ page import ="board.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="Content-Style-Type" content="text/css" />
    <meta http-equiv="Content-Script-Type" content="text/javascript" />
    <link href="/HEW/CSS/common.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="/HEW/JavaScript/jquery-1.11.2.js"></script>
    <script type="text/javascript" src="/HEW/JavaScript/common.js"></script>
	<title>Thread List</title>

	<style>
		body {
			color :#fff;
		}
		#threadlist{
			width :700px;
			float :left;
			height :2000px;
			background-color :rgba(255,255,255,0.3);
		}
		
		#threadcreate{
			width :400px;
			height :2000px;
			float :right;
		}
		.thread{
			color :#FFF;
			font-size :2em;
			width :600px;
			height :50px;
			padding :20px 0px 0px 20px;
		}
		a{
			text-decoration:none;
		}
		a:link {color :#FFF;	} a:visited { color :#FFF;}
		a:hover {color :#aaa;}
	</style>
</head>
<body>

<div id="wrapper">
	<div id="threadlist">
		<%
			board.Thread threadroot = DBinterface.createThreadList();
			threadroot.getThreadList(out);
		%>
	</div>	<!-- threadlist close -->
	
	<div id="threadcreate">
        <div class="form">
                <form id="createthread" action="/HEW/ThreadDispatcher" method="post">
                        threadのタイトル<input type="text" name="threadtitle"/>
                        threadの内容<input type="text" name="threadcontent"/>
                         <input name="type" value="thread"  style="display :none;" />
                         <input type="submit" value="threadの作成"/>
                </form>
        </div>
     </div>
     
     
</div><!--  close wrapper -->
</body>
</html>