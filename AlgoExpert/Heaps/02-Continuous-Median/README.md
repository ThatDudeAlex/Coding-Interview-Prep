
## Continuous Median

Write a ContinuousMedianHandler class that supports:

The getMedian method has already been written for you. You simply
have to write the insert method.

The median of a set of numbers is the "middle" number when the numbers are
ordered from smallest to greatest. If there's an odd number of numbers in the
set, as in {1, 3, 7}, the median is the number in the middle
(3 in this case); if there's an even number of numbers in the
set, as in {1, 3, 7, 8}, the median is the average of the two
middle numbers ((3 + 7) / 2 == 5 in this case).

### Sample Input
```
// All operations below are performed sequentially.
ContinuousMedianHandler(): - // instantiate a ContinuousMedianHandler
insert(5): -
insert(10): -
getMedian(): 7.5
insert(100): -
getMedian(): 10
```

### Sample Output
```
{
  "classMethodsToCall": [
    {
      "arguments": [5],
      "method": "insert"
    },
    {
      "arguments": [10],
      "method": "insert"
    },
    {
      "arguments": [],
      "method": "getMedian"
    },
    {
      "arguments": [100],
      "method": "insert"
    },
    {
      "arguments": [],
      "method": "getMedian"
    }
  ]
}
```
