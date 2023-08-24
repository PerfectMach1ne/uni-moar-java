package wspa2;

class Person_v2 {
    String name;
    int age;

    void speak() {
        System.out.println("Hello! ");
    }
}

public class App2 {
    public static void main(String[] args) {
        Person_v2 person1 = new Person_v2();
        person1.name = "Jan Kowalski";
        person1.age = 25;
        person1.speak();
        System.out.println(person1.name + ", " + person1.age + " lat");

        Person_v2 person2 = new Person_v2();
        person2.name = "Ewa";
        person2.age = 20;
        System.out.println(person2.name);
        person2.speak();
        System.out.println(person2.name + ", " + person2.age + " lat");
    }
}