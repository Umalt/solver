package leetcode.easy;
public class IsSubsequence {

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }

    private static boolean isSubsequence(String s, String t) {int k = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(k)) k++;
            if (k == s.length() - 1) return true;
        }
        return false;
    }
}
