import java.util.*;

class Solution {

  public int firstDuplicateValue(int[] array) {
    // Write your code here.
    Set<Integer> uniqueValues = new HashSet<>();

    for (int i = 0; i < array.length; i++) {
      int currNum = array[i];

      if (uniqueValues.contains(currNum)) {
        return currNum;
      }
      uniqueValues.add(currNum);
    }

    return -1;
  }
}
