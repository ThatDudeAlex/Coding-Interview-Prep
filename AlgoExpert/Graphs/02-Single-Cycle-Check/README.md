
## Single Cycle Check

You're given an array of integers where each integer represents a jump of its
value in the array. For instance, the integer 2 represents a jump
of two indices forward in the array; the integer -3 represents a
jump of three indices backward in the array.

If a jump spills past the array's bounds, it wraps over to the other side. For
instance, a jump of -1 at index 0 brings us to the last index in
the array. Similarly, a jump of 1 at the last index in the array brings us to
index 0.

Write a function that returns a boolean representing whether the jumps in the
array form a single cycle. A single cycle occurs if, starting at any index in
the array and following the jumps, every element in the array is visited
exactly once before landing back on the starting index.

In the video explanation of this question, we explain that we need to handle
negative values for the nextIdx calculated in our helper method.

In most programming languages, this is necessary because, if
currentIdx + jump is negative, then
(currentIdx + jump) % len(array) will also be negative.

In Python, however, "the modulo operator always yields a result with the same
sign as its second operand (or zero)"
[Python Docs]. In other words, in Python, the modulo operation to compute the
nextIdx will always return a number with the sign of
len(array), which is naturally positive.

More specifically, the modulo operator in Python behaves as follows when used
with a negative first operand:

The Python modulo operator effectively does, by default, what we do in our
code to handle negative values.

Thus, in Python, we can just return
(currentIdx + jump) % len(array) for the nextIdx,
without needing to handle negative values.

### Sample Input
```
array = [2, 3, 1, -4, -4, 2]
```

### Sample Output
```
true
```
