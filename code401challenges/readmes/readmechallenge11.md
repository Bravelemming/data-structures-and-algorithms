# Reverse an Array
Author: Jack Daniel Kinne.
Challenge by: Codefellows.
<!-- Short summary or background information -->
write a queue with only two stacks.  That's it!

## Challenge
<!-- Description of the challenge -->
no libraries.
use only your own classes.
make within a class.  you only two two of your stacks, and their methods.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
- push into s1
- pop and push into s2
- for new "queues" push into s1
- for new "dequeues" pop from s2
- when s2 is null, reload from s1

## Solution
<!-- Embedded whiteboard image -->
![whiteboard](../assets/code11whiteboard.jpg)

## credits and contributions
https://javarevisited.blogspot.com/2014/12/9-things-about-null-in-java.html
https://gist.github.com/es20641/1208340/06d598126d53b048058bc243cbc4e4dd7db9a23a
