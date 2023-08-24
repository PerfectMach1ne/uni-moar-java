package Cwiczenie5_1;

public class Main {
    public static void main(String[] args) {
        String kwiatuszek = "magnolia";
        System.out.println("kwiatuszek = " + kwiatuszek);
        String kwiaciuch = kwiatuszek.substring(0, 3);
        System.out.println("kwiaciuch = " + kwiaciuch);
        String kwiacisko = kwiatuszek.substring(3);
        System.out.println("kwiacisko = " + kwiacisko);
        System.out.println("kwiaciuch + kwiacisko = " + kwiaciuch + kwiacisko);

        System.out.println( "Alojzy z dużych liter: " + "Alojzy".toUpperCase() );
    }
}
