
## Sum BSTs

You're given a Binary Tree. As with any Binary Tree, this tree may contain
one or more Binary Search Trees (BSTs), and it may even be a BST itself.

Write a function that returns the sum of all the values of nodes in this
tree which are part of a BST containing at least 3 nodes.

Each BinaryTree node has an integer value, a
left child node, and a right child node. Children
nodes can either be BinaryTree nodes themselves or
None / null.

A BST is a special type of Binary Tree whose nodes all satisfy the BST
property. A node satisfies the BST property if its value is
strictly greater than the values of every node to its left; its
value is less than or equal to the values of every node to its
right; and its children nodes are either valid BST nodes
themselves or None / null.

### Sample Input
```
tree =     8
         /    \
       2       9
     /   \       \
   1     10       5
```

### Sample Output
```
13 // 1, 2, and 10 form the only BST containing at least 3 nodes.
```
