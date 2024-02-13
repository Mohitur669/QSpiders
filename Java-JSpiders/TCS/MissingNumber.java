public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        int n = 10;
        int sum = n * (n + 1) / 2;
        int arrSum = 0;

        for (int j : arr) {
            arrSum += j;
        }

        System.out.println(sum - arrSum);
    }
}