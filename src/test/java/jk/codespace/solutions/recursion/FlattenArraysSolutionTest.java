package jk.codespace.solutions.recursion;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class FlattenArraysSolutionTest {

    FlattenArraysSolution classUnderTest = new FlattenArraysSolution();

    @Test
    public void testCase1(){
        Integer[] expected = new Integer[]{1,2,3,4,5,6};
        Integer[] result = classUnderTest.flatten(new Object[]{1,2,3,4,5,6});
        assertTrue(Arrays.equals(result, expected));
    }

    @Test
    public void testCase2(){
        Integer[] expected = new Integer[]{6};
        Integer[] result = classUnderTest.flatten(new Object[]{6});
        assertTrue(Arrays.equals(result, expected));
    }

    @Test
    public void testCase3(){
        Integer[] expected = new Integer[]{1,2,3,4,5,6};
        Integer[] result = classUnderTest.flatten(new Object[]{1, new Object[]{2,3, new Object[]{4,5}},6});
        assertTrue(Arrays.equals(result, expected));
    }

    @Test
    public void testCase4(){
        Integer[] expected = new Integer[]{};
        Integer[] result = classUnderTest.flatten(new Object[]{});
        assertTrue(Arrays.equals(result, expected));
    }

}
