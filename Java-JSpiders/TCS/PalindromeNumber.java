public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 121;
        int temp = n;
        int reversed = 0;

        while (temp > 0) {
            int lastDigit = temp % 10;
            reversed = reversed * 10 + lastDigit;
            temp /= 10;
        }

        if (reversed == n) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}