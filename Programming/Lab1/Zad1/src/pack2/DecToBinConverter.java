package pack2;

public class DecToBinConverter {
    DecToBinConverter() {

    }

    String toBinaryString(Integer decimalNumber) {
        int lengthOfDecNumber = decimalNumber.toString().length();
        int transitionNumber = 0;
        String binaryNumber = "";

        for (int i = 0; i < lengthOfDecNumber; i++) {
            transitionNumber += (decimalNumber % 10) * (int)Math.pow(10,i);
            decimalNumber = (decimalNumber - decimalNumber % 10) / 10;
        }

        while (transitionNumber != 1) {
            if (transitionNumber % 2 == 1) binaryNumber = "1".concat(binaryNumber);
            else binaryNumber = "0".concat(binaryNumber);
            transitionNumber /= 2;
        }

        return "1".concat(binaryNumber);
    }
}
