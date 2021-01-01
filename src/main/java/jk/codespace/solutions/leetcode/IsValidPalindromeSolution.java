package jk.codespace.solutions.leetcode;

/*
Solution for leetcode problem;
https://leetcode.com/problems/valid-palindrome/

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:
Input: "A man, a plan, a canal: Panama"
Output: true

Example 2:
Input: "race a car"
Output: false

Constraints:
s consists only of printable ASCII characters.

*/
public class IsValidPalindromeSolution {
    public boolean isPalindrome(String s) {
        if(s != null) {
            s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
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
