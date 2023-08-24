package examples.example10c;

class Thing {
    public String name;
    public static String description;

    public void showName() {
        System.out.println(name);
    }

    public static void showInfo() {
        System.out.println(description);
    }
}

public class App {
    public static void main(String[] args) {
        Thing.description = "I am a thing";
        System.out.println(Thing.description);
        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        thing1.name = "Bob";
        thing2.name = "Sue";

        Thing.showInfo();

        thing1.showName();
        thing2.showName();
    }
}
