package aminals;

import java.util.Random;

public class Pies {
    Random rand = new Random();
    int upperBound = 4;

    public void makeSound() {
        int randomInt = rand.nextInt(upperBound);
        switch (randomInt) {
            case 0:
                System.out.println("Borf");
                break;
            case 1:
                System.out.println("Hau");
                break;
            case 2:
                System.out.println("Bork");
                break;
            case 3:
                System.out.println("Woof");
                break;
            default:
                break;
        }

    }
}
