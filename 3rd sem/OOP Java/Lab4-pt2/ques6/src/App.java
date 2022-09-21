//Exception handling
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 integers");
        a = sc.nextInt();
        b = sc.nextInt();
        
        try {
            System.out.println("Quotient is "+(a/b));
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
