import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class App {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost", "root", "");
            String query = "CREATE TABLE bcathird.student (id int, name varchar(100), email varchar(100), address varchar(50))";
            PreparedStatement ps = con.prepareStatement(query);
            ps.executeUpdate();
            System.out.println("Table created");
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}