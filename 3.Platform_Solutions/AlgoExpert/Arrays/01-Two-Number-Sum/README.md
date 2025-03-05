
## Two Number Sum

Write a function that takes in a non-empty array of distinct integers and an
integer representing a target sum. If any two numbers in the input array sum
up to the target sum, the function should return them in an array, in any
order. If no two numbers sum up to the target sum, the function should return
an empty array.

Note that the target sum has to be obtained by summing two different integers
in the array; you can't add a single integer to itself in order to obtain the
target sum.

You can assume that there will be at most one pair of numbers summing up to
the target sum.

### Sample Input
```
array = [3, 5, -4, 8, 11, 1, -1, 6]
targetSum = 10
```

### Sample Output
```
[-1, 11] // the numbers could be in reverse order
```

## Solution Algorithm

My solution uses a `set` to efficiently track numbers we have already
seen in the array

1. **Initialization:** Create an empty set called `numbers_seen`. This set will store  
the numbers we've already encountered in the input array

2. **Iteration:** Iterate through the input `array` element by element.  Let the current  
element be `array[i]`.

3. **Check for Match:** For each `array[i]`, calculate the `potentialMatch` needed to reach the  
`targetSum`:  `potentialMatch = targetSum - array[i]`.

4. **Found Match:** Check if the `potentialMatch` is already present in the `numbers_seen` set.  
If it is, this means we've found the two numbers that sum to the `targetSum`.  
Return the pair `[potentialMatch, array[i]]`.  The order doesn't matter.

5. **Add to Seen:** If the `potentialMatch` is not in the `numbers_seen` set, add the current  
number `array[i]` to the `numbers_seen` set. This way, if we encounter its match later,  
we'll know we've already seen it.

6. **No Match:** If the loop completes without finding a match, it means no two numbers  
in the array sum to the `targetSum`. Return an empty array.

### Space & Time Complexity

O(n) time | O(n) space - where n is the length of the input array
