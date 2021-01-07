package jk.codespace.solutions.sorting;

public class SelectionSortSolution {

    public int[] selectionSort(final int[] arr){

        for(int i=0; i<arr.length; i++){
            int val = arr[i];
            int lowestIndex = -1;
            int lowest = Integer.MAX_VALUE;

            for(int j=i+1; j<arr.length; j++){
                int valUnsorted = arr[j];
                if(valUnsorted < lowest){
                    lowest = valUnsorted;
                    lowestIndex = j;
                }
            }
            if(lowest < val && lowestIndex > 0){
                arr[i] = lowest;
                arr[lowestIndex] = val;
            }
        }

        return arr;
    }


}
