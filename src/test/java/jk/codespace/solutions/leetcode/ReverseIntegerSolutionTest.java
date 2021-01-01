package jk.codespace.solutions.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseIntegerSolutionTest {

    ReverseIntegerSolution classUnderTest = new ReverseIntegerSolution();

    @Test
    public void testReverseInteger1(){
        assertEquals(classUnderTest.reverse(123), 321);
    }

    @Test
    public void testReverseInteger2(){
        assertEquals(classUnderTest.reverse(-123), -321);
    }

    @Test
    public void testReverseInteger3(){
        assertEquals(classUnderTest.reverse(0), 0);
    }

    @Test
    public void testReverseInteger4(){
        assertEquals(classUnderTest.reverse(210000000), 12);
    }

    @Test
    public void testReverseInteger5(){
        assertEquals(classUnderTest.reverse(1534236469), 0);
    }

    @Test
    public void testReverseInteger6(){
        assertEquals(classUnderTest.reverse(-0), -0);
    }

    @Test
    public void testReverseInteger7(){
        assertEquals(classUnderTest.reverse(-1230), -321);
    }
}