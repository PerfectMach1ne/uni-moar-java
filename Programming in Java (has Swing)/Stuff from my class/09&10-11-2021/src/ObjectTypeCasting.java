public class ObjectTypeCasting {
    public static void main(String[] args) {
        double myDouble = 1.1;
        int myInt = (int)myDouble;

        assertNotEquals(myDouble, myInt);
    }

    private static void assertNotEquals(double myDouble, int myInt) {
        if (myDouble != myInt) System.out.println(myDouble + " != " + myInt);
    }
}
