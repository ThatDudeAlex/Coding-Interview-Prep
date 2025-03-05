
## Longest Most Frequent Prefix

Write a function that takes in an array of unique strings and returns the
prefix that appears most frequently throughout the strings. If there are two
or more such prefixes, your function should return the longest one. If there
are no such prefixes, your function should return the longest string. You
can assume that there will only ever be one longest prefix or string.

For example, given the strings
["algoexpert", "algorithm", "foo", "food"], the most frequent
prefix is either "algo" or "foo", since both appear in two strings. However,
"algo" is longer than "foo", so "algo" is the desired answer.

### Sample Input
```
strings = [
  "algoexpert",
  "algorithm",
  "frontendexpert",
  "mlexpert"
]
```

### Sample Output
```
"algo"
```
