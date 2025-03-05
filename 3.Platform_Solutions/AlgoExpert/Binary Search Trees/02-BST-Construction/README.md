
## BST Construction

Write a BST class for a Binary Search Tree. The class should
support:

Note that you can't remove values from a single-node tree. In other words,
calling the remove method on a single-node tree should simply not
do anything.

Each BST node has an integer value, a
left child node, and a right child node. A node is
said to be a valid BST node if and only if it satisfies the BST
property: its value is strictly greater than the values of every
node to its left; its value is less than or equal to the values
of every node to its right; and its children nodes are either valid
BST nodes themselves or None / null.

### Sample Input
```
// Assume the following BST has already been created:
         10
       /     \
      5      15
    /   \   /   \
   2     5 13   22
 /           \
1            14

// All operations below are performed sequentially.
insert(12):   10
            /     \
           5      15
         /   \   /   \
        2     5 13   22
      /        /  \
     1        12  14

remove(10):   12
            /     \
           5      15
         /   \   /   \
        2     5 13   22
      /           \
     1            14

contains(15): true
```

### Sample Output
```
{
  "rootValue": 10,
  "classMethodsToCall": [
    {
      "arguments": [5],
      "method": "insert"
    },
    {
      "arguments": [15],
      "method": "insert"
    },
    {
      "arguments": [2],
      "method": "insert"
    },
    {
      "arguments": [5],
      "method": "insert"
    },
    {
      "arguments": [13],
      "method": "insert"
    },
    {
      "arguments": [22],
      "method": "insert"
    },
    {
      "arguments": [1],
      "method": "insert"
    },
    {
      "arguments": [14],
      "method": "insert"
    },
    {
      "arguments": [12],
      "method": "insert"
    },
    {
      "arguments": [10],
      "method": "remove"
    },
    {
      "arguments": [15],
      "method": "contains"
    }
  ]
}
```
