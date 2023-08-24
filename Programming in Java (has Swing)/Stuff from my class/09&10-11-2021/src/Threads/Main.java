package Threads;

public class Main extends Thread {  // public class Main implements Runnable {...}
    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        System.out.println("Test");
        System.out.println("This code is outside of the thread");
    }

    public void run() {
        System.out.println("This code is running in a thread.");
    }
}
