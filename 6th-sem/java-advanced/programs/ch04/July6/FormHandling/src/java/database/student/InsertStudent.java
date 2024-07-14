/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package database.student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 *
 * @author sujal
 */
@WebServlet(name = "InsertStudent", urlPatterns = {"/InsertStudent"})
public class InsertStudent extends HttpServlet {

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
		try (PrintWriter out = response.getWriter()) {
			String fName = request.getParameter("fName");
			String lName = request.getParameter("lName");
			String district = request.getParameter("district");
			String gender = request.getParameter("gender");
			// instead of this, can use same input name for multiple inputs
			// and use request.getParameterValues(name), which returns string[]  of values
			String[] vehicleInputNames = {"vehcile-bus", "vehcile-bike", "vehcile-car"};
			String vehicle = "";

			for (String v : vehicleInputNames) {
				if (request.getParameter(v) != null) {
					vehicle += request.getParameter(v) + ", ";
					break;
				}
			}

			String email="", password="";
			email = request.getParameter("email");
			password = request.getParameter("password");

			// Glassfish may not find jdbc driver so use either of these 2
			// to specify which Driver class to use

			// DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "");
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

			RequestDispatcher rd = request.getRequestDispatcher("signIn.html");
			rd.forward(request, response);
			

			/*
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet InsertStudent</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Inserted: </h1>");
			out.println("Name: " + fName + " " + lName);
			out.println("<br/>District: " + district);
			out.println("<br/>Gender: " + gender);
			out.println("<br/>Vehicle Type: " + vehicle);
			out.println("<br/>Email: " + email);
			out.println("</body>");
			out.println("</html>");
			*/
		} catch (Exception e) {
			System.err.println(e.getMessage());
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
