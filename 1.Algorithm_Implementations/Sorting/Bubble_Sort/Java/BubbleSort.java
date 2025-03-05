
class BubbleSort {
    public static int[] sort(int[] array) {
        if (array.length == 1 || array.length == 0)
            return array;

        // Optimization technique. The end of the array is sorted each
        // run so we move the unsorted limit to not waste runs on things
        // that already have been sorted
        int limit = array.length - 1;
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int j = 0; j < limit; j++) {
                if (array[j] > array[j + 1]) {
                    swap(j, j + 1, array);
                    // If a swap happenend we know the arrow wasn't sorted
                    // so set to false to initiate another run to recheck
                    isSorted = false;
                }
            }

            // moves the window of the unsorted portion by 1
            limit--;
        }

        return array;
    }

    public static void swap(int index1, int index2, int[] array) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
