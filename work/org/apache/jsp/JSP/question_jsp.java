/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.41
 * Generated at: 2015-02-20 07:28:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class question_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"Content-Style-Type\" content=\"text/css\" />\r\n");
      out.write("        <meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\" />\r\n");
      out.write("         <link href=\"/HEW/CSS/common.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <script type=\"text/javascript\" src=\"/HEW/JavaScript/jquery-1.11.2.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"/HEW/JavaScript/common.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <title>チャンピョンアンケート</title>\r\n");
      out.write("        <style>\r\n");
      out.write("        \t \r\n");
      out.write("        \t body {\r\n");
      out.write("   \t             color :#FFF;\r\n");
      out.write("             } \r\n");
      out.write("        \th2 {\r\n");
      out.write("        \t\ttext-align :center;\t\r\n");
      out.write("        \t\tfont-size :3em;\r\n");
      out.write("        \t\tmargin-top :100px;\r\n");
      out.write("        \t\tmargin-bottom :100px;\r\n");
      out.write("        \t\ttext-indent :0em;\r\n");
      out.write("        \t\t\r\n");
      out.write("        \t}\r\n");
      out.write("        \t/*champion icon */\t\r\n");
      out.write("             .icon{\r\n");
      out.write("            \tdisplay :block;\r\n");
      out.write("            \twidth :150px;\r\n");
      out.write("            \theight :150px;\r\n");
      out.write("            \tmargin :0px;\r\n");
      out.write("            \tfloat :left;\r\n");
      out.write("            } \r\n");
      out.write("             #input{\r\n");
      out.write("             \twidth :1000px;\r\n");
      out.write("             \theight :100px;\r\n");
      out.write("             \tpadding :;\r\n");
      out.write("             }\r\n");
      out.write("            input[type=\"text\"]  {\r\n");
      out.write("             \tcolor :#AAA;\r\n");
      out.write("             }\r\n");
      out.write("             #submit {\r\n");
      out.write("             \tfloat :right;\r\n");
      out.write("             \tmargin-right :100px;\r\n");
      out.write("\t\t\t\tdisplay :inline-bolck;\r\n");
      out.write("             \twidth :300px;\r\n");
      out.write("             \theight :70px;\r\n");
      out.write("             }\r\n");
      out.write("        </style>\r\n");
      out.write("\t</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("\t<h2>あなたのお気に入りを教えてください</h2>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div id=\"content\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<form action=\"./database/DB_favarite.jsp\" method=\"post\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t<div id=\"input\"> <!--  このTextが変更されるたびに入力から正規表現をつくって、championと照合し、表示を決定する -->\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"serch\" value=\"絞り込み検索ができます\" onfocus=\"erase()\" id=\"serch\" onChange=\"test()\" />\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"このチャンピョンに投票する\" id=\"submit\" />\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                <script type=\"text/javascript\" >\r\n");
      out.write("                //<![CDATA[\r\n");
      out.write("                           \r\n");
      out.write("                //アイコン生成     \r\n");
      out.write(" \t\t\t\tfor(var i = 0 ; i <=122 ; i++){\r\n");
      out.write(" \t\t\t\t\tdocument.write(\"<p class='icon' id='\"+i+\"' ><input type='radio' name='select'  value=\"+championName[i]+\" />\"+championName[i]+\" <img src='http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/\"+championName[i]+\".png' /> </p>\");\r\n");
      out.write(" \t\t\t\t}               \r\n");
      out.write("                \r\n");
      out.write(" \t\t\t\t//textにfocusされたらデフォルトの文字をけす\r\n");
      out.write(" \t\t\t\tfunction erase(){\r\n");
      out.write(" \t\t\t\t\tvar element = document.getElementById(\"serch\");\r\n");
      out.write(" \t\t\t\t\tvar num = element.value;\r\n");
      out.write(" \t\t\t\t\tvar string = \"絞り込み検索ができます\";\r\n");
      out.write(" \t\t\t\t\tif(num == string){\r\n");
      out.write(" \t\t\t\t\t\tdocument.getElementById(\"serch\").value = \"\";\r\n");
      out.write(" \t\t\t\t\t\telement.style.color=\"#000\";\r\n");
      out.write(" \t\t\t\t\t}\r\n");
      out.write(" \t\t\t\t}\r\n");
      out.write("                           \r\n");
      out.write("                 function test(){\r\n");
      out.write("                \t //textの入力から正規表現つくる\r\n");
      out.write("                \tvar words = document.getElementById(\"serch\").value;\r\n");
      out.write("                \t//入力が空になったら、絞り込み直しとしてすべての要素を再表示する \r\n");
      out.write("                \t if(words == \"\"){\r\n");
      out.write("                \t\tvar array = document.getElementsByClassName(\"icon\");\r\n");
      out.write("                \t\tfor(var i=0; i < 123; i++){ \r\n");
      out.write("                \t\t\t$(function(){$(array[i]).fadeIn(\"slow\")});\r\n");
      out.write("                \t\t}\r\n");
      out.write("                \t}\r\n");
      out.write("                \tvar regEx = new RegExp(\"^\"+words+\".*\",\"i\");\r\n");
      out.write("                \t\r\n");
      out.write("                \tfor (var i = 0; i <=122; i++ ){\r\n");
      out.write("                \t//matchしない要素はnoneにする要素は表示させる\r\n");
      out.write("                \t\tif(!   (regEx.test(championName[i]))   ){\r\n");
      out.write("                \t\t\tvar element = document.getElementById(i);\r\n");
      out.write("                \t\t\t//element.style.display = \"none\";\r\n");
      out.write("                \t\t\t$(function(){$(element).fadeOut(\"slow\")});\r\n");
      out.write("                \t\t}else{\r\n");
      out.write("                \t\t\tvar element = document.getElementById(i);\r\n");
      out.write("                \t\t\t$(function(){$(element).fadeIn(\"slow\")});\r\n");
      out.write("                \t\t}\r\n");
      out.write("                \t}\r\n");
      out.write("                \t \r\n");
      out.write("                 }  //test()\r\n");
      out.write("                 //]]>\r\n");
      out.write("                </script>      \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div><!--  content -->\t\r\n");
      out.write("\r\n");
      out.write("</div><!--  wrapper -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
