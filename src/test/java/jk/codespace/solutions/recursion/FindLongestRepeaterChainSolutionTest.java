package jk.codespace.solutions.recursion;

import org.junit.Test;

import java.util.ArrayList;

public class FindLongestRepeaterChainSolutionTest {

    FindLongestRepeaterChainSolution classUnderTest = new FindLongestRepeaterChainSolution();

    @Test
    public void testCase1(){
        Repeater rp1 = new Repeater("RP1", 1, 0);
        Repeater rp2 = new Repeater("RP2", 2, 1);
        Repeater rp3 = new Repeater("RP3", 4, 3);
        Repeater rp4 = new Repeater("RP4", 5, 0);
        Repeater rp5 = new Repeater("RP5", 6, 2);
        Repeater rp6 = new Repeater("RP6", 7, 6);
        Repeater rp7 = new Repeater("RP7", 15, 9);

        ArrayList<Repeater> repeaters = new ArrayList<>();
        repeaters.add(rp1);
        repeaters.add(rp2);
        repeaters.add(rp3);
        repeaters.add(rp4);
        repeaters.add(rp5);
        repeaters.add(rp6);
        repeaters.add(rp7);

        NetworkTestResult result = classUnderTest.determineLongestChainInRadioNetwork(repeaters);

        assert result.longestChain == 4;
        assert result.orphanedRepeaters.contains(rp3);
        assert result.orphanedRepeaters.contains(rp7);
    }

    @Test
    public void testCase2(){
        Repeater rp1 = new Repeater("RP1", 1, 0);
        Repeater rp16 = new Repeater("RP16", 2, 1);

        Repeater rp2 = new Repeater("RP2", 3, 2);
        Repeater rp3 = new Repeater("RP3", 4, 3);
        Repeater rp4 = new Repeater("RP4", 5, 4);
        Repeater rp5 = new Repeater("RP5", 6, 5);
        Repeater rp6 = new Repeater("RP6", 7, 6);
        Repeater rp7 = new Repeater("RP7", 4, 0);

        ArrayList<Repeater> repeaters = new ArrayList<>();
        repeaters.add(rp1);
        repeaters.add(rp2);
        repeaters.add(rp3);
        repeaters.add(rp4);
        repeaters.add(rp5);
        repeaters.add(rp6);
        repeaters.add(rp7);
        repeaters.add(rp16);

        NetworkTestResult result = classUnderTest.determineLongestChainInRadioNetwork(repeaters);

        assert result.longestChain == 7;
        assert result.orphanedRepeaters.contains(rp7);
        assert result.problemRepeaters.contains(rp7);
    }


}
