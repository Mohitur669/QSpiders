public class DuplicatesInArray {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 30, 30, 30, 40, 50, 50 };
        
        System.out.println("Duplicate elements in array are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}