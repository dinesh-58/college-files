public class App {
    public static void main(String[] args) throws Exception {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        emp1.setValues("Ram", 2056, "Kathmandu");
        emp2.setValues("Shyam", 2062, "Biratnagar");
        emp3.setValues("Jeevan", 2065, "Pokhara");

        System.out.println("Name Year of joining Address");
        System.out.println(emp1.getName()+" "+emp1.getJoinedYear()+" "+emp1.getAddress());
        System.out.println(emp2.getName()+" "+emp2.getJoinedYear()+" "+emp2.getAddress());
        System.out.println(emp3.getName()+" "+emp3.getJoinedYear()+" "+emp3.getAddress());
    }
}
