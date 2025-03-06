# Merge Sort Algorithm

## Introduction
Merge Sort is a divide-and-conquer sorting algorithm that recursively divides an array into two halves, sorts each half, and then merges the sorted halves to produce a fully sorted array. It is efficient for large datasets and guarantees O(n log n) performance.

## Algorithm
1. If the array has one or zero elements, it is already sorted.
2. Divide the array into two halves at the midpoint.
3. Recursively sort both halves.
4. Merge the two sorted halves into a single sorted array.

### Algorithm Visualizer
You can view a step-by-step visualization of the algorithm sorting an array [here](https://www.hackerearth.com/practice/algorithms/sorting/merge-sort/visualize/)

## Complexity Analysis
- **Best-case time complexity:** O(n log n) (always requires splitting and merging)
- **Worst-case time complexity:** O(n log n) (since it consistently divides and merges)
- **Average-case time complexity:** O(n log n)
- **Space complexity:** O(n) (requires additional memory for merging)

## Pros & Cons

### Pros:
- Guarantees O(n log n) time complexity in all cases.
- Stable sorting algorithm (preserves order of equal elements).
- Efficient for sorting large datasets.

### Cons:
- Requires additional memory space proportional to the input size.
- Slower than Quick Sort for in-place sorting due to memory overhead.

## Conclusion
Merge Sort is a powerful and reliable sorting algorithm that excels in situations where stability and worst-case efficiency are crucial. However, its space requirements make it less ideal for in-place sorting compared to Quick Sort.
