package jk.codespace.solutions;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsValidPalindromeSolutionTest {
    IsValidPalindromeSolution classUnderTest = new IsValidPalindromeSolution();

    @Test
    public void testIsValidPalindrome1(){
        assertTrue(classUnderTest.isPalindrome("erre"));
    }

    @Test
    public void testIsValidPalindrome2(){
        assertTrue(classUnderTest.isPalindrome("erare"));
    }

    @Test
    public void testIsValidPalindrome3(){
        assertTrue(classUnderTest.isPalindrome("erAre"));
    }

    @Test
    public void testIsValidPalindrome4(){
        assertTrue(classUnderTest.isPalindrome("erA re"));
    }

    @Test
    public void testIsValidPalindrome5(){
        assertTrue(classUnderTest.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void testIsValidPalindrome6(){
        assertTrue(classUnderTest.isPalindrome("Able was I, ere I saw Elba"));
    }

    @Test
    public void testIsValidPalindrome7(){
        assertFalse(classUnderTest.isPalindrome("Able was I, ere I saw Alba"));
    }

    @Test
    public void testIsValidPalindrome8(){
        assertFalse(classUnderTest.isPalindrome("0P"));
    }

    @Test
    public void testIsValidPalindrome9(){
        assertFalse(classUnderTest.isPalindrome(null));
    }

    @Test
    public void testIsValidPalindrome10(){
        assertTrue(classUnderTest.isPalindrome(""));
    }
}
