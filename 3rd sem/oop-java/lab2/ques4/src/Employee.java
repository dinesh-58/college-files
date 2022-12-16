public class Employee {
    public String name;
    public String address;
    public int joinedYear;

    //default constructor
    public Employee() {
        name = "Ram";
        joinedYear = 2056;
        address = "Kathmandu";
        System.out.println(name+" "+joinedYear+" "+address);
    }
    // parameterized constructor
    public Employee (String name, int joinedYear, String address) {
        this.name = name;
        this.joinedYear = joinedYear;
        this.address = address; 
        System.out.println(name+" "+joinedYear+" "+address);

    }

    
}
