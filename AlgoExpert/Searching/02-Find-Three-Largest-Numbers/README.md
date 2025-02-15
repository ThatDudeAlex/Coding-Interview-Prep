
## Find Three Largest Numbers

Write a function that takes in an array of at least three integers and,
without sorting the input array, returns a sorted array of the three largest
integers in the input array.

The function should return duplicate integers if necessary; for example, it
should return [10, 10, 12] for an input array of
[10, 5, 9, 10, 12].

Can we just sort the input array and return the last three elements in the
sorted array?

The best sorting algorithms run, on average, in O(nlog(n)) time; we can
implement a more optimal, linear-time algorithm (an O(n)-time
algorithm) by not sorting the input array.

### Sample Input
```
array = [141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7]
```

### Sample Output
```
[18, 141, 541]
```
