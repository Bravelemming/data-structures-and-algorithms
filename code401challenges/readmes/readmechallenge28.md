# Quick Sort
Author: Jack Daniel Kinne.
Challenge by: Codefellows.
<!-- Short summary or background information -->
- write a quick sort!

## Challenge
<!-- Description of the challenge -->
- Complete a working, tested implementation of Quick Sort, based on the 
pseudo code provided
- Create a blog post on understanding the Quick Sort Algorithm suitable 
for a 301 level student. Alternately, prepare a presentation that presents 
the algorithm in a novel way. E.g. a short skit, live mini-lecture, 
interpretive dance.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
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

### blog post notes:
- [blog_merge_sort](/blogs/blog_quick_sort.md)
- Create a BLOG.md document using the template provided
- 1 short video resource
- 2 quality readings/references
- An organized, ordered blog outline

- Working pseudo code
- Description of the algorithm
- Supportive Images

## credits and contributions
