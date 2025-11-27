package app;

public class StringUtils {
    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        String cleaned = s.replaceAll("\\s+", "").toLowerCase();
        return cleaned.contentEquals(new StringBuilder(cleaned).reverse());
    }

    public static int countVowels(String s) {
        if (s == null) return 0;
        int c = 0;
        for (char ch : s.toLowerCase().toCharArray()) {
            if ("aeiouy".indexOf(ch) >= 0) c++;
        }
        return c;
    }
}
