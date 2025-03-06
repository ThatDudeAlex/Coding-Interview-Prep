function mergeSort(array) {
    sort(array, 0, array.length - 1);
    return array;
}

function sort(array, lowBound, highBound) {
    if (lowBound >= highBound) return;

    const midPoint = Math.floor(lowBound + (highBound - lowBound) / 2); // prevent's using float

    sort(array, lowBound, midPoint); // Left Partition
    sort(array, midPoint + 1, highBound); // Right Partition

    const auxArray = createAuxArray(array, lowBound, highBound, midPoint);
    copyAuxContent(array, auxArray, lowBound, highBound);
}

function createAuxArray(array, lowBound, highBound, midPoint) {
    const auxArray = new Array(highBound - lowBound + 1);
    let leftPointer = lowBound;
    let rightPointer = midPoint + 1;
    let auxIdx = 0;

    while (leftPointer <= midPoint && rightPointer <= highBound) {
        if (array[rightPointer] < array[leftPointer]) {
            auxArray[auxIdx++] = array[rightPointer++];
        } else {
            auxArray[auxIdx++] = array[leftPointer++];
        }
    }

    // Copy remaining left-side elements
    while (leftPointer <= midPoint) {
        auxArray[auxIdx++] = array[leftPointer++];
    }

    // Copy remaining right-side elements
    while (rightPointer <= highBound) {
        auxArray[auxIdx++] = array[rightPointer++];
    }

    return auxArray;
}

function copyAuxContent(array, auxArray, lowBound, highBound) {
    for (let i = lowBound; i <= highBound; i++) {
        array[i] = auxArray[i - lowBound];
    }
}

// Do not edit the line below. Needed for test cases
exports.mergeSort = mergeSort;
