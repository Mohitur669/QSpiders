public class SwapWithoutThird {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;

        // Swap without third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}