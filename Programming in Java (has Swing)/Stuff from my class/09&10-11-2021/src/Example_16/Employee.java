package Example_16;

public class Employee extends Person {
    String title;

    public String getDescription() {
        System.out.println("W klasie Employee ");
        return super.getDescription() + ": " + title;
    }
}