public class HCFAndLCF {
    public static void main(String[] args) {
        int a = 12;
        int b = 15;

        System.out.println(hcf(a, b));
        System.out.println(lcf(a, b));
    }

    public static int hcf(int a, int b) {
        if (b == 0) {
            return a;
        }
        return hcf(b, a % b);
    }

    public static int lcf(int a, int b) {
        return (a * b) / hcf(a, b);
    }
}