namespace Arrays;
public class Constructor {
    public Constructor() {
        Console.WriteLine("Executed default Constructor");
    }
    public Constructor(int a) {
        Console.WriteLine("Executed parameterized Constructor with parameter value {0}", a);
    }
    // TODO: try creating static constructor & calling it twice
}
