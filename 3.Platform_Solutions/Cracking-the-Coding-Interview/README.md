## Systematic Approach To Coding Problems

Page 62 of Cracking the Coding interview gives a really helpful roadmap
for solving coding challenges. I have written the roadmap below with slight
tweaks that I personally found helpful.

### 1. Listen

```
Pay very dose attention to any information in the problem description. You probably need it all for an optimal algorithm
```

**My Take**  

I use this step to also list the expected **Inputs & Outputs** of question.

### 2. Example

```
Most examples are too small or are special cases. Debug your example. Is there any way it's a special case? Is it big enough?
```

**My Take**  

I quickly comeup with 1 - 2 additional examples to debug and make sure I understand the situation

### 3. Brute Force

```
Get a brute-force solution as soon as possible. Don't worry about developing an efficient algorithm yet State a naive algorithm and its runtime, then optimize from there. Don't code yet though'
```

**My Take**  

This is step is most of the coding challenge. I try to come up with a selection as quickly as possible.

If i get stuck systematically going over each of the possible data structures below is helpful:

* **Arrays/Lists:**
    * When order matters, or for sequential access.
    * Consider sorting for searching or finding pairs.
* **Hash Maps/Dictionaries:**
    * When you need fast lookups, counting frequencies, or storing key-value pairs.
    * Ideal for checking duplicates.
* **Sets:**
    * When you need to track unique elements or perform set operations (intersection, union).
    * Useful for checking the presence of elements.
* **Stacks:**
    * When you need to maintain a LIFO (Last-In, First-Out) order.
    * Useful for matching parentheses, reversing, or DFS.
* **Queues:**
    * When you need to maintain a FIFO (First-In, First-Out) order.
    * Useful for BFS or processing elements in order.

#### **Consider Specialized Data Structures (If Needed):**

* **Trees (Binary Trees, Tries, Heaps):**
    * When you need hierarchical data structures, ordered data, or efficient searching.
    * Tries are excellent for prefix-based string operations.
    * Heaps are great for priority queues.
* **Graphs:**
    * When you need to represent relationships between entities.
    * Useful for network problems or pathfinding.

### 4. Optimize


#### **BUD Optimization**

* **B**ottlenecks
* **U**nnecessary Work
* **D**uplicated Work

```
Walk through your brute force with BUD
optimization or try some of these ideas:

> Look for any unused info.You usually
  need all the information in a problem.

> Solve it manually on anexample, then
  reverse engineer your thought process. 
  How did you solve it?

> Solve it "incorrectly" and then think about
  why the algorithm fails. Can you fix those issues?

> Make a time vs space tradeoff. Hash tables are
  especially useful!
```

### 5. Walkthrough

```
Now that you have an optimal solution, walk through your approach in detail. Make sure you understand each detail before you start coding.
```

### 6. Implement

```
Your goal is to write beautiful code. Modularize your code from the beginning and refactor to clean up anything that isn't beautiful.
```

### 7. Test

Test in this order:

1. Conceptual test.Walkthrough you rcode
   like you would for a detailed code review

2. Unusual or non-standard code

3. Hot spots, like arithmetic and null nodes

4. Small test cases. It's much faster than a big 
   test case and just as effective

5. Special cases and edge cases

And when you find bugs, **fix them carefully!**