package Zadanie3_4;

public class Machine {
    private String name;

    public Machine() {
        System.out.println("First constructor running");
    }

    public Machine(String name) {
        System.out.println("Second constructor running");
        this.name = name;
    }
}
