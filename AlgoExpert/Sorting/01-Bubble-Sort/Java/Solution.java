import java.util.*;

class Solution {
  public static int[] bubbleSort(int[] array) {
    if (array.length == 1 || array.length == 0)
    return array;
    
    int limit = array.length - 1;
    boolean isSorted = false;
    
    // Write your code here.
    while(!isSorted) {
      isSorted = true;
      for (int j = 0; j < limit; j++) {
        if (array[j] > array[j + 1]){
          swap(j, j + 1, array);
          isSorted = false;
        }
      }
      limit--;
    }
    
    return array;
  }
  
  public static void swap(int index1, int index2, int[] array) {
    int tmp = array[index1];
    array[index1] = array[index2];
    array[index2] = tmp;
  }
}

