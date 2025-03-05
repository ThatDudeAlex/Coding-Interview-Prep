function quickSort(array) {
    sort(array, 0, array.length - 1)
    return array
}

function sort(array, lowBound, highBound) {
    // single element
    if (lowBound >= highBound)
        return

    let pivot = lowBound
    let pivotNum = array[pivot]
    let leftPointer = lowBound + 1
    let rightPointer = highBound

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


function swap(array, index1, index2) {
    const temp = array[index1]
    array[index1] = array[index2]
    array[index2] = temp
}


// Do not edit the line below. Need it for testcases
exports.quickSort = quickSort
