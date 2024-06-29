package june29;

import javax.swing.JFrame;
import java.sql.*;
import javax.swing.JTable;

public class SelectDemo extends JFrame {

	public SelectDemo() {
		this.setSize(500, 500);
		String[][] rowData = getData();
		String[] columnNames = {
			"id", "first_name", "last_name", "gender", "district", "vehicle_type"
		};
		JTable jt = new JTable(rowData, columnNames);
		this.add(jt);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public String[][] getData() {
		String[][] data = {{}};
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "");
			String sql = "select * from student";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			System.out.println("id \t | first_name \t | last_name \t | gender \t | district \t | vehicle_type ");

			rs.last();
			int rowCount = rs.getRow();
			rs.beforeFirst();

			data = new String[rowCount][6];
			int curRow = 0;
			while (rs.next()) {
				System.out.println(
					rs.getInt("id") + " \t "
					+ rs.getString("first_name") + " \t "
					+ rs.getString("last_name") + " \t "
					+ rs.getString("gender") + " \t "
					+ rs.getString("district") + " \t "
					+ rs.getString("vehicle_type") + " \t "
				);
				for (int i = 0; i < 6; i++) {
					data[curRow][i] = rs.getString(i + 1);
				}
				curRow++;
			}
			conn.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return data;
	}
}