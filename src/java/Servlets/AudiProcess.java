
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

 @MultipartConfig
public class AudiProcess extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
            {
           response.setContentType("text/html;charset=UTF-8");
           PrintWriter out =response.getWriter();;
           HttpSession session=request.getSession();
                System.out.println(request.getParameter("eventName"));
        try{
                       
<<<<<<< HEAD
=======
//            HashMap h=(HashMap)session.getAttribute("UserDetails");
//            String username=(String)h.get("username");
//            
//            String nameOfDepartment=request.getParameter("nameOfDepartment");
//            String eventName=request.getParameter("eventName");
//            String typeOfEvent=request.getParameter("typeOfEvent");
//            String eventChiefGuest=request.getParameter("eventChiefGuest");
//           
//            String eventDate=request.getParameter("eventDate");
//            java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("dd/MM/yyyy");
//            java.util.Date dt=sdf.parse(eventDate);
//            java.sql.Date sdt=new java.sql.Date(dt.getTime());
//            
//            String usr_time1=request.getParameter("time1");
//            Time time1 = Time.valueOf( usr_time1 );
//            String usr_time2=request.getParameter("time2");
//            Time time2 = Time.valueOf( usr_time2 );
//            
//            String eventGather=request.getParameter("eventGathering");
//            int eventGathering=Integer.parseInt(eventGather);
//            System.out.println(username+" "+nameOfDepartment+" "+eventName+" "+typeOfEvent+" "+eventChiefGuest+" "+sdt+" "+time1+" "+time2+" "+String.valueOf(eventGathering));
//            
            
            
<<<<<<< HEAD
>>>>>>> 0c86cd9df15d0958e24b8b07c6d8811ee8cb9908
            HashMap h=(HashMap)session.getAttribute("UserDetails");
            String username=(String)h.get("username");
            String nameOfDepartment=(String)request.getParameter("nameOfDepartment");
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
<<<<<<< HEAD


=======
=======
         /*   dba.dbConnect db=(dba.dbConnect)session.getAttribute("db");
>>>>>>> e3dc6bd398a6ad3df7d9595241aaa453a7e1805d
>>>>>>> 0c86cd9df15d0958e24b8b07c6d8811ee8cb9908
            if(db==null){
                db=new dba.dbConnect();
                session.setAttribute("db", db);
            }
            String s=db.insertAudiBookigProcess(nameOfDepartment,eventName,typeOfEvent,eventChiefGuest,sdt,usr_time1,usr_time2,eventGathering,username);
           /* if(s.equalsIgnoreCase("Success")){
               HashMap h=new HashMap();
               h.put("email",email);
               h.put("name",name);
               h.put("phone",phone);
               h.put("dob",sdt);
               h.put("gender",gender);
               h.put("city",city);
               h.put("area",area);
               h.put("state",state);
               session.setAttribute("UserDetails",h);
               response.sendRedirect("profile.jsp");
            }
            else if(s.equalsIgnoreCase("Failed")){
               session.setAttribute("msg","Registeration Failed.");
               response.sendRedirect("home.jsp");
            }
            else if(s.equalsIgnoreCase("Already")){
               session.setAttribute("msg","EmailID Already Registered.");
               response.sendRedirect("home.jsp");
            }
            else if(s.equalsIgnoreCase("Exception")){
               session.setAttribute("msg","Registeration Failed.(Exception Occured.)");
               response.sendRedirect("home.jsp");
            }*/
           }catch(Exception e){
<<<<<<< HEAD
                session.setAttribute("msg","error!!!");
=======
<<<<<<< HEAD
               e.printStackTrace();
=======
               System.out.println(e);
>>>>>>> e3dc6bd398a6ad3df7d9595241aaa453a7e1805d
               session.setAttribute("msg","error!!!");
>>>>>>> 0c86cd9df15d0958e24b8b07c6d8811ee8cb9908
               response.sendRedirect("login.jsp");
        }
    }

}