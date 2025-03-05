import java.util.*;

class Solution {
  
  public int minimumWaitingTime(int[] queries) {
    // Write your code here.
    int currentSum = 0;
    int minTime = 0;
    
    if (queries.length == 1)
    return minTime;
    
    Arrays.sort(queries); // nLog(n)
    
    for (int i = 1; i < queries.length; i++) {
      currentSum = currentSum + queries[i - 1];
      minTime += currentSum;
    }
    
    return minTime;
  }
}

