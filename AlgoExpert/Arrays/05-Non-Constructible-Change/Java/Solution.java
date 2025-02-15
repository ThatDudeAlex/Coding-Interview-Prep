import java.util.*;

class Solution {

  public int nonConstructibleChange(int[] coins) {
    // Write your code here.		
    Arrays.sort(coins); // nLog(n) runtime 
    
    if (coins == null || coins.length == 0 || coins[0] != 1) {
        return 1;
    }
    
    int change = 0;
    
    for (int coin : coins) {
        if (coin > (change + 1)) {
            return change + 1;
        }	
        change += coin;
    }
    
    return change + 1;	
  }
}
