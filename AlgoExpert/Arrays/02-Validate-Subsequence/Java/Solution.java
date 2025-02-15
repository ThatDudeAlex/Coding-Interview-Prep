import java.util.*;

class Solution {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    // Write your code here.
    int currSequenceIndex = 0;
    
    for (int item : array) {
      if (sequence.get(currSequenceIndex) == item)
        currSequenceIndex++;
          
      if (currSequenceIndex == sequence.size())
        return true;
    }
      
    return false;
  }
}
