package examples.example1;

public class TypicalClass {
    private String specialization = "dermatolog";
    private String job;
    private int age;
    private int praktyka;
    private String name;

    public String makeSpecialization() {
        specialization = "pediatra";
        return specialization;
    }

    public String getDoctor(String firstLastName) {
        name = firstLastName;
        return name;
    }

    public int obliczLataPraktyki(int age) {
        praktyka = (age - 26);
        return praktyka;
    }
}
