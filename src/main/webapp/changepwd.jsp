<%-- 
    Document   : changepwd
    Created on : 17 Mar, 2019, 5:14:01 PM
    Author     : AJAY
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<%
    String currentPassword = request.getParameter("current");
    String Newpass = request.getParameter("new");
    String conpass = request.getParameter("confirm");
    String connurl = "jdbc:mysql://localhost:3306/result_portal_db";
    Connection con = null;
    String pass = "";
    
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(connurl, "root", "");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from admin_login where password='" + currentPassword + "'");
        while (rs.next()) {
            
            pass = rs.getString(2);
        }
        System.out.println(" " + pass);
        if (pass.equals(currentPassword)) {
            Statement st1 = con.createStatement();
            int i = st1.executeUpdate("update admin_login set password='" + Newpass + "'");
            out.println("Password changed successfully");
            st1.close();
            con.close();
        } else {
            out.println("Invalid Current Password");
        }
    } catch (Exception e) {
        out.println(e);
    }
%>
