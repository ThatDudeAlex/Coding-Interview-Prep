
class MergeSort {
    public static int[] sort(int[] array) {
        sort(array, 0, array.length - 1);
        return array;
    }

    private static void sort(int[] array, int lowBound, int highBound) {
        if (lowBound >= highBound) {
            return;
        }

        int midPoint = lowBound + (highBound - lowBound) / 2;
        sort(array, lowBound, midPoint); // leftPartition
        sort(array, midPoint + 1, highBound); // rightPartition

        int[] auxArray = createAuxArray(array, lowBound, highBound, midPoint);
        copyAuxContent(array, auxArray, lowBound, highBound);
    }

    private static int[] createAuxArray(int[] array, int lowBound, int highBound, int midPoint) {
        int[] auxArray = new int[highBound - lowBound + 1];
        int leftPointer = lowBound;
        int rightPointer = midPoint + 1;
        int auxIdx = 0;

        while (leftPointer <= midPoint || rightPointer <= highBound) {
            if (leftPointer > midPoint || (rightPointer <= highBound && array[rightPointer] < array[leftPointer])) {
                auxArray[auxIdx++] = array[rightPointer++];
            } else {
                auxArray[auxIdx++] = array[leftPointer++];
            }
        }

        return auxArray;
    }

    private static void copyAuxContent(int[] array, int[] auxArray, int lowBound, int highBound) {
        for (int i = lowBound; i <= highBound; i++) {
            array[i] = auxArray[i - lowBound];
        }
    }

}
