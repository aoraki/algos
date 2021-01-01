package jk.codespace.solutions.leetcode;

import org.junit.Test;

public class ValidParenthesesSolutionTest {
    ValidParenthesesSolution classUnderTest = new ValidParenthesesSolution();

    @Test
    public void testCase1(){
        boolean result = classUnderTest.isValid("()");
        boolean expected = true;
        assert result == expected;
    }

    @Test
    public void testCase2(){
        boolean result = classUnderTest.isValid("()[]{}");
        boolean expected = true;
        assert result == expected;
    }

    @Test
    public void testCase3(){
        boolean result = classUnderTest.isValid("(]");
        boolean expected = false;
        assert result == expected;
    }

    @Test
    public void testCase4(){
        boolean result = classUnderTest.isValid("([)]");
        boolean expected = false;
        assert result == expected;
    }

    @Test
    public void testCase5(){
        boolean result = classUnderTest.isValid("{[]}");
        boolean expected = true;
        assert result == expected;
    }

    @Test
    public void testCase6(){
        boolean result = classUnderTest.isValid("{)");
        boolean expected = false;
        assert result == expected;
    }

    @Test
    public void testCase7(){
        boolean result = classUnderTest.isValid("([)]");
        boolean expected = false;
        assert result == expected;
    }

    @Test
    public void testCase8(){
        boolean result = classUnderTest.isValid("((");
        boolean expected = false;
        assert result == expected;
    }

    @Test
    public void testCase9(){
        boolean result = classUnderTest.isValid("){");
        boolean expected = false;
        assert result == expected;
    }
}
