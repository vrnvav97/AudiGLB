package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Audi Booking App</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t/*html\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\tbackground:url(\"img/glbajaj-banner.jpg\") no-repeat center center fixed;\r\n");
      out.write("\t\tbackground-size: cover;\t\r\n");
      out.write("\t\theight: 100%;\r\n");
      out.write("\t\toverflow: hidden;\r\n");
      out.write("\t\t}*/\r\n");
      out.write("\t\tbody\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tmargin:0;\r\n");
      out.write("\t\t\tbackground-image: url(\"img/glbajaj-banner.jpg\");\r\n");
      out.write("\t\t\theight: 100%;\r\n");
      out.write("\t\t\tbackground-repeat: no-repeat;\r\n");
      out.write("\t\t\tbackground-attachment: fixed;\r\n");
      out.write("\t\t\tbackground-position: center;\r\n");
      out.write("\t\t\tbackground-size: cover;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.login\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tposition: absolute;\r\n");
      out.write("\t\t\ttop: 20%;\r\n");
      out.write("\t\t\tleft: 30%;\r\n");
      out.write("\t\t\tbackground-color: #000;\r\n");
      out.write("\t\t\topacity: 0.5;\r\n");
      out.write("\t\t\twidth: 440px;\r\n");
      out.write("\t\t\theight: 320px;\r\n");
      out.write("\t\t\tcolor: #fff;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\t<div class=\"intro py-3 text-center\" style=\"background-color: #592106\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<h2 class=\"\" style=\"color: white; font-family: Times New Roman\">G L Bajaj Institute of Technology and Management</h2>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"login\">\r\n");
      out.write("\t\t\t\t<h3 class=\"text-center\" style=\"text-transform: uppercase;margin-top: 10px;\">Login</h3>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("                                <form class=\"text-center\" style=\"font-size:20px\" method=\"put\" action=\"loginServlet\">\r\n");
      out.write("\t\t\t\t\t<p><span>Username</span> <input type=\"text\" name=\"username\"><br><br>\r\n");
      out.write("\t\t\t\t\t<span>Password</span> <input type=\"password\" name=\"password\"></p>\r\n");
      out.write("\t\t\t\t\t<a href=\"\">Forgot Password</a><br><br>\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" name=\"\" value=\"GO\"style=\"border-radius: 30px; width: 200px;\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rGF8kKXvvmYtT4zNGqicXRjvuAnmmbvPZX.109773641.100148163.100148163.109773641.100148163.100148163.109773641.100148163.109773641.100148163.100148163.109773641.100148163.109773641.100148163.100148163.109773641.100148163.109773641.100148163vH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSXgi164MCGG3u5RKXaBGVBabmxQTVRAAVECCPSEWY5UMdx9nDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\t<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
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
