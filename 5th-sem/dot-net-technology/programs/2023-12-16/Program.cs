namespace Arrays;
internal class Program {
    static void Main(string[] args) {
        
        MultiDim.CreateArray();  
        // MultiDim is class in same namespace & CreateArray is static method.
        
        Console.WriteLine(Partial.prop);
        Console.WriteLine(Partial.prop2);

        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor(1);
    }
}
