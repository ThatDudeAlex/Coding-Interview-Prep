
## Shifted Binary Search

Write a function that takes in a sorted array of distinct integers as well as a target
integer. The caveat is that the integers in the array have been shifted by
some amount; in other words, they've been moved to the left or to the right by
one or more positions. For example, [1, 2, 3, 4] might have
turned into [3, 4, 1, 2].

The function should use a variation of the Binary Search algorithm to
determine if the target integer is contained in the array and should return
its index if it is, otherwise -1.

If you're unfamiliar with Binary Search, we recommend watching the Conceptual
Overview section of the Binary Search question's video explanation before
starting to code.

The numbers in the input array must be distinct in order for this algorithm to
work all the time. The sample array in the video, which has a repeated
45, happens to work fine, but this is an exception—not the rule.

To understand why the numbers must be distinct, consider the following inputs:

With these inputs, our first binary-search step would have the following
indices:

We would then compare the left 45 to the middle
45 and conclude that the left half of the array was sorted, since
45 <= 45.

This would be incorrect, since the left subarray
[45, 33, 45] clearly isn't sorted.

This would lead our algorithm down the wrong path, and our function would end
up returning -1, which would be incorrect.

### Sample Input
```
array = [45, 61, 71, 72, 73, 0, 1, 21, 33, 37]
target = 33
```

### Sample Output
```
8
```
