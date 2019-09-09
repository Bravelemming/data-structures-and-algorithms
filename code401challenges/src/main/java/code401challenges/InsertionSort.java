package code401challenges;

public class InsertionSort {

    public static int[] insertionSort (int [] arr){
        for (int i = 1; i < arr.length; i++){
            int j = i -1;
            int temp = arr[i];
            while (i >= 0 && temp < arr[j]){
                arr[j+1] = arr[j];
                j = j -1;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }
}


