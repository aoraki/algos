package jk.codespace.solutions.recursion;

import java.util.ArrayList;

public class NetworkTestResult {
    public final int longestChain;
    public final ArrayList<Repeater> orphanedRepeaters;
    public final ArrayList<Repeater> problemRepeaters;

    public NetworkTestResult(final int longestChain, final ArrayList<Repeater> orphanedRepeaters, final ArrayList<Repeater> problemRepeaters){
        this.longestChain = longestChain;
        this.orphanedRepeaters = orphanedRepeaters;
        this.problemRepeaters = problemRepeaters;
    }

    @Override
    public String toString() {
        return "NetworkTestResult{" +
                "longestChain=" + longestChain +
                ", orphanedRepeaters=" + orphanedRepeaters +
                ", problemRepeaters=" + problemRepeaters +
                '}';
    }
}
