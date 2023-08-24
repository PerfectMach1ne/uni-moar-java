package examples.example2_8;

class Robot {
    public void speak(String text) {
        System.out.println(text);
    }

    public void jump(int height) {
        System.out.println("Jumping " + height + " meters.");
    }

    public void move(String direction, double distance) {
        System.out.println("Ed move " + distance + " km on " + direction);
    }
}

public class App {
    public static void main(String[] args) {
        Robot ed = new Robot();
        ed.speak("Hi, I am Ed!");
        ed.jump(7);
        ed.move("West", 12.5);
    }
}
