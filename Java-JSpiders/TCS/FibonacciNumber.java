public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;

        //for (int i = 0; i < n; i++) {
        //    System.out.println(a);
        //    int sum = a + b;
        //    a = b;
        //    b = sum;
        //}

        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}