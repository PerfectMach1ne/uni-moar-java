package Example_16;

public class Person {
    String firstName;
    String lastName;

    public String getDescription() {
        System.out.println("W klasie person ");
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}