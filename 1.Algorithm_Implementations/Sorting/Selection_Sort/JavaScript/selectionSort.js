function selectionSort(array) {

    for (let i = 0; i < array.length; i++) {
        let indexOfSmallestNum = i

        for (let j = i + 1; j < array.length; j++) {
            if (array[j] < array[indexOfSmallestNum])
                indexOfSmallestNum = j
        }
        swap(i, indexOfSmallestNum, array)
    }

    return array
}

function swap(index1, index2, array) {
    const temp = array[index1]
    array[index1] = array[index2]
    array[index2] = temp
}

// Do not edit the line below. Need it for testcases
exports.selectionSort = selectionSort;
