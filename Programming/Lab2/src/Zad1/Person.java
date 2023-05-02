package Zad1;

import java.util.Objects;

public class Person {
    private String imie;
    private String nazwisko;
    private char plec;
    private byte[] pesel = new byte[11];
    private Person matka;
    private Person ojciec;
    private Person dziecko;

    public Person() {

    }

    public Person(String imie, String nazwisko, char plec, Integer pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.pesel = pesel;
        this.pesel = pesel.
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return plec == person.plec && pesel == person.pesel && imie.equals(person.imie) &&
                nazwisko.equals(person.nazwisko) && Objects.equals(matka, person.matka) &&
                Objects.equals(ojciec, person.ojciec) && Objects.equals(dziecko, person.dziecko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, plec, pesel, matka, ojciec, dziecko);
    }

    public Person getMatka() {
        return matka;
    }

    public void setMatka(Person matka) {
        this.matka = matka;
    }

    public Person getOjciec() {
        return ojciec;
    }

    public void setOjciec(Person ojciec) {
        this.ojciec = ojciec;
    }

    public Person getDziecko() {
        return dziecko;
    }

    public void setDziecko(Person dziecko) {
        this.dziecko = dziecko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public char getPlec() {
        return plec;
    }

    public void setPlec(char plec) {
        this.plec = plec;
    }

    public Integer getPesel() {
        return pesel;
    }

    public void setPesel(Integer pesel) {
        this.pesel = pesel;
    }
}
