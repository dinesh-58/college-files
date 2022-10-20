public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(StaticClass.var);
        StaticClass.var++;
        StaticClass.disp();
    }
}
