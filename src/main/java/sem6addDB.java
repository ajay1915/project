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
public class sem6addDB extends HttpServlet {

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
        int usit601t = Integer.parseInt(request.getParameter("usit601t"));
        int usit601p = Integer.parseInt(request.getParameter("usit601p"));
        int usit602t = Integer.parseInt(request.getParameter("usit602t"));
        int usit602p = Integer.parseInt(request.getParameter("usit602p"));
        int usit603t = Integer.parseInt(request.getParameter("usit603t"));
        int usit603p = Integer.parseInt(request.getParameter("usit603p"));
        int usit604t = Integer.parseInt(request.getParameter("usit604t"));
        int usit604p = Integer.parseInt(request.getParameter("usit604p"));
        int usit605t = Integer.parseInt(request.getParameter("usit605t"));
        int usit605p = Integer.parseInt(request.getParameter("usit605p"));

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/result_portal_db", "root", "");
            PreparedStatement stmt = con.prepareStatement("insert into sem6 values (?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1, rollno);
            stmt.setInt(2, usit601t);
            stmt.setInt(3, usit601p);
            stmt.setInt(4, usit602t);
            stmt.setInt(5, usit602p);
            stmt.setInt(6, usit603t);
            stmt.setInt(7, usit603p);
            stmt.setInt(8, usit604t);
            stmt.setInt(9, usit604p);
            stmt.setInt(10, usit605t);
            stmt.setInt(11, usit605p);
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
