import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Manager m;
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("1: create HR Manager");
        System.out.println("2: create General Manager");
        System.out.println("3: create Manager only");
        choice = sc.nextInt();
        switch (choice) {
            case 1: 
                m = new HRManager();
                break;
            case 2: 
                m = new GeneralManager();
                break;
            case 3: 
                m = new Manager();
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
