
class Solution {
  public static int longestPeak(int[] array) {
    // Write your code here.
    if (array.length < 3) {
      return 0;
    }

    int prev = array[0];
    int currPeakLen = 1;
    int maxPeakLen = 0;
    boolean inDecline = false;

    for (int i = 1; i < array.length; i++) {
      int curr = array[i];

      if (curr == prev) {
        currPeakLen = 1;
      } else if (prev < curr && !inDecline) {
        currPeakLen += 1;
      } else if (prev < curr && inDecline) {
        inDecline = false;
        currPeakLen = 2;
      } else if (prev > curr && !inDecline && currPeakLen != 1) {
        inDecline = true;
        currPeakLen += 1;
        maxPeakLen = Math.max(maxPeakLen, currPeakLen);
      } else if (prev > curr && inDecline && currPeakLen != 1) {
        currPeakLen += 1;
        maxPeakLen = Math.max(maxPeakLen, currPeakLen);
      }

      prev = curr;
    }

    return maxPeakLen;
  }
}
