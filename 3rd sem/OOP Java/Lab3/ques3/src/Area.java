public class Area {
    public Area(int radius) {
        System.out.println("Area of circle is "+(3.14*radius*radius));
    }

    public Area(int length, int breadth) {
        System.out.println("Area of rectangle is "+length*breadth);
    }

    public Area(double length, double breadth) {
        System.out.println("Area of rectangle is "+length*breadth);
    }
}