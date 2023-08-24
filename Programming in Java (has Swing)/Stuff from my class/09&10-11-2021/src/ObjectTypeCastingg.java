public class ObjectTypeCastingg {
    public static void main(String[] args) {
        Cat cat = new Cat();

        // upcasting - narrows the list of methods
        // downcasting - - extends the list of methods
        Animal animal = cat;    // implicit upcasting
        animal = (Animal)cat;   // Explicit upcasting

        cat.meow();
        animal.eat();
        // animal.meow(); The method meow() is undefined for the type Animal

    }
}