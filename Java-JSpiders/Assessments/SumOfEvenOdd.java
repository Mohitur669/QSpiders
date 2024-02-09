import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range: ");
        int a = sc.nextInt();

        int eSum = 0;
        int oSum = 0;
        for (int i = 0; i <= a; i++) {
            if (i % 2 == 0) {
                eSum += i;
            } else {
                oSum += i;
            }
        }

        System.out.println("Even sum: " + eSum);
        System.out.println("Odd sum: " + oSum);
    }
}