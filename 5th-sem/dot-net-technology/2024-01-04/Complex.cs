namespace _2024_01_05;

class Complex {
    int a, b;
    public Complex() {} // default constructor

    public Complex(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public void show() {
        Console.WriteLine("Values {0}, {1}", a, b);
    }

    // unary operator operloading
    public static Complex operator - (Complex x) {
        Complex temp = new Complex();
        temp.a = - x.a;
        temp.b = - x.b;
        return temp;
    }

    // binary operator operloading
    public static Complex operator - (Complex x, Complex y) {
        Complex temp = new Complex();
        temp.a = x.a - y.a;
        temp.b = x.b - y.b;
        return temp;
    }
}
