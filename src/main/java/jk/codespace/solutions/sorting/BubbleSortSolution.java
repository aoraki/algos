package jk.codespace.solutions.sorting;

public class BubbleSortSolution {

    public int[] sortArray(int[] arr){
        boolean sortingRequired = true;
        while(sortingRequired){
            boolean sortingWasApplied = false;
            if(arr.length == 1) {
                return arr;
            } else {
                for (int i = 0; i < arr.length - 1; i++) {
                    int firstDigit = arr[i];
                    int secondDigit = arr[i + 1];
                    if (secondDigit < firstDigit) {
                        arr[i] = secondDigit;
                        arr[i + 1] = firstDigit;
                        sortingWasApplied = true;
                    }
                    sortingRequired = sortingWasApplied;
                }
            }
        }
        return arr;
    }
}
