package jk.codespace.solutions;

import org.junit.Test;

public class MaximumSubarraySolutionTest {

    MaximumSubarraySolution classUnderTest = new MaximumSubarraySolution();


    @Test
    public void testCase1(){
        int result = classUnderTest.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        int expected = 6;
        assert result == expected;
    }

    @Test
    public void testCase2(){
        int result = classUnderTest.maxSubArray(new int[]{1});
        int expected = 1;
        assert result == expected;
    }

    @Test
    public void testCase3(){
        int result = classUnderTest.maxSubArray(new int[]{0});
        int expected = 0;
        assert result == expected;
    }

    @Test
    public void testCase4(){
        int result = classUnderTest.maxSubArray(new int[]{-1});
        int expected = -1;
        assert result == expected;
    }

    @Test
    public void testCase5(){
        int result = classUnderTest.maxSubArray(new int[]{-2, 1});
        int expected = 1;
        assert result == expected;
    }
}
