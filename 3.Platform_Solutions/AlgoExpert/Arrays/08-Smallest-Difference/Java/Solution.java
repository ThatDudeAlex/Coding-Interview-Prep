import java.util.*;

class Solution {
  public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
    // Write your code here.		
    Arrays.sort(arrayOne);
    Arrays.sort(arrayTwo);
    int[] pair = getPair(arrayOne, arrayTwo);
		
    return pair;
  }
	
  private static int[] getPair(int[] arrayOne, int[] arrayTwo) {
      int[] pair = new int[2];
      int smallestDiff = Integer.MAX_VALUE;
      int arrayOnePointer = 0;
      int arrayTwoPointer = 0;
      
      while (arrayOnePointer < arrayOne.length && arrayTwoPointer < arrayTwo.length) {
          int num1 = arrayOne[arrayOnePointer];
          int num2 = arrayTwo[arrayTwoPointer];
          int difference = Math.abs(num1 - num2);
          
          if (difference == 0) {
              return new int[] {num1, num2};
          }
          else if (difference < smallestDiff) {
              smallestDiff = difference;
              pair[0] = num1;
              pair[1] = num2;
          }
          
          if (num1 > num2) {
              arrayTwoPointer += 1;
          } else {
              arrayOnePointer += 1;
          }
      }
      
      return pair;
  }	
}
