package jk.codespace.solutions.recursion;

import org.junit.Test;

public class StringPermutationGeneratorSolutionTest {
    StringPermutationGeneratorSolution classUnderTest = new StringPermutationGeneratorSolution();


    @Test
    public void testCase1(){
        StringPermutationGeneratorSolution.StringPermutationsOutput result = classUnderTest.calculatePermutations("Test");

        assert result.permutations.size() == 24;
        assert result.permutations.contains("estT");
        assert result.permutations.contains("estT");
    }

    @Test
    public void testCase2(){
        StringPermutationGeneratorSolution.StringPermutationsOutput result = classUnderTest.calculatePermutations("house");

        assert result.permutations.size() == 120;
        assert result.permutations.contains("house");
        assert result.permutations.contains("ehuso");
        assert result.permutations.contains("soueh");
    }


}
