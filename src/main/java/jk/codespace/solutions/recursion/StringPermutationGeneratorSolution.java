package jk.codespace.solutions.recursion;


import java.util.ArrayList;

public class StringPermutationGeneratorSolution {

    private ArrayList<String> permutations;
    private boolean displayUniqueOnly = true;

    public StringPermutationsOutput calculatePermutations(String input) {
        this.permutations = new ArrayList();
        int inputLength = input.length();
        boolean[] used = new boolean[inputLength];
        StringBuffer outputString = new StringBuffer();
        char[] in = input.toCharArray();

        doPermute(in, outputString, used, inputLength, 0);

        if (this.permutations.size() > 0) {
            System.out.println("There are " + this.permutations.size() + " possible permutations of " + input);
            System.out.println("Printing out all possible permutations of " + input);
            System.out.println(this.permutations);
        }
        return new StringPermutationsOutput(this.permutations);
    }

    private void doPermute(char[] in, StringBuffer outputString, boolean[] used, int inputlength, int level) {
        if (level == inputlength) {
            String permToAdd = outputString.toString();
            if (this.displayUniqueOnly) {
                if (!this.permutations.contains(permToAdd)) {
                    this.permutations.add(permToAdd);
                }
            } else {
                this.permutations.add(permToAdd);
            }
            return;
        }

        for (int i = 0; i < inputlength; ++i) {
            if (used[i]) {
                continue;
            }
            outputString.append(in[i]);
            used[i] = true;
            doPermute(in, outputString, used, inputlength, level + 1);
            used[i] = false;
            outputString.setLength(outputString.length() - 1);
        }
    }

    class StringPermutationsOutput {
        public final ArrayList<String> permutations;

        public StringPermutationsOutput(final ArrayList<String> permutations){
            this.permutations = permutations;
        }
    }

}
