
class QuickSort {
    public static int[] sort(int[] array) {
        sort(array, 0, array.length - 1);
        return array;
    }

    private static void sort(int[] array, int lowBound, int highBound) {
        // single element
        if (lowBound >= highBound) {
            return;
        }

        int pivot = lowBound;
        int pivotNum = array[pivot];
        int leftPointer = lowBound + 1;
        int rightPointer = highBound;

        while (leftPointer <= rightPointer) {
            if (array[leftPointer] > pivotNum && array[rightPointer] <= pivotNum) {
                swap(array, leftPointer, rightPointer);
                leftPointer += 1;
                rightPointer -= 1;
            } else if (array[leftPointer] <= pivotNum) {
                leftPointer += 1;
            } else if (array[rightPointer] > pivotNum) {
                rightPointer -= 1;
            }
        }

        swap(array, pivot, rightPointer);
        sort(array, lowBound, rightPointer - 1);
        sort(array, rightPointer + 1, highBound);
    }

    private static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
