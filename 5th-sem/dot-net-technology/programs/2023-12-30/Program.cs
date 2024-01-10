namespace _2023_12_30;

class Program
{
    static void Main(string[] args)
    {
        /*
        Student s = new Student();
        s.FullName = "Sujal";
        Console.Write(s.FullName);
        */

        GenericStudent<string> gs = new GenericStudent<string>("Sujal");
        GenericStudent<int> gs2 = new GenericStudent<int>(12);
    }
}

// properties
class Student {
    private string? _fullName;
    private int _ageGroup;

    public string? FullName {
        get{ return _fullName; } 
        set{_fullName = value;}
    }

    public string? AgeGroup {
        get; set;
    }
}

class GenericStudent<T> {
    public T FullName;

    public GenericStudent(T name) {
        FullName = name;
    }
    public T Show() {
        return FullName;
    }
    public T MyProperty {
        get; set;
    }
}
