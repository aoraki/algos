package jk.codespace.solutions;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class BubbleSortSolutionTest {

    BubbleSortSolution classUnderTest = new BubbleSortSolution();

    @Test
    public void testCase1() {
        int[] result = classUnderTest.sortArray(new int[]{5, 1, 4, 2, 8});
        int[] expected = new int[]{1, 2, 4, 5, 8};
        assertTrue(Arrays.equals(result, expected));
    }

    @Test
    public void testCase2() {
        int[] result = classUnderTest.sortArray(new int[]{2, 1});
        int[] expected = new int[]{1, 2};
        assertTrue(Arrays.equals(result, expected));
    }

    @Test
    public void testCase3() {
        int[] result = classUnderTest.sortArray(new int[]{2});
        int[] expected = new int[]{2};
        assertTrue(Arrays.equals(result, expected));
    }

    @Test
    public void testCase4() {
        int[] result = classUnderTest.sortArray(new int[]{2, 1, 78, 34, 236, 321, 34, 1235, 123, 54, 123, 1});
        int[] expected = new int[]{1, 1, 2, 34, 34, 54, 78, 123, 123, 236, 321, 1235};
        assertTrue(Arrays.equals(result, expected));
    }

    @Test
    public void testCase5() {
        int[] result = classUnderTest.sortArray(new int[]{0, 0, 0, 0});
        int[] expected = new int[]{0, 0, 0, 0};
        assertTrue(Arrays.equals(result, expected));
    }
}


