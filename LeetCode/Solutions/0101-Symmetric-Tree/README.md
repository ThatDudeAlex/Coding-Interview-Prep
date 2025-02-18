# 101. Symmetric Tree

Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

## Examples

- **Example 1:**

```mermaid
graph TD;
  A[1]
  B[2]
  C[2]
  D[3]
  E[4]
  F[4]
  G[3]

  A --> B;
  A --> C;
  B --> D;
  B --> E;
  C --> F;
  C --> G;
```


- **Input:** root = [1,2,2,3,4,4,3]
- **Output:** true

- **Example 2:**

```mermaid
graph TD;
    A[1]
    B[2]
    C[2]
    D[3]
    E[3]

    A --> B
    A --> C
    B --> D
    C --> E
```


- **Input:** root = [1,2,2,null,3,null,3]
- **Output:** false

## Constraints

- The number of nodes in the tree is in the range [1, 1000].
- -100 <= Node.val <= 100
