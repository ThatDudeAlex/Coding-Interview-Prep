
## First Duplicate Value

Given an array of integers between 1 and n,
inclusive, where n is the length of the array, write a function
that returns the first integer that appears more than once (when the array is
read from left to right).

In other words, out of all the integers that might occur more than once in the
input array, your function should return the one whose first duplicate value
has the minimum index.

If no integer appears more than once, your function should return
-1.

Note that you're allowed to mutate the input array.

At 9:43 in the video, the math that describes the number of operations
performed in Solution #1 has a typo. It should not involve
multiplication; instead, the total number of operations is approximated by the
following sum:

In the first iteration, we visit n elements; in the second
iteration, we visit n - 1 elements; in the third iteration, we
visit n - 2 elements; etc..

This sum is equal to n(n + 1) / 2, which leads to an algorithm
that runs in O(n^2) time.

### Sample Input
```
array = [2, 1, 5, 2, 3, 3, 4]
```

### Sample Output
```
2 // 2 is the first integer that appears more than once.
// 3 also appears more than once, but the second 3 appears after the second 2.
```
