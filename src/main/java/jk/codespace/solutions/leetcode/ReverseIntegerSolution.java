package jk.codespace.solutions.leetcode;

/*
Solution for leetcode problem;
https://leetcode.com/problems/reverse-integer/

Given a 32-bit signed integer, reverse digits of an integer.

Note:
Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.


Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21

Example 4:
Input: x = 0
Output: 0


Constraints:
-231 <= x <= 231 - 1
*/
public class ReverseIntegerSolution {
    public int reverse(int x) {
        long reverse = 0;
        boolean isNegative = x < 0;

        x = Math.abs(x);
        while (x > 0) {
            reverse = (reverse * 10) + (x % 10);
            x = x / 10;
        }

        if(reverse > Integer.MAX_VALUE){
            return 0;
        } else {
            return isNegative ? (int)(Math.negateExact(reverse)):(int)reverse;
        }
    }
}


