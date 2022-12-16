import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Choice | Calculate area for: ");
        System.out.println("1 | circle");
        System.out.println("2 | rectangle(integer values)");
        System.out.println("3 | rectangle(fractional values)");
        Scanner sc = new Scanner(System.in);
        Calc c = new Calc();
        
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter circle radius");
                c.area(sc.nextInt());
                break;
            case 2:
                System.out.println("Enter rectangle length & breadth in integers");
                c.area(sc.nextInt(), sc.nextInt());
                break;
            case 3:
                System.out.println("Enter rectangle length & breadth in fractions");
                c.area(sc.nextDouble(), sc.nextDouble());
                break;
        }
    }
}
