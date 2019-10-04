
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
public class AllowAudi extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession();
        try{
            HashMap h=(HashMap)session.getAttribute("AdminDetails");
            
            
            if(h!=null){
                String audiName = request.getParameter("audiSelection");
                String id = request.getParameter("bookingId");
                String pageName = request.getParameter("pageName");
                int bid = Integer.parseInt(id);
            dba.dbConnect db=(dba.dbConnect)session.getAttribute("db");
           if(db==null){
                db=new dba.dbConnect();
                session.setAttribute("db", db);
           }
           String s= db.allowAudi(bid,audiName);
           session.setAttribute("msg",s);
           if(pageName.equalsIgnoreCase("p")){
                response.sendRedirect("pendingRequest.jsp");
           }else{
               response.sendRedirect("cancelledRequest.jsp");
           }
           
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
