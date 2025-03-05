function bubbleSort(array) {
    // If array is empty or with 1 element then it's sorted
    if (array.length == 0 || array.length == 1)
        return array

    // Optimization technique. The end of the array is sorted each
    // run so we move the unsorted limit to not waste runs on things
    // that already have been sorted
    let limit = array.length - 1
    let is_sorted = false

    while (!is_sorted) {
        is_sorted = true

        for (let i = 0; i < limit; i++) {
            if (array[i] > array[i + 1]) {
                swap(i, i + 1, array)
                // If a swap happenend we know the arrow wasn't sorted
                // so set to false to initiate another run to recheck
                is_sorted = false
            }
        }

        // moves the window of the unsorted portion by 1
        limit -= 1
    }

    return array
}

function swap(index1, index2, array) {
    const temp = array[index1]
    array[index1] = array[index2]
    array[index2] = temp
}

// Do not edit the line below. Need it for testcases
exports.bubbleSort = bubbleSort;
