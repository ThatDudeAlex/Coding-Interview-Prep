import java.util.*;

class Solution {
  // Tip: You can use `element instanceof ArrayList` to check whether an item
  // is an array or an integer.
  public static int productSum(List<Object> array) {
    // Write your code here.
    return calcSum(array, 1);
  }
  
  private static int calcSum(List<Object> array, int depth) {
    int sum = 0;
    
    for (Object item : array) {
      if (item instanceof ArrayList) {
        List<Object> nestArray = (ArrayList<Object>)item;
        sum += calcSum(nestArray, depth + 1);
      } else {
        sum += ((int)item );
      }
    }
    
    return sum * depth;
  }
  
}

