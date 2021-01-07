package jk.codespace.solutions.sorting;

public class InsertionSortSolution {

    public int[] insertionSort(final int[] arr){
        //{2, 3, 4, 1, 5}
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1] < arr[i]){
                int val = arr[i+1];
                int j = i;
                while(j>=0 && (val < arr[j])){
                    int temp = arr[j];
                    arr[j] = val;
                    arr[j+1] = temp;
                    j--;
                }
            }
        }
        return arr;
    }
}
