<%-- 
    Document   : Connection
    Created on : Aug 2, 2024, 6:43:54 PM
    Author     : sujal
--%>

<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
	DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "");
%>