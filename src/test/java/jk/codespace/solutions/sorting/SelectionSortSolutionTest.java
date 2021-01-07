package jk.codespace.solutions.sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class SelectionSortSolutionTest {
    SelectionSortSolution classUnderTest = new SelectionSortSolution();

    @Test
    public void testCase1(){
        int[] result = classUnderTest.selectionSort(new int[]{3, 5, 1, 2, 4});
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertTrue(Arrays.equals(result, expected));
    }

    @Test
    public void testCase2(){
        int[] result = classUnderTest.selectionSort(new int[]{3});
        int[] expected = new int[]{3};
        assertTrue(Arrays.equals(result, expected));
    }

    @Test
    public void testCase3(){
        int[] result = classUnderTest.selectionSort(new int[]{1, 2, 3, 4, 5});
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertTrue(Arrays.equals(result, expected));
    }

    @Test
    public void testCase4(){
        int[] result = classUnderTest.selectionSort(new int[]{5, 1, 12, -5, 16, 2, 12, 14});
        int[] expected = new int[]{-5, 1, 2, 5, 12, 12, 14, 16};
        assertTrue(Arrays.equals(result, expected));
    }


}
