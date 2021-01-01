package jk.codespace.solutions.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LongestCommonPrefixSolutionTest {

    LongestCommonPrefixSolution classUnderTest = new LongestCommonPrefixSolution();

    @Test
    public void testCase1(){
        String longestCommonPrefixResult = classUnderTest.longestCommonPrefix(new String[] {"flower", "flow", "flight"});
        String expected  = "fl";
        assertTrue(longestCommonPrefixResult.equals(expected));
    }

    @Test
    public void testCase2(){
        String longestCommonPrefixResult = classUnderTest.longestCommonPrefix(new String[] {"dog", "racecar", "car"});
        String expected  = "";
        assertTrue(longestCommonPrefixResult.equals(expected));
    }

    @Test
    public void testCase3(){
        String longestCommonPrefixResult = classUnderTest.longestCommonPrefix(new String[] {"", "racecar", "car"});
        String expected  = "";
        assertTrue(longestCommonPrefixResult.equals(expected));
    }

    @Test
    public void testCase4(){
        String longestCommonPrefixResult = classUnderTest.longestCommonPrefix(new String[]{});
        String expected  = "";
        assertTrue(longestCommonPrefixResult.equals(expected));
    }

    @Test
    public void testCase5(){
        String longestCommonPrefixResult = classUnderTest.longestCommonPrefix(new String[]{"", "", ""});
        String expected  = "";
        assertTrue(longestCommonPrefixResult.equals(expected));
    }

    @Test
    public void testCase6(){
        String longestCommonPrefixResult = classUnderTest.longestCommonPrefix(new String[]{null, "racecar", "car"});
        String expected  = "";
        assertTrue(longestCommonPrefixResult.equals(expected));
    }

}
