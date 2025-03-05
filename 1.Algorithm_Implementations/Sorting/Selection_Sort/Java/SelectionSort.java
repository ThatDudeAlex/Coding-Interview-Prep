
class SelectionSort {
    public static int[] sort(int[] array) {
        int smallestNumberIndex;

        for (int i = 0; i < array.length; i++) {
            smallestNumberIndex = i;

            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[smallestNumberIndex])
                    smallestNumberIndex = j;
            swap(array, i, smallestNumberIndex);
        }
        return array;
    }

    private static void swap(int[] array, int index, int smallestNumberIndex) {
        int tmp = array[index];
        array[index] = array[smallestNumberIndex];
        array[smallestNumberIndex] = tmp;
    }
}
