
## Union Find

The union-find data structure is similar to a traditional set data structure
in that it contains a collection of unique values. However, these values are
spread out amongst a variety of distinct disjoint sets, meaning that no set
can have duplicate values, and no two sets can contain the same value.

Write a UnionFind class that implements the union-find (also
called a disjoint set) data structure. This class should support three methods:

You can assume createSet will never be called with the same
value twice.

If you're unfamiliar with Union Find, we recommend watching the Conceptual
Overview section of this question's video explanation before starting to code.

### Sample Input
```
createSet(5): null
createSet(10): null
find(5): 5
find(10): 10
union(5, 10): null
find(5): 5
find(10): 5
createSet(20): null
find(20): 20
union(20, 10): null
find(5): 5
find(10): 5
find(20): 5
```

### Sample Output
```
{
  "classMethodsToCall": [
    {
      "arguments": [0],
      "method": "find"
    },
    {
      "arguments": [1],
      "method": "find"
    }
  ]
}
```
