/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AJAY
 */
public class sem2addDB extends HttpServlet {

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
        PrintWriter out = response.getWriter();

        int rollno = Integer.parseInt(request.getParameter("rollno"));
        int usit201t = Integer.parseInt(request.getParameter("usit201t"));
        int usit201p = Integer.parseInt(request.getParameter("usit201p"));
        int usit202t = Integer.parseInt(request.getParameter("usit202t"));
        int usit202p = Integer.parseInt(request.getParameter("usit202p"));
        int usit203t = Integer.parseInt(request.getParameter("usit203t"));
        int usit203p = Integer.parseInt(request.getParameter("usit203p"));
        int usit204t = Integer.parseInt(request.getParameter("usit204t"));
        int usit204p = Integer.parseInt(request.getParameter("usit204p"));
        int usit205t = Integer.parseInt(request.getParameter("usit205t"));
        int usit205p = Integer.parseInt(request.getParameter("usit205p"));

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/result_portal_db", "root", "");
            PreparedStatement stmt = con.prepareStatement("insert into sem2 values (?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1, rollno);
            stmt.setInt(2, usit201t);
            stmt.setInt(3, usit201p);
            stmt.setInt(4, usit202t);
            stmt.setInt(5, usit202p);
            stmt.setInt(6, usit203t);
            stmt.setInt(7, usit203p);
            stmt.setInt(8, usit204t);
            stmt.setInt(9, usit204p);
            stmt.setInt(10, usit205t);
            stmt.setInt(11, usit205p);
            int row = stmt.executeUpdate();
            if (row == 1) {
                out.print("Successfully Inserted!");
                
            } else {
                out.print("not inserted!");
                
            }
        } catch (Exception e) {
            out.println(e);
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
