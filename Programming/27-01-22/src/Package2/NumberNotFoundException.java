package Package2;

public class NumberNotFoundException extends Exception {
    private final int secretNumber = 49;

    private final boolean isCorrectNumber;

    public NumberNotFoundException(String message, boolean isCorrectNumber) {
        super(message);
        this.isCorrectNumber = isCorrectNumber;
    }

    public NumberNotFoundException(String message, Throwable cause, boolean isCorrectNumber) {
        super(message, cause);
        this.isCorrectNumber = isCorrectNumber;
    }

    public boolean isCorrectNumber() {
        return isCorrectNumber;
    }
}
