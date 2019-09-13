## Quick Sort
- challenge by: codefellows
- author: Jack Daniel Kinne

## Description
- Quicksort is an algorithm used to quickly sort items within an array no matter how big the array is. It is quite scalable and works relatively well for small and large data sets, and is easy to implement with little time complexity. It does this through a divide-and-conquer method that divides a single large array into two smaller ones and then repeats this process for all created arrays until the sort is complete.

## Approach & Efficiency
- the pseudo code:
```
ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition the array by setting the position of the pivot value 
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right. 
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1

ALGORITHM Swap(arr, i, low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp
```

- the code:
```$xslt
public void quickSort(int arr[], int begin, int end) {
    if (begin < end) {
        int partitionIndex = partition(arr, begin, end);
 
        quickSort(arr, begin, partitionIndex-1);
        quickSort(arr, partitionIndex+1, end);
    }
}

private int partition(int arr[], int begin, int end) {
    int pivot = arr[end];
    int i = (begin-1);
 
    for (int j = begin; j < end; j++) {
        if (arr[j] <= pivot) {
            i++;
 
            int swapTemp = arr[i];
            arr[i] = arr[j];
            arr[j] = swapTemp;
        }
    }
 
    int swapTemp = arr[i+1];
    arr[i+1] = arr[end];
    arr[end] = swapTemp;
 
    return i+1;
}
```
## The image
![Insertion Sort](/assets/quick-sort.png)

## time and space complexity

### time complexity
- O(n log n) or at worst 0 (n^2)

### space complexity: 
- 	O(log(n))

## additional resources
- [the video explanation](https://www.youtube.com/watch?v=SLauY6PpjW4)
- [the algorithm](https://www.baeldung.com/java-quicksort)
- [time complexity](https://www.baeldung.com/java-quicksort)
- [the description](https://www.techopedia.com/definition/21578/quicksort#targetText=Quicksort%20is%20a%20popular%20sorting,Hoare%20(commonly%20known%20as%20C.A.R.)
