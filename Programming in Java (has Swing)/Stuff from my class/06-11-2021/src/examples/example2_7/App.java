package examples.example2_7;

class Robot {
    public void speak(String text) {
        System.out.println(text);
    }
}

public class App {
    public static void main(String[] args) {
        Robot ed = new Robot();
        ed.speak("Hi, I am ed!");
    }
}
