package code401challenges;

import java.util.Arrays;

public class ArrayBinSearch {

    //searches an array for a key value.  returns index.
    public static int arrayBinarySearch(int[] arr, int key){
        //vars
        int maxi = arr.length-1;
        int mini = 0;
        int midi = (maxi+mini)/2;

        while ( mini <= maxi  ) {
            //if match
            if (arr[midi]==key){
                return midi;
            }
            //if greater
            else if (arr[midi] > key){
                maxi = midi - 1;
                midi = (maxi+mini)/2;
            }
            //if lesser
            else if (arr[midi] < key ) {
                mini = midi + 1;
                midi = (maxi+mini)/2;
            }
        }
        //not in array
        return -1;
    }
}
