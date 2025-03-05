import java.util.*;

class Solution {
  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
    // Write your code here.
    if (array.length < 3) {
      return new ArrayList<Integer[]>();
    }
    List<Integer[]> triplets = new ArrayList<>();
    
    Arrays.sort(array); // O(nlogn)

    for (int i = 0; i < array.length; i++) {
      int currValue = array[i];
      int leftPointer = i + 1;
      int rightPointer = array.length - 1;
      
      while (leftPointer < rightPointer) {
        int currSum = currValue + array[leftPointer] + array[rightPointer];
        
        if (currSum == targetSum) {
          triplets.add(new Integer[]{currValue, array[leftPointer], array[rightPointer]});
          leftPointer += 1;
          rightPointer -= 1;
        }
        else if (currSum < targetSum) {
          leftPointer += 1;
        }
        else if (currSum > targetSum) {
          rightPointer -= 1;
        }
      }
    }
		
    return triplets;
  }
}