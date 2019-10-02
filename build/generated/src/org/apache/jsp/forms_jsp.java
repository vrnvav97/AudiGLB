package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.util.HashMap;

public final class forms_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Form</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\tbody\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tbackground-color: #ffc107;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.navbar\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdisplay: inline;\r\n");
      out.write("\t\t\tfloat: right;\r\n");
      out.write("\t\t\tmargin:10px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.back\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tposition: absolute;\r\n");
      out.write("\t\t\ttop: 20%;\r\n");
      out.write("\t\t\tleft: 30%;\r\n");
      out.write("\t\t\tbackground-color: #000;\r\n");
      out.write("\t\t\topacity: 0.9;\r\n");
      out.write("\t\t\twidth: 500px;\r\n");
      out.write("\t\t\theight: 500px;\r\n");
      out.write("\t\t\tcolor: #fff;\r\n");
      out.write("\t\t\toverflow-y: scroll;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.label\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tmargin: 15px;\r\n");
      out.write("\t\t\tfont-size: 1.2em;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.drop-down\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\twidth: 150px;\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("                .radio\r\n");
      out.write("                {\r\n");
      out.write("                    font-size: 14px;\r\n");
      out.write("                    padding: 8px;\r\n");
      out.write("                }\r\n");
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
      out.write("\t\t\t<p class=\"navbar\">hii</p>\r\n");
      out.write("\t\t\t<p class=\"navbar\">hi</p>\r\n");
      out.write("\t\t\t<p class=\"navbar\">hi</p>\r\n");
      out.write("\t\t\t<p class=\"navbar\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i></p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"back\">\r\n");
      out.write("\t\t\t<h3 class=\"text-center\" style=\"font-size: 3em;\">Book Audi</h3>\r\n");
      out.write("                        <form action=\"confirmForm.jsp\" method=\"post\">\r\n");
      out.write("\t\t\t\t<label class=\"label\">Name of Department</label>\r\n");
      out.write("\t\t\t\t<select class=\"drop-down\">\r\n");
      out.write("\t\t\t\t\t<option>Select</option>\r\n");
      out.write("\t\t\t\t\t<option>CSE - Computer Science & Engineering</option>\r\n");
      out.write("\t\t\t\t\t<option>IT - Information Technology</option>\r\n");
      out.write("\t\t\t\t\t<option>MCA - Master of Computer Applications</option>\r\n");
      out.write("\t\t\t\t\t<option>1st YR -  Applied Sciences</option>\r\n");
      out.write("\t\t\t\t\t<option>ECE - Electornics & Communication Engineering</option>\r\n");
      out.write("\t\t\t\t\t<option>EE - Electronics Engineering</option>\r\n");
      out.write("\t\t\t\t\t<option>CE - Civil Enginnering</option>\r\n");
      out.write("\t\t\t\t\t<option>MBA - Master of Business Administration</option>\r\n");
      out.write("                                        <option>PGDM - Post Graduate Diploma in Management</option>\r\n");
      out.write("\t\t\t\t\t<option>TNP - Training & Placement</option>\r\n");
      out.write("\t\t\t\t\t<option>BBA - Bachelor of Business Administration</option>\r\n");
      out.write("\t\t\t\t\t<option>BCA - Bachelor of Computer Applications</option>\r\n");
      out.write("                                        <option>College</option>\r\n");
      out.write("                                        <option>Other</option>\t\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("                                <label class=\"label\">Name of Event</label>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"eventName\"/>\r\n");
      out.write("                                <br>\r\n");
      out.write("\t\t\t\t<label class=\"label\">Type of Event</label>\r\n");
      out.write("                                <div class=\"text-center\">\r\n");
      out.write("                                    <input type=\"radio\" class=\"radio\" name=\"typeOfEvent\" name=\"One\" value=\"One\" checked=\"true\" ><label class=\"radio\">Departmental</label>\r\n");
      out.write("                                    <input type=\"radio\" class=\"radio\" name=\"typeOfEvent\" name=\"Two\" value=\"Two\" ><label class=\"radio\">Inter Departmental</label>\r\n");
      out.write("                                    <input type=\"radio\" class=\"radio\" name=\"typeOfEvent\" name=\"Three\" value=\"Three\" ><label class=\"radio\">Inter College</label>\r\n");
      out.write("                                    <input type=\"radio\" class=\"radio\" name=\"typeOfEvent\" name=\"Four\" value=\"Four\" ><label class=\"radio\">Other</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("\t\t\t        <label class=\"label\">Chief Guest of the Event</label>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"eventChiefGuest\"/>\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("                                    <label class=\"label\">Date</label>\r\n");
      out.write("                                    <input type=\"date\" name=\"eventDate\" id=\"dateChooser\" onchange=f()>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label class=\"label\">Time</label>\r\n");
      out.write("                                    <input type=\"time\" name=\"usr_time1\"> To <input type=\"time\" name=\"usr_time2\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label class=\"label\">Expected Gathering</label>\r\n");
      out.write("\t\t\t\t    <input type=\"text\" name=\"eventGathering\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <center> <div  text-align=\"center\" class=\"form-group\">\r\n");
      out.write("                                        <input type=\"submit\" class=\"btn-success\" name=\"submit\" value=\"Book Audi\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </center>\r\n");
      out.write("                        </form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/font-awesome.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            var d = new Date();\r\n");
      out.write("\tvar date = [\r\n");
      out.write("  d.getFullYear(),\r\n");
      out.write("  ('0' + (d.getMonth() + 1)).slice(-2),\r\n");
      out.write("  ('0' + d.getDate()).slice(-2)\r\n");
      out.write("].join('-');\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tdocument.querySelector('#dateChooser').setAttribute(\"min\",date);\r\n");
      out.write("\tfunction f()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar a = document.getElementById('dateChooser').value; // value\r\n");
      out.write("                console.log(a);\r\n");
      out.write("\t}\r\n");
      out.write("            </script>\r\n");
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
