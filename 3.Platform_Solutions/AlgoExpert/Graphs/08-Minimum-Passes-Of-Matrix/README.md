
## Minimum Passes Of Matrix

Write a function that takes in an integer matrix of potentially unequal height
and width and returns the minimum number of passes required to convert all
negative integers in the matrix to positive integers.

A negative integer in the matrix can only be converted to a positive integer
if one or more of its adjacent elements is positive. An adjacent element is an
element that is to the left, to the right, above, or below the current element
in the matrix. Converting a negative to a positive simply involves multiplying
it by -1.

Note that the 0 value is neither positive nor negative, meaning
that a 0 can't convert an adjacent negative to a positive.

A single pass through the matrix involves converting all the negative integers
that can be converted at a particular point in time. For example,
consider the following input matrix:

After a first pass, only 3 values can be converted to positives:

After a second pass, the remaining negative values can all be converted to
positives:

Note that the input matrix will always contain at least one element. If the
negative integers in the input matrix can't all be converted to positives,
regardless of how many passes are run, your function should return
-1.

### Sample Input
```
[ 
  [0, -2, -1], 
  [-5, 2, 0], 
  [-6, -2, 0],
]
```

### Sample Output
```
[ 
  [0, 2, -1], 
  [5, 2, 0], 
  [-6, 2, 0],
]
```
