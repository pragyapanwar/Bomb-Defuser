package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class startVideo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" ng-app=\"blog\">\n");
      out.write("<head>\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Lato\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write(".\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\t\n");
      out.write("\t<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />\n");
      out.write("\t<meta content=\"yes\" name=\"mobile-web-app-capable\">\n");
      out.write("\t<meta content=\"yes\" name=\"apple-mobile-web-app-capable\">\n");
      out.write("\t<meta content=\"yes\" name=\"apple-touch-fullscreen\">\n");
      out.write("\n");
      out.write("\t<!-- TWITTER CARDS HERE -->\n");
      out.write("    <meta name=\"twitter:card\" content=\"summary_large_image\">\n");
      out.write("\t<meta name=\"twitter:site\" content=\"@OmnilabsLTD\">\n");
      out.write("\t<meta name=\"twitter:creator\" content=\"@OmnilabsLTD\">\n");
      out.write("\t<meta name=\"twitter:title\" content=\"Omnilabs\">\n");
      out.write("\t<meta name=\"twitter:description\" content=\"Omnilabs was created in 2013 by a group of talented engineers. Innovation is what we live for. Perfection is our second name.\">\n");
      out.write("\t<meta name=\"twitter:image\" content=\"/images/cover-img.jpg\">\n");
      out.write("    <!-- TWITTER CARDS ENDS HERE -->\n");
      out.write("\n");
      out.write("    <!-- FACEBOOK TAGS HERE -->\n");
      out.write("    <meta property=\"fb:app_id\" content=\"https://www.facebook.com/The-Bombsquad-441417446000174/\">\n");
      out.write("    <meta property=\"og:title\" content=\"The Bombsquad\">\n");
      out.write("\t<meta property=\"og:image\" content=\"/images/cover-img.jpg\">\n");
      out.write("\t<meta property=\"og:url\" content=\"\">\n");
      out.write("\t<meta property=\"og:description\" content=\"Omnilabs was created in 2013 by a group of talented engineers. Innovation is what we live for. Perfection is our second name.\">\n");
      out.write("\t<!-- FACEBOOK TAGS END HERE -->\t\n");
      out.write("\n");
      out.write("    <title>Bombsquad - Defuse the Bomb</title>\n");
      out.write("\t\n");
      out.write("\t<!-- Open Graph -->\n");
      out.write("\t<meta property=\"og:title\" content=\"Bombsquad - Defuse the Bomb\" />\n");
      out.write("\t<meta property=\"og:type\" content=\"website\" />\n");
      out.write("\t<meta property=\"og:url\" content=\"http://bombsquad.army/index.html\"/>\n");
      out.write("\t<meta property=\"og:image\" content=\"http://bombsquad.army/images/preview.jpg\" />\n");
      out.write("\t<meta name=\"author\" content=\"Omnilabs LTD\">\n");
      out.write("\t<meta name=\"description\" content=\"Official website of Bombsquad - Defuse the Bomb, game for ios, devices.\">\n");
      out.write("\t<meta name=\"keywords\" content=\"bomb,squad,defuse,game,gaming,ios,bombsquad,best,defusing,ultimate,entertainment,disposal,expert,Bombsquad\">\n");
      out.write("\t<!-- END Open Graph -->\n");
      out.write("\t\n");
      out.write("\t<link rel=\"apple-touch-icon\" sizes=\"57x57\" href=\"/apple-touch-icon-57x57.png\">\n");
      out.write("\t<link rel=\"apple-touch-icon\" sizes=\"60x60\" href=\"/apple-touch-icon-60x60.png\">\n");
      out.write("\t<link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"/apple-touch-icon-72x72.png\">\n");
      out.write("\t<link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"/apple-touch-icon-76x76.png\">\n");
      out.write("\t<link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"/apple-touch-icon-114x114.png\">\n");
      out.write("\t<link rel=\"apple-touch-icon\" sizes=\"120x120\" href=\"/apple-touch-icon-120x120.png\">\n");
      out.write("\t<link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"/apple-touch-icon-144x144.png\">\n");
      out.write("\t<link rel=\"apple-touch-icon\" sizes=\"152x152\" href=\"/apple-touch-icon-152x152.png\">\n");
      out.write("\t<link rel=\"apple-touch-icon\" sizes=\"180x180\" href=\"/apple-touch-icon-180x180.png\">\n");
      out.write("\t<link type=\"image/x-icon\" href=\"/favicon.ico\" rel=\"shortcut icon\">\n");
      out.write("\t<link type=\"image/x-icon\" href=\"/favicon.ico\" rel=\"icon\">\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"/favicon-32x32.png\" sizes=\"32x32\">\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"/android-chrome-192x192.png\" sizes=\"192x192\">\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"/favicon-96x96.png\" sizes=\"96x96\">\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"/favicon-16x16.png\" sizes=\"16x16\">\n");
      out.write("\t<link rel=\"manifest\" href=\"/manifest.json\">\n");
      out.write("\t<link rel=\"mask-icon\" href=\"/safari-pinned-tab.svg\" color=\"#5bbad5\">\n");
      out.write("\t<meta name=\"msapplication-TileColor\" content=\"#da532c\">\n");
      out.write("\t<meta name=\"msapplication-TileImage\" content=\"/mstile-144x144.png\">\n");
      out.write("\t<meta name=\"theme-color\" content=\"#ffffff\">\n");
      out.write("\t<link rel=\"stylesheet\" media=\"all\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">\n");
      out.write("\t<link href='https://fonts.googleapis.com/css?family=Roboto:400,700,900' rel='stylesheet' type='text/css'>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/blueimp-gallery.min.css\">\t\n");
      out.write("\n");
      out.write("<script>setTimeout(function(){window.location.href='TitlePage.jsp'},11000);</script>\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("@import url(http://fonts.googleapis.com/css?family=Titan+One);\n");
      out.write("/* BODY */\n");
      out.write("body {\n");
      out.write("  position: fixed;\n");
      out.write("  top: -4%;\n");
      out.write("  left: -0.6%;\n");
      out.write("  right: 0;\n");
      out.write("  bottom: 0;\n");
      out.write("  width: 100%;  \n");
      out.write("  height: 100%;\n");
      out.write("  background-color: #000000;\n");
      out.write("  background-image: -webkit-linear-gradient(90deg, skyblue 0%, steelblue 100%);\n");
      out.write("  background-attachment: fixed;\n");
      out.write("  background-size: 100% 100%;\n");
      out.write("  overflow: hidden;\n");
      out.write("}\n");
      out.write("::selection {\n");
      out.write("  background: transparent;\n");
      out.write("}\n");
      out.write("/* CLOUDS */\n");
      out.write("body:before {\n");
      out.write("  content: '';\n");
      out.write("  position: fixed;\n");
      out.write("  top: 0;\n");
      out.write("  left: 0;\n");
      out.write("  right: 0;\n");
      out.write("  width: 0;\n");
      out.write("  height: 0;\n");
      out.write("  //margin: auto;\n");
      out.write("   //margin-top: 5%;\n");
      out.write("  border-radius: 100%;\n");
      out.write("  background: transparent;\n");
      out.write("  display: block;\n");
      out.write("  \n");
      out.write("  box-shadow: 0 0 150px 100px rgba(255, 255, 255, .6),\n");
      out.write("              200px 0 200px 150px rgba(255, 255, 255, .6),\n");
      out.write("              -250px 0 300px 150px rgba(255, 255, 255, .6),\n");
      out.write("              550px 0 300px 200px rgba(255, 255, 255, .6),\n");
      out.write("              -550px 0 300px 200px rgba(255, 255, 255, .6);\n");
      out.write("}\n");
      out.write("/* JUMP */\n");
      out.write("h1 {\n");
      out.write("  cursor: default;\n");
      out.write("  position: absolute;\n");
      out.write("  top: 30px;\n");
      out.write("  left: 0;\n");
      out.write("  right: 0;\n");
      out.write("  bottom: 0;\n");
      out.write("  height: 100px;\n");
      out.write("  margin: auto;\n");
      out.write("  display: block;\n");
      out.write(" margin-top:5%; \n");
      out.write("\n");
      out.write("  -webkit-animation: bounce 2s ease 1 alternate;\n");
      out.write("  -webkit-animation-delay:10s;\n");
      out.write("    -webkit-animation\n");
      out.write("  font-family: 'Titan One', cursive;\n");
      out.write("  font-size: 80px;\n");
      out.write("  color: #ffffff;\n");
      out.write("  text-align: center;\n");
      out.write("  line-height: 100px;\n");
      out.write("  text-shadow: 0 1px 0 #CCC,\n");
      out.write("               0 2px 0 #CCC,\n");
      out.write("               0 3px 0 #CCC,\n");
      out.write("               0 4px 0 #CCC,\n");
      out.write("               0 5px 0 #CCC,\n");
      out.write("               0 6px 0 transparent,\n");
      out.write("               0 7px 0 transparent,\n");
      out.write("               0 8px 0 transparent,\n");
      out.write("               0 9px 0 transparent,\n");
      out.write("               0 10px 10px rgba(0, 0, 0, .6);\n");
      out.write("}\n");
      out.write("\n");
      out.write("z{-webkit-animation: seconds 12.5s forwards;\n");
      out.write("  -webkit-animation-iteration-count: 1;\n");
      out.write(" -webkit-animation-delay:0s;\n");
      out.write("\n");
      out.write("}\n");
      out.write("@-webkit-keyframes seconds {\n");
      out.write("  0% {\n");
      out.write("    opacity: 0;\n");
      out.write("  }\n");
      out.write(" 50%{ opacity:0;}\n");
      out.write(" 75%{opacity:0;}\n");
      out.write("  100% {\n");
      out.write("    opacity: 1;\n");
      out.write("    left: -30px; \n");
      out.write("  }\n");
      out.write("}\n");
      out.write("@keyframes seconds {\n");
      out.write("  0% {\n");
      out.write("    opacity: 0;\n");
      out.write("  } 50%{ opacity:0;}\n");
      out.write(" 75%{opacity:0;}\n");
      out.write(" \n");
      out.write("  100% {\n");
      out.write("    opacity: 1;\n");
      out.write("    left: -30px; \n");
      out.write("  }\n");
      out.write("}\n");
      out.write("/* ANIMATION */\n");
      out.write("@-webkit-keyframes bounce {\n");
      out.write("  0%{ left:-905px;  top:0;\n");
      out.write("    0 1px 0 #CCC,\n");
      out.write("                 0 2px 0 #CCC,\n");
      out.write("                 0 3px 0 #CCC,\n");
      out.write("                 0 4px 0 #CCC,\n");
      out.write("                 0 5px 0 #CCC,\n");
      out.write("                 0 6px 0 #CCC,\n");
      out.write("                 0 7px 0 #CCC,\n");
      out.write("                 0 8px 0 #CCC,\n");
      out.write("                 0 9px 0 #CCC,\n");
      out.write("                 0 30px 30px rgba(0, 0, 0, .3);\n");
      out.write("  }\n");
      out.write("25%{\n");
      out.write("left:0px; top: 500px;  right:400px;\n");
      out.write(" 0 1px 0 #CCC,\n");
      out.write("                 0 2px 0 #CCC,\n");
      out.write("                 0 3px 0 #CCC,\n");
      out.write("                 0 4px 0 #CCC,\n");
      out.write("                 0 5px 0 #CCC,\n");
      out.write("                 0 6px 0 #CCC,\n");
      out.write("                 0 7px 0 #CCC,\n");
      out.write("                 0 8px 0 #CCC,\n");
      out.write("                 0 9px 0 #CCC,\n");
      out.write("                 0 30px 30px rgba(0, 0, 0, .3);\n");
      out.write("}\n");
      out.write("  50%{\n");
      out.write("   left:1000px;  top:200px; right:300px;  0 1px 0 #CCC,\n");
      out.write("                 0 2px 0 #CCC,\n");
      out.write("                 0 3px 0 #CCC,\n");
      out.write("                 0 4px 0 #CCC,\n");
      out.write("                 0 5px 0 #CCC,\n");
      out.write("                 0 6px 0 #CCC,\n");
      out.write("                 0 7px 0 #CCC,\n");
      out.write("                 0 8px 0 #CCC,\n");
      out.write("                 0 9px 0 #CCC,\n");
      out.write("                 0 30px 30px rgba(0, 0, 0, .3);\n");
      out.write("\n");
      out.write("} \n");
      out.write("69%{\n");
      out.write("top:-20px; left:49px;\n");
      out.write(" transform:translateZ(400px);\n");
      out.write("  transform:rotate(360deg);\n");
      out.write(" text-shadow: 0 1px 0 #CCC,\n");
      out.write("                 0 2px 0 #CCC,\n");
      out.write("                 0 3px 0 #CCC,\n");
      out.write("                 0 4px 0 #CCC,\n");
      out.write("                 0 5px 0 #CCC,\n");
      out.write("                 0 6px 0 #CCC,\n");
      out.write("                 0 7px 0 #CCC,\n");
      out.write("                 0 8px 0 #CCC,\n");
      out.write("                 0 9px 0 #CCC,\n");
      out.write("                 0 30px 30px rgba(0, 0, 0, .6);\n");
      out.write("  } \n");
      out.write("\n");
      out.write("84%{\n");
      out.write("top:-20px; left:49px;\n");
      out.write(" transform:translateZ(-400px);\n");
      out.write("  transform:rotate(360deg);\n");
      out.write(" text-shadow: 0 1px 0 #CCC,\n");
      out.write("                 0 2px 0 #CCC,\n");
      out.write("                 0 3px 0 #CCC,\n");
      out.write("                 0 4px 0 #CCC,\n");
      out.write("                 0 5px 0 #CCC,\n");
      out.write("                 0 6px 0 #CCC,\n");
      out.write("                 0 7px 0 #CCC,\n");
      out.write("                 0 8px 0 #CCC,\n");
      out.write("                 0 9px 0 #CCC,\n");
      out.write("                 0 30px 30px rgba(0, 0, 0, .6);\n");
      out.write("  } \n");
      out.write(" 100% {\n");
      out.write("    top: -30px;\n");
      out.write("    left:49px;\n");
      out.write("transform:translateZ(0px);\n");
      out.write("\n");
      out.write("    text-shadow: 0 1px 0 #CCC,\n");
      out.write("                 0 2px 0 #CCC,\n");
      out.write("                 0 3px 0 #CCC,\n");
      out.write("                 0 4px 0 #CCC,\n");
      out.write("                 0 5px 0 #CCC,\n");
      out.write("                 0 6px 0 #CCC,\n");
      out.write("                 0 7px 0 #CCC,\n");
      out.write("                 0 8px 0 #CCC,\n");
      out.write("                 0 9px 0 #CCC,\n");
      out.write("                 0 30px 30px rgba(0, 0, 0, .3);\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("/* make keyframes that tell the start state and the end state of our object */\n");
      out.write(" \n");
      out.write("@-webkit-keyframes fadeIn { from { opacity:0; } to { opacity:1; } }\n");
      out.write("@-moz-keyframes fadeIn { from { opacity:0; } to { opacity:1; } }\n");
      out.write("@keyframes fadeIn { from { opacity:0; } to { opacity:1; } }\n");
      out.write(" \n");
      out.write(".fade-in {\n");
      out.write("\topacity:0;  /* make things invisible upon start */\n");
      out.write("\t-webkit-animation:fadeIn ease-in 1;/* Safari */\n");
      out.write("//    named fadeIn, use animattion ease-in and repeat it only 1 time */\t-moz-animation:fadeIn ease-in 1;\n");
      out.write("animation:fadeIn ease-in 1;\n");
      out.write(" \n");
      out.write("/*\t-webkit-animation-fill-mode:forwards;  /* this makes sure that after animation is done we remain at the last keyframe value (opacity: 1)*/\n");
      out.write("\t-moz-animation-fill-mode:forwards;\n");
      out.write("\tanimation-fill-mode:forwards;*/\n");
      out.write(" -webkit-animation-duration:0.1s;\n");
      out.write("\t-moz-animation-duration:0.1s;\n");
      out.write("\tanimation-duration:0.1s;\n");
      out.write("}\n");
      out.write(" \n");
      out.write(".fade-in.one {\n");
      out.write("-webkit-animation-delay: 0.7s;\n");
      out.write("-moz-animation-delay: 0.7s;\n");
      out.write("animation-delay: 0.7s;\n");
      out.write("}\n");
      out.write(" \n");
      out.write(".fade-in.two {\n");
      out.write("-webkit-animation-delay: 1.4s;\n");
      out.write("-moz-animation-delay:1.4s;\n");
      out.write("animation-delay: 1.4s;\n");
      out.write("}\n");
      out.write(" \n");
      out.write(".fade-in.three {\n");
      out.write("-webkit-animation-delay:2.1s;\n");
      out.write("-moz-animation-delay: 2.1s;\n");
      out.write("animation-delay: 2.1s;\n");
      out.write("}\n");
      out.write(".fade-in.four {\n");
      out.write("-webkit-animation-delay:2.8s;\n");
      out.write("-moz-animation-delay: 2.8s;\n");
      out.write("animation-delay: 2.8s;\n");
      out.write("}\n");
      out.write(".fade-in.five {\n");
      out.write("-webkit-animation-delay:3.5s;\n");
      out.write("-moz-animation-delay: 3.5s;\n");
      out.write("animation-delay: 3.5s;\n");
      out.write("}\n");
      out.write("img{\n");
      out.write("width: 200px;\n");
      out.write("height: 200px;\n");
      out.write("position: fixed;  top:230px; left:530px;\n");
      out.write("margin: 10px;\n");
      out.write("float: left;\n");
      out.write("border: 1px solid #333;\n");
      out.write("border-radius:65px;\n");
      out.write("\n");
      out.write("}body {\n");
      out.write("  perspective: 1000px; padding:-20px;\n");
      out.write("}\n");
      out.write("#spinner {\n");
      out.write("  font-size: 50px;\n");
      out.write("  text-align: center;\n");
      out.write("  animation-name: spin, depth;\n");
      out.write("  animation-timing-function: linear;\n");
      out.write("  animation-iteration-count: 5;\n");
      out.write("  animation-duration: 1s;\n");
      out.write("  transform-style: preserve-3d;\n");
      out.write("  position: relative;\n");
      out.write("   font-family:\"Arial Black\", Gadget, sans-serif;\n");
      out.write("}\n");
      out.write("#spinner::before,\n");
      out.write("#spinner::after {\n");
      out.write("  content: \"BOMB DEFUSE\";\n");
      out.write("  display: block;\n");
      out.write("  position: absolute;\n");
      out.write("  width: 100%;\n");
      out.write("  height: 100%;\n");
      out.write("  top: 0;\n");
      out.write("  transform: rotateY(0.5deg);\n");
      out.write("  transform-origin: 0 50%;   color:#FAEBD7\n");
      out.write("}\n");
      out.write("}\n");
      out.write("#spinner::after {\n");
      out.write("  transform: rotateY(-0.5deg);\n");
      out.write("  transform-origin: 100% 50%; color:#2F4F4F\n");
      out.write("}\n");
      out.write("@keyframes spin {\n");
      out.write("  from { transform: rotateY(0deg); }\n");
      out.write("  to { transform: rotateY(-360deg); }\n");
      out.write("}\n");
      out.write("@keyframes depth {\n");
      out.write("  0% { text-shadow: 0 0 #2F4F4F; }\n");
      out.write("  25% { text-shadow: 1px 0 #2F4F4F, 2px 0 #2F4F4F, 3px 0 #2F4F4F, 4px 0 black, 5px 0 black, 6px 0 #2F4F4F; }\n");
      out.write("  50% { text-shadow: 0 0 #2F4F4F; }\n");
      out.write("  75% { text-shadow: -1px 0 #2F4F4F, -2px 0 #2F4F4F, -3px 0 #2F4F4F, -4px 0 black, -5px 0 #2F4F4F, -6px 0 #2F4F4F; }\n");
      out.write("  100% { text-shadow: 0 0 #2F4F4F; }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".item { \n");
      out.write("     color:#A52A2A; font-size:450%; font-weight:30%;\n");
      out.write("    position: relative;\n");
      out.write("    float: left;\n");
      out.write("margin-top:-1% ;margin-left:44%\n");
      out.write("}\n");
      out.write("\n");
      out.write(".item h2 {\n");
      out.write("    text-align:center;\n");
      out.write("    position: absolute;\n");
      out.write("    line-height: 125px;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("svg {\n");
      out.write("   -webkit-transform: rotate(-90deg);\n");
      out.write("    transform: rotate(-90deg);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".circle_animation {\n");
      out.write("  stroke-dasharray: 440; /* this value is the pixel circumference of the circle */\n");
      out.write("  stroke-dashoffset: 440;\n");
      out.write("  transition: all 1s linear;\n");
      out.write("  margin-top:30%\n");
      out.write("}\n");
      out.write("\n");
      out.write("span{  \n");
      out.write("margin-left:27%; margin-top:18% ;font-size:200%; font-weight:120%\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("$(function(){\n");
      out.write("var timer = setInterval(function(){\n");
      out.write("$(\"#count_num\").html(function(i,html){\n");
      out.write("   \n");
      out.write("if(parseInt(html)>0)\n");
      out.write("   {\n");
      out.write("   return parseInt(html)-1;\n");
      out.write("   }\n");
      out.write("   else\n");
      out.write("   {\n");
      out.write("   clearTimeout(timer);\n");
      out.write("       return \"\";\n");
      out.write("   }\n");
      out.write(" });\n");
      out.write("\n");
      out.write("},1000);\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("});\n");
      out.write("</script></head>\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("\t<body>\n");
      out.write("\t\n");
      out.write("\t<section class=\"video\">\n");
      out.write("\t\t<div class=\"gradient\"></div>\n");
      out.write("\t\t<video id=\"myVideo\" class=\"video-background\"  controls=\"1\" width=100% height=100% autoplay=\"autoplay\" >\n");
      out.write("                    <source type=\"video/mp4\" src=\"video/123.mp4\"/><source type=\"video/ogv\" src=\"123.ogv\"/>\n");
      out.write("                    <source type=\"video/webm\" src=\"video/123.webm\"/>\n");
      out.write("</video></section>\n");
      out.write("</html>");
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
