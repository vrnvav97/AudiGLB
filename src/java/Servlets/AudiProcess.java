
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.HashMap;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
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
            String userEmail=(String)h.get("email");
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
                //start mail code
                        final String SEmail = "samrattechnologies01@gmail.com";
                        final String SPass = "S@Tech123";

                        final String REmail = userEmail;
                        final String Sub = "Requested For Audi Sucessfully  || GlbAudiBookingApp";
                        final String Body = "Hii " + REmail + "<br>You request for Audi have been sent to Admin.<br> You will get notified on Audi Confirmination.<br>If You have any Query Contact us @ " + SEmail;
                        //mail sendCode
                        Properties props = new Properties();
                        props.put("mail.smtp.host", "smtp.gmail.com");
                        props.put("mail.smtp.socketFactory.port", "465");
                        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
                        props.put("mail.smtp.auth", "true");
                        props.put("mail.smtp.port", "465");
                        Session ses = Session.getInstance(props,
                                new javax.mail.Authenticator() {
                            protected PasswordAuthentication getPasswordAuthentication() {
                                return new PasswordAuthentication(SEmail, SPass);
                            }
                        }
                        );

                        Message message = new MimeMessage(ses);
                        message.setFrom(new InternetAddress(SEmail, "Samrat Technologies"));
                        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(REmail));
                        message.setSubject(Sub);
                        message.setContent(Body, "text/html");
                        Transport.send(message);
                
                
                //end mail code
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
