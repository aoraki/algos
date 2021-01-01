package jk.codespace.solutions.leetcode;

import java.util.StringTokenizer;

/*
Solution for leetcode problem;
https://leetcode.com/problems/length-of-last-word/

Given a string s consists of some words separated by spaces, return the length of the last word in the string.
If the last word does not exist, return 0.

A word is a maximal substring consisting of non-space characters only.

Example 1:
Input: s = "Hello World"
Output: 5

Example 2:
Input: s = " "
Output: 0

Constraints:
1 <= s.length <= 104
s consists of only English letters and spaces ' '.
*/
public class LengthOfLastWordSolution {

    public int lengthOfLastWord(String s) {
        String[] arrOfStr = s.split("\\s+");
        String lastWord = "";
        if (arrOfStr.length > 0) {
            lastWord = arrOfStr[arrOfStr.length - 1];
        }
        return lastWord.length();
    }

    public int lengthOfLastWordUsingTokenizer(String s) {
        StringTokenizer st = new StringTokenizer(s);
        String lastWord = "";
        while (st.hasMoreElements()) {
            lastWord = st.nextToken();
        }
        return lastWord.length();
    }
}