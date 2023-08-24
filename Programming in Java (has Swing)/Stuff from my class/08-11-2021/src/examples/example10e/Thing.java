package examples.example10e;

public class Thing {
    public final static int LUCKY_NUMBER = 21;
    public String name;
    public static String description;
    public static int count = 0;
    public int id;

    public Thing() {
        id = count;
        count++;
    }

    public void showName() {
        System.out.println("Objects id: " + id + ", " + description + ": " + name);
    }

    public static void showInfo() {
        System.out.println("Hello in static method");
    }
}
