
class Solution {
  public static boolean hasSingleCycle(int[] array) {
    // Write your code here.
    int currentIndex = 0;

    for (int i = 0; i < array.length; i++) {
      if (i > 0 && currentIndex == 0)
        return false;

      currentIndex = getIndex(currentIndex, array);
    }

    return currentIndex == 0;
  }

  private static int getIndex(int currentIndex, int[] array) {
    int jumps = array[currentIndex];
    int nextIndex = (currentIndex + jumps) % array.length;
    return nextIndex >= 0 ? nextIndex : array.length + nextIndex;
  }
}
