
class Solution {
  public static boolean isMonotonic(int[] array) {
    // Write your code here.
    if (array.length <= 2) {
      return true;
    }

    int startIndex = skipDuplicates(array);
    int prevValue = array[startIndex];
    boolean isIncreasing = false;

    if (startIndex == array.length - 1) {
      return true;
    }

    if (prevValue < array[startIndex + 1]) {
      isIncreasing = true;
    }

    for (int i = startIndex; i < array.length - 1; i++) {
      if (isIncreasing) {
        if (array[i + 1] < prevValue) {
          return false;
        }

        prevValue = array[i + 1];
      } else {
        if (array[i + 1] > prevValue) {
          return false;
        }

        prevValue = array[i + 1];
      }
    }

    return true;
  }

  private static int skipDuplicates(int[] array) {
    if (array[0] != array[1]) {
      return 0;
    }

    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] != array[i + 1]) {
        return i;
      }
    }

    return array.length - 1;
  }
}
