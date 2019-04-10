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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AJAY
 */
public class sem1addDB extends HttpServlet {

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
        int usit101t = Integer.parseInt(request.getParameter("usit101t"));
        int usit101p = Integer.parseInt(request.getParameter("usit101p"));
        int usit102t = Integer.parseInt(request.getParameter("usit102t"));
        int usit102p = Integer.parseInt(request.getParameter("usit102p"));
        int usit103t = Integer.parseInt(request.getParameter("usit103t"));
        int usit103p = Integer.parseInt(request.getParameter("usit103p"));
        int usit104t = Integer.parseInt(request.getParameter("usit104t"));
        int usit104p = Integer.parseInt(request.getParameter("usit104p"));
        int usit105t = Integer.parseInt(request.getParameter("usit105t"));
        int usit105p = Integer.parseInt(request.getParameter("usit105p"));

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/result_portal_db", "root", "");
            PreparedStatement stmt = con.prepareStatement("insert into sem1 values (?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1, rollno);
            stmt.setInt(2, usit101t);
            stmt.setInt(3, usit101p);
            stmt.setInt(4, usit102t);
            stmt.setInt(5, usit102p);
            stmt.setInt(6, usit103t);
            stmt.setInt(7, usit103p);
            stmt.setInt(8, usit104t);
            stmt.setInt(9, usit104p);
            stmt.setInt(10, usit105t);
            stmt.setInt(11, usit105p);
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
