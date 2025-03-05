# Quick Sort Algorithm

## Introduction
Quick Sort is a highly efficient, comparison-based sorting algorithm that follows the divide-and-conquer approach. It works by selecting a pivot element, partitioning the array into elements smaller and larger than the pivot, and then recursively sorting the partitions. Quick Sort is widely used in practice due to its superior performance on average compared to other simple sorting algorithms.

## Algorithm
1. Choose a pivot element from the array (often the first, last, or a random element).
2. Partition the array so that elements smaller than the pivot move to its left, and elements greater move to its right.
3. Recursively apply the same process to the left and right partitions.
4. Continue until the base case (single-element or empty partition) is reached.

### Algorithm Visualizer
You can view a step-by-step visualization of the algorithm sorting an array [here](https://www.hackerearth.com/practice/algorithms/sorting/quick-sort/visualize/)

## Complexity Analysis
- **Best-case time complexity:** O(n log n) (when the pivot divides the array into balanced partitions)
- **Worst-case time complexity:** O(n²) (when the pivot consistently results in highly unbalanced partitions, e.g., already sorted or reverse-sorted data with a bad pivot choice)
- **Average-case time complexity:** O(n log n)
- **Space complexity:** O(log n) (due to recursive calls in the function stack, but still considered efficient)

## Pros & Cons

### Pros:
- Fast and efficient with an average O(n log n) complexity.
- Performs well on large datasets.
- Works in-place, requiring little additional memory.
- Commonly used in practical applications.

### Cons:
- Worst-case performance can degrade to O(n²) with poor pivot choices.
- Recursive implementation requires function stack space.
- Unstable sorting algorithm (does not maintain the relative order of equal elements).

## Conclusion
Quick Sort is one of the most efficient sorting algorithms, widely used in various applications due to its speed and adaptability. It performs significantly better than simpler algorithms like Bubble Sort and Insertion Sort, making it a preferred choice for many real-world sorting tasks.
