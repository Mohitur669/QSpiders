import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
//        if (isPrime(a)) {
//            System.out.println("Prime Number");
//        } else {
//            System.out.println("Not a Prime Number");
//        }
        allPrimeNumbersToTheLimit(a);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }


        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

    public static void allPrimeNumbersToTheLimit(int limit) {
        for (int i = 0; i < limit; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}