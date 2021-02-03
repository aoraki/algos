package jk.codespace.solutions.recursion;

import java.util.ArrayList;
import java.util.List;

public class FlattenArraysSolution {

    List<Integer> masterArrayList = new ArrayList<>();
    public Integer[] flatten(Object[] unflattenedArray){
        for(Object obj : unflattenedArray){
            if (obj instanceof Object[]) {
                flatten((Object[])obj);
            } else {
                masterArrayList.add((Integer) obj);
            }
        }
        return masterArrayList.toArray(new Integer[masterArrayList.size()]);
    }
}
