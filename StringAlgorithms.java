import java.util.ArrayList;
import java.util.List;

public class StringAlgorithms {
    public static List<Integer> kmpPatternMatch(String text, String pattern) {
        int[] lps = computeLPSArray(pattern);
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < text.length()) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }
            if (j == pattern.length()) {
                result.add(i - j);
                j = lps[j - 1];
            } else if (i < text.length() && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return result;
    }

    private static int[] computeLPSArray(String pattern) {
        int length = 0;
        int i = 1;
        int[] lps = new int[pattern.length()];
        lps[0] = 0;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public static String runLengthEncoding(String str) {
        StringBuilder encoded = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            int count = 1;
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                i++;
                count++;
            }
            encoded.append(count).append(str.charAt(i));
            i++;
        }
        return encoded.toString();
    }
}
