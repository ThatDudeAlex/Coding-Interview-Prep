
## Sort K-Sorted Array

Write a function that takes in a non-negative integer k and a k-sorted array
of integers and returns the sorted version of the array. Your function can
either sort the array in place or create an entirely new array.

A k-sorted array is a partially sorted array in which all elements are at most
k positions away from their sorted position. For example, the array
[3, 1, 2, 2] is k-sorted with k = 3, because each
element in the array is at most 3 positions away from its sorted position.

Note that you're expected to come up with an algorithm that can sort the
k-sorted array faster than in O(nlog(n)) time.

### Sample Input
```
array = [3, 2, 1, 5, 4, 7, 6, 5]
k = 3
```

### Sample Output
```
[1, 2, 3, 4, 5, 5, 6, 7]
```
