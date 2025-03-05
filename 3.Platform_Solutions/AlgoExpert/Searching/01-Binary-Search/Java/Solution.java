import java.util.*;

class Solution {
  public static int binarySearch(int[] array, int target) {
    // Write your code here.
    int low  = 0;
    int high = array.length - 1;
    
    while (high >= low) {
      int middle = (low + high) / 2;
      int midValue = array[middle];
      
      if (midValue == target) {
        return middle;
      }
      else if (target > midValue) {
        low = middle + 1;
      } else {
        high = middle - 1;
      }
    }
    return -1;
  }
}

