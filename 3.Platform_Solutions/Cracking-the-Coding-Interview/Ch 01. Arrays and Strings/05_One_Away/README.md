
One Away: There are three types of edits that can be performed on strings: insert a 
character, remove a character, or replace a character. Given two strings, write a 
function to check if they are one edit (or zero edits) away.

EXAMPLE

pale, ple -> true  
pales, pale -> true  
pale, bale -> true  
pale, bake -> false


## Solution Walkthrough

### Step 1. List Inputs & Outputs

* Inputs: `string1`, `string2`
* Output: `boolean`
* Special Cases:
    * Empty strings
    * Strings of the same length
    * Strings with a length difference of exactly 1

### Step 2. Example

* "pale", "ple" -> True (remove)
* "pales", "pale" -> True (insert)
* "pale", "bale" -> True (replace)
* "pale", "bake" -> False (two replacements)
* "apple", "aple" -> True (remove)
* "pale", "pal" -> True (remove)
* "pale", "pa" -> False (two removes)

### Step 3. Brute Force Solution

1. Check if the absolute difference of the length between `str1` and `str2` is greater than 1 
    * If it is, return `False`

2. Initialize a variable `allowed` to 1 to track the number of allowed edits

3. Initialize two pointers, `pointer1` and `pointer2`, to 0

4. Iterate through the strings using the pointers:
   * If the characters at `pointer1` and `pointer2` match, increment both pointers

   * If the characters don't match:
     * Decrement `allowed`

     * If `allowed` is less than 0, return `False`

     * If the lengths of the strings are equal, increment both pointers (replace)

     * If `str1` is longer, increment `pointer1` (remove)

     * If `str2` is longer, increment `pointer2` (insert)

5. Return `True` if the loop completes without returning `False`

6. O(n) Runtime
 
### Step 4. Optimize

* No optimization needed, brute force is already optimal.

### Step 5. Implimentation

```python
# O(n) Runtime
def one_way(str1, str2):
    if abs(len(str1) - len(str2)) > 1:
        return False

    allowed = 1
    pointer1 = 0
    pointer2 = 0

    while (pointer1 < len(str1)) and (pointer2 < len(str2)):
        if str1[pointer1] == str2[pointer2]:
            pointer1 += 1
            pointer2 += 1
        else:
            allowed -= 1

            if allowed < 0:
                return False
            elif len(str1) == len(str2):
                pointer1 += 1
                pointer2 += 1
            elif len(str1) > len(str2):
                pointer1 += 1
            else:
                pointer2 += 1

    return True
```


## How to Recognize the Pointer Approach:

* **Sequential Comparison:**

    * The core of the "One Away" problem is comparing the characters of two strings in a sequential manner

    * When you see a problem that involves comparing two sequences (strings, arrays, linked lists) element by element, pointers are often a good choice

* **Order Matters:**

    * If the problem's solution depends on the relative positions of elements, pointers are usually more effective than hashmaps or sets, which don't preserve order

* **Linear Traversal:**

    * The "One Away" problem can be solved by traversing the strings linearly, checking for differences as you go. Pointers are ideal for linear traversals

* **Edit/Difference Tracking:**

    * Pointers allow you to track the location of the differences, and handle the edit types based on the location of the difference

    * For example, if the pointers are different, and the length of the strings are different, then you can deduce that it is an insertion or deletion. If the lengths are the same, you know it is a replacement

## Systematic Process for String/Array Problems:

* **Indexes First:**

    * Always start by considering if you can solve the problem using indexes and simple iteration. This often leads to the most efficient solutions

* **Pointers:**

    * If you need to compare sequences element by element, track positions, or handle edits/differences, think about using pointers

* **Data Structures (If Needed):**

    * If the problem involves:
        * **Frequency counting:** Hashmaps

        * **Checking for existence:** Sets

        * **LIFO/FIFO behavior:** Stacks/Queues

        * **Sorting/Ordering:** Array lists, or other sorting algorithms