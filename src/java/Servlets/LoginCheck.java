/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.*;
/**
 *
 * @author ROHIT
 */
public class LoginCheck extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session=null;
            try{
                String username=request.getParameter("username");
                String password=request.getParameter("password");
              /*  db.DbConnect db=(db.DbConnect)session.getAttribute("db");
                if(db==null){
                db=new db.DbConnect();
                session.setAttribute("db", db);
                }
                ResultSet r=(ResultSet)db.checkLoginProcess(username, password);
                if(r!=null){
               HashMap h=new HashMap();
               h.put("username",username);
               h.put("name",r.getString("name"));
               h.put("post",r.getString("post"));
               session.setAttribute("UserDetails",h);
                    if(r.getString("post").equals("admin")){
                          response.sendRedirect("adminDashboard.jsp");
                    }else{
                          response.sendRedirect("userDashboard.jsp");
                    }
                }
                else{
                    session.setAttribute("msg","Username or Password Is Wrong!!");
                    response.sendRedirect("login.jsp");
                }
            */
                if(username.equals("admin")){
                          response.sendRedirect("adminDashboard.jsp");
                }else if(username.equals("teacher")){
                          response.sendRedirect("userDashboard.jsp");
                }else{
                        response.sendRedirect("login.jsp");
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
