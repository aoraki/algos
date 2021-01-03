package jk.codespace.solutions.leetcode;

import org.junit.Test;

public class StrStrSolutionTest {

    StrStrSolution classUnderTest = new StrStrSolution();

    @Test
    public void testCase1(){
        int result = classUnderTest.strStr("hello", "ll");
        assert result == 2;
    }

    @Test
    public void testCase2(){
        int result = classUnderTest.strStr("aaaaa", "bba");
        assert result == -1;
    }

    @Test
    public void testCase3(){
        int result = classUnderTest.strStr("", "");
        assert result == 0;
    }

}
