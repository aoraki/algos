package jk.codespace.solutions;

public class IsPalindromeNumberSolution {
    public boolean isPalindrome(int x) {
        if(x >= 0) {
            String s = String.valueOf(x);
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) == s.charAt((s.length() - 1) - i)) {
                    continue;
                } else {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
