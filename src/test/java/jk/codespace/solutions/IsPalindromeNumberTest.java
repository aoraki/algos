package jk.codespace.solutions;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IsPalindromeNumberTest {
    IsPalindromeNumberSolution classUnderTest = new IsPalindromeNumberSolution();

    @Test
    public void testIsValidPalindrome1(){
        assertTrue(classUnderTest.isPalindrome(121));
    }
}
