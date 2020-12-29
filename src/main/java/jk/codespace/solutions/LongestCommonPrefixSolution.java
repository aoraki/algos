package jk.codespace.solutions;

/*
Leetcode Problem : https://leetcode.com/problems/longest-common-prefix/

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""

Explanation: There is no common prefix among the input strings.

Constraints:
0 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lower-case English letters.
 */
import java.util.ArrayList;
import java.util.Arrays;

public class LongestCommonPrefixSolution {

    public String longestCommonPrefix(String[] strs) {

        ShortestStringAndIndexTuple ssait = getShortestStringAndItsIndex(strs);

        if(ssait.indexOfString < 0){
            return "";
        }
        ArrayList<String> listOfStringsToCheck = new ArrayList(Arrays.asList(strs));
        listOfStringsToCheck.remove(ssait.indexOfString);

        int i = ssait.shortestString.length();
        String longestCommonPrefix = "";

        outer:
        while(i >= 1){
            String check = ssait.shortestString.substring(0,i);
            boolean allStringsMatchCheck = true;

            for(int j=0; j< listOfStringsToCheck.size(); j++){
                if (listOfStringsToCheck.get(j).indexOf(check) != 0){
                    allStringsMatchCheck = false;
                    break;
                }
            }

            if(allStringsMatchCheck){
                longestCommonPrefix = check;
                break outer;
            }
            i--;
        }
        return longestCommonPrefix;
    }

    private ShortestStringAndIndexTuple getShortestStringAndItsIndex(String [] strs){
        String shortestString = "";
        int indexOfShortestString = -1;

        int shortestLength = 0;

        for (int i = 0; i < strs.length; i++){
            String strToCheck = strs[i];
            if (strToCheck != null){
                int length = strToCheck.length();
                if(i==0){
                    shortestLength = length;
                    shortestString = strToCheck;
                    indexOfShortestString = i;
                } else {
                    if (length < shortestLength) {
                        shortestLength = length;
                        shortestString = strToCheck;
                        indexOfShortestString = i;
                    }
                }
            } else {
                shortestString = "";
                indexOfShortestString = -1;
                break;
            }
        }
        return new ShortestStringAndIndexTuple(indexOfShortestString, shortestString);
    }

    private class ShortestStringAndIndexTuple {
        public final int indexOfString;
        public final String shortestString;

        ShortestStringAndIndexTuple (final int indexOfString, final String shortestString) {
            this.indexOfString = indexOfString;
            this.shortestString = shortestString;
        }
    }
}
