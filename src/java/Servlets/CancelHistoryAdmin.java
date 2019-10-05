/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Mukul Samrat
 */
public class CancelHistoryAdmin extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession();
        try{
            HashMap h=(HashMap)session.getAttribute("AdminDetails");
            
            
            if(h!=null){
                String id = request.getParameter("bookingId");
                int bid = Integer.parseInt(id);
            dba.dbConnect db=(dba.dbConnect)session.getAttribute("db");
           if(db==null){
                db=new dba.dbConnect();
                session.setAttribute("db", db);
           }
           String s= db.historyCancelAdmin(bid);
           session.setAttribute("msg",s);
           response.sendRedirect("adminAllHistory.jsp");
            
            }else{
            session.setAttribute("msg","Please Login First!");
            response.sendRedirect("login.jsp");
            
            }
            
            }catch(Exception e){
               session.setAttribute("msg","Try Again Error Occurred!");
               response.sendRedirect("login.jsp");
        }
        
        
       
    }

}
