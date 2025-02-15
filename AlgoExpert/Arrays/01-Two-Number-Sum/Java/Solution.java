import java.util.*;

class Solution {
  public int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
    Set<Integer> numSeen = new HashSet<>();

    for (int number : array) {
      int match = targetSum - number;

      if (numSeen.contains(match)) {
        return new int[]{number, match};
      }
      numSeen.add(number);
    }

    return new int[]{};
  }
}