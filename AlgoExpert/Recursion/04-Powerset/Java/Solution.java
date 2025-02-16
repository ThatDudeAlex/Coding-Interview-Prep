import java.util.*;

// Iterate Solution
class Solution {
  public static List<List<Integer>> powerset(List<Integer> array) {
    // Write your code here.
    List<List<Integer>> pset = new ArrayList<>();
    pset.add(new ArrayList<Integer>());
    
    constructPowerSet(array, pset);
    return pset;
  }
  
  private static void constructPowerSet(List<Integer> array, List<List<Integer>> pset) {
    if (array.isEmpty()) {
      return;
    }
    
    for (Integer num : array) {
      int numSubsets = pset.size();
      
      for (int i = 0; i < numSubsets; i++) {
        List<Integer> subset = new ArrayList<>(pset.get(i));
        subset.add(num);
        pset.add(subset);
      }
    }
  }
  
}

