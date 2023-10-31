package Workshop_Day4;

import java.util.HashMap;

public class CharacterCounts {
    public static void main(String[] args) {
        String input = "Tobeto";
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : charCount.keySet()) {
            System.out.println(c + ": " + charCount.get(c));
        }
    }
}
