// Docs: https://dev.mysql.com/doc/connector-j/en/
package june28;

import java.sql.*;

/**
 *
 * @author sujal
 */
public class June28 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		try {
			java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "");
			System.out.println("Connected !");
			String sql = "create table student(id int PRIMARY KEY AUTO_INCREMENT, name varchar(40));";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.execute();
			System.out.println("table created");

				
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
		}
	}
	
}
