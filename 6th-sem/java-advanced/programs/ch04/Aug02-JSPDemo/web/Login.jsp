<%-- 
    Document   : Login
    Created on : Aug 2, 2024, 6:00:35 PM
    Author     : sujal
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
		<%@ include file="includes/header.html" %>
        <h1>Login</h1>
		<form action="" method="post">
			<label>
				Email:
				<% String email = request.getParameter("email"); %>
				<input required name="email" type="email" value='<%= email != null ? email : "john@mail.com" %>' autofocus />
			</label>
			<label>
				Password:
				<input name="password" type="password" />
			</label>
			<button name="submit" type="submit">Log In</button>
		</form>

		<%@include file="./includes/Connection.jsp" %>
		<%
			if(request.getMethod().equalsIgnoreCase("post") && request.getParameter("submit") != null) {
				String password = request.getParameter("password");

				String sql = "select id, first_name from student where email = ? AND password_plain_text = ?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, email);
				ps.setString(2, password);
				ResultSet rs = ps.executeQuery();

				if(rs.next()) {
					session.setAttribute("id", rs.getString(1));
					session.setAttribute("first_name", rs.getString(2));
					response.sendRedirect("dashboard");
				} else {
					out.print("<dialog open> Error logging in. <a href='register'>Create account? </a>");
					out.print("</dialog>");
				}
			}
			conn.close();
		%>
    </body>
</html>
