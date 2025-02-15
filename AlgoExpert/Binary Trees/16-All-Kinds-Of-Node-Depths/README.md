
## All Kinds Of Node Depths

The distance between a node in a Binary Tree and the tree's root is called the
node's depth.

Write a function that takes in a Binary Tree and returns the sum of all of
its subtrees' nodes' depths.

Each BinaryTree node has an integer value, a
left child node, and a right child node. Children
nodes can either be BinaryTree nodes themselves or
None / null.

There's an additional, cleaner and more clever way of solving this question
with the same time and space time complexities as the optimal solution covered
in the video explanation.

Realize that a given node in the input tree has:

Since these depths are captured in each subtree's nodes' depths, which we sum
up to get the final answer, we can deduce that each node in the input tree
contributes 1 + 2 + 3 + ... + d - 1 + d to the final answer.

Thus, we can solve this question with a simple recursive function that takes
in the running depthSum and adds the current node's depth to it
at every call. See Solution 5 for the implementation of this algorithm.

We can go one step further by realizing that the sum
1 + 2 + 3 + ... + n - 1 + n can be calculated with the formula
(n * (n + 1)) / 2, which eliminates the need to pass the running
depthSum to each recursive function call. See
Solution 6 for this implementation.

Note that these two extra solutions are very clever and wouldn't be expected
of you in an interview (especially Solution 6, which takes advantage of
a math formula). That being said, if you were able to come up with either of
these two solutions, that certainly wouldn't be bad!

### Sample Input
```
tree =    1
       /     \
      2       3
    /   \   /   \
   4     5 6     7
 /   \
8     9
```

### Sample Output
```
26
// The sum of the root tree's node depths is 16.
// The sum of the tree rooted at 2's node depths is 6.
// The sum of the tree rooted at 3's node depths is 2.
// The sum of the tree rooted at 4's node depths is 2.
// Summing all of these sums yields 26.
```
