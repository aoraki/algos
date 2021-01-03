package jk.codespace.solutions.leetcode;

import org.junit.Test;

public class BuyAndSellStockSolutionTest {

    BuyAndSellStockSolution classUnderTest = new BuyAndSellStockSolution();

    @Test
    public void testCase1(){
        int result = classUnderTest.maxProfit(new int[]{7,1,5,3,6,4});
        assert result == 5;
    }

    @Test
    public void testCase2(){
        int result = classUnderTest.maxProfit(new int[]{7,6,4,3,1});
        assert result == 0;
    }

    @Test
    public void testCase3(){
        int result = classUnderTest.maxProfit(new int[]{7});
        assert result == 0;
    }
}
