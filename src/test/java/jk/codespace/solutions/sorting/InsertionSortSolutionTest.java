package jk.codespace.solutions.sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class InsertionSortSolutionTest {
    InsertionSortSolution classUnderTest = new InsertionSortSolution();

    @Test
    public void testCase1(){
        int[] result = classUnderTest.insertionSort(new int[]{2});
        int[] expected = new int[]{2};
        assertTrue(Arrays.equals(result, expected));
    }

    @Test
    public void testCase2(){
        int[] result = classUnderTest.insertionSort(new int[]{2, 3, 4, 1, 5});
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertTrue(Arrays.equals(result, expected));
    }

    @Test
    public void testCase3(){
        int[] result = classUnderTest.insertionSort(new int[]{7,2,4,6,8});
        int[] expected = new int[]{2, 4, 6, 7, 8};
        assertTrue(Arrays.equals(result, expected));
    }

    @Test
    public void testCase4(){
        int[] result = classUnderTest.insertionSort(new int[]{1,7,2,5,6,9,4,2,3});
        int[] expected = new int[]{1,2,2,3,4,5,6,7,9};
        assertTrue(Arrays.equals(result, expected));
    }



}
