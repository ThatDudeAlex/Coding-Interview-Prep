import java.util.*;

class Solution {
  public int optimalFreelancing(Map<String, Integer>[] jobs) {
    // Write your code here.
    int maxProfits = 0;
    int[] days = new int[7];
    
    // Sort array
    Arrays.sort(jobs, new Comparator<Map<String, Integer>>() {
      @Override
      public int compare(Map<String, Integer> m1, Map<String, Integer> m2) {
        return m2.get("payment").compareTo(m1.get("payment"));
      }
    });
    // Arrays.sort(jobs, (m1, m2) -> m2.get("payment").compareTo(m1.get("payment"));
    
    for (Map<String, Integer> day : jobs) {
      int deadline = day.get("deadline");
      int payment = day.get("payment");
      
      if (deadline > days.length) {
        deadline = days.length;
      }
      
      for (int i = deadline - 1; i >= 0; i--) {
        
        if (payment > days[i]) {
          days[i] = payment;
          break;
        }
      }
    }
    
    for (int i = 0; i < days.length; i++) {
      maxProfits += days[i];
