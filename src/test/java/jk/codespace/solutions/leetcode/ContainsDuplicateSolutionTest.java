package jk.codespace.solutions.leetcode;

import org.junit.Test;

public class ContainsDuplicateSolutionTest {
    ContainsDuplicateSolution classUnderTest = new ContainsDuplicateSolution();


    @Test
    public void testCase1(){
        boolean result = classUnderTest.containsDuplicate(new int[]{1,2,3,1});
        assert result;
    }

    @Test
    public void testCase2(){
        boolean result = classUnderTest.containsDuplicate(new int[]{1,2,3,4});
        assert result == false;
    }

    @Test
    public void testCase3(){
        boolean result = classUnderTest.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2});
        assert result;
    }
}
