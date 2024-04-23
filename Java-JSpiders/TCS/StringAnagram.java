public class StringAnagram {
    public static void main(String[] args) {
        String a = "Listen";
        String b = "Silent";

        a = a.toLowerCase();
        b = b.toLowerCase();

        boolean isAnagram = false;
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                isAnagram = false;
                for (int j = 0; j < b.length(); j++) {
                    if (a.charAt(i) == b.charAt(j)) {
                        isAnagram = true;
                        break;
                    }
                }
                if (!isAnagram) {
                    break;
                }
            }
        }
        if (isAnagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
