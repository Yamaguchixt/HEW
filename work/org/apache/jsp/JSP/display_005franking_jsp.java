/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.41
 * Generated at: 2015-02-21 18:06:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class display_005franking_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"Content-Style-Type\" content=\"text/css\" />\r\n");
      out.write("        <meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\" />\r\n");
      out.write("        <link href=\"/HEW/CSS/common.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <script type=\"text/javascript\" src=\"/HEW/JavaScript/jquery-1.11.2.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"/HEW/JavaScript/common.js\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<title>ランキング</title>\r\n");
      out.write("\t\t<style>\r\n");
      out.write("\t\t\t#plot{\r\n");
      out.write("\t\t\t\tborder :solid 2px #DDD;\r\n");
      out.write("\t\t\t\twidth :1100;\r\n");
      out.write("\t\t\t\theight :10000px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#imgfield{\r\n");
      out.write("\t\t\t\tborder :solid 1px #F00;\r\n");
      out.write("\t\t\t\twidth :70px;\r\n");
      out.write("\t\t\t\theight :8700px;\r\n");
      out.write("\t\t\t\tfloat :left;\r\n");
      out.write("\t\t\t\tmargin :489px 0px 0px 100px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.icon{\r\n");
      out.write("\t\t\t\twidth :50px;\r\n");
      out.write("\t\t\t\theight :63px;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#graphfield{\r\n");
      out.write("\t\t\t\twidth :900px;\r\n");
      out.write("\t\t\t\theight :10000px;\r\n");
      out.write("\t\t\t\tfloat :left;\r\n");
      out.write("\t\t\t\tborder :solid 3px #00F;\r\n");
      out.write("\t\t\t\tmargin :30px 80px 0px 0px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.imgfieldsub{\r\n");
      out.write("\t\t\t\tmargin-top :11px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("\t\t<div id=\"plot\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div id=\"imgfield\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div id=\"imgfield1\">\r\n");
      out.write("\t\t\t\t\t<script type=\"text/javascript\" >\r\n");
      out.write(" \t\t\t\t\t\tfor(var i = 0 ; i <=20 ; i++){\r\n");
      out.write(" \t\t\t\t\t\t\tdocument.write(\"<p class='icon' id='\"+i+\"' ><img src='http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/\"+championName[i]+\".png' width='60px' height='64px' /> </p>\");\r\n");
      out.write(" \t\t\t\t\t\t}               \r\n");
      out.write("\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"imgfieldsub\">\r\n");
      out.write("\t\t\t\t\t<script type=\"text/javascript\" >\r\n");
      out.write(" \t\t\t\t\t\tfor(var i = 21 ; i <=40 ; i++){\r\n");
      out.write(" \t\t\t\t\t\t\tdocument.write(\"<p class='icon' id='\"+i+\"' ><img src='http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/\"+championName[i]+\".png' width='60px' height='64px' /> </p>\");\r\n");
      out.write(" \t\t\t\t\t\t}               \r\n");
      out.write("\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"imgfieldsub\">\r\n");
      out.write("\t\t\t\t\t<script type=\"text/javascript\" >\r\n");
      out.write(" \t\t\t\t\t\tfor(var i = 41 ; i <=60 ; i++){\r\n");
      out.write(" \t\t\t\t\t\t\tdocument.write(\"<p class='icon' id='\"+i+\"' ><img src='http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/\"+championName[i]+\".png' width='60px' height='64px' /> </p>\");\r\n");
      out.write(" \t\t\t\t\t\t}               \r\n");
      out.write("\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"imgfieldsub\">\r\n");
      out.write("\t\t\t\t\t<script type=\"text/javascript\" >\r\n");
      out.write(" \t\t\t\t\t\tfor(var i = 61 ; i <=80 ; i++){\r\n");
      out.write(" \t\t\t\t\t\t\tdocument.write(\"<p class='icon' id='\"+i+\"' ><img src='http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/\"+championName[i]+\".png' width='60px' height='64px' /> </p>\");\r\n");
      out.write(" \t\t\t\t\t\t}               \r\n");
      out.write("\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"imgfieldsub\">\r\n");
      out.write("\t\t\t\t\t<script type=\"text/javascript\" >\r\n");
      out.write(" \t\t\t\t\t\tfor(var i = 81 ; i <=100 ; i++){\r\n");
      out.write(" \t\t\t\t\t\t\tdocument.write(\"<p class='icon' id='\"+i+\"' ><img src='http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/\"+championName[i]+\".png' width='60px' height='64px' /> </p>\");\r\n");
      out.write(" \t\t\t\t\t\t}               \r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"imgfieldsub\">\r\n");
      out.write("\t\t\t\t\t<script type=\"text/javascript\" >\r\n");
      out.write(" \t\t\t\t\t\tfor(var i = 101 ; i <=122 ; i++){\r\n");
      out.write(" \t\t\t\t\t\t\tdocument.write(\"<p class='icon' id='\"+i+\"' ><img src='http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/\"+championName[i]+\".png' width='60px' height='64px' /> </p>\");\r\n");
      out.write(" \t\t\t\t\t\t}               \r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div><!-- close imgfield -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div id=\"graphfield\">\r\n");
      out.write("\t\t\t\t<img src=\"/HEW/RankingBarGraph\" alt=\"graph\" width=\"900\" height=\"8700\" />\r\n");
      out.write("\t\t\t</div><!--  close graphfield -->\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div> <!--  close wrapper -->\r\n");
      out.write("\t</body>\r\n");
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
