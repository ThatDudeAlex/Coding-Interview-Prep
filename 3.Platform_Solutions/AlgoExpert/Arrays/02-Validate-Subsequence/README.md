
## Validate Subsequence

Given two non-empty arrays of integers, write a function that determines
whether the second array is a subsequence of the first one.

A subsequence of an array is a set of numbers that aren't necessarily adjacent
in the array but that are in the same order as they appear in the array. For
instance, the numbers [1, 3, 4] form a subsequence of the array
[1, 2, 3, 4], and so do the numbers [2, 4]. Note
that a single number in an array and the array itself are both valid
subsequences of the array.

### Sample Input
```
array = [5, 1, 22, 25, 6, -1, 8, 10]
sequence = [1, 6, -1, 10]
```

### Sample Output
```
true
```

## Solution Algorithm

My solution uses a `pointer` to track what value in the `sequence` we're searching for

1. **Initialization:** Create `currSequenceIndex` and set it to 0. This value will point  
to the number in ther `sequence` array that we're currently looking for

2. **Iteration:** Iterate through the input `array` element by element.  Let the current  
element be `array[i]`.

3. **Check for Match:** For each `array[i]`, check if `array[i] == sequence[currSequenceIndex]`

4. **Found Match:** increment currSequenceIndex by 1

5. **Check for Completion:** If `currSequenceIndex` is equal to the length of the `sequence`  
array, then return `true` since we completed the sequence

6. **No Completion:** If the loop completes without completing the sequence, it means `sequence`  
is not a subsequence of `array`

### Space & Time Complexity

O(n) time | O(1) space - where n is the length of the input array