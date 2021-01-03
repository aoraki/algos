package jk.codespace.solutions.leetcode;

/*
Solution for leetcode problem;
https://leetcode.com/problems/add-binary/

Given two binary strings a and b, return their sum as a binary string.

Example 1:
Input: a = "11", b = "1"
Output: "100"

Example 2:
Input: a = "1010", b = "1011"
Output: "10101"

Constraints:
1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.

Each string does not contain leading zeros except for the zero itself.
*/
public class AddBinarySolution {

    public String addBinary(String a, String b) {

        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();

        int i = charsA.length-1;
        int j = charsB.length-1;

        StringBuilder sb = new StringBuilder();
        boolean isCarryOver = false;

        for(; i >= 0 || j >= 0; i--, j--){
            char charABinaryChar;
            char charBBinaryChar;

            if(i < 0) {
                charABinaryChar = '0';
            } else {
                charABinaryChar = charsA[i];
            }

            if(j < 0) {
                charBBinaryChar = '0';
            } else {
                charBBinaryChar = charsB[j];
            }

            if(charABinaryChar == '1'){
                if (charABinaryChar == charBBinaryChar) {
                    if(isCarryOver){
                        sb.insert(0, "1");
                        // leave isCarryOver to be true
                    } else {
                        sb.insert(0, 0);
                        isCarryOver = true;
                    }
                } else {
                    if(isCarryOver){
                        sb.insert(0, "0");
                    } else {
                        sb.insert(0, "1");
                    }
                }
            } else {
                // Char is 0
                if (charABinaryChar == charBBinaryChar) {
                    if(isCarryOver){
                        sb.insert(0, "1");
                        isCarryOver = false;
                    } else {
                        sb.insert(0, "0");
                    }
                } else {
                    if(isCarryOver){
                        sb.insert(0, "0");
                    } else {
                        sb.insert(0, "1");
                    }
                }
            }
        }
        if(isCarryOver){
            sb.insert(0, "1");
        }
        return sb.toString();
    }
}
