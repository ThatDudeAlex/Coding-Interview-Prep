import java.util.*;

class Solution {
  public static int maxSubsetSumNoAdjacent(int[] array) {
    // Write your code here.
    if (array.length == 0)
    return 0;
    if (array.length == 1)
    return array[0];
    if (array.length == 2)
    return Math.max(array[0], array[1]);
    
    int[] maxSum = {array[0], Math.max(array[0], array[1])};
    System.out.println("Init: " + Arrays.toString(maxSum));
    
    for (int i = 2; i < array.length; i++) {
      int sum = Math.max(maxSum[1], maxSum[0] + array[i]);
      maxSum[0] = maxSum[1];
      maxSum[1] = sum;
      System.out.println("MaxSum["+i+"]: " +Arrays.toString(maxSum));
    }
    
    System.out.println(Arrays.toString(maxSum));
    return maxSum[1];
  }
}

