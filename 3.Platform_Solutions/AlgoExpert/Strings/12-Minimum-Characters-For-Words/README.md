
## Minimum Characters For Words

Write a function that takes in an array of words and returns the smallest
array of characters needed to form all of the words. The characters don't need
to be in any particular order.

For example, the characters ["y", "r", "o", "u"] are needed to
form the words ["your", "you", "or", "yo"].

Note: the input words won't contain any spaces; however, they might contain
punctuation and/or special characters.

The space complexity of O(c), where c is the number
of unique characters across all words, is actually a lower bound for our
solution's space complexity.

This is because the maximumCharacterFrequencies hash table will
take up O(c) space, but the output array of characters might take
up more space if some unique characters appear multiple times in a single
word. For example, we might have a hash table {"a": 3"} with one
character but an output array ["a", "a", "a"] with three
characters.

An upper bound for the space complexity is O(n * l), which
happens when every single character in each word is unique across all words
and the output array therefore contains n * l characters.

### Sample Input
```
words = ["this", "that", "did", "deed", "them!", "a"]
```

### Sample Output
```
["t", "t", "h", "i", "s", "a", "d", "d", "e", "e", "m", "!"]
// The characters could be ordered differently.
```
