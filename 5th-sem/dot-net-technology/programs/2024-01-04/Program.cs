namespace _2024_01_05;
using System.Collections.Generic;

class Program
{
    static void Main(string[] args)
    {
        // OperatorOverloadDemo();
        GenericTypeDemo();
    }

    static void OperatorOverloadDemo() {
        Complex cmp1 = new Complex(10, 20);
        Complex cmp2 = new Complex(5, 10);
        //cmp1 = -cmp1;
        //cmp1.show();
        (-cmp1).show();
        (cmp1 - cmp2).show();
    }

    static void GenericTypeDemo() {
        List<Student> ls = new List<Student>();
        
        Student s1 = new Student("Sujal", 20, "Kathmandu");
        ls.Add(s1);

        Student s2 = new Student("Dinesh", 20, "Kathmandu");
        ls.Add(s2);

        foreach(Student s in ls) {
            Console.WriteLine(s.name);
        }
    }
}

class Student {
    public string? name;
    public int age;
    public string? address;
    public Student() {}
    public Student(string name, int age, string address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

}
