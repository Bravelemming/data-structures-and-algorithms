package code401challenges;

public class MergeSort {
    public static void mergeSort(int[] arr){
        int n = arr.length;

        if (n > 1){
            int mid = n/2;
            int[] left;    //declaring array
            left = new int[mid];  // allocating memory to array
            int[] right;    //declaring array
            right = new int[arr.length - mid];  // allocating memory to array

            for (int i = 0 ; i < left.length; i ++ ){
                    left[i] = arr [i];
            }
            for (int i = 0 ; i < right.length; i ++ ){
                right[i] = arr [i+ mid];
            }


            MergeSort.toString(left);
            MergeSort.toString(right);

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
            while (j < right.length) {
                arr[k] = right[j];
                j++;
                k++;
            }

        }
        else {
            //set remaining entries in arr to remaining values in left
            while ( i < left.length) {
                arr[k] = left[i];
                i++;
                k++;
            }
        }

    }

    public static void toString(int arr[]) {
        System.out.println("Get ready to ARRAY: ");
        for (int i=0; i < arr.length; i++ ) {
            System.out.println("Array at " + i + ": " +arr[i]);
        }
    }
}
