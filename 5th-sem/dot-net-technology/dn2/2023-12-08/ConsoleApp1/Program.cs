using System;
namespace ConsoleApp1;

public class Program{
    static void Main(string[] args)
    {
        Hello obj = new Hello();
        // obj.Addition();
        
        // ====== pass by value ======
        
        // Console.WriteLine(obj.Display());
        // Console.WriteLine(obj.Display("India"));
        // Console.WriteLine(obj.Display(college: "Pulchowk"));
        // Console.WriteLine(obj.Display("Nepal", "Pulchowk"));
        // Console.ReadKey();
        
        // obj.checkOddEven();
        
        
        // ====== ref params ======
        int x = 10;
        Console.Write("Value of x before calling is: {0}", x);
        ref int test = ref x;
        Console.WriteLine($"ref of x is {test}");
        ChangeRefVal(ref x);
        Console.Write("Value of x after calling is: {0}", x);


        // ====== out params ======
        int a, b;
        OutFunc(out a, out b);
        Console.WriteLine("a: {0}   b: {1}", a, b);
    }
    
    public static void ChangeRefVal(ref int tempRef)
    {
        tempRef = 20;
    }

    public static void OutFunc(out int x, out int y) {
        x = 10;
        y = 20;
    }
}
