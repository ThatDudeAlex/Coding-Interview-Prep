
## Max Sum Increasing Subsequence

Write a function that takes in a non-empty array of integers and returns the
greatest sum that can be generated from a strictly-increasing subsequence in
the array as well as an array of the numbers in that subsequence.

A subsequence of an array is a set of numbers that aren't necessarily adjacent
in the array but that are in the same order as they appear in the array. For
instance, the numbers [1, 3, 4] form a subsequence of the array
[1, 2, 3, 4], and so do the numbers [2, 4]. Note
that a single number in an array and the array itself are both valid
subsequences of the array.

You can assume that there will only be one increasing subsequence with the
greatest sum.

### Sample Input
```
array = [10, 70, 20, 30, 50, 11, 30]
```

### Sample Output
```
[110, [10, 20, 30, 50]] // The subsequence [10, 20, 30, 50] is strictly increasing and yields the greatest sum: 110.
```
