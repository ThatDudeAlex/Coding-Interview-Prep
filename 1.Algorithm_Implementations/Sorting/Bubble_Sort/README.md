# Bubble Sort Algorithm

## Introduction
Bubble Sort is a simple sorting algorithm that works by repeatedly stepping through the list, comparing adjacent elements, and swapping them if they are in the wrong order. The process continues until the entire list is sorted. Although inefficient for large datasets, it is useful for educational purposes and small lists.

## Algorithm
1. Start at the beginning of the list.

2. Compare adjacent elements and swap them if they are out of order.

3. Continue this process for the entire list.

4. Repeat the process for the remaining unsorted elements until no more swaps are needed.

5. The largest unsorted element moves to its correct position in each pass.


### Algorithm Visualizer

You can view a step by step visualization of the algorithm sorting an array [here](https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/visualize/)


## Complexity Analysis
- **Best-case time complexity:** O(n) (when the list is already sorted and the algorithm stops early)

- **Worst-case time complexity:** O(n²) (when the list is sorted in reverse order)

- **Average-case time complexity:** O(n²)

- **Space complexity:** O(1) (since sorting is done in place)


## Pros & Cons

### Pros:
- Simple to understand and implement.

- Works well for small datasets.

- In-place sorting, requires no additional memory.

### Cons:
- Inefficient for large datasets due to O(n²) complexity.

- Slower than other sorting algorithms like QuickSort or MergeSort.

## Conclusion
Bubble Sort is a fundamental sorting algorithm that is easy to implement but not suitable for large datasets due to its inefficiency. It serves as a good introduction to sorting techniques and algorithm optimization concepts.
