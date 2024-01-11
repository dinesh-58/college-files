namespace _2024_01_11;

class Program {
    static void Main(string[] args) {

        // DemoLinqLambda();
        DemoLinqPractice();
    }

    static void DemoLinqLambda() {
        Employee e1 = new Employee("Shyam", 20000, "Kathmandu");
        Employee e2 = new Employee("Ram", 30000, "Kathmandu");
        Employee e3 = new Employee("Raju Chaudhari", 200000, "Chitwan");

        List<Employee> EList = new List<Employee>{e1,e2,e3};
        // EList.Add(e1); EList.Add(e2); EList.Add(e3);

        var linq = from e in EList
            where e.Salary > 10000 && e.Address == "Kathmandu"
            select e;

        // lambda expressions. basically JS array methods
        var lambda = EList.FindAll(e => e.Salary > 1000 && e.Address == "Kathmandu");

        foreach(Employee emp in lambda) {
            Console.WriteLine(emp.Name + emp.Salary + emp.Address);
        }
    }
    static void DemoLinqPractice() {
        List<int> numbers = new List<int>{1,2,3,4,5,6,7,8,9};
        /* find
         * square numbers
         * only even numbers
        */

        Console.Write("\n Square of numbers: ");
        foreach(int x in numbers.Select(n => n*n)) {
            Console.Write($"{x} ");
        }

        Console.Write("\n Even numbers: ");
        foreach(int x in numbers.Where(n => n % 2 == 0)) {
            Console.Write($"{x} ");
        } 
    }
}

class Employee {
    public string? Name{get; set;}
    public int Salary{get; set;}
    public string? Address{get; set;}

    public Employee(){}
    public Employee(string name, int salary, string address){
        this.Name = name;
        this.Salary = salary;
        this.Address = address;
    }
}
