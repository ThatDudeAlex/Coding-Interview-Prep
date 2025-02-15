
## Three Number Sum

Write a function that takes in a non-empty array of distinct integers and an
integer representing a target sum. The function should find all triplets in
the array that sum up to the target sum and return a two-dimensional array of
all these triplets. The numbers in each triplet should be ordered in ascending
order, and the triplets themselves should be ordered in ascending order with
respect to the numbers they hold.

If no three numbers sum up to the target sum, the function should return an
empty array.

The first step in the solution is to sort the input array. Why is the
O(nlog(n)) runtime of the sorting step not reflected in the overall
time complexity of the algorithm?

The nested loops in the solution run in O(n^2) time; this dwarfs the
O(nlog(n)) runtime of the sorting step and allows us to remove it from
the final time complexity of the algorithm.

### Sample Input
```
array = [12, 3, 1, 2, -6, 5, -8, 6]
targetSum = 0
```

### Sample Output
```
[[-8, 2, 6], [-8, 3, 5], [-6, 1, 5]]
```
