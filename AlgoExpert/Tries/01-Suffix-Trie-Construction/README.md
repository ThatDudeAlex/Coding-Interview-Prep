
## Suffix Trie Construction

Write a SuffixTrie class for a Suffix-Trie-like data structure.
The class should have a root property set to be the root node of
the trie and should support:

Note that every string added to the trie should end with the special
endSymbol character: "*".

If you're unfamiliar with Suffix Tries, we recommend watching the
Conceptual Overview section of this question's video explanation before
starting to code.

### Sample Input
```
string = "babc"
```

### Sample Output
```
The structure below is the root of the trie.
{
  "c": {"*": true},
  "b": {
    "c": {"*": true},
    "a": {"b": {"c": {"*": true}}},
  },
  "a": {"b": {"c": {"*": true}}},
}
```
