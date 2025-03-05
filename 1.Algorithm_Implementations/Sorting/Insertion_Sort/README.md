# Insertion Sort Algorithm

## Introduction
Insertion Sort is a simple sorting algorithm that builds the final sorted array one item at a time. It takes each element and inserts it into its correct position in the already sorted portion of the array. This method is efficient for small datasets and nearly sorted data but is inefficient for large, unsorted datasets.

## Algorithm
1. Start with the second element (assuming the first is already sorted).
2. Compare it with the previous elements and shift larger elements one position to the right.
3. Insert the current element into its correct position.
4. Repeat the process for all elements in the list until the entire list is sorted.

### Algorithm Visualizer
You can view a step-by-step visualization of the algorithm sorting an array [here](https://www.hackerearth.com/practice/algorithms/sorting/insertion-sort/visualize/)

## Complexity Analysis
- **Best-case time complexity:** O(n) (when the list is already sorted, as only one comparison per element is needed)
- **Worst-case time complexity:** O(n²) (when the list is sorted in reverse order, requiring many shifts)
- **Average-case time complexity:** O(n²)
- **Space complexity:** O(1) (since sorting is done in place)

## Pros & Cons

### Pros:
- Simple to understand and implement.
- Efficient for small or nearly sorted datasets.
- In-place sorting, requiring no additional memory.
- Performs well with partially sorted data.

### Cons:
- Inefficient for large datasets due to O(n²) complexity.
- Slower than advanced sorting algorithms like QuickSort or MergeSort.

## Conclusion
Insertion Sort is a fundamental sorting algorithm that is easy to implement and works well for small or nearly sorted datasets. However, it is not suitable for large datasets due to its inefficiency in handling many comparisons and swaps.
