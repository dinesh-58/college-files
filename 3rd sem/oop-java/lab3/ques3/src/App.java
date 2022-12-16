import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Choice | Calculate area for: ");
        System.out.println("1 | circle");
        System.out.println("2 | rectangle(integer values)");
        System.out.println("3 | rectangle(fractional values)");
        Scanner sc = new Scanner(System.in);
        Area c;
        
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter circle radius");
                c = new Area(sc.nextInt());
                break;
            case 2:
                System.out.println("Enter rectangle length & breadth in integers");
                c = new Area(sc.nextInt(), sc.nextInt());
                break;
            case 3:
                System.out.println("Enter rectangle length & breadth in fractions");
                c = new Area(sc.nextDouble(), sc.nextDouble());
                break;
        }
    }
}