
## Spiral Traverse

Write a function that takes in an n x m two-dimensional array (that can be
square-shaped when n == m) and returns a one-dimensional array of all the
array's elements in spiral order.

Spiral order starts at the top left corner of the two-dimensional array, goes
to the right, and proceeds in a spiral pattern all the way until every element
has been visited.

In the video explanation, we forget to mention the edge cases where the final
"spiral section" consists of a single row or a single column. Consider the
following two matrices:

In the first matrix, the final section consists of a single row:
[11, 12]; in the second matrix, the final section consists of a
single column: [13, 14, 15].

In order to avoid double-counting elements in these sections (i.e., counting
11, 12, 11 instead of just 11, 12 in the first example, and counting
13, 14, 15, 14 instead of just 13, 14, 15 in the second example), we
have to add a couple of checks in our code to see if the
endRow and endCol are equal to the
startRow and startCol, respectively. If either of
them are, we make sure to break out of the loop we're in to avoid the
double-counting.

### Sample Input
```
array = [
  [1,   2,  3, 4],
  [12, 13, 14, 5],
  [11, 16, 15, 6],
  [10,  9,  8, 7],
]
```

### Sample Output
```
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
```
