
## Caesar Cipher Encryptor

Given a non-empty string of lowercase letters and a non-negative integer
representing a key, write a function that returns a new string obtained by
shifting every letter in the input string by k positions in the alphabet,
where k is the key.

Note that letters should "wrap" around the alphabet; in other words, the
letter z shifted by one returns the letter a.

For Solution 2 of this problem, in the video explanation, we update the
newLetterCode with the following formula if it's greater than
25:

This logic is actually flawed, because if
newLetterCode % 25 happens to be equal to 0, then
we'll be accessing a letter in the alphabet at index
-1, which will throw an error in a lot of languages or simply
return an incorrect answer in other languages.

For example, this edge-case issue will occur with these inputs:

Instead, we need to use the following formula if the
newLetterCode is greater than 25:

Why isn't this an issue in Solution 1?

In Solution 1, our formula is:

Since we only actually apply this formula if newLetterCode is
greater than 122, and since the key that's used to initially compute
newLetterCode is always less than 26 (because it's
modded by 26 at the beginning of the algorithm), we know that
newLetterCode % 122 will never be equal to 0 (newLetterCode
will always be between 123 and 147).

Thus, we'll never compute a character from the char code 96,
which would be equivalent to accessing a letter at index -1 in
Solution 2.

### Sample Input
```
string = "xyz"
key = 2
```

### Sample Output
```
"zab"
```
