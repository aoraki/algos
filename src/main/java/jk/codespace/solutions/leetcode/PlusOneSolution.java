package jk.codespace.solutions.leetcode;

/*

Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array
contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.

Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.

Example 3:
Input: digits = [0]
Output: [1]

Example 4:
Input: digits = [9]
Output: [1,0]

Example 5:
Input: digits = [4,3,2,9]
Output: [4,3,3,0]
Explanation: The array represents the integer 4321.


Constraints:
1 <= digits.length <= 100
0 <= digits[i] <= 9

 */

import java.util.*;

public class PlusOneSolution {

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int returnArr[] = new int [len + 1];

        for (int i = 0; i < len; i++){
            returnArr[i+1] = digits[i];
        }

        returnArr[len]++;
        while (returnArr[len] > 9) {
            returnArr[len] = returnArr[len] % 10;
            len--;
            returnArr[len]++;
        }

        if (returnArr[0] == 0){
            int re1[] = new int [returnArr.length - 1];
            for (int i = 0; i < re1.length; i++) {
                re1[i] = returnArr[i+1];
            }
            return re1;
        }
        return returnArr;
    }
}