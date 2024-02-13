public class NumberConversion {
    public static void main(String[] args) {
        int binary = 1010;
        int decimal = 10;

        System.out.println(binaryToDecimal(binary));
        System.out.println(decimalToBinary(decimal));
    }

    public static int binaryToDecimal(int n) {
        int decimal = 0;
        int base = 1;

        while (n > 0) {
            int lastDigit = n % 10;
            n /= 10;
            decimal += lastDigit * base;
            base *= 2;
        }

        return decimal;
    }

    public static int decimalToBinary(int n) {
        int binary = 0;
        int base = 1;

        while (n > 0) {
            int lastDigit = n % 2;
            n /= 2;
            binary += lastDigit * base;
            base *= 10;
        }

        return binary;
    }
}