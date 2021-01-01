package jk.codespace.solutions.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class PlusOneSolutionsTest {

    PlusOneSolution classUnderTest = new PlusOneSolution();

    @Test
    public void testCase1(){
        int[] result = classUnderTest.plusOne(new int[]{1,2,3});
        int[] expected = new int[]{1,2,4};
        assertTrue(Arrays.equals(result, expected));
    }

    @Test
    public void testCase2(){
        int[] result = classUnderTest.plusOne(new int[]{4,3,2,1});
        int[] expected = new int[]{4,3,2,2};
        assertTrue(Arrays.equals(result, expected));
    }

    @Test
    public void testCase3(){
        int[] result = classUnderTest.plusOne(new int[]{0});
        int[] expected = new int[]{1};
        assertTrue(Arrays.equals(result, expected));
    }

    @Test
    public void testCase4(){
        int[] result = classUnderTest.plusOne(new int[]{9});
        int[] expected = new int[]{1,0};
        assertTrue(Arrays.equals(result, expected));
    }

    @Test
    public void testCase5(){
        int[] result = classUnderTest.plusOne(new int[]{4,3,2,9});
        int[] expected = new int[]{4,3,3,0};
        assertTrue(Arrays.equals(result, expected));
    }

    @Test
    public void testCase6(){
        int[] result = classUnderTest.plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});
        int[] expected = new int[]{9,8,7,6,5,4,3,2,1,1};
        assertTrue(Arrays.equals(result, expected));
    }

    @Test
    public void testCase7(){
        int[] result = classUnderTest.plusOne(new int[]{0,0});
        int[] expected = new int[]{0,1};
        assertTrue(Arrays.equals(result, expected));
    }

    @Test
    public void testCase8(){
        int[] result = classUnderTest.plusOne(new int[]{9,9,9});
        int[] expected = new int[]{1,0,0,0};
        assertTrue(Arrays.equals(result, expected));
    }


}
