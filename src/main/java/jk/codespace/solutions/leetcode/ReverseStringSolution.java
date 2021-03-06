package jk.codespace.solutions.leetcode;

/*
Solution for leetcode problem;
https://leetcode.com/problems/reverse-string/

Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.

Example 1:

Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:

Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
*/
public class ReverseStringSolution {
    public char[] reverseString(char[] s) {
        for(int i=0; i<s.length/2; i++){
            char temp = s[i];
            char target = s[(s.length-1) - i];
            s[i] = target;
            s[(s.length-1) - i] = temp;
        }
        return s;
    }
}