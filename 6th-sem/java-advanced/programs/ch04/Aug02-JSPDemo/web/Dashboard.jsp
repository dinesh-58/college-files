<%-- 
    Document   : Dashboard
    Created on : Aug 2, 2024, 7:18:22 PM
    Author     : sujal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Dashboard</title>
		<style>
			tr:nth-child(even){
				background: gray;
			}
		</style>
    </head>
    <body>
		<% out.print("Hello, " + session.getAttribute("first_name"));%>
		<form method="post">
			<button type="submit" name="logout">Log out</button>
		</form>
		<h1>Student details: </h1>
		<%@include file="./includes/Connection.jsp" %>
		<form method="post">
			<table border='2'>
				<thead>
				<th>id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Gender</th>
				<th>District</th>
				<th>Vehicle types</th>
				<th>Email</th>
				<th></th>
				</thead>
				<%			if (session.getAttribute("id") == null) {
						response.sendRedirect("login");
					}
					String sql = "select id, first_name, last_name, gender, district, vehicle_type, email from student";
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(sql);

					while (rs.next()) {
						out.println("<tr>");
						for (int i = 1; i < 8; i++) {
							out.println("<td>" + rs.getString(i) + "</td>");
						}
						out.println("<td><button type='submit' name='deleteStudentId' value='" + rs.getString("id") + "'>Delete</button></td>");
						out.println("</tr>");
					}
					stmt.close();
				%>
			</table>
		</form>
		<%
			if (request.getMethod().equalsIgnoreCase("post")) {
				if (request.getParameter("logout") != null) {
//				session.removeAttribute("id");
					session.invalidate();
					response.sendRedirect("login");
				}
				String deleteStudentId = request.getParameter("deleteStudentId");

				if (request.getParameter("deleteStudentId") != null) {
					String deleteSql = "delete from student where id=?";
					PreparedStatement ps = conn.prepareStatement(deleteSql);
					ps.setString(1, request.getParameter("deleteStudentId"));
					ps.executeUpdate();
					ps.close();
					response.sendRedirect("");
				}
			}
		%>
		<% conn.close(); %>
	</body>
</html>
</body>
</html>
