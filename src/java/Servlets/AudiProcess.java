
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;


public class AudiProcess extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
            {
           response.setContentType("text/html;charset=UTF-8");
           PrintWriter out =response.getWriter();;
           HttpSession session=request.getSession();
        try{
            HashMap h=null;
            HashMap uh=(HashMap)session.getAttribute("UserDetails");
            HashMap ah=(HashMap)session.getAttribute("AdminDetails");
            if(uh!=null){
                h=uh;
            }
            if(ah!=null){
                h=ah;
            }
            String username=(String)h.get("username");
            String nameOfDepartment=request.getParameter("nameOfDepartment");
            String eventName=request.getParameter("eventName");
            String typeOfEvent=request.getParameter("typeOfEvent");
            String eventChiefGuest=request.getParameter("eventChiefGuest");
            
            String eventDate=request.getParameter("eventDate");
            java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("yyyy-MM-dd");
            java.util.Date dt=sdf.parse(eventDate);
            java.sql.Date sdt=new java.sql.Date(dt.getTime());
            
           String usr_time1=request.getParameter("usr_time1");
           String usr_time2=request.getParameter("usr_time2");
           String eventGather=request.getParameter("eventGathering");
           int eventGathering=Integer.parseInt(eventGather);
          
           dba.dbConnect db=(dba.dbConnect)session.getAttribute("db");
           if(db==null){
                db=new dba.dbConnect();
                session.setAttribute("db", db);
            }
           String s=db.insertAudiBookigProcess(nameOfDepartment,eventName,typeOfEvent,eventChiefGuest,sdt,usr_time1,usr_time2,eventGathering,username);
            if(s.equalsIgnoreCase("Success")){
               session.setAttribute("msg","Your Request For Audi Booking Is Sent Successfully!!!");
               if(((String)h.get("post")).equals("admin")){
                   response.sendRedirect("adminDashboard.jsp");
               }else{
                   response.sendRedirect("userDashboard.jsp");
               }
            }
            else if(s.equalsIgnoreCase("Failed")){
               session.setAttribute("msg","Your Request For Audi Booking Is Failed Try Again Later!!!");
               if(((String)h.get("post")).equals("admin")){
                   response.sendRedirect("adminDashboard.jsp");
               }else{
                   response.sendRedirect("userDashboard.jsp");
               }
            }
            else if(s.equalsIgnoreCase("Already")){
               session.setAttribute("msg","Request Already InQueue.");
               if(((String)h.get("post")).equals("admin")){
                   response.sendRedirect("adminDashboard.jsp");
               }else{
                   response.sendRedirect("userDashboard.jsp");
               }
            }
            else if(s.equalsIgnoreCase("Exception")){
               session.setAttribute("msg","Request Failed.(Exception Occured.)");
               if(((String)h.get("post")).equals("admin")){
                   response.sendRedirect("adminDashboard.jsp");
               }else{
                   response.sendRedirect("userDashboard.jsp");
               }
            }
           }catch(Exception e){
               
               session.setAttribute("msg","Try Again Error Occurred!");
               response.sendRedirect("login.jsp");
        }
    }

}
