public class App {
    public static void main(String[] args) {
        Student std = new Student();
        std.rollNumber = 20;
        std.name = "Ram Bahadur";
        std.faculty = "BCA";
        
        System.out.println("Name: "+std.name+" Roll: "+std.rollNumber+" Faculty: "+std.faculty);
    }
}
