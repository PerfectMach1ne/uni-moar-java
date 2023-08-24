package wspa2;

class Person_v1 {
    String name;
    int age;
}

public class App1 {
    public static void main(String[] args) {
        Person_v1 person1 = new Person_v1();
        person1.name = "Jan Kowalski";
        person1.age = 25;

        Person_v1 person2 = new Person_v1();
        person2.name = "Ewa";
        person2.age = 20;

        System.out.println(person2.name + " " + person2.age);
    }
}
