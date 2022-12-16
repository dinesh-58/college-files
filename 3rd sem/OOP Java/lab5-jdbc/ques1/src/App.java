import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost", "root", "");
            String query = "CREATE DATABASE bcathird";
            PreparedStatement ps = con.prepareStatement(query);
            ps.executeUpdate();
            System.out.println("Database created");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
