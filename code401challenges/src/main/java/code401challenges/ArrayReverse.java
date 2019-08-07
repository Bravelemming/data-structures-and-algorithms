package code401challenges;

import java.util.Arrays;

public class ArrayReverse {
  public static void main(String[] args){
    int[] tobeR = new int[]{1,2,3,4,5};
    System.out.println( Arrays.toString(  reverseArray(tobeR) ) );
  }

  public static int[] reverseArray(int[] arr){
    //vars
    int end = arr.length-1;
    int start = 0;
    while ( start < end ) {
      //swap 
      int swap = arr[start];
      arr[start] = arr[end];
      arr[end] = swap;
      //iterate
      start++;
      end--;
    }
    return arr;
  }
}