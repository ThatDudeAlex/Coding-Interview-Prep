import java.util.*;

class Solution {

  public static List<Integer> spiralTraverse(int[][] array) {
    // Write your code here.
    List<Integer> itemsInSpiral = new ArrayList<>();

    traverseArray(array, itemsInSpiral, 0, array.length - 1, 0, array[0].length - 1);
    System.out.println(itemsInSpiral.toString());
    return itemsInSpiral;
  }

  private static void traverseArray(int[][] array, List<Integer> itemsInSpiral, int rowStart, int rowEnd, int colStart,
      int colEnd) {
    if (rowStart > rowEnd || colStart > colEnd) {
      return;
    }
    System.out.println(Arrays.toString(array[rowStart]));
    // traverses top perimeter
    for (int col = colStart; col <= colEnd; col++) {
      itemsInSpiral.add(array[rowStart][col]);
    }
    System.out.println(itemsInSpiral.toString());

    for (int row = rowStart + 1; row <= rowEnd; row++) {
      itemsInSpiral.add(array[row][colEnd]);
    }

    if (rowStart != rowEnd)
      for (int col = colEnd - 1; col >= colStart; col--) {
        itemsInSpiral.add(array[rowEnd][col]);
      }

    if (colStart != colEnd)
      for (int row = rowEnd - 1; row >= rowStart + 1; row--) {
        itemsInSpiral.add(array[row][colStart]);
      }

    traverseArray(array, itemsInSpiral, rowStart + 1, rowEnd - 1, colStart + 1, colEnd - 1);
  }
}
