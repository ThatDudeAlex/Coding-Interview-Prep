
## Maximum Sum Submatrix

You're given a two-dimensional array (a matrix) of potentially unequal height
and width that's filled with integers. You're also given a positive integer
size. Write a function that returns the maximum sum that can be
generated from a submatrix with dimensions size * size.

For example, consider the following matrix:

If size = 2, then the 2x2 submatrices to consider are:

The sum of the elements in the first submatrix is 17, and the sum
of the elements in the second submatrix is 10. In this example,
your function should return 17.

Note: size will always be at least 1, and the
dimensions of the input matrix will always be at least
size * size.

### Sample Input
```
[
  [2, 4],
  [5, 6],
  [-3, 2],
]
```

### Sample Output
```
[2, 4]
[5, 6]
------
[5, 6]
[-3, 2]
```
