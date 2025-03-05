
class InsertionSort {
    public static int[] sort(int[] array) {
        if (array.length <= 1)
            return array;

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
