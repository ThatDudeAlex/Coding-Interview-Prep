
## Split Binary Tree

Write a function that takes in a Binary Tree with at least one node and
checks if that Binary Tree can be split into two Binary Trees of equal sum by
removing a single edge. If this split is possible, return the new sum of each
Binary Tree, otherwise return 0. Note that you do not need to return the edge
that was removed.

The sum of a Binary Tree is the sum of all values in that Binary Tree.

Each BinaryTree node has an integer value, a
left child node, and a right child node. Children
nodes can either be BinaryTree nodes themselves or
None / null.

### Sample Input
```
tree =     1
        /     \
       3       -2
     /   \    /  \
    6    -5  5    2
  /
 2
```

### Sample Output
```
6 // Remove the edge to the left of the root node,
// creating two trees, each with sums of 6
```
