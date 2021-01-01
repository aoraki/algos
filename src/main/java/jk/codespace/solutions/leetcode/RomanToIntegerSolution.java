package jk.codespace.solutions.leetcode;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
Solution for leetcode problem;
https://leetcode.com/problems/roman-to-integer/

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.


Example 1:
Input: s = "III"
Output: 3

Example 2:
Input: s = "IV"
Output: 4

Example 3:
Input: s = "IX"
Output: 9

Example 4:
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

Example 5:
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


Constraints:
1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
*/


public class RomanToIntegerSolution {

    private class DictionaryItem {
        final String romanNumeral;
        final int decimalValue;

        public DictionaryItem(String romanNumeral, int decimalValue){
            this.romanNumeral = romanNumeral;
            this.decimalValue = decimalValue;
        }
    }

    private LinkedHashSet<DictionaryItem> dictionary = new LinkedHashSet<DictionaryItem>();

    private void createDictionary(){
        dictionary.add(new DictionaryItem("M", 1000));
        dictionary.add(new DictionaryItem("CM", 900));
        dictionary.add(new DictionaryItem("D", 500));
        dictionary.add(new DictionaryItem("CD", 400));
        dictionary.add(new DictionaryItem("C", 100));
        dictionary.add(new DictionaryItem("XC", 90));
        dictionary.add(new DictionaryItem("L", 50));
        dictionary.add(new DictionaryItem("XL", 40));
        dictionary.add(new DictionaryItem("X", 10));
        dictionary.add(new DictionaryItem("IX", 9));
        dictionary.add(new DictionaryItem("V", 5));
        dictionary.add(new DictionaryItem("IV", 4));
        dictionary.add(new DictionaryItem("I", 1));
    }

    public int romanToInt(String s) {
        this.createDictionary();
        int runningTotal = 0;

        Iterator<DictionaryItem> it = dictionary.iterator();
        while (it.hasNext() && s.length() > 0){
            DictionaryItem item = it.next();
            while (s.indexOf(item.romanNumeral) == 0){
                runningTotal += item.decimalValue;
                s = s.replaceFirst(item.romanNumeral, "");
            }
        }
        return runningTotal;
    }

}
