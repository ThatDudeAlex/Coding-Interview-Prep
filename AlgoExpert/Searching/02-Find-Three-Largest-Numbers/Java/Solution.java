import java.util.*;

class Solution {
  public static int[] findThreeLargestNumbers(int[] array) {
    // Write your code here.
    int[] largest = {array[0], array[1], array [2]};
    sort(largest);
    
    if (array.length == 3)
    return largest;
    
    for (int i = 3; i < array.length; i++) {
      if (array[i] > largest[0]) {
        largest[0] = array[i];
        sort(largest);
      }
    }
    
    return largest;
  }
  
  private static void sort(int[] array) {
    boolean isSorted = false;
    
    while (!isSorted) {
      isSorted = true;
      
      for (int i = 0; i < 2; i++) {
        if (array[i] > array[i + 1]) {
          swap(i, i + 1, array);
          isSorted = false;
        }
      }
    }
  }
  
  private static void swap(int index1, int index2, int[] array) {
    int tmp = array[index1];
    array[index1] = array[index2];
    array[index2] = tmp;
  }
  
}

