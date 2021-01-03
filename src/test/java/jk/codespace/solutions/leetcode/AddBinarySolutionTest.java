package jk.codespace.solutions.leetcode;

import org.junit.Test;

public class AddBinarySolutionTest {

    AddBinarySolution classUnderTest = new AddBinarySolution();

    @Test
    public void testCase1(){
        String result = classUnderTest.addBinary("10011","10011");
        assert result.equals("100110");
    }

    @Test
    public void testCase2(){
        String result = classUnderTest.addBinary("1010","1011");
        assert result.equals("10101");
    }

    @Test
    public void testCase3(){
        String result = classUnderTest.addBinary("0","0");
        assert result.equals("0");
    }

    @Test
    public void testCase4(){
        String result = classUnderTest.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101","110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011");
        assert result.equals("110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000");
    }

    @Test
    public void testCase5(){
        String result = classUnderTest.addBinary("11","1");
        assert result.equals("100");
    }
}
