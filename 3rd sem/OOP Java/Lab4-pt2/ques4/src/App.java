public class App {
    public static void main(String[] args) throws Exception {
        Cat ca = new Cat();
        Cow co = new Cow();
        Dog d = new Dog();

        System.out.println(ca.sayHello());
        ca.showType();
        ca.makeSound();
        
        System.out.println(co.sayHello());
        co.showType();
        co.makeSound();
        
        System.out.println(d.sayHello());
        d.showType();
        d.makeSound();

    }
}
