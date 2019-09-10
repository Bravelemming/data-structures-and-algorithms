# Binary Tree Max Value
Author: Jack Daniel Kinne.
Challenge by: Codefellows.
<!-- Short summary or background information -->
- write a merge sort!

## Challenge
<!-- Description of the challenge -->
- Complete a working, tested implementation of Merge Sort, based on the pseudo code 
provided
- Create a blog post on understanding the Merge Sort Algorithm suitable for a 301 level student. 
Alternately, prepare a presentation that presents the algorithm in a novel way. E.g. a short skit, 
live mini-lecture, interpretive dance.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
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

### blog post notes:
- [blog_merge_sort](/blogs/blog_merge_sort.md)
- Create a BLOG.md document using the template provided
- 1 short video resource
- 2 quality readings/references
- An organized, ordered blog outline

- Working pseudo code
- Description of the algorithm
- Supportive Images

## credits and contributions
Marisha Hoza
Matt Stuhring