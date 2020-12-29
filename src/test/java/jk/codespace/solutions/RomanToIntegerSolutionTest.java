package jk.codespace.solutions;

import org.junit.Test;

public class RomanToIntegerSolutionTest {
    RomanToIntegerSolution classUnderTest = new RomanToIntegerSolution();

    @Test
    public void testRomanToIntegerCase1(){
        assert classUnderTest.romanToInt("MMM") == 3000;
    }

    @Test
    public void testRomanToIntegerCase2(){
        assert classUnderTest.romanToInt("I") == 1;
    }

    @Test
    public void testRomanToIntegerCase3(){
        assert classUnderTest.romanToInt("III") == 3;
    }

    @Test
    public void testRomanToIntegerCase4(){
        assert classUnderTest.romanToInt("IV") == 4;
    }

    @Test
    public void testRomanToIntegerCase5(){
        assert classUnderTest.romanToInt("V") == 5;
    }

    @Test
    public void testRomanToIntegerCase6(){
        assert classUnderTest.romanToInt("LVIII") == 58;
    }

    @Test
    public void testRomanToIntegerCase7(){
        assert classUnderTest.romanToInt("MCMXCIV") == 1994;
    }

}
