
## First Non-Repeating Character

Write a function that takes in a string of lowercase English-alphabet letters
and returns the index of the string's first non-repeating character.

The first non-repeating character is the first character in a string that
occurs only once.

If the input string doesn't have any non-repeating characters, your function
should return -1.

In the optimal solution, we store the input string's character frequencies in
a hash table. Why is this solution's space complexity O(1) as opposed to O(n)?

The problem's prompt specifies that the input string only contains lowercase
English-alphabet letters. Since there are only 26 lowercase English-alphabet
letters, our hash table will never store more than 26 character frequencies;
thus, the optimal solution's space complexity is O(1). If the input string
could contain any character, then the space complexity would be
O(n).

This type of detail should always be confirmed with your interviewer in a real
coding interview.

### Sample Input
```
string = "abcdcaf"
```

### Sample Output
```
1 // The first non-repeating character is "b" and is found at index 1.
```
