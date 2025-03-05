# Selection Sort Algorithm

## Introduction
Selection Sort is a simple comparison-based sorting algorithm that works by repeatedly finding the smallest element in the unsorted portion of the list and swapping it with the first unsorted element. The process continues until the entire list is sorted. Though inefficient for large datasets, it is useful for educational purposes and small lists.

## Algorithm
1. Start with an unsorted list.

2. Find the smallest element in the unsorted section.

3. Swap it with the first unsorted element.

4. Move the boundary of the sorted section one step to the right.

5. Repeat the process until the entire list is sorted.

### Algorithm Visualizer
You can view a step-by-step visualization of the algorithm sorting an array [here](https://www.hackerearth.com/practice/algorithms/sorting/selection-sort/visualize/)

## Complexity Analysis
- **Best-case time complexity:** O(n²) (even when the list is already sorted, as it always performs n² comparisons)

- **Worst-case time complexity:** O(n²) (when the list is sorted in reverse order)

- **Average-case time complexity:** O(n²)

- **Space complexity:** O(1) (since sorting is done in place)

## Pros & Cons

### Pros:
- Simple to understand and implement.
- Works well for small datasets.
- In-place sorting, requiring no additional memory.
- Performs fewer swaps compared to Bubble Sort.

### Cons:
- Inefficient for large datasets due to O(n²) complexity.
- Slower than other sorting algorithms like QuickSort or MergeSort.

## Conclusion
Selection Sort is a basic sorting algorithm that is easy to implement but inefficient for large datasets. It is mainly used for learning purposes and scenarios where memory efficiency is a priority over speed.
