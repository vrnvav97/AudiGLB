
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

public class LoginCheck extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
            {
           response.setContentType("text/html;charset=UTF-8");
           PrintWriter out=null;
           HttpSession session=null;
        try{
            session=request.getSession();
            out=response.getWriter();
            String username=request.getParameter("username");
            String password=request.getParameter("password");
            
            dba.dbConnect db=(dba.dbConnect)session.getAttribute("db");
            if(db==null){
                db=new dba.dbConnect();
                session.setAttribute("db", db);
            }
            ResultSet r=(ResultSet)db.checkAdLoginProcess(username,password);
            if(r!=null){
               HashMap h=new HashMap();
               h.put("username",username);
               h.put("name",r.getString("name"));
               h.put("post",r.getString("post"));
               
                    if(r.getString("post").equals("admin")){
                          session.setAttribute("AdminDetails",h);
                          response.sendRedirect("adminDashboard.jsp");
                    }else if(r.getString("post").equals("Teacher")){
                          session.setAttribute("UserDetails",h);
                          response.sendRedirect("userDashboard.jsp");
                    }else{
                          session.setAttribute("msg","Only Teachers And Administration peaple Have Access!!!");
                          response.sendRedirect("login.jsp");
                    }
            }
            else{
               session.setAttribute("msg","Invalid Credentials!");
               response.sendRedirect("login.jsp");
            }
           }catch(Exception e){
               session.setAttribute("msg","error!!!");
               response.sendRedirect("login.jsp");
        }
    }

}
