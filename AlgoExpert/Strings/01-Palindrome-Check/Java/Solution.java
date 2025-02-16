import java.util.*;

class Solution {
  public static boolean isPalindrome(String str) {
    // Write your code here.
    for (int i = 0, j = str.length() - 1; i <= (str.length()/2); i++, j--) {
      if (str.charAt(i) != str.charAt(j))
      return false;
    }
    return true;
  }
}

