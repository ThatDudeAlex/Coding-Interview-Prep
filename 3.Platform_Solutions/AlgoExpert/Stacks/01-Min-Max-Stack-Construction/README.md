
## Min Max Stack Construction

Write a MinMaxStack class for a Min Max Stack. The class should
support:

All class methods, when considered independently, should run in constant time
and with constant space.

### Sample Input
```
// All operations below are performed sequentially.
MinMaxStack(): - // instantiate a MinMaxStack
push(5): -
getMin(): 5
getMax(): 5
peek(): 5
push(7): -
getMin(): 5
getMax(): 7
peek(): 7
push(2): -
getMin(): 2
getMax(): 7
peek(): 2
pop(): 2
pop(): 7
getMin(): 5
getMax(): 5
peek(): 5
```

### Sample Output
```
{
  "classMethodsToCall": [
    {
      "arguments": [5],
      "method": "push"
    },
    {
      "arguments": [],
      "method": "getMin"
    },
    {
      "arguments": [],
      "method": "getMax"
    },
    {
      "arguments": [],
      "method": "peek"
    },
    {
      "arguments": [7],
      "method": "push"
    },
    {
      "arguments": [],
      "method": "getMin"
    },
    {
      "arguments": [],
      "method": "getMax"
    },
    {
      "arguments": [],
      "method": "peek"
    },
    {
      "arguments": [2],
      "method": "push"
    },
    {
      "arguments": [],
      "method": "getMin"
    },
    {
      "arguments": [],
      "method": "getMax"
    },
    {
      "arguments": [],
      "method": "peek"
    },
    {
      "arguments": [],
      "method": "pop"
    },
    {
      "arguments": [],
      "method": "pop"
    },
    {
      "arguments": [],
      "method": "getMin"
    },
    {
      "arguments": [],
      "method": "getMax"
    },
    {
      "arguments": [],
      "method": "peek"
    }
  ]
}
```
