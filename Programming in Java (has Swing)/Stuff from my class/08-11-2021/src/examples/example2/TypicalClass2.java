package examples.example2;

import examples.example1.TypicalClass;

public class TypicalClass2 {
    public String model;
    public String marka;
    public int moc;
    public double cena;
    static int myCarCount = 1;

    public TypicalClass2(String model, String marka, int moc, double cena) {
        super();
        this.model = model;
        this.marka = marka;
        this.moc = moc;
        this.cena = cena;
    }

    static {
        System.out.println("b");
    }

    public TypicalClass2() {
        super();
    }

    public String getModel() {
        return model;
    }

    public String getMarka() {
        return marka;
    }

    public int getMoc() {
        return moc;
    }

    public double getCena() {
        return cena;
    }
}
