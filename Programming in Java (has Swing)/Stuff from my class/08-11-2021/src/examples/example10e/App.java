package examples.example10e;

public class App {
    public static void main(String[] args) {
        Thing.description = "I am a thing";
        System.out.println(Thing.description);
        System.out.println("Before creating objects, count is " + Thing.count);
        Thing thing1 = new Thing();
        Thing thing2 = new Thing();
        System.out.println("After creating objects, count is " + Thing.count);
        thing1.name = "Bob";
        thing2.name = "Sue";

        Thing.showInfo();
        thing1.showName();
        thing2.showName();

        System.out.println(Math.PI);
        System.out.println(Thing.LUCKY_NUMBER);
    }
}
