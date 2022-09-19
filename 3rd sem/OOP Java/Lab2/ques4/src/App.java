public class App {
    public static void main(String[] args) throws Exception {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Shyam", 2062, "Biratnagar");
        Employee e3 = new Employee("Jeevan", 2065, "Pokhara");

        System.out.println(e1.name+" "+e1.joinedYear+" "+e1.address);
        System.out.println(e2.name+" "+e2.joinedYear+" "+e2.address);
        System.out.println(e3.name+" "+e3.joinedYear+" "+e3.address);
    }
}
