package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class leaderboard2_0020_00281_0029_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>bomb </title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <script type=\"text/javascript\" src=\"js\\jquery-1.4.2.min.js\"></script>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("     \n");
      out.write(".table-hover tbody tr:hover td:nth-of-type(5) {\n");
      out.write("      visibility: visible;\n");
      out.write("} \n");
      out.write("   h1{\n");
      out.write("  font-size: 30px;\n");
      out.write("  color: #fff;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("  font-weight: 300;\n");
      out.write("  text-align: center;\n");
      out.write("  margin-bottom: 15px;\n");
      out.write("}\n");
      out.write("table{\n");
      out.write("  width:100%;\n");
      out.write("  table-layout: fixed;\n");
      out.write("}\n");
      out.write(".tbl-header{\n");
      out.write("  background-color: rgba(255,255,255,0.3);\n");
      out.write(" }\n");
      out.write(".tbl-content{\n");
      out.write("  height:300px;\n");
      out.write("  overflow-x:auto;\n");
      out.write("  margin-top: 0px;\n");
      out.write("  border: 1px solid rgba(255,255,255,0.3);\n");
      out.write("}\n");
      out.write("th{\n");
      out.write("  padding: 20px 15px;\n");
      out.write("  text-align: left;\n");
      out.write("  font-weight: 500;\n");
      out.write("  font-size: 12px;\n");
      out.write("  color: #fff;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("}\n");
      out.write("td{\n");
      out.write("  padding: 15px;\n");
      out.write("  text-align: left;\n");
      out.write("  vertical-align:middle;\n");
      out.write("  font-weight: 300;\n");
      out.write("  font-size: 12px;\n");
      out.write("  color: #fff;\n");
      out.write("  border-bottom: solid 1px rgba(255,255,255,0.1);\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* demo styles */\n");
      out.write("\n");
      out.write("/*@import url(http://fonts.googleapis.com/css?family=Roboto:400,500,300,700);*/\n");
      out.write("body{\n");
      out.write("  background: -webkit-linear-gradient(left, #25c481, #25b7c4);\n");
      out.write("  background: linear-gradient(to right, #25c481, #25b7c4);\n");
      out.write("  font-family: 'Roboto', sans-serif;\n");
      out.write("}\n");
      out.write("section{\n");
      out.write("  margin: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/* follow me template */\n");
      out.write(".made-with-love {\n");
      out.write("  margin-top: 40px;\n");
      out.write("  padding: 10px;\n");
      out.write("  clear: left;\n");
      out.write("  text-align: center;\n");
      out.write("  font-size: 10px;\n");
      out.write("  font-family: arial;\n");
      out.write("  color: #fff;\n");
      out.write("}\n");
      out.write(".made-with-love i {\n");
      out.write("  font-style: normal;\n");
      out.write("  color: #F50057;\n");
      out.write("  font-size: 14px;\n");
      out.write("  position: relative;\n");
      out.write("  top: 2px;\n");
      out.write("}\n");
      out.write(".made-with-love a {\n");
      out.write("  color: #fff;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write(".made-with-love a:hover {\n");
      out.write("  text-decoration: underline;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/* for custom scrollbar for webkit browser*/\n");
      out.write("\n");
      out.write("::-webkit-scrollbar {\n");
      out.write("    width: 6px;\n");
      out.write("} \n");
      out.write("::-webkit-scrollbar-track {\n");
      out.write("    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3); \n");
      out.write("} \n");
      out.write("::-webkit-scrollbar-thumb {\n");
      out.write("    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3); \n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    $(window).on(\"load resize \", function() {\n");
      out.write("  var scrollWidth = $('.tbl-content').width() - $('.tbl-content table').width();\n");
      out.write("  $('.tbl-header').css({'padding-right':scrollWidth});\n");
      out.write("}).resize();\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("    <body>\n");
      out.write("         <style>\n");
      out.write("      .table-hover tbody tr td:nth-of-type(2) {\n");
      out.write("    color: #ffffff;\n");
      out.write("    text-decoration:none;\n");
      out.write("    visibility: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".table-hover tbody tr:hover td:nth-of-type(2) {\n");
      out.write("      visibility: visible;\n");
      out.write("} \n");
      out.write("  </style>\n");
      out.write("        <section> <!--for demo wrap-->\n");
      out.write("<h1>leaderboard</h1>  \n");
      out.write("\n");
      out.write("<div  class=\"tbl-header\">\n");
      out.write("<table  class=\"table table-hover table-striped\"  cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("  <thead>\n");
      out.write("    <tr>\n");
      out.write("      <th>Rank</th>\n");
      out.write("      <th></th>\n");
      out.write("      <th>Name</th>\n");
      out.write("      <th>Score</th>\n");
      out.write("      <th>Time</th>\n");
      out.write("      <th>Team</th>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("<div  class=\"tbl-content\">\n");
      out.write("<table class=\"table table-hover table-striped\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("  <tbody>\n");
      out.write("    <tr>\n");
      out.write("      <td>AAC</td>\n");
      out.write("      <td><a href=\"dashboard.jsp\">COMPARE</a></td>\n");
      out.write("      <td>AUSTRALIAN COMPANY </td>\n");
      out.write("      <td>$1.38</td>\n");
      out.write("      <td>+2.01</td>\n");
      out.write("      <td>-0.36%</td>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>AAD</td>\n");
      out.write("      <td>COMPARE</td>\n");
      out.write("      <td>AUSENCO</td>\n");
      out.write("      <td>$2.38</td>\n");
      out.write("      <td>-0.01</td>\n");
      out.write("      <td>-1.36%</td>\n");
      out.write("      x\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>AAX</td>\n");
      out.write("      <td>COMPARE</td>\n");
      out.write("      <td>ADELAIDE</td>\n");
      out.write("      <td>$3.22</td>\n");
      out.write("      <td>+0.01</td>\n");
      out.write("      <td>+1.36%</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>XXD</td>\n");
      out.write("      <td>COMPARE</td>\n");
      out.write("      <td>ADITYA BIRLA</td>\n");
      out.write("      <td>$1.02</td>\n");
      out.write("      <td>-1.01</td>\n");
      out.write("      <td>+2.36%</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>AAC</td>\n");
      out.write("      <td>COMPARE</td>\n");
      out.write("      <td>AUSTRALIAN COMPANY </td>\n");
      out.write("      <td>$1.38</td>\n");
      out.write("      <td>+2.01</td>\n");
      out.write("      <td>-0.36%</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>AAD</td>\n");
      out.write("      <td>COMPARE</td>\n");
      out.write("      <td>AUSENCO</td>\n");
      out.write("      <td>$2.38</td>\n");
      out.write("      <td>-0.01</td>\n");
      out.write("      <td>-1.36%</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>AAX</td>\n");
      out.write("      <td>COMPARE</td>\n");
      out.write("      <td>ADELAIDE</td>\n");
      out.write("      <td>$3.22</td>\n");
      out.write("      <td>+0.01</td>\n");
      out.write("      <td>+1.36%</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>XXD</td>\n");
      out.write("      <td>COMPARE</td>\n");
      out.write("      <td>ADITYA BIRLA</td>\n");
      out.write("      <td>$1.02</td>\n");
      out.write("      <td>-1.01</td>\n");
      out.write("      <td>+2.36%</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>AAC</td>\n");
      out.write("      <td>COMPARE</td>\n");
      out.write("      <td>AUSTRALIAN COMPANY </td>\n");
      out.write("      <td>$1.38</td>\n");
      out.write("      <td>+2.01</td>\n");
      out.write("      <td>-0.36%</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>AAD</td>\n");
      out.write("       <td>COMPARE</td>\n");
      out.write("      <td>AUSENCO</td>\n");
      out.write("      <td>$2.38</td>\n");
      out.write("      <td>-0.01</td>\n");
      out.write("      <td>-1.36%</td>\n");
      out.write("     \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>AAX</td>\n");
      out.write("       <td>COMPARE</td>\n");
      out.write("      <td>ADELAIDE</td>\n");
      out.write("      <td>$3.22</td>\n");
      out.write("      <td>+0.01</td>\n");
      out.write("      <td>+1.36%</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>XXD</td>\n");
      out.write("       <td>COMPARE</td>\n");
      out.write("      <td>ADITYA BIRLA</td>\n");
      out.write("      <td>$1.02</td>\n");
      out.write("      <td>-1.01</td>\n");
      out.write("      <td>+2.36%</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>AAC</td>\n");
      out.write("       <td>COMPARE</td>\n");
      out.write("      <td>AUSTRALIAN COMPANY </td>\n");
      out.write("      <td>$1.38</td>\n");
      out.write("      <td>+2.01</td>\n");
      out.write("      <td>-0.36%</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>AAD</td>\n");
      out.write("       <td>COMPARE</td>\n");
      out.write("      <td>AUSENCO</td>\n");
      out.write("      <td>$2.38</td>\n");
      out.write("      <td>-0.01</td>\n");
      out.write("      <td>-1.36%</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>AAX</td>\n");
      out.write("       <td>COMPARE</td>\n");
      out.write("      <td>ADELAIDE</td>\n");
      out.write("      <td>$3.22</td>\n");
      out.write("      <td>+0.01</td>\n");
      out.write("      <td>+1.36%</td>\n");
      out.write("     \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>XXD</td>\n");
      out.write("       <td>COMPARE</td>\n");
      out.write("      <td>ADITYA BIRLA</td>\n");
      out.write("      <td>$1.02</td>\n");
      out.write("      <td>-1.01</td>\n");
      out.write("      <td>+2.36%</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>AAC</td>\n");
      out.write("       <td>COMPARE</td>\n");
      out.write("      <td>AUSTRALIAN COMPANY </td>\n");
      out.write("      <td>$1.38</td>\n");
      out.write("      <td>+2.01</td>\n");
      out.write("      <td>-0.36%</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>AAD</td>\n");
      out.write("       <td>COMPARE</td>\n");
      out.write("      <td>AUSENCO</td>\n");
      out.write("      <td>$2.38</td>\n");
      out.write("      <td>-0.01</td>\n");
      out.write("      <td>-1.36%</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>AAX</td>\n");
      out.write("       <td>COMPARE</td>\n");
      out.write("      <td>ADELAIDE</td>\n");
      out.write("      <td>$3.22</td>\n");
      out.write("      <td>+0.01</td>\n");
      out.write("      <td>+1.36%</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>XXD</td>\n");
      out.write("       <td>COMPARE</td>\n");
      out.write("      <td>ADITYA BIRLA</td>\n");
      out.write("      <td>$1.02</td>\n");
      out.write("      <td>-1.01</td>\n");
      out.write("      <td>+2.36%</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>AAC</td>\n");
      out.write("       <td>COMPARE</td>\n");
      out.write("      <td>AUSTRALIAN COMPANY </td>\n");
      out.write("      <td>$1.38</td>\n");
      out.write("      <td>+2.01</td>\n");
      out.write("      <td>-0.36%</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>AAD</td>\n");
      out.write("       <td>COMPARE</td>\n");
      out.write("      <td>AUSENCO</td>\n");
      out.write("      <td>$2.38</td>\n");
      out.write("      <td>-0.01</td>\n");
      out.write("      <td>-1.36%</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>AAX</td>\n");
      out.write("       <td>COMPARE</td>\n");
      out.write("      <td>ADELAIDE</td>\n");
      out.write("      <td>$3.22</td>\n");
      out.write("      <td>+0.01</td>\n");
      out.write("      <td>+1.36%</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>XXD</td>\n");
      out.write("       <td>COMPARE</td>\n");
      out.write("      <td>ADITYA BIRLA</td>\n");
      out.write("      <td>$1.02</td>\n");
      out.write("      <td>-1.01</td>\n");
      out.write("      <td>+2.36%</td>\n");
      out.write("     \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>AAC</td>\n");
      out.write("       <td>COMPARE</td>\n");
      out.write("      <td>AUSTRALIAN COMPANY </td>\n");
      out.write("      <td>$1.38</td>\n");
      out.write("      <td>+2.01</td>\n");
      out.write("      <td>-0.36%</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>AAD</td>\n");
      out.write("       <td>COMPARE</td>\n");
      out.write("      <td>AUSENCO</td>\n");
      out.write("      <td>$2.38</td>\n");
      out.write("      <td>-0.01</td>\n");
      out.write("      <td>-1.36%</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>AAX</td>\n");
      out.write("       <td>COMPARE</td>\n");
      out.write("      <td>ADELAIDE</td>\n");
      out.write("      <td>$3.22</td>\n");
      out.write("      <td>+0.01</td>\n");
      out.write("      <td>+1.36%</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>XXD</td>\n");
      out.write("       <td>COMPARE</td>\n");
      out.write("      <td>ADITYA BIRLA</td>\n");
      out.write("      <td>$1.02</td>\n");
      out.write("      <td>-1.01</td>\n");
      out.write("      <td>+2.36%</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>AAC</td>\n");
      out.write("       <td>COMPARE</td>\n");
      out.write("      <td>AUSTRALIAN COMPANY </td>\n");
      out.write("      <td>$1.38</td>\n");
      out.write("      <td>+2.01</td>\n");
      out.write("      <td>-0.36%</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>AAD</td>\n");
      out.write("       <td>COMPARE</td>\n");
      out.write("      <td>AUSENCO</td>\n");
      out.write("      <td>$2.38</td>\n");
      out.write("      <td>-0.01</td>\n");
      out.write("      <td>-1.36%</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>AAX</td>\n");
      out.write("       <td>COMPARE</td>\n");
      out.write("      <td>ADELAIDE</td>\n");
      out.write("      <td>$3.22</td>\n");
      out.write("      <td>+0.01</td>\n");
      out.write("      <td>+1.36%</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>XXD</td>\n");
      out.write("       <td>COMPARE</td>\n");
      out.write("      <td>ADITYA BIRLA</td>\n");
      out.write("      <td>$1.02</td>\n");
      out.write("      <td>-1.01</td>\n");
      out.write("      <td>+2.36%</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- follow me template -->\n");
      out.write("<div class=\"made-with-love\">\n");
      out.write("  Made with \n");
      out.write("  <i>♥</i> by \n");
      out.write("  <a target=\"_blank\" href=\"http://codepen.io/nikhil8krishnan\">PRAGYA PANWAR</a>\n");
      out.write("</div>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t\n");
      out.write("$(\"tr\").not(':firs<t').hover(\n");
      out.write("  function () {\n");
      out.write("    $(this).css(\"background\",\"green\");\n");
      out.write("  }, \n");
      out.write("  function () {\n");
      out.write("    $(this).css(\"background\",\"\");\n");
      out.write("  }\n");
      out.write(");\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("</script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
