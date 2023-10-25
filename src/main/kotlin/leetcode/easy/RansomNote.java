package leetcode.easy;

import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        System.out.print(canConstruct("aa", "aab"));
    }
    
    private static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;

        HashMap<Character, Integer> chars = new HashMap<>();

        for (char ch : magazine.toCharArray()) {
            if (chars.containsKey(ch)) {
                chars.put(ch, chars.get(ch) + 1);
            } else {
                chars.put(ch, 1);
            }
        }

        for (char ch : ransomNote.toCharArray()) {
            if (chars.containsKey(ch)) {
                if (chars.get(ch) == 1) {
                    chars.remove(ch);
                } else {
                    chars.put(ch, chars.get(ch) - 1);
                }
            } else {
                return false;
            }
        }

        return true;
    }
}
