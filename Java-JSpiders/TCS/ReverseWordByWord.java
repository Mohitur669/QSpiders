public class ReverseWordByWord {
    public static void main(String[] args) {
        String s = "Welcome to InterviewBit";
        String[] words = s.split(" ");
        String reversedString = "";

        for (String word : words) {
            String reversedWord = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord += word.charAt(j);
            }

            reversedString += reversedWord + " ";
        }

        System.out.println(reversedString);
    }
}