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
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AJAY
 */
public class stdvalidate extends HttpServlet {

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

        int semno = Integer.parseInt(request.getParameter("sem"));
        int rollno = Integer.parseInt(request.getParameter("rollno"));

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/result_portal_db", "root", "");
            if (semno == 1) {
                PreparedStatement stmt = con.prepareStatement("select * from sem1 where rollno=?");
                stmt.setInt(1, rollno);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    out.println("roll no is " + rs.getString(1));
                    out.println("marks " + rs.getString(2));
                    out.println("");
                } else {
                    out.println("not in database");
                }
            } else if (semno == 2) {
                PreparedStatement stmt = con.prepareStatement("select * from sem2 where rollno=?");
                stmt.setInt(1, rollno);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    out.println("roll no is " + rs.getString(1));
                    out.println("marks " + rs.getString(2));
                    out.println("");
                } else {
                    out.println("not any information");
                }
            } else if (semno == 3) {
                PreparedStatement stmt = con.prepareStatement("select * from sem3 where rollno=?");
                stmt.setInt(1, rollno);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    out.println("roll no is " + rs.getString(1));
                    out.println("marks " + rs.getString(2));
                    out.println("");
                } else {
                    out.println("not any information");
                }
            } else if (semno == 4) {
                PreparedStatement stmt = con.prepareStatement("select * from sem4 where rollno=?");
                stmt.setInt(1, rollno);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    out.println("roll no is " + rs.getString(1));
                    out.println("marks " + rs.getString(2));
                    out.println("");
                } else {
                    out.println("not any information");
                }
            } else if (semno == 5) {
                PreparedStatement stmt = con.prepareStatement("select * from sem5 where rollno=?");
                stmt.setInt(1, rollno);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    out.println("roll no is " + rs.getString(1));
                    out.println("marks " + rs.getString(2));
                    out.println("");
                } else {
                    out.println("not any information");
                }
            } else if (semno == 6) {
                PreparedStatement stmt = con.prepareStatement("select * from sem6 where rollno=?");
                stmt.setInt(1, rollno);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    out.println("roll no is " + rs.getString(1));
                    out.println("marks " + rs.getString(2));
                    out.println("");
                } else {
                    out.println("not any information");
                }
            }
        } catch (Exception e) {

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
