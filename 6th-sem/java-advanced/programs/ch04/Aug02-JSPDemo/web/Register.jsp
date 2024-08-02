<%-- 
    Document   : Register
    Created on : Aug 2, 2024, 7:18:37 PM
    Author     : sujal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <h1>Register a new account</h1>
		<form method="post">
			<label>
				First Name: <input required name="fName" type="text" />
			</label>
			<label>
				Last Name: <input required name="lName" type="text" />
			</label>
			<fieldset>
				Gender: 
				<input required name="gender" type="radio" value="male" /> Male
				<input required name="gender" type="radio" value="femae" /> Female
				<input required name="gender" type="radio" value="other" /> Other
			</fieldset>
			<fieldset>
				District: 
				<select required name="district">
					<option value="KTM">KTM</option>
					<option value="Pokhara">Pokhara</option>
					<option value="Birgunj">Birgunj</option>
				</select>
			</fieldset>
			<fieldset>
				Vehicle type: 
				<label>
					<input type="checkbox" name="vehicle" value="bus" checked />
					Bus:
				</label>
				<label>
					<input type="checkbox" name="vehicle" value="bike" />
					Bike:
				</label>
				<label>
					<input type="checkbox" name="vehicle" value="car" />
					Car:
				</label>
			</fieldset>
			<label>
				Email : <input required name="email" type="email" />
			</label>
			<label>
				Password: <input required name="password" type="password" />
			</label>
			<button type="submit" name="submit">Register</button>
		</form>
		<%@include file="./includes/Connection.jsp"%>
		<%			
			if (request.getMethod().equalsIgnoreCase("post") && request.getParameter("submit") != null) {
				String fName = request.getParameter("fName");
				String lName = request.getParameter("lName");
				String district = request.getParameter("district");
				String gender = request.getParameter("gender");
				String vehicle = String.join(", ", request.getParameterValues("vehicle"));
				String email = request.getParameter("email");
				String password = request.getParameter("password");

				String sql = "insert into student(first_name, last_name, gender, district, vehicle_type, email, password_plain_text) values"
					+ "(?, ?, ?, ?, ?, ?, ?)";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, fName);
				ps.setString(2, lName);
				ps.setString(3, district);
				ps.setString(4, gender);
				ps.setString(5, vehicle);
				ps.setString(6, email);
				ps.setString(7, password);

				ps.execute();
				ps.close();
				conn.close();
				response.sendRedirect("login?email="+email);
			}
		%>
    </body>
</html>
