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
public class sem3addDB extends HttpServlet {

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
        PrintWriter out = response.getWriter();

        int rollno = Integer.parseInt(request.getParameter("rollno"));
        int usit301t = Integer.parseInt(request.getParameter("usit301t"));
        int usit301p = Integer.parseInt(request.getParameter("usit301p"));
        int usit302t = Integer.parseInt(request.getParameter("usit302t"));
        int usit302p = Integer.parseInt(request.getParameter("usit302p"));
        int usit303t = Integer.parseInt(request.getParameter("usit303t"));
        int usit303p = Integer.parseInt(request.getParameter("usit303p"));
        int usit304t = Integer.parseInt(request.getParameter("usit304t"));
        int usit304p = Integer.parseInt(request.getParameter("usit304p"));
        int usit305t = Integer.parseInt(request.getParameter("usit305t"));
        int usit305p = Integer.parseInt(request.getParameter("usit305p"));

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/result_portal_db", "root", "");
            PreparedStatement stmt = con.prepareStatement("insert into sem3 values (?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1, rollno);
            stmt.setInt(2, usit301t);
            stmt.setInt(3, usit301p);
            stmt.setInt(4, usit302t);
            stmt.setInt(5, usit302p);
            stmt.setInt(6, usit303t);
            stmt.setInt(7, usit303p);
            stmt.setInt(8, usit304t);
            stmt.setInt(9, usit304p);
            stmt.setInt(10, usit305t);
            stmt.setInt(11, usit305p);
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
