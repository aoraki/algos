package jk.codespace.solutions.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ReverseStringSolutionTest {

    ReverseStringSolution classUnderTest = new ReverseStringSolution();

    @Test
    public void testReverseStringHappyPathUnevenNumOfChars(){
        char[] result = classUnderTest.reverseString(new char[]{'h','e','l','l','o'});
        char[] expected = new char[]{'o','l','l','e','h'};
        assertTrue(Arrays.equals(result, expected));
    }

    @Test
    public void testReverseStringUnhappyPathUnevenNumOfChars(){
        char[] result = classUnderTest.reverseString(new char[]{'h','e','l','l','o'});
        char[] expected = new char[]{'i','l','l','e','h'};
        assertFalse(Arrays.equals(result, expected));
    }

    @Test
    public void testReverseStringHappyPathEvenNumOfChars(){
        char[] result = classUnderTest.reverseString(new char[]{'H','a','n','n','a','h'});
        char[] expected = new char[]{'h','a','n','n','a','H'};
        assertTrue(Arrays.equals(result, expected));
    }

    @Test
    public void testReverseStringUnhappyPathEvenNumOfChars(){
        char[] result = classUnderTest.reverseString(new char[]{'H','a','n','n','a','h'});
        char[] expected = new char[]{'h','a','n','a','H'};
        assertFalse(Arrays.equals(result, expected));
    }

}