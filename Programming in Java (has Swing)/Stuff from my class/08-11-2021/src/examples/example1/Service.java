package examples.example1;

public class Service {
    public static void main(String[] args) {
        TypicalClass my = new TypicalClass();
        System.out.println("Idę do lekarza o specjalizacji: " + my.makeSpecialization());
        System.out.println("Mój lekarz nazywa się " + my.getDoctor("Jan Kowalski"));
        System.out.println("Mój lekarz praktykuje od " + my.obliczLataPraktyki(48) + " lat.");
    }
}