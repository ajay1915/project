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
public class sem5addDB extends HttpServlet {

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
        int usit501t = Integer.parseInt(request.getParameter("usit501t"));
        int usit501p = Integer.parseInt(request.getParameter("usit501p"));
        int usit502t = Integer.parseInt(request.getParameter("usit502t"));
        int usit502p = Integer.parseInt(request.getParameter("usit502p"));
        int usit503t = Integer.parseInt(request.getParameter("usit503t"));
        int usit503p = Integer.parseInt(request.getParameter("usit503p"));
        int usit504t = Integer.parseInt(request.getParameter("usit504t"));
        int usit504p = Integer.parseInt(request.getParameter("usit504p"));
        int usit505t = Integer.parseInt(request.getParameter("usit505t"));
        int usit505p = Integer.parseInt(request.getParameter("usit505p"));

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/result_portal_db", "root", "");
            PreparedStatement stmt = con.prepareStatement("insert into sem5 values (?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1, rollno);
            stmt.setInt(2, usit501t);
            stmt.setInt(3, usit501p);
            stmt.setInt(4, usit502t);
            stmt.setInt(5, usit502p);
            stmt.setInt(6, usit503t);
            stmt.setInt(7, usit503p);
            stmt.setInt(8, usit504t);
            stmt.setInt(9, usit504p);
            stmt.setInt(10, usit505t);
            stmt.setInt(11, usit505p);
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
