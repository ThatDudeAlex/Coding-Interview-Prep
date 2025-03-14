
## Square of Zeroes

Write a function that takes in a square-shaped n x n two-dimensional array of
only 1s and 0s and returns a boolean representing whether the input matrix
contains a square whose borders are made up of only 0s.

Note that a 1 x 1 square doesn't count as a valid square for the purpose of
this question. In other words, a singular 0 in the input matrix
doesn't constitute a square whose borders are made up of only 0s; a square of
zeroes has to be at least 2 x 2.

### Sample Input
```
matrix = [
  [1, 1, 1, 0, 1, 0],
  [0, 0, 0, 0, 0, 1],
  [0, 1, 1, 1, 0, 1],
  [0, 0, 0, 1, 0, 1],
  [0, 1, 1, 1, 0, 1],
  [0, 0, 0, 0, 0, 1],
]
```

### Sample Output
```
true
[
  [ ,  ,  ,  ,  ,  ],
  [0, 0, 0, 0, 0,  ],
  [0,  ,  ,  , 0,  ],
  [0,  ,  ,  , 0,  ],
  [0,  ,  ,  , 0,  ],
  [0, 0, 0, 0, 0,  ],
]
```
