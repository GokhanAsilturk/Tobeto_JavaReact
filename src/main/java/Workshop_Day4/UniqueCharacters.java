package Workshop_Day4;

import java.util.HashSet;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "abcdefg";
        boolean hasUniqueCharacters = true;
        HashSet<Character> characterSet = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (characterSet.contains(c)) {
                hasUniqueCharacters = false;
                break;
            } else {
                characterSet.add(c);
            }
        }

        if (hasUniqueCharacters) {
            System.out.println(str + " tüm benzersiz karakterlere sahiptir.");
        } else {
            System.out.println(str + " benzersiz karakterlere sahip değildir.");
        }
    }
}
