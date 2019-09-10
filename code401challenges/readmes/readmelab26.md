# Multi bracket validation
Author: Jack Daniel Kinne.
Challenge by: Codefellows.
<!-- Short summary or background information -->
- Complete a working, tested implementation of Insertion Sort, based on the pseudo code provided
- 

## Challenge
<!-- Description of the challenge -->
- Create a blog post on understanding the Insertion Sort Algorithm suitable for 
    a 301 level student. Alternately, prepare a presentation that presents 
    the algorithm in a novel way. E.g. a short skit, live mini-lecture, 
    interpretive dance.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
- use the following for a starter:
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

### blog post notes:
- [blog_insertion_sort](/blogs/blog_insertion_sort.md)
- Create a BLOG.md document using the template provided
- 1 short video resource
- 2 quality readings/references
- An organized, ordered blog outline

- Working pseudo code
- Description of the algorithm
- Supportive Images


## credits and contributions


