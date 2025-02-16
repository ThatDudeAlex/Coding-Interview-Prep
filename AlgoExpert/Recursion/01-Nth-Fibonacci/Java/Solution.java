import java.util.*;

class Solution {
  public static int getNthFib(int n) {
    // Write your code here.
    int[] fib = {0, 1};
    
    if (n == 0 || n == 1)
    return 0;
    if (n == 2)
    return 1;
    
    for (int i = 2; i < n; i++) {
      int fibOfI = fib[0] + fib[1];
      fib[0] = fib[1];
      fib[1] = fibOfI;
    }
    return fib[1];
  }
}

