package aminals;

import java.util.Random;

public class Kot {
    Random rand = new Random();
    int upperBound = 4;

    public void makeSound() {
        int randomInt = rand.nextInt(upperBound);
        switch (randomInt) {
            case 0:
                System.out.println("Meow");
                break;
            case 1:
                System.out.println("Miau");
                break;
            case 2:
                System.out.println("Purr");
                break;
            case 3:
                System.out.println("Hiss");
                break;
            default:
                break;
        }

    }
}
