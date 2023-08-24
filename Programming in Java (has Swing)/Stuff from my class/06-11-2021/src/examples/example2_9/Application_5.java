package examples.example2_9;

class Person {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Application_5 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Barbara");
        System.out.println(person1.getName());

        Person person2 = new Person();
    }
}
