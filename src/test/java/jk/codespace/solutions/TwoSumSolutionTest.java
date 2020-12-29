package jk.codespace.solutions;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class TwoSumSolutionTest {
    TwoSumSolution classUnderTest = new TwoSumSolution();

    @Test
    public void testTwoSums1(){
        int[] result = classUnderTest.twoSum(new int[]{2,7,11,15},9);
        int[] expected = new int[]{0,1};
        assertTrue(Arrays.equals(result, expected));
    }

    @Test
    public void testTwoSums2(){
        int[] result = classUnderTest.twoSum(new int[]{3,3},6);
        int[] expected = new int[]{0,1};
        assertTrue(Arrays.equals(result, expected));
    }

    @Test
    public void testTwoSums4(){
        int[] result = classUnderTest.twoSum(new int[]{3,2,4},6);
        int[] expected = new int[]{1,2};
        assertTrue(Arrays.equals(result, expected));
    }

}
