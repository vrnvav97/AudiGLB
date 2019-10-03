<%-- 
    Document   : Logout
    Created on : 18 Nov, 2018, 8:56:30 AM
    Author     : ROHIT
--%>

<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout jsp</title>
    </head>
    <body>
        <%
            HashMap h=null;
            HashMap uh=(HashMap)session.getAttribute("UserDetails");
            HashMap ah=(HashMap)session.getAttribute("AdminDetails");
            if(uh!=null){
                h=uh;
            }
            if(ah!=null){
                h=ah;
            }
            if(h!=null){

            session.invalidate();
            response.sendRedirect("login.jsp");
            }else{
                session.setAttribute("msg","Plzz Login First!");
                 response.sendRedirect("login.jsp");
            }
         %>
    </body>
</html>
