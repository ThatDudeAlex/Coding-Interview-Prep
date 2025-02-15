
## Max Path Sum In Binary Tree

Write a function that takes in a Binary Tree and returns its max path sum.

A path is a collection of connected nodes in a tree, where no node is
connected to more than two other nodes; a path sum is the sum of the values of
the nodes in a particular path.

Each BinaryTree node has an integer value, a
left child node, and a right child node. Children
nodes can either be BinaryTree nodes themselves or
None / null.

In the video explanation, we forget to handle the edge case where all nodes in
the input Binary Tree have negative values.

In this case, the maxPathSum is guaranteed to be negative, since
there are no positive-valued nodes.

This means that we can't set the base-case
leftMaxPathSum and rightMaxPathSum values, when the
left and / or right child nodes are null, to 0. Setting them to 0
means that the final maxPathSum will always be 0, since the final
computation in our recursive method will compare 0 to a negative value.

This operation will always yield 0 when maxSumAsRootNode is
negative and leftMaxPathSum and / or
rightMaxPathSum are 0.

Therefore, we set the base-case leftMaxPathSum and
rightMaxPathSum values, when the left and / or right child nodes
are null, to -Infinity (or whatever the min number
in your programming language is).

### Sample Input
```
tree = 1
    /     \
   2       3
 /   \   /   \
4     5 6     7
```

### Sample Output
```
18 // 5 + 2 + 1 + 3 + 7
```
