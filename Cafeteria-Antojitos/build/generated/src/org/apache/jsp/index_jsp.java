package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\r\n");
      out.write("        <style>\r\n");
      out.write("    body {\r\n");
      out.write("    height:100vh;\r\n");
      out.write("    width:100%;\r\n");
      out.write("    margin:0px;\r\n");
      out.write("    overflow:hidden;\t\r\n");
      out.write("    margin: 0%;\r\n");
      out.write("\tbackground: linear-gradient(0deg, #ccccc6,  #3f2616 );\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  #LibrarianPicture {\r\n");
      out.write("    width:100%;\r\n");
      out.write("    height:100%;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  #loginContainer {\r\n");
      out.write("    padding:25px;\r\n");
      out.write("    background-color:  #624c3c;\r\n");
      out.write("    width:450px;\r\n");
      out.write("    height:auto;\r\n");
      out.write("    margin:auto;\r\n");
      out.write("    margin-top:25px;\r\n");
      out.write("    margin-bottom:100px;\r\n");
      out.write("    -webkit-box-shadow: 0px 5px 35px 0px rgba(0,0,0,0.75);\r\n");
      out.write("    -moz-box-shadow: 0px 5px 35px 0px rgba(0,0,0,0.75);\r\n");
      out.write("    box-shadow: 0px 5px 35px 0px rgba(0,0,0,0.75);\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  #loginPicture:hover + #leftEye,#loginPicture:hover + #rightEye {\r\n");
      out.write("    fill:white !important;\r\n");
      out.write("    transform: translate(5px, 0px);\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .testClass {\r\n");
      out.write("    width:10px;\r\n");
      out.write("    height:10px;\r\n");
      out.write("    background-color:blue;\r\n");
      out.write("    position:absolute;\r\n");
      out.write("    z-index:100000;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  #loginPicture {\r\n");
      out.write("    position:relative;\r\n");
      out.write("    width:250px;\r\n");
      out.write("    height:270px;\r\n");
      out.write("    background-color:white;\r\n");
      out.write("    border:7px solid  #8c7459;\r\n");
      out.write("    border-radius:20px;\r\n");
      out.write("    margin:auto;\r\n");
      out.write("    background-color:grey;\r\n");
      out.write("    z-index:200;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  #loginPicture svg {\r\n");
      out.write("    width:100%;\r\n");
      out.write("    position:relative;\r\n");
      out.write("    top:-25px;\r\n");
      out.write("    z-index:0;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  #loginOverlay {\r\n");
      out.write("    position:absolute;\r\n");
      out.write("    background-color:white;\r\n");
      out.write("    border:5px solid rgba(10,250,252,0.35);  width:250px;\r\n");
      out.write("    height:250px;\r\n");
      out.write("    top:30px;\r\n");
      out.write("    margin:auto;\r\n");
      out.write("    border-radius:180px;\r\n");
      out.write("    z-index:500;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .loginForm {\r\n");
      out.write("    color:white;\r\n");
      out.write("    margin-top:25px;\r\n");
      out.write("    padding-bottom:25px;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .loginForm label {\r\n");
      out.write("    width:30%;\r\n");
      out.write("    display:table-cell;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .loginForm input {\r\n");
      out.write("    width:100%;\r\n");
      out.write("    display:block;\r\n");
      out.write("    background-color:transparent;\r\n");
      out.write("    border:0px solid transparent;\r\n");
      out.write("    border-bottom:2px solid  #8c7459;\r\n");
      out.write("    font-size:20px;\r\n");
      out.write("    color:white;\r\n");
      out.write("    text-align:center;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .loginFormContainer {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  #login {\r\n");
      out.write("    -webkit-transition: all 300ms ease-out 0s;\r\n");
      out.write("    -moz-transition: all 300ms ease-out 0s;\r\n");
      out.write("    -o-transition: all 300ms ease-out 0s;\r\n");
      out.write("    transition: all 300ms ease-out 0s;\r\n");
      out.write("    -webkit-box-sizing: border-box;\r\n");
      out.write("    -moz-box-sizing: border-box;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    width:100%;\r\n");
      out.write("    margin-top:25px;\r\n");
      out.write("    padding:15px;\r\n");
      out.write("    background-color:  #8c7459;\r\n");
      out.write("    border:1px solid   #8c7459;\r\n");
      out.write("    color:#8c5426;\r\n");
      out.write("    cursor:pointer;\r\n");
      out.write("    font-size: 18px;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  #login:hover {\r\n");
      out.write("    -webkit-box-sizing: border-box;\r\n");
      out.write("    -moz-box-sizing: border-box;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    background-color:transparent;\r\n");
      out.write("    color: #8c5426;\r\n");
      out.write("    border:1px solid  #8c5426;\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("  }  \r\n");
      out.write("\r\n");
      out.write("  .imgdiv{\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    border-radius: 20px;\r\n");
      out.write("  }\r\n");
      out.write("        </style>\r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    <div id=\"loginContainer\">\r\n");
      out.write("        <div id=\"loginPicture\">\r\n");
      out.write("            <img src=\"img/Logo.png\" alt=\"\" class=\"imgdiv\">\r\n");
      out.write("        </div>  \r\n");
      out.write("        <div id=\"loginPictureCover\"> </div>\r\n");
      out.write("        <form class=\"loginForm\" action=\"Validar\" method=\"POST\">                            \r\n");
      out.write("            <div id=\"loginFormContainer\"> \r\n");
      out.write("                <input type=\"text\" name=\"txtUser\" placeholder=\"username\"> \r\n");
      out.write("            </div>\r\n");
      out.write("            <br>\r\n");
      out.write("            <div class=\"loginFormContainer\">\r\n");
      out.write("                <input type=\"password\" name=\"txtPass\" placeholder=\"password\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <input id=\"login\" type=\"submit\" name=\"accion\" value=\"Ingresar\" clsas=\"btn btn-primary btn-block\">\r\n");
      out.write("        </form>   \r\n");
      out.write("    </div>\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\" integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
