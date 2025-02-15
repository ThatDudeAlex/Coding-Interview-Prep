
## Evaluate Expression Tree

You're given a binary expression tree. Write a function to evaluate
this tree mathematically and return a single resulting integer.

All leaf nodes in the tree represent operands, which will always be positive
integers. All of the other nodes represent operators. There are 4 operators
supported, each of which is represented by a negative integer:

You can assume the tree will always be a valid expression tree. Each
operator also works as a grouping symbol, meaning the bottom of the tree is
always evaluated first, regardless of the operator.

### Sample Input
```
tree =    -1
        /     \
      -2       -3
     /   \    /  \
   -4     2  8    3
  /   \
 2     3
```

### Sample Output
```
6 // (((2 * 3) - 2) + (8 / 3))
```
