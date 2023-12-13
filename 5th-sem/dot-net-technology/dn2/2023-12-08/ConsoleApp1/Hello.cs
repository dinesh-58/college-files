namespace ConsoleApp1;

public class Hello
{
    public string Display(string country = "Nepal", string college = "HCOE")
    {
        return country + " " + college;
    }
    public void Addition()
    {
        Console.WriteLine("Enter 2 number");
        int a = Convert.ToInt32(Console.ReadLine());
        int b = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine(a+b);
        Console.WriteLine($"Sum of {a} and {b} is {a+b}");
        Console.WriteLine("Sum of {0} and {1} is {2}", a, b, a+b);
    }

    public void checkOddEven()
    {
        Console.Write("Enter a number ");
        int num = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine(num % 2 == 0 ? "Even" : "Odd");
    }
}