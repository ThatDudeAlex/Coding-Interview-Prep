
## Shorten Path

Write a function that takes in a non-empty string representing a valid
Unix-shell path and returns a shortened version of that path.

A path is a notation that represents the location of a file or directory in a
file system.

A path can be an absolute path, meaning that it starts at the root directory
in a file system, or a relative path, meaning that it starts at the current
directory in a file system.

In a Unix-like operating system, a path is bound by the following rules:

Note that the shortened version of the path must be equivalent to the original
path. In other words, it must point to the same file or directory as the
original path.

### Sample Input
```
path = "/foo/../test/../test/../foo//bar/./baz"
```

### Sample Output
```
"/foo/bar/baz" // This path is equivalent to the input path.
```
