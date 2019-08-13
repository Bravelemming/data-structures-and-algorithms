# Reverse an Array
Author: Jack Daniel Kinne.
Challenge by: Codefellows.
<!-- Short summary or background information -->
write a linked list from scratch without using a prebuilt constructor.
add to this challenge by making an insertbefore, insertafter, 
and append, which i renamed insertRear.  Because reasons.

## Challenge
<!-- Description of the challenge -->
- append(value) which adds a new node with the given value to the end of the list
- insertBefore(value, newVal) which add a new node with the given 
newValue immediately before the first value node
- insertAfter(value, newVal) which add a new node with the given 
newValue immediately after the first value node

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

- append - iterate through the list until next is null.  add node with value.
- insert before - iterate trhough the list until value matches data.  create a temp node. 
connect temp to next and previous.  create a new node. link new node to previous and next nodes.
- insert after - same as before, except treat current as previous and current.next as next.

#### Big O : 
- insertRear: O (n)
- insertBefore: O (n)
- insertAfter: O (n)

## Solution
<!-- Embedded whiteboard image -->
![whiteboard](../assets/linkedListExtended.jpg)

## credits and contributions
- Pair with Joachen Busch for whiteboarding
- https://www.cs.cmu.edu/~adamchik/15-121/lectures/Linked%20Lists/linked%20lists.html
- https://gist.github.com/es20641/1208340/06d598126d53b048058bc243cbc4e4dd7db9a23a

