
class Solution {
  public static int longestPeak(int[] array) {
    // Write your code here.
    if (array.length < 3) {
      return 0;
    }

    int prev = array[0];
    int longestPeak = 0;
    int currPeak = 1;
    boolean inDecline = false;

    for (int i = 1; i < array.length; i++) {
      int currNumber = array[i];

      if (prev == currNumber) {
        currPeak = 1;
      } else if (currNumber > prev && !inDecline) {
        currPeak += 1;
      } else if (currNumber > prev && inDecline) {
        inDecline = false;
        currPeak = 1;
      } else if (currNumber < prev && currPeak >= 2 && !inDecline) {
        inDecline = true;
        currPeak += 1;
        longestPeak = Math.max(longestPeak, currPeak);
      } else if (currNumber < prev && inDecline) {
        currPeak += 1;
        longestPeak = Math.max(longestPeak, currPeak);
      } else if (currNumber < prev && currPeak < 2) {
        currPeak = 1;
      }

      prev = currNumber;
    }

    return longestPeak;
  }
}
