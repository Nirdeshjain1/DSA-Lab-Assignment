import java.util.HashMap;

public class StringOperations {
    public static String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public static String substring(String str, int start, int end) {
        return str.substring(start, end);
    }

    public static boolean compare(String str1, String str2) {
        return str1.equals(str2);
    }

    public static HashMap<Character, Integer> characterFrequency(String str) {
        HashMap<Character, Integer> frequency = new HashMap<>();
        for (char ch : str.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }
        return frequency;
    }
}
