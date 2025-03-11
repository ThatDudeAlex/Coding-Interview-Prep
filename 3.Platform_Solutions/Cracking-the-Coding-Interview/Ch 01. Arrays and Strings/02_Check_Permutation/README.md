## Check Permutation
Given two strings,write a method to decide if one is a permutation of the
other.

## Solution Walkthrough

### Step 1. List Inputs & Outputs

    Inputs: input_string1, input_string2

    Output: boolean

### Step 2. Examples

* Ex.1: 
    * a string and it's reversed form

        * Input: "abc", "cba"

        * Output: `true`

* Ex.2: 
    * 2 empty strings

        * Input: "", ""

        * Output: `true`

* Ex.3: 
    * different length strings

        * Input: "abc", "abcd"

        * Output: `false`

### Step 3. Brute Force Solution 

Assumuming the input strings aren't `null` the algorithm is
the following:

1.  Compare if the length of both strings is equal.
    If not `return false`

2.  We need a `Hash Map` for each string to keep track of the
    frequency count of each character

3.  Iterate string1 and for each character we either add it into
    the map or increase the `frequency count`

4.  Iterate string2 and perform the same operations in step 3

5. Iterate the `keys` & `value` for map1
    * For each key we check if it exist in map2
    * If it does we check that the values are equal
    * Else if the key does not exist or the values are
      different, then `return false`

6. `return true` since we have now comfirmed that 1 string is a
    permutation of the other

### Step 4. Optimize

* Bottleneck? 
    * The bottleneck is having to iterate the strings and then verifying
    the frequencies. No way around this

* Unnecessary Work?
    * Nope

* Duplicated Work?
    * Yep! instead of separately iterating each input string
    to setup the frequency map, we can do it within a single
    loop instead of two loop.

    * `Runtime goes from O(3n) to O(2n)`

### Step 5. Implimentation

I will implement the solution in python, but the algorithmn in steps 3 & 4 
apply to most common languages.

```python
def is_permutation(input_string1, input_string2):
    # 1. compare lengths
    if len(input_string1) != len(input_string2):
        return False

    # 2. setup dictionaries (hash maps)
    frequency_map1 = dict()
    frequency_map2 = dict()

    # 3 & 4: Iterate both strings
    for i in range(len(input_string1)):
        char1 = input_string1[i]
        char2 = input_string2[i]

        # setup frequency map1
        if char1 not in frequency_map1:
            frequency_map1[char1] = 1
        else:
            frequency_map1[char1] = frequency_map1[char1] + 1

        # setup frequency map2
        if char2 not in frequency_map2:
            frequency_map2[char2] = 1
        else:
            frequency_map2[char2] = frequency_map2[char2] + 1

    # 5. Iterate key & values of frequency map1
    for key, value in frequency_map1.items():

        # verify key exist and values are equal
        if (key not in frequency_map2) or (value != frequency_map2[key]):
            return False

    # 6. return true if we make it to the end
    return True
```



