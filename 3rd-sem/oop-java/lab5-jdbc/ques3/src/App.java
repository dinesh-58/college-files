import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {
    public void insertRow(int id, String name, String email, String address) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bcathird", "root", "");
            String query = "INSERT INTO student(id, name, email, address) VALUES(?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, email);
            ps.setString(4, address);
            ps.executeUpdate();
            System.out.println("Data inserted");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    } 
    
    public static void main(String[] args) {
        App a = new App();
        a.insertRow(1, "Ram Sharma", "ramsharma@gmail.com", "Kathmandu");
        a.insertRow(2, "Shyam Chhetri", "chhetrishyam@gmail.com", "Pokhara");
        a.insertRow(3, "Sita Neupane", "neupanesita@gmail.com", "Chitwan");
    }
}
