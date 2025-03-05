function insertionSort(array) {
    if (array.length <= 1)
        return array

    for (let i = 1; i < array.length; i++) {
        let j = i

        while (j > 0 && array[j] < array[j - 1]) {
            swap(j, j - 1, array)
            j--
        }
    }
    return array
}


function swap(index1, index2, array) {
    const temp = array[index1]
    array[index1] = array[index2]
    array[index2] = temp
}

// Do not edit the line below. Need it for testcases
exports.insertionSort = insertionSort;
