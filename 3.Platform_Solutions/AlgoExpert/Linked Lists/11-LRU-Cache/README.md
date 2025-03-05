
## LRU Cache

Implement an LRUCache class for a Least Recently Used (LRU)
cache. The class should support:

Each of these methods should run in constant time.

Additionally, the LRUCache class should store a
maxSize property set to the size of the cache, which is passed in
as an argument during instantiation. This size represents the maximum number
of key-value pairs that the cache can store at once. If a key-value pair is
inserted in the cache when it has reached maximum capacity, the least recently
used key-value pair should be evicted from the cache and no longer
retrievable; the newly added key-value pair should effectively replace it.

Note that inserting a key-value pair with an already existing key should
simply replace the key's value in the cache with the new value and shouldn't
evict a key-value pair if the cache is full. Lastly, attempting to retrieve a
value from a key that isn't in the cache should return None /
null.

### Sample Input
```
// All operations below are performed sequentially.
LRUCache(3): - // instantiate an LRUCache of size 3
insertKeyValuePair("b", 2): -
insertKeyValuePair("a", 1): -
insertKeyValuePair("c", 3): -
getMostRecentKey(): "c" // "c" was the most recently inserted key
getValueFromKey("a"): 1
getMostRecentKey(): "a" // "a" was the most recently retrieved key
insertKeyValuePair("d", 4): - // the cache had 3 entries; the least recently used one is evicted
getValueFromKey("b"): None // "b" was evicted in the previous operation
insertKeyValuePair("a", 5): - // "a" already exists in the cache so its value just gets replaced
getValueFromKey("a"): 5
```

### Sample Output
```
{
  "maxSize": 3,
  "classMethodsToCall": [
    {
      "arguments": ["b", 2],
      "method": "insertKeyValuePair"
    },
    {
      "arguments": ["a", 1],
      "method": "insertKeyValuePair"
    },
    {
      "arguments": ["c", 3],
      "method": "insertKeyValuePair"
    },
    {
      "arguments": [],
      "method": "getMostRecentKey"
    },
    {
      "arguments": ["a"],
      "method": "getValueFromKey"
    },
    {
      "arguments": [],
      "method": "getMostRecentKey"
    },
    {
      "arguments": ["d", 4],
      "method": "insertKeyValuePair"
    },
    {
      "arguments": ["b"],
      "method": "getValueFromKey"
    },
    {
      "arguments": ["a", 5],
      "method": "insertKeyValuePair"
    },
    {
      "arguments": ["a"],
      "method": "getValueFromKey"
    }
  ]
}
```
