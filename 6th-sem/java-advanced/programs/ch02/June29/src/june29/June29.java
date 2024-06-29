/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package june29;

import java.sql.*;

/**
 *
 * @author sujal
 */
public class June29 {

	Connection conn;

	public static void main(String[] args) {
		try {
//			UpdateDemo();
//			DeleteDemo();
			new SelectDemo();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public static void UpdateDemo() throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "");
		// NOTE: no need to wrap placeholders (?) in quotes. will get added by setString 
		String sql = "update student set first_name=?, last_name=? where id=1";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, "sujal");
		ps.setString(2, "gurung");
		ps.execute();
		conn.close();
	}

	public static void DeleteDemo() throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "");
		String sql = "delete from student where id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, 1);
		ps.execute();
		conn.close();
	}
}
