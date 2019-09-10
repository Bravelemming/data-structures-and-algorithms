package code401challenges;

public class MergeSort {
    public static void mergeSort(int[] arr){
        int n = arr.length-1;

        if (n > 1){
            int mid = n/2;
            int left[];    //declaring array
            left = new int[mid];  // allocating memory to array

            int right[];    //declaring array
            right = new int[mid];  // allocating memory to array

            for (int i = 0; i < n ; i ++){
                if ( i < mid ){
                    right[i] = arr [i];
                }
                if ( i >= mid ){
                    left[i] = arr [i];
                }
            }

            // sort the left side
            mergeSort(left);
            // sort the right side
            mergeSort(right);
            // merge the sorted left and right sides together
            merge(left, right, arr, n , mid);
        }
    }
    public static void merge(int[] left, int[] right, int[] arr, int n, int mid){
        int i =0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length ) {
            if (left[i] <= right[j]){
                arr[k] = left[i];
                i = i + 1;
            }
            else{
                arr[k] = right[j];
                j = j + 1;
            }
            k = k + 1;

        }
        if (i == left.length){
            //set remaining entries in arr to remaining values in right
            while (j < n - mid) {
                arr[k] = right[j];
                j++;
                k++;
            }

        }
        else {
            //set remaining entries in arr to remaining values in left
            while ( i < mid) {
                arr[k] = left[i];
                i++;
                k++;
            }
        }

    }

    public static void toString(int arr[]) {
        for (int i=0; i < arr.length; i++ ) {
            System.out.println(arr[i]);
        }
    }
}
