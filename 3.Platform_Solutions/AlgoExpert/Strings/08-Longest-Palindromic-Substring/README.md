
## Longest Palindromic Substring

Write a function that, given a string, returns its longest palindromic
substring.

A palindrome is defined as a string that's written the same forward and
backward. Note that single-character strings are palindromes.

You can assume that there will only be one longest palindromic substring.

In the video explanation of this question, we mistakenly state that the
optimal solution runs with constant space.

It's true that throughout our traversal of the input string, we only store an
array of length 2; however, we ultimately still need to slice the longest
palindromic substring out of the string, and this longest palindromic
substring can be as large as the string itself, in the worst case.

Thus, the algorithm runs with linear space.

### Sample Input
```
string = "abaxyzzyxf"
```

### Sample Output
```
"xyzzyx"
```
