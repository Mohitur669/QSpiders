public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int temp = n;
        int sum = 0;

        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += lastDigit * lastDigit * lastDigit;
            temp /= 10;
        }

        if (sum == n) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not an Armstrong");
        }
    }
}