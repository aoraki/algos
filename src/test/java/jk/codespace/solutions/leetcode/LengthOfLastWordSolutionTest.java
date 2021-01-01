package jk.codespace.solutions.leetcode;

import org.junit.Test;

public class LengthOfLastWordSolutionTest {
    LengthOfLastWordSolution classUnderTest = new LengthOfLastWordSolution();

    @Test
    public void testCase1(){
        int lenLastWord = classUnderTest.lengthOfLastWord("Mary had a little lamb");
        int expected = 4;
        assert lenLastWord == expected;
    }

    @Test
    public void testCase2(){
        int lenLastWord = classUnderTest.lengthOfLastWord(" ");
        int expected = 0;
        assert lenLastWord == expected;
    }

    @Test
    public void testCase3(){
        int lenLastWord = classUnderTest.lengthOfLastWord("Hello World ");
        int expected = 5;
        assert lenLastWord == expected;
    }

    @Test
    public void testCase4(){
        int lenLastWord = classUnderTest.lengthOfLastWord(" Hello Worlde ");
        int expected = 6;
        assert lenLastWord == expected;
    }

}
