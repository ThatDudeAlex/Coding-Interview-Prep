## Is Unique

Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

## Solution Walkthrough

I'll provide 2 solutions for this question, one using an additional data structure and 1 without it.

### Solution 1 (optimal) - with additional data struct

Using a `Set` data structures allows us to solve this problem easily with the following algorithm:

1. **Setup:** instantiate an empty character set

2. **Iterate:** we iterate each character of the string

3. **Verify Uniqueness:** for each character we verify if it's unique
by checking if it's in the `Set`

4. **If unique:** if the character is not found in the set, it means it's a new character so we add it to the `Set`

5. **If not unique:** if the character is in the `Set` we can immidiately return false since we now know all characters are 
not unique

6. **Post-Iteration:** return true since we finished iterating the 
string and all characters were unique

7. **Space & Time Complexity**
    - O(n) time | O(m) space - Where `n` is the length of the string, and 
    `m` is the number of unique characters in the string

### Solution 2 - without additional data struct

For this solution since we can't use any additional data structures such as
a `Set` or `Array`, we'll need to check for uniqueness as following algorithm:

1. **Iterate:** we iterate each character of the string

2. **Nested Iteration:** we then perform a 2nd character iteration starting from `i + 1` until the end of the string

3. **Verify Uniqueness:** we compare if `charAt[i] == charAt[j]`

4. **If unique:** if the characters are not equal we continue

5. **If not unique:** if the characters are equal we can immidiately return false since we now know all characters are not unique

6. **Post-Iteration:** return true since we finished iterating the 
string and all characters were unique

7. **Space & Time Complexity**
    - O(n<sup>2</sup>) time | O(1) space - Where `n` is the length of the string
