package Zwierzaki;

import java.time.LocalDateTime;

public class Person {
    private String imie;
    private String nazwisko;
    private Plec plec;
    private String pesel;
    private Person ojciec;
    private Person matka;

    public Person() {}

    public Person(String imie, String nazwisko, Plec plec, String pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.pesel = pesel;
    }

    public boolean peselPoprawny() {
        if(pesel.length() != 11) {
            return false;
        }

        int[] dniWMiesiacach = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] data;

        try {
            data = getDataUrodzenia().split("-");
        } catch (IllegalArgumentException e) {
            return false;
        }

        if(Integer.parseInt(data[0]) < 1800 || Integer.parseInt(data[0]) > LocalDateTime.now().getYear()){
            return false;
        } else if(Integer.parseInt(data[1]) < 1 ||Integer.parseInt(data[1]) > 12) {
            return false;
        } else if(Integer.parseInt(data[2]) < 1) {
            return false;
        }

        if(Integer.parseInt(data[1]) == 2) {
            if(Integer.parseInt(data[0])%4 == 0) {
                if(Integer.parseInt(data[2]) > 29) {
                    return false;
                }
            } else {
                if(Integer.parseInt(data[2]) > 28) {
                    return false;
                }
            }
        } else {
            if(Integer.parseInt(data[1]) > dniWMiesiacach[Integer.parseInt(data[1])]){
                return false;
            }
        }

        if(Integer.parseInt(String.valueOf(pesel.charAt(9))) % 2 == 0 && (plec == Plec.Mezczyzna) ||
                Integer.parseInt(String.valueOf(pesel.charAt(9))) % 2 != 0 && (plec == Plec.Kobieta)) {

            return false;
        }

        int sumaKontrolna = Integer.parseInt(String.valueOf(pesel.charAt(0))) * 1
                + Integer.parseInt(String.valueOf(pesel.charAt(1))) * 3
                + Integer.parseInt(String.valueOf(pesel.charAt(2))) * 7
                + Integer.parseInt(String.valueOf(pesel.charAt(3))) * 9
                + Integer.parseInt(String.valueOf(pesel.charAt(4))) * 1
                + Integer.parseInt(String.valueOf(pesel.charAt(5))) * 3
                + Integer.parseInt(String.valueOf(pesel.charAt(6))) * 7
                + Integer.parseInt(String.valueOf(pesel.charAt(7))) * 9
                + Integer.parseInt(String.valueOf(pesel.charAt(8))) * 1
                + Integer.parseInt(String.valueOf(pesel.charAt(9))) * 3;

        if(sumaKontrolna % 10 != Integer.parseInt(String.valueOf(pesel.charAt(10)))){
            return false;
        }


        return true;
    }

    public String getDataUrodzenia() throws IllegalArgumentException{
        if(!czyPeselJestLiczba()){
            throw new IllegalArgumentException("Nie poprawny pesel");
        }

        int rok;
        int miesiac;
        int dzien;

        rok = Integer.parseInt(pesel.substring(0, 2));
        miesiac = Integer.parseInt(pesel.substring(2, 4));
        dzien = Integer.parseInt(pesel.substring(4, 6));

        if(miesiac <= 12) {
            rok += 1900;
        } else if(miesiac - 20 <= 12) {
            rok += 2000;
            miesiac -= 20;
        } else if(miesiac - 40 <= 12) {
            rok += 2100;
            miesiac -= 40;
        } else if(miesiac - 60 <= 12) {
            rok += 2200;
            miesiac -= 60;
        } else {
            rok += 1800;
            miesiac -= 80;
        }

        return rok + "-" + miesiac + "-" + dzien;
    }

    private boolean czyPeselJestLiczba() {
        for(char symbol: pesel.toCharArray()) {
            if(!Character.isDigit(symbol)){
                return false;
            }
        }

        return true;
    }

    public boolean jestDziadkiem(Person person) {
        if(this.ojciec != null) {
            if(this.ojciec.getOjciec().equals(person)){
                return true;
            }
        }
        if(this.matka != null) {
            if(this.matka.getOjciec().equals(person)) {
                return true;
            }
        }

        return false;
    }

    public boolean jestBabcia(Person person) {
        if(this.ojciec != null) {
            if(this.ojciec.getMatka().equals(person)){
                return true;
            }
        }
        if(this.matka != null) {
            if(this.matka.getMatka().equals(person)) {
                return true;
            }
        }

        return false;
    }

    public boolean jestOjcem(Person person) {
        return this.ojciec.equals(person);
    }

    public boolean jestMatka(Person person) {
        return this.matka.equals(person);
    }

    public void setOjciec(Person ojciec) {
        this.ojciec = ojciec;
    }

    public void setMatka(Person matka) {
        this.matka = matka;
    }

    public Person getOjciec() {
        return ojciec;
    }

    public Person getMatka() {
        return matka;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (plec != person.plec) return false;
        if (pesel != person.pesel) return false;
        if (imie != null ? !imie.equals(person.imie) : person.imie != null) return false;
        return nazwisko != null ? nazwisko.equals(person.nazwisko) : person.nazwisko == null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", plec=" + plec +
                ", pesel=" + pesel +
                '}';
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

    public Plec getPlec() {
        return plec;
    }

    public void setPlec(Plec plec) {
        this.plec = plec;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}