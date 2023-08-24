package w5.stringPkg;

public class Test {
    String rower;
    String hulajnoga = new String(); // unnecessary
    String skuter = new String("Osa");

    // substring(...)
    String typPojazdu = new String("Hulajnoga elektryczna");
    String sub = typPojazdu.substring(5, 21);

    // konkatenacja
    String typ = "hulajnoga";
    String rodzaj = "elektryczna";
    String resultOne = typ + rodzaj;
    String resultTwo = typ + " " + rodzaj;

    private static String toConcat() {
        String h = "hulajnoga";
        String e = "elektryczna";
        String result = h.concat(e);
        return result;
    }

    public static String getToConcat() {
        return toConcat();
    }
}
