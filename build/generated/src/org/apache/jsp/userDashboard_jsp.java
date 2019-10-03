package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.util.HashMap;

public final class userDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    HashMap h=(HashMap)session.getAttribute("UserDetails");
    if(h!=null){

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Dashboard</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\tbody\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tbackground-color: #ffc107;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\ti\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tposition: relative;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.badge\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tposition: absolute;\r\n");
      out.write("\t\t\ttop: -10px;\r\n");
      out.write("\t\t\tright: -10px;\r\n");
      out.write("\t\t\tpadding: 5px;\r\n");
      out.write("\t\t\tborder-radius: 50%;\r\n");
      out.write("\t\t\tbackground:red;\r\n");
      out.write("\t\t\tcolor: white;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.navbar\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdisplay: inline;\r\n");
      out.write("\t\t\tfloat: right;\r\n");
      out.write("\t\t\tmargin:10px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.box\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tbackground-color: #592106;\r\n");
      out.write("\t\t\twidth: 220px;\r\n");
      out.write("\t\t\theight: 220px;\r\n");
      out.write("\t\t\tdisplay: relative;\r\n");
      out.write("\t\t\tborder-radius: 20px;\r\n");
      out.write("\t\t\tmargin: 70px;\r\n");
      out.write("\t\t\tfloat: left;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.box-inner\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\twidth: 220px;\r\n");
      out.write("\t\t\theight: 75px;\r\n");
      out.write("\t\t\tbackground-color: #17a2b8;\r\n");
      out.write("\t\t\tborder-radius: 20px 20px 0px 0px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.box-inner h3\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tmargin: 5px;\r\n");
      out.write("\t\t\tline-height: 50px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.box-inner-down\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tcolor: #fff;\r\n");
      out.write("\t\t\theight: 145px;\r\n");
      out.write("\t\t\tposition: relative;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.icon\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tposition: relative;\r\n");
      out.write("\t\t\tleft: 25%;\r\n");
      out.write("\t\t\ttop: 5%;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.container h3\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tcolor: #fff;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"py-3 container-fluid\" style=\"background-color: #592106;margin: 0px;display: inline-block;\">\r\n");
      out.write("\t\t<div class=\"text-center\" style=\"width: 80%;float: left;\">\r\n");
      out.write("\t\t\t\t<h2 style=\"color: white; font-family: Times New Roman;\">G L Bajaj Institute of Technology and Management</h2>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"width: 20%;float: right;color: #fff;\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- <a href=\"\" class=\"navbar\">hi</a>\r\n");
      out.write("\t\t\t<a href=\"\" class=\"navbar\">hi</a>\r\n");
      out.write("\t\t\t<a href=\"\" class=\"navbar\">hi</a>\r\n");
      out.write("\t\t\t<a href=\"\" class=\"navbar\">hi</a> -->\r\n");
      out.write("\t\t\t<p class=\"navbar\">Welcome:");
      out.print((String)h.get("name"));
      out.write("</p>\r\n");
      out.write("\t\t\t<p class=\"navbar\">hi</p>\r\n");
      out.write("\t\t\t<p class=\"navbar\">hi</p>\r\n");
      out.write("\t\t\t<p class=\"navbar\"><i class=\"fa fa-bell\" aria-hidden=\"true\" ><span class=\"badge\">1</span></i></p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<a href=\"forms.jsp\">\r\n");
      out.write("\t\t\t\t<div class=\"box\">\r\n");
      out.write("\t\t\t\t\t<div class=\"box-inner\">\r\n");
      out.write("\t\t\t\t\t<h3 class=\"text-center\">Book Audi</h3>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"box-inner-down\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-plus-circle icon\" aria-hidden=\"true\" style=\"font-size: 8em\"></i>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<a href=\"\">\r\n");
      out.write("\t\t\t\t<div class=\"box\">\r\n");
      out.write("\t\t\t\t\t<div class=\"box-inner\">\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"text-center\">Active Booking</h3>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"box-inner-down\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-bookmark icon\" aria-hidden=\"true\" style=\"font-size: 8em\"></i>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<a href=\"\">\r\n");
      out.write("\t\t\t\t<div class=\"box\">\r\n");
      out.write("\t\t\t\t\t<div class=\"box-inner\">\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"text-center\">History</h3>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"box-inner-down\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-history icon\" aria-hidden=\"true\" style=\"font-size: 8em\"></i>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<script src=\"//netdna.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<!-- <script src=\"https://use.fontawesome.com/5b68f82424.js\"></script> -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/font-awesome.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");

    }else{
        session.setAttribute("msg","Plz Login First");
        response.sendRedirect("login.jsp");
    }

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
