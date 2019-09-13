## Merge Sort
- challenge by: codefellows
- author: Jack Daniel Kinne

## Description
- Merge sort is a “divide and conquer” algorithm wherein we first divide the problem into subproblems. When the solutions for the subproblems are ready, we combine them together to get the final solution to the problem.

## Approach & Efficiency
- the pseudo code:
```
ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length
           
    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left
```

- the code:
```$xslt
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
```
## The image
![Insertion Sort](/assets/merge-sort.png)

## time and space complexity

### time complexity
- O(n log n) 

### space complexity: 
- O(n log n) 

## additional resources
- [the video explanation](https://www.youtube.com/watch?v=iMT7gTPpaqw)
- [the algorithm](https://www.baeldung.com/java-merge-sort)
- [time complexity](https://www.baeldung.com/java-merge-sort)
- [the description](https://www.geeksforgeeks.org/merge-sort/)
