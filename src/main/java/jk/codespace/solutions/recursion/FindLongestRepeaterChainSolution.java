package jk.codespace.solutions.recursion;

/*

 - Problem Spec -
Radio Network Repeater Chain Length

In one type of simple radio network, transceivers can operate on one of 20 fixed frequencies, which
we will call channels 0 to 19. Each transceiver can only cover a limited distance, beyond which the
signal is too weak to be received.

The "central" transceiver always operates on channel 0. To extend the network coverage, repeaters
are installed which receive a signal on one channel and re-transmit the signal on another channel.

Each repeater can be described as a pair of channel numbers, the "upstream" channel number
(which is "closer" to the central node) and the "downstream" channel number (which is "further"
from the central node). No repeater can have a downstream channel of 0 (since this is used by the
central node) and no two repeaters can have the same downstream channel (since their
transmissions would interfere).

Given a list of repeater channel number pairs, determine the longest chain of repeaters in the
network, and identify any repeaters that are "orphaned" because there is no chain that connects
them back to the central node.

For example, for this set or repeaters (upstream/downstream):

0/1, 1/2, 3/4, 0/5

the longest chain is two repeaters and repeater 3/4 is orphaned.


SOLUTION : Use a recursive algorithm to navigate the repeater set and determine the longest chain

*/
import java.util.ArrayList;
import java.util.HashMap;

public class FindLongestRepeaterChainSolution {

    private final static Integer MAX_CHANNEL_NUMNER = 19;
    private final static Integer MIN_CHANNEL_NUMNER = 0;
    private final static Integer RESERVED_CHANNEL_NUMNER = 0;

    private ArrayList<Repeater> repeaters = new ArrayList<>();
    private ArrayList<Integer> downStreamChannels = new ArrayList<>();
    private HashMap<Integer, ArrayList<Repeater>> byUpStream = new HashMap();

    private int longestChain = 0;

    private ArrayList<Repeater> problematicRepeaters = new ArrayList<>();

    private boolean isValidRepeater(Repeater rp){
        boolean isValid = true;

        if(rp.downstreamChannel.equals(RESERVED_CHANNEL_NUMNER)){
            System.out.println("Repeater detected using reserved channel of 0, repeater id :" + rp.identifier);
            return false;
        }

        if(!(rp.downstreamChannel.intValue() >= MIN_CHANNEL_NUMNER.intValue() && rp.downstreamChannel.intValue() <= MAX_CHANNEL_NUMNER.intValue())){
            System.out.println("Repeater detected using channel out of range, repeater id :" + rp.identifier);
            return false;
        }

        if(this.downStreamChannels.contains(rp.downstreamChannel)){
            System.out.println("Repeater detected using a downstream channel already in use in the network :" + rp.identifier);
            return false;
        }

        return isValid;
    }

    private void validateAndLoadRepeaters(){
        for(Repeater rp : this.repeaters){
            if(this.isValidRepeater(rp)){
                this.downStreamChannels.add(rp.downstreamChannel);
                if(this.byUpStream.containsKey(rp.upstreamChannel)){
                    ArrayList<Repeater> repeaters = (ArrayList)this.byUpStream.get(rp.upstreamChannel);
                    if(!repeaters.contains(rp)){
                        repeaters.add(rp);
                    }
                    this.byUpStream.put(rp.upstreamChannel, repeaters);
                } else {
                    ArrayList<Repeater> repeaters = new ArrayList();
                    repeaters.add(rp);
                    this.byUpStream.put(rp.upstreamChannel, repeaters);
                }
            } else {
                this.problematicRepeaters.add(rp);
            }
        }
    }

    /*
     *  Recursive method that navigates the data structures as set up in validateAndLoadRepeaters method.
     *  For the purposes of this problem, the first time this method is called is with (0,0) being passed
     *  as the arguments to the method.
     *
     */
    private void determineChains(Integer nextChannel, int chainLength){
        if(this.byUpStream.containsKey(nextChannel)){
            chainLength = chainLength + 1;
            ArrayList<Repeater> repeaters = this.byUpStream.get(nextChannel);

            for(int i=0; i<repeaters.size(); i++){
                Repeater rp = repeaters.get(i);
                // Because we have discovered this repeater in the chain navigation process, we are removing it from the repeaters collection.
                // Any repeaters left in the collection at the end of the process will be deemed "orphaned"
                if(this.repeaters.contains(rp)){
                    this.repeaters.remove(rp);
                }
                this.determineChains(rp.downstreamChannel, chainLength);
            }
        } else {
            // This signifies the end of chain.  No more matches found in the byUpstream HashMap
            System.out.println("Chain length = " + chainLength);

            // If we have exceeded the longest chain recorded then we overwrite it with the new value.
            if(chainLength > this.longestChain){
                this.longestChain = chainLength;
            }
        }
    }

    public NetworkTestResult determineLongestChainInRadioNetwork(ArrayList<Repeater> repeaters){
        this.repeaters = repeaters;
        this.validateAndLoadRepeaters();
        this.determineChains(0,0);
        return new NetworkTestResult(this.longestChain, this.repeaters, this.problematicRepeaters);
    }
}


