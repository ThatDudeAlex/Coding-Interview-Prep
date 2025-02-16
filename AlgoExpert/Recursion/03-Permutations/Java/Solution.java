import java.util.*;

class Solution {
  public static List<List<Integer>> getPermutations(List<Integer> array) {
    // Write your code here.
    List<List<Integer>> allPermutations = new ArrayList<>();
    List<Integer> currentPermutation = new ArrayList<>();
    
    if (array.isEmpty()) {
      return allPermutations;
    }
    
    getAllPermutations(array, currentPermutation, allPermutations);
    return allPermutations;
  }
  
  private static void getAllPermutations(List<Integer> array, List<Integer> currentPermutation, List<List<Integer>> allPermutations) {
    if (array.isEmpty()) {
      allPermutations.add(currentPermutation);
      return;
    }
    
    for (Integer num : array) {
      List<Integer> newArray = removeNumFromArray(array, num);
      List<Integer> newPerm  = appendToCurrent(currentPermutation, num);
      getAllPermutations(newArray, newPerm, allPermutations);
    }
  }
  
  private static List<Integer> removeNumFromArray(List<Integer> array, Integer num) {
    List<Integer> newArray = new ArrayList<>(array);
    newArray.remove(num);
    return newArray;
  }
  
  private static List<Integer> appendToCurrent(List<Integer> currentPermutation, Integer num) {
    List<Integer> newPermutation = new ArrayList<>(currentPermutation);
    newPermutation.add(num);
    return newPermutation;
  }
  
}

