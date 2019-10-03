<%@page import="java.net.PasswordAuthentication"%>
<%@page import="com.mysql.cj.Session"%>
<%@page import="javax.mail.internet.InternetAddress"%>
<%@page import="javax.mail.internet.MimeMessage"%>
<%@page import="javax.mail.*"%>
<%@page import="java.util.Properties"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forgot password process</title>
    </head>
    <body>
        <% 
             String e=request.getParameter("username");
             dba.dbConnect db= (dba.dbConnect)session.getAttribute("db");
             if(db==null){
                db=new dba.dbConnect(); 
                session.setAttribute("db",db);
            }
            ResultSet rs=db.getUser(e);
            if(rs!=null){
              String p=rs.getString("password");
              final  String SEmail=e;
       
              final String AEmail = "samrattechnologies01@gmail.com";
              final String APass = "S@Tech123";
                String sub="Forget Password Subject.";
                String body="Your Password: "+p;
                try{
                    Properties properties = new Properties();
                    properties.put("mail.smtp.host", "smtp.gmail.com");  
                    properties.put("mail.smtp.socketFactory.port", "465");  
                    properties.put("mail.smtp.socketFactory.class",  
                          "javax.net.ssl.SSLSocketFactory");  
                    properties.put("mail.smtp.auth", "true");  
                    properties.put("mail.smtp.port", "465");

                    Session ss = Session.getInstance(properties,    
                         new javax.mail.Authenticator() {  
                          protected PasswordAuthentication getPasswordAuthentication() {  
                          return new PasswordAuthentication(AEmail, APass); } 
                         });  

                    Message message = new MimeMessage(ss);  
                    message.setFrom(new InternetAddress(AEmail));  
                    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(SEmail));  
                    message.setSubject(sub);  
                    message.setText(body);  
                    Transport.send(message);
                    session.setAttribute("msg","Mail Send Success. Get Your Password from Mail.");
                    response.sendRedirect("home.jsp");
                }catch(Exception ex){
                    session.setAttribute("msg",ex.getMessage());
                    response.sendRedirect("forgetpassword.jsp");
                }
            }
            else{
               session.setAttribute("msg","This Email ID Doesn't Exist!!");
               response.sendRedirect("forgetpassword.jsp");
            }
        %>
    </body>
</html>
