# Left join on two hashmaps
- Author: Jack Daniel Kinne.
- Challenge by: Codefellows.
<!-- Short summary or background information -->
- Find the left join of two hash tables.

## Challenge
<!-- Description of the challenge -->
- Write a function that LEFT JOINs two hashmaps into a single data structure.
- The first parameter is a hashmap that has word strings as keys, and a synonym of the key as values.
- The second parameter is a hashmap that has word strings as keys, and antonyms of the key as values.
- Combine the key and corresponding values (if they exist) into a new data structure according to LEFT JOIN logic.
- LEFT JOIN means all the values in the first hashmap are returned, and if values exist in the “right” hashmap, they are appended to the result row. If no values exist in the right hashmap, then some flavor of NULL should be appended to the result row.
- The returned data structure that holds the results is up to you. It doesn’t need to exactly match the output below, so long as it achieves the LEFT JOIN logic.
- Avoid utilizing any of the library methods available to your language.
  
## Approach & Efficiency
- print key list of left HT.
- does key list contain right HT?
-  If yes, add to left HT.
- return left HT as final.

## whiteboard
![/assets/leftjoin.jpg](/assets/leftjoin.jpg)

## credits and contributions
- Matt Stuhring