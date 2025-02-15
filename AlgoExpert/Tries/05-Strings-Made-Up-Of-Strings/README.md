
## Strings Made Up Of Strings

Write a function that takes in a non-empty array of unique strings
strings as well as another non-empty array of unique strings
substrings. This function should return an array of all of
the strings in strings that can be formed by concatenating
one or more of the strings in substrings.

Note that:



The worst case time complexity of the isMadeUpOfStrings
helper function is O(n^2) where n is the length of the string
being checked. However, if we only considered "typical" cases that complexity
would be closer to O(n).

The worst possible input would be a very contrived case where nearly every
possible substring of the string being checked exists in the Trie. For this
reason, we could end up calling isMadeUpOfStrings on
n different inputs, each of which would get past the base
cases and require iterating through the characters of the string.

### Sample Input
```
strings = [
  "bar",
  "are",
  "foo",
  "ba",
  "b",
  "barely"
]
substrings = [
  "b",
  "a",
  "r",
  "ba",
  "ar",
  "bar"
]
```

### Sample Output
```
["bar", "ba", "b"]
```
