## Insertion Sort
- challenge by: codefellows
- author: Jack Daniel Kinne

## Description
- Insertion sort is a sorting algorithm in which the elements are 
transferred one at a time to the right position. In other words, an insertion sort helps in building the final sorted list, one item at a time, with the movement of higher-ranked elements. 
An insertion sort has the benefits of simplicity and low overhead.

## Approach & Efficiency
- the pseudo code:
```
  InsertionSort(int[] arr)
  
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp
```
- the code:
```$xslt
public class InsertionSortExample {  
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
```
## The image
![Insertion Sort](/assets/insertion-sort.png)

## time and space complexity

### time complexity
- at first glance, it would look like it's time complexity is O(n^2) because you see
a while loop inside a for loop.  the actual work being done, however,
is only O(n), the outer loop N times, the inner loop will swap O(1) times.
### space complexity: 
- because this is happening in place, inside its own array,
space complexity is constant at 0(1).  this is because array's are passed
by reference, while primitives are passed by value.

## additional resources
- [the video explanation](https://www.youtube.com/watch?v=lCDZ0IprFw4)
- [the algorithm](https://www.javatpoint.com/insertion-sort-in-java#targetText=Insertion%20is%20good%20for%20small,void%20insertionSort(int%20array%5B%5D)%20%7B)
- [time complexity](https://www.geeksforgeeks.org/time-complexity-insertion-sort-inversions/#targetText=Therefore%20overall%20time%20complexity%20of,is%20sorted%20in%20reverse%20order.)
- [the description](https://www.techopedia.com/definition/20039/insertion-sort#targetText=Insertion%20sort%20is%20a%20sorting,movement%20of%20higher%2Dranked%20elements.)
