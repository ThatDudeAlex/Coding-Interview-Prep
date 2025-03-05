
class Solution {
  public static int[] insertionSort(int[] array) {
    // Write your code here.
    if (array.length == 0)
      return new int[] {};

    for (int i = 1; i < array.length; i++) {
      int j = i;

      while (j > 0 && array[j] < array[j - 1]) {
        swap(j, j - 1, array);
        j--;
      }
    }
    return array;
  }

  private static void swap(int index1, int index2, int[] arr) {
    int tmp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = tmp;
  }
}
